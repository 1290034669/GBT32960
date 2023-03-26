package com.yzxc.common.paltform;

import com.yzxc.common.type.RequestType;
import com.yzxc.common.type.ResponseTag;
import com.yzxc.common.util.GBT32960Message;
import io.netty.buffer.ByteBuf;
import lombok.Data;

import java.nio.charset.StandardCharsets;
import java.time.Instant;

@Data
public class PlatformMessage {

    private RequestType requestType;
    private ResponseTag responseTag;
    private LoginPlatform data;

    public void encoderData(ByteBuf out, LoginPlatform data) {
        GBT32960Message.writeTime(out, Instant.now());
        out.writeShort(data.getLoginDaySeq());
        out.writeBytes(data.getUsername().getBytes(StandardCharsets.US_ASCII));
        out.writeBytes(data.getPassword().getBytes(StandardCharsets.US_ASCII));
        out.writeByte(data.getEncryption());
    }


}
