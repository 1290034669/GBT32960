package com.yzxc.common.type;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum RealTimeType {

    VEHICLE((byte) 0x01),
    MOTOR((byte) 0x02),
    FUEL_CELL((byte) 0x03),
    ENGINE((byte) 0x04),
    LOCATION((byte) 0x05),
    EXTREMUM((byte) 0x06),
    ALARM((byte) 0x07),
    BATTERY_VOLTAGE((byte) 0x08),
    BATTERY_TEMPERATURE((byte) 0x09);

    private final byte value;

    public static RealTimeType valueOf(byte type) {
        for (RealTimeType t : values()) {
            if (t.value == type) {
                return t;
            }
        }
        throw new IllegalArgumentException("未知的信息类型标志定义: " + type);
    }

}
