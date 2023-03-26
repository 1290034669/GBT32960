package com.yzxc.common.type;

import io.netty.util.ByteProcessor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@ToString
public class FrameHeader {

    public static final int HEADER_LENGTH = 22;

    private final RequestType requestType;
    private final ResponseTag responseTag;
    private final String vin;
    private final EncryptionType encryptionType;
    private final int payloadLength;
    private final String hex;

    public static final class CheckCodeProcessor implements ByteProcessor {

        @Getter
        private byte checkCode = (byte) 0x00;

        @Override
        public boolean process(byte value) {
            checkCode ^= value;
            return true;
        }
    }

}
