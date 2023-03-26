package com.yzxc.common.type;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ResponseTag {

    SUCCESS((byte) 0x01),
    FAILED((byte) 0x02),
    VIN_DUP((byte) 0x03),
    COMMAND((byte) 0xFE);

    private final byte value;


    public static ResponseTag valueOf(byte type) {
        for (ResponseTag t : values()) {
            if (t.value == type) {
                return t;
            }
        }
        throw new IllegalArgumentException("Unknown reply flag definition type: " + type);
    }

}
