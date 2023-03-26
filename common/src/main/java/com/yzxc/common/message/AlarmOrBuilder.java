package com.yzxc.common.message;

public interface AlarmOrBuilder extends
        com.google.protobuf.MessageOrBuilder {

    int getMaxAlarmLevel();

    int getAlarmBitIdentify();

    int getBatteryFaultNum();

    java.util.List<Integer> getBatteryFaultDataList();

    int getBatteryFaultDataCount();

    int getBatteryFaultData(int index);

    int getMotorFaultNum();

    java.util.List<Integer> getMotorFaultDataList();

    int getMotorFaultDataCount();

    int getMotorFaultData(int index);

    int getEngineFaultNum();

    java.util.List<Integer> getEngineFaultDataList();

    int getEngineFaultDataCount();

    int getEngineFaultData(int index);

    int getOtherFaultNum();

    java.util.List<Integer> getOtherFaultDataList();

    int getOtherFaultDataCount();

    int getOtherFaultData(int index);
}
