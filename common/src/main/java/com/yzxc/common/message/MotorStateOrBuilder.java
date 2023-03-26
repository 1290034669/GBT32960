package com.yzxc.common.message;

public interface MotorStateOrBuilder extends
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int64 motor_seq = 1;</code>
   */
  long getMotorSeq();

  /**
   * <code>optional .MotorState.MotorStatus status = 8;</code>
   */
  int getStatusValue();
  /**
   * <code>optional .MotorState.MotorStatus status = 8;</code>
   */
  MotorState.MotorStatus getStatus();

  /**
   * <code>optional int32 controller_temperature = 2;</code>
   */
  int getControllerTemperature();

  /**
   * <code>optional int32 motor_speed = 3;</code>
   */
  int getMotorSpeed();

  /**
   * <code>optional float motor_torque = 4;</code>
   */
  float getMotorTorque();

  /**
   * <code>optional int32 motor_temperature = 5;</code>
   */
  int getMotorTemperature();

  /**
   * <code>optional float controller_voltage = 6;</code>
   */
  float getControllerVoltage();

  /**
   * <code>optional float controller_current = 7;</code>
   */
  float getControllerCurrent();
}
