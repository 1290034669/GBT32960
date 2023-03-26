package com.yzxc.electrical.netty.handler;

import com.yzxc.common.factory.ThreadFactoryCustomer;
import com.yzxc.common.formatters.PlatformMessage;
import com.yzxc.common.message.LoginRequest;
import com.yzxc.common.message.LogoutRequest;
import com.yzxc.common.message.RealTimeReport;
import com.yzxc.common.paltform.LoginPlatform;
import com.yzxc.common.type.FrameHeader;
import com.yzxc.common.type.RequestType;
import com.yzxc.common.type.ResponseTag;
import com.yzxc.common.util.GBT32960Message;
import com.yzxc.common.util.ResponseMessage;
import io.netty.channel.ChannelDuplexHandler;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.timeout.IdleState;
import io.netty.handler.timeout.IdleStateEvent;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutorService;

@Slf4j
@ChannelHandler.Sharable
public class ProtocolNettyHandler extends ChannelDuplexHandler {
    private static final ExecutorService EXECUTOR_SERVICE = ThreadFactoryCustomer.defaultExecutorService();
    @Getter
    private static ProtocolNettyHandler instance = new ProtocolNettyHandler();

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) {
        response(ctx, msg);
    }

    ProtocolNettyHandler() {
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        ctx.close();
    }

    @Override
    public void userEventTriggered(ChannelHandlerContext ctx, Object evt) {
        if (evt instanceof IdleStateEvent) {
            IdleStateEvent e = (IdleStateEvent) evt;
            if (e.state() == IdleState.READER_IDLE) {
                ctx.close();
            }
        }
    }

    private GBT32960Message toGBT32960Message(Object msg) {
        if (msg instanceof GBT32960Message) {
            return (GBT32960Message) msg;
        }
        throw new ClassCastException("数据协议未转换成GBT32960Message对象");
    }

    private void response(ChannelHandlerContext context, Object msg) {
        GBT32960Message message = toGBT32960Message(msg);
        FrameHeader header = message.getHeader();
        switch (header.getRequestType()) {
            case LOGIN:
                loginResponse(context, msg);
            case LOGOUT:
                logoutResponse(context, msg);
            case REISSUE:
                reIssueResponse(context, msg);
            case REAL_TIME:
                realTimeResponse(context, msg);
                EXECUTOR_SERVICE.execute(() -> {
                    RealTimeReport realTimeReport = (RealTimeReport) message.getDataUnit();
                });
                break;
            case PLATFORM_LOGIN:
                platformLoginResponse(context, msg);
                break;
            case PLATFORM_LOGOUT:
                platformLogoutResponse(context, msg);
                break;
            default:
                log.info("处理器未识别到消息命令标识，无法响应客户端！");
                break;
        }
    }

    private void loginResponse(ChannelHandlerContext context, Object msg) {
        GBT32960Message message = toGBT32960Message(msg);
        LoginRequest dataUnit = (LoginRequest) message.getDataUnit();
        String vin = message.getHeader().getVin();
        context.writeAndFlush(responseMessage(vin, RequestType.LOGIN, ResponseTag.SUCCESS));
    }

    private void logoutResponse(ChannelHandlerContext context, Object msg) {
        GBT32960Message message = toGBT32960Message(msg);
        LogoutRequest dataUnit = (LogoutRequest) message.getDataUnit();
        String vin = message.getHeader().getVin();
        context.writeAndFlush(responseMessage(vin, RequestType.LOGOUT, ResponseTag.SUCCESS));
    }

    private void reIssueResponse(ChannelHandlerContext context, Object msg) {
        GBT32960Message message = toGBT32960Message(msg);
        RealTimeReport dataUnit = (RealTimeReport) message.getDataUnit();
        String vin = message.getHeader().getVin();
        context.writeAndFlush(responseMessage(vin, RequestType.REISSUE, ResponseTag.SUCCESS));
    }

    private void realTimeResponse(ChannelHandlerContext context, Object msg) {
        GBT32960Message message = toGBT32960Message(msg);
        RealTimeReport dataUnit = (RealTimeReport) message.getDataUnit();
        String vin = message.getHeader().getVin();
        context.writeAndFlush(responseMessage(vin, RequestType.REAL_TIME, ResponseTag.SUCCESS));
    }

    private ResponseMessage responseMessage(String vin, RequestType requestType, ResponseTag responseTag) {
        ResponseMessage responseMessage = new ResponseMessage();
        responseMessage.setVin(vin);
        PlatformMessage platformMessage = new PlatformMessage();
        platformMessage.setRequestType(requestType);
        platformMessage.setResponseTag(responseTag);
        platformMessage.setData(null);
        responseMessage.setMessage(platformMessage);
        return responseMessage;
    }

    private void platformLoginResponse(ChannelHandlerContext context, Object msg) {
        GBT32960Message message = toGBT32960Message(msg);
        FrameHeader header = message.getHeader();
        LoginPlatform loginPlatform = (LoginPlatform) message.getDataUnit();

        String username = loginPlatform.getUsername();
        String password = loginPlatform.getPassword();
        context.writeAndFlush(responseMessage(header.getVin(), RequestType.PLATFORM_LOGIN, ResponseTag.FAILED));
    }

    private void platformLogoutResponse(ChannelHandlerContext context, Object msg) {
        GBT32960Message message = toGBT32960Message(msg);
        LoginPlatform dataUnit = (LoginPlatform) message.getDataUnit();
        String vin = message.getHeader().getVin();
        context.writeAndFlush(responseMessage(vin, RequestType.PLATFORM_LOGOUT, ResponseTag.FAILED));
    }
}