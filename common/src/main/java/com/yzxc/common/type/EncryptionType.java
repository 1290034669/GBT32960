package com.yzxc.common.type;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum EncryptionType {

    PLAIN((byte) 0x01),
    RSA((byte) 0x02),
    AES128((byte) 0x03),
    ABNORMAL((byte) 0xFE),
    INVALID((byte) 0xFF);

    private final byte value;

    public static EncryptionType valueOf(byte type) {
        for (EncryptionType t : values()) {
            if (t.value == type) {
                return t;
            }
        }
        throw new IllegalArgumentException("Unknown encryption rule: " + type);
    }

}
