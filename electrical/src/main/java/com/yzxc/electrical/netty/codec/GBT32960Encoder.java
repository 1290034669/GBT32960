package com.yzxc.electrical.netty.codec;


import com.yzxc.common.formatters.PlatformMessage;
import com.yzxc.common.paltform.LoginPlatform;
import com.yzxc.common.type.RequestType;
import com.yzxc.common.util.ResponseMessage;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;

import static com.yzxc.common.util.GBT32960Message.*;


@Slf4j
public class GBT32960Encoder extends MessageToByteEncoder<ResponseMessage> {

    @Override
    protected void encode(ChannelHandlerContext ctx, ResponseMessage response, ByteBuf out) {
        RequestType requestType = response.getMessage().getRequestType();

        switch (requestType) {
            case LOGIN:
                encodeLoginMessage(ctx, out, response.getVin(), requestType, response.getMessage().getResponseTag());
            case LOGOUT:
                encodeLogoutMessage(ctx, out, response.getVin(), requestType, response.getMessage().getResponseTag());
                //平台登入
            case PLATFORM_LOGIN:
                encodeMessage(ctx, out, response.getVin(), requestType, response.getMessage().getResponseTag(), buf -> encodePlatformLogin(response.getMessage(), buf));
                break;
            //平台登出
            case PLATFORM_LOGOUT:
                encodeMessage(ctx, out, response.getVin(), requestType, response.getMessage().getResponseTag(), buf -> encodePlatformLogout(response.getMessage(), buf));
                break;
            case REALTIME_RESPONSE:
                realTimeResponse(ctx, out, response.getVin(), response.getMessage().getResponseTag());
            default:
                log.info("未识别的消息标识！");
                break;
        }

    }

    private void encodePlatformLogin(PlatformMessage platformMessage, ByteBuf out) {
        LoginPlatform data = platformMessage.getData();
        writeTime(out, new Date().getTime() / 1000);
        out.writeShort(data.getLoginDaySeq());
        out.writeCharSequence(data.getUsername(), ASCII_CHARSET);
        out.writeCharSequence(data.getPassword(), ASCII_CHARSET);
        out.writeByte(data.getEncryption());
    }

    private void encodePlatformLogout(PlatformMessage platformMessage, ByteBuf out) {
        LoginPlatform data = platformMessage.getData();
        writeTime(out, new Date().getTime() / 1000);
        out.writeShort(data.getLoginDaySeq());
    }
}
