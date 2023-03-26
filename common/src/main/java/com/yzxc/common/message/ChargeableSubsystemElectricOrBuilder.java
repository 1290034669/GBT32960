package com.yzxc.common.message;

public interface ChargeableSubsystemElectricOrBuilder extends
        com.google.protobuf.MessageOrBuilder {

    int getChargeableSubSystemNumber();

    float getVoltage();

    float getCurrent();

    long getBatteryTotalCount();

    long getFrameStartBatterySeq();

    java.util.List<Float> getBatteryVoltageList();

    int getBatteryVoltageCount();

    float getBatteryVoltage(int index);
}
