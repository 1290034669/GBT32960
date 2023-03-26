package com.yzxc.common.type;

import lombok.AllArgsConstructor;
import lombok.Getter;
@AllArgsConstructor
@Getter
public enum RequestType {
    LOGIN((byte) 0x01),
    REAL_TIME((byte) 0x02),
    REISSUE((byte) 0x03),
    LOGOUT((byte) 0x04),
    PLATFORM_LOGIN((byte) 0x05),
    PLATFORM_LOGOUT((byte) 0x06),
    HEARTBEAT((byte) 0x07),
    CLOCK_CORRECT((byte) 0x08),
    CONFIG_QUERY((byte) 0x80),
    CONFIG_SETUP((byte) 0x81),
    CONTROL((byte) 0x82),

    PLATFORM_LOGIN_RESPONSE((byte) 0xC0),
    PLATFORM_LOGOUT_RESPONSE((byte) 0xC1),
    REALTIME_RESPONSE((byte) 0xC2);

    private final byte value;

    public static RequestType valueOf(byte type) {
        for (RequestType t : values()) {
            if (t.value == type) {
                return t;
            }
        }
        throw new IllegalArgumentException("Unknown command flag definition : " + type);
    }

}
