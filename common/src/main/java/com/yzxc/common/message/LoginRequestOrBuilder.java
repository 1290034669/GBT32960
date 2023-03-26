package com.yzxc.common.message;

public interface LoginRequestOrBuilder extends
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int64 record_time = 1;</code>
   */
  long getRecordTime();

  /**
   * <code>optional int32 login_day_seq = 2;</code>
   */
  int getLoginDaySeq();

  /**
   * <code>optional string iccid = 3;</code>
   */
  String getIccid();
  /**
   * <code>optional string iccid = 3;</code>
   */
  com.google.protobuf.ByteString
      getIccidBytes();

  /**
   * <code>optional int32 system_code_length = 4;</code>
   */
  int getSystemCodeLength();

  /**
   * <code>repeated string chargeable_subsystem_code = 5;</code>
   */
  java.util.List<String>
      getChargeableSubsystemCodeList();
  /**
   * <code>repeated string chargeable_subsystem_code = 5;</code>
   */
  int getChargeableSubsystemCodeCount();
  /**
   * <code>repeated string chargeable_subsystem_code = 5;</code>
   */
  String getChargeableSubsystemCode(int index);
  /**
   * <code>repeated string chargeable_subsystem_code = 5;</code>
   */
  com.google.protobuf.ByteString
      getChargeableSubsystemCodeBytes(int index);
}
