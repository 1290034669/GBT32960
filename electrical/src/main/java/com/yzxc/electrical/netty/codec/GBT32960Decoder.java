package com.yzxc.electrical.netty.codec;

import com.yzxc.common.message.LoginRequest;
import com.yzxc.common.message.LogoutRequest;
import com.yzxc.common.message.RealTimeReport;
import com.yzxc.common.paltform.LoginPlatform;
import com.yzxc.common.type.EncryptionType;
import com.yzxc.common.type.FrameHeader;
import com.yzxc.common.type.RequestType;
import com.yzxc.common.type.ResponseTag;
import com.yzxc.common.util.GBT32960Message;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufUtil;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ReplayingDecoder;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

import static com.yzxc.common.type.FrameHeader.HEADER_LENGTH;
import static com.yzxc.common.util.GBT32960Message.*;

/**
 * 解决粘包拆包问题
 */
@Slf4j
public class GBT32960Decoder extends ReplayingDecoder<Void> {

    private FrameHeader frameHeader;

    @Override
    protected void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) {
        int startIndex = in.readerIndex();
        checkpoint();
        String hexDump = ByteBufUtil.hexDump(internalBuffer());
        if (in.readShort() != START_SYMBOL) {
            in.skipBytes(actualReadableBytes());
            ctx.close();
            return;
        }
        frameHeader = decodeFrameHeader(in, hexDump);
        int payloadLength = frameHeader.getPayloadLength();
        byte nowCheckCode = checkCode(in, startIndex, HEADER_LENGTH + 2 + payloadLength);
        byte sourceCheckCode = in.getByte(HEADER_LENGTH + 2 + payloadLength + startIndex);
        if (nowCheckCode != sourceCheckCode) {
            return;
        }
        Object dataUnit = decodeDataUnit(in, frameHeader);
        GBT32960Message message = GBT32960Message.builder()
                .header(frameHeader)
                .dataUnit(dataUnit)
                .build();
        out.add(message);
        in.skipBytes(1);
    }

    private Object decodeDataUnit(ByteBuf in, FrameHeader header) {
        switch (header.getRequestType()) {
            case REAL_TIME:
                return realTime(in, header);
            case REISSUE:
                return reIssueTime(in, header);
            case PLATFORM_LOGIN:
                return decodeLoginPlatform(in);
            case PLATFORM_LOGOUT:
                return decodeLogoutPlatform(in);
            case PLATFORM_LOGOUT_RESPONSE:
            case PLATFORM_LOGIN_RESPONSE:
                return header.getResponseTag();
            case LOGIN:
                LoginRequest loginRequest = decodeLogin(in);
                return loginRequest;
            case LOGOUT:
                LogoutRequest logout = LogoutRequest.newBuilder()
                        .setRecordTime(readTime(in))
                        .setLogoutDaySeq(in.readUnsignedShort()).build();
                return logout;
            default:
                throw new Error();
        }
    }

    private LoginRequest decodeLogin(ByteBuf in) {
        LoginRequest.Builder builder = LoginRequest.newBuilder()
                .setRecordTime(readTime(in))
                .setLoginDaySeq(in.readUnsignedShort())
                .setIccid(in.readCharSequence(20, ASCII_CHARSET).toString());
        int count = in.readByte();
        int length = in.readByte();
        builder.setSystemCodeLength(length);
        for (int i = 0; i < count; i++) {
            builder.addChargeableSubsystemCode(
                    in.readCharSequence(length, ASCII_CHARSET).toString());
        }
        return builder.build();
    }


    private LoginPlatform decodeLoginPlatform(ByteBuf in) {
        return LoginPlatform.decoderFul(in);
    }

    private LoginPlatform decodeLogoutPlatform(ByteBuf in) {
        return LoginPlatform.decoderLogout(in);
    }

    private FrameHeader decodeFrameHeader(ByteBuf in, String hexDump) {
        frameHeader = FrameHeader.builder()
                .requestType(RequestType.valueOf(in.readByte()))
                .responseTag(ResponseTag.valueOf(in.readByte()))
                .vin(in.readCharSequence(17, GBT32960Message.ASCII_CHARSET).toString())
                .encryptionType(EncryptionType.valueOf(in.readByte()))
                .payloadLength(in.readUnsignedShort())
                .hex(hexDump)
                .build();
        return frameHeader;
    }

    private byte checkCode(ByteBuf in, int start, int length) {
        if (length == 0) {
            return 0;
        }
        FrameHeader.CheckCodeProcessor processor = new FrameHeader.CheckCodeProcessor();
        in.forEachByte(start, length, processor);
        return processor.getCheckCode();
    }

    private RealTimeReport realTime(ByteBuf in, FrameHeader header) {
        ByteBuf fullBody = in.readRetainedSlice(header.getPayloadLength());
        RealTimeReport.Builder report = ReportDecoder.decodeFully(fullBody);
        fullBody.release();
        report.setReissue(header.getRequestType() == RequestType.REISSUE);
        return report.build();
    }

    private RealTimeReport reIssueTime(ByteBuf in, FrameHeader header) {
        ByteBuf fullBody = in.readRetainedSlice(header.getPayloadLength());
        RealTimeReport.Builder report = ReportDecoder.decodeFully(fullBody);
        fullBody.release();
        report.setReissue(header.getRequestType() == RequestType.REISSUE);
        return report.build();
    }

}
