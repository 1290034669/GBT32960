package com.yzxc.electrical.netty;

import com.yzxc.electrical.netty.codec.GBT32960Decoder;
import com.yzxc.electrical.netty.codec.GBT32960Encoder;
import com.yzxc.electrical.netty.handler.ProtocolNettyHandler;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.timeout.IdleStateHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class NettyServer implements CommandLineRunner {
    @Value("${gps.socket.tcpPort}")
    private int LISTEN_PORT;
    private final EventLoopGroup bossGroup = new NioEventLoopGroup();
    private final EventLoopGroup workGroup = new NioEventLoopGroup();

    @Override
    public void run(String... args) {
        try {
            ServerBootstrap bootstrap = new ServerBootstrap();
            bootstrap.group(bossGroup, workGroup)
                    .channel(NioServerSocketChannel.class)
                    .option(ChannelOption.SO_BACKLOG, 1024)
                    .childOption(ChannelOption.SO_KEEPALIVE, true)
                    .childHandler(new ChannelInitializer<SocketChannel>() {
                        @Override
                        protected void initChannel(SocketChannel ch) {
                            ch.pipeline().addLast(new GBT32960Decoder());
                            ch.pipeline().addLast(new GBT32960Encoder());
                            ch.pipeline().addLast(new IdleStateHandler(60 * 5, 0, 0));
                            ch.pipeline().addLast(ProtocolNettyHandler.getInstance());
                        }
                    });

            log.info(".....Netty-GBT32960服务启动成功！.....");
            ChannelFuture cf = bootstrap.bind(LISTEN_PORT).sync();
            cf.addListener((ChannelFutureListener) future -> {
                if (cf.isSuccess()) {
                    log.info("GBT32960服务-监听端口{}成功!", LISTEN_PORT);
                } else {
                    log.error("GBT32960服务-监听端口{}失败!", LISTEN_PORT);
                }
            });
            cf.channel().closeFuture().sync();
        } catch (Exception e) {
            log.error(" Netty-GBT32960服务启动异常：{}", e.getMessage());
        } finally {
            bossGroup.shutdownGracefully();
            workGroup.shutdownGracefully();
        }
    }
}
