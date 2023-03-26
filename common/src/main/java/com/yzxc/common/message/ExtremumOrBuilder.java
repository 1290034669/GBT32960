package com.yzxc.common.message;

public interface ExtremumOrBuilder extends
        com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int32 voltage_max_subsystem = 1;</code>
     */
    int getVoltageMaxSubsystem();

    /**
     * <code>optional int32 voltage_max_battery = 2;</code>
     */
    int getVoltageMaxBattery();

    /**
     * <code>optional float max_voltage = 3;</code>
     */
    float getMaxVoltage();

    /**
     * <code>optional int32 voltage_min_subsystem = 4;</code>
     */
    int getVoltageMinSubsystem();

    /**
     * <code>optional int32 voltage_min_battery = 5;</code>
     */
    int getVoltageMinBattery();

    /**
     * <code>optional float min_voltage = 6;</code>
     */
    float getMinVoltage();

    /**
     * <code>optional int32 temperature_max_subsystem = 7;</code>
     */
    int getTemperatureMaxSubsystem();

    /**
     * <code>optional int32 temperature_max_probe = 8;</code>
     */
    int getTemperatureMaxProbe();

    /**
     * <code>optional int32 max_temperature = 9;</code>
     */
    int getMaxTemperature();

    /**
     * <code>optional int32 temperature_min_subsystem = 10;</code>
     */
    int getTemperatureMinSubsystem();

    /**
     * <code>optional int32 temperature_min_probe = 11;</code>
     */
    int getTemperatureMinProbe();

    /**
     * <code>optional int32 min_temperature = 12;</code>
     */
    int getMinTemperature();
}
