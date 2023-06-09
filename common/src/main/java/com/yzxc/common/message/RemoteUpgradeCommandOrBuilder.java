// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gbt3260.proto

package com.yzxc.common.message;

public interface RemoteUpgradeCommandOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.ime.iov.gbt32960.RemoteUpgradeCommand)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int64 request_time = 11;</code>
   */
  long getRequestTime();

  /**
   * <code>optional string dial_name = 1;</code>
   */
  String getDialName();
  /**
   * <code>optional string dial_name = 1;</code>
   */
  com.google.protobuf.ByteString
      getDialNameBytes();

  /**
   * <code>optional string dial_account = 2;</code>
   */
  String getDialAccount();
  /**
   * <code>optional string dial_account = 2;</code>
   */
  com.google.protobuf.ByteString
      getDialAccountBytes();

  /**
   * <code>optional string dial_password = 3;</code>
   */
  String getDialPassword();
  /**
   * <code>optional string dial_password = 3;</code>
   */
  com.google.protobuf.ByteString
      getDialPasswordBytes();

  /**
   * <code>optional string address = 4;</code>
   */
  String getAddress();
  /**
   * <code>optional string address = 4;</code>
   */
  com.google.protobuf.ByteString
      getAddressBytes();

  /**
   * <code>optional int32 port = 5;</code>
   */
  int getPort();

  /**
   * <code>optional string terminal_manufacturer_id = 6;</code>
   */
  String getTerminalManufacturerId();
  /**
   * <code>optional string terminal_manufacturer_id = 6;</code>
   */
  com.google.protobuf.ByteString
      getTerminalManufacturerIdBytes();

  /**
   * <code>optional string hardware_version = 7;</code>
   */
  String getHardwareVersion();
  /**
   * <code>optional string hardware_version = 7;</code>
   */
  com.google.protobuf.ByteString
      getHardwareVersionBytes();

  /**
   * <code>optional string firmware_version = 8;</code>
   */
  String getFirmwareVersion();
  /**
   * <code>optional string firmware_version = 8;</code>
   */
  com.google.protobuf.ByteString
      getFirmwareVersionBytes();

  /**
   * <code>optional string upgrade_url = 9;</code>
   */
  String getUpgradeUrl();
  /**
   * <code>optional string upgrade_url = 9;</code>
   */
  com.google.protobuf.ByteString
      getUpgradeUrlBytes();

  /**
   * <code>optional int32 upgrade_time_limit = 10;</code>
   */
  int getUpgradeTimeLimit();
}
