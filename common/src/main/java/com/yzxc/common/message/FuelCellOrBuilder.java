package com.yzxc.common.message;

public interface FuelCellOrBuilder extends
        com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional double fuel_cell_voltage = 1;</code>
     */
    double getFuelCellVoltage();

    /**
     * <code>optional double fuel_cell_current = 2;</code>
     */
    double getFuelCellCurrent();

    /**
     * <code>optional double fuel_consumption_rate = 3;</code>
     */
    double getFuelConsumptionRate();

    /**
     * <code>optional int32 total_number_of_fctp = 4;</code>
     */
    int getTotalNumberOfFctp();

    /**
     * <code>repeated int32 probe_temperature_value = 5;</code>
     */
    java.util.List<Integer> getProbeTemperatureValueList();

    /**
     * <code>repeated int32 probe_temperature_value = 5;</code>
     */
    int getProbeTemperatureValueCount();

    /**
     * <code>repeated int32 probe_temperature_value = 5;</code>
     */
    int getProbeTemperatureValue(int index);

    /**
     * <code>optional double highest_temp_of_hydrogen_system = 6;</code>
     */
    double getHighestTempOfHydrogenSystem();

    /**
     * <code>optional int32 highest_temp_probe_code_of_hyd_sys = 7;</code>
     */
    int getHighestTempProbeCodeOfHydSys();

    /**
     * <code>optional int32 highest_con_of_hydrogen = 8;</code>
     */
    int getHighestConOfHydrogen();

    /**
     * <code>optional int32 highest_hy_con_sensor_code = 9;</code>
     */
    int getHighestHyConSensorCode();

    /**
     * <code>optional double hydrogen_max_pressure = 10;</code>
     */
    double getHydrogenMaxPressure();

    /**
     * <code>optional int32 hydrogen_max_pressure_sensor_code = 11;</code>
     */
    int getHydrogenMaxPressureSensorCode();

    /**
     * <code>optional .FuelCell.HighVoltageDCState high_voltage_dc_state = 12;</code>
     */
    int getHighVoltageDcStateValue();

    /**
     * <code>optional .FuelCell.HighVoltageDCState high_voltage_dc_state = 12;</code>
     */
    FuelCell.HighVoltageDCState getHighVoltageDcState();
}
