// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gbt3260.proto

package com.yzxc.common.message;

public interface ProtoResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ProtoResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int32 messsage_type = 1;</code>
   */
  int getMesssageType();

  /**
   * <code>optional int32 result = 2;</code>
   */
  int getResult();

  /**
   * <code>optional .LoginRequest login = 3;</code>
   */
  LoginRequest getLogin();
  /**
   * <code>optional .LoginRequest login = 3;</code>
   */
  LoginRequestOrBuilder getLoginOrBuilder();

  public ProtoResponse.ProtoCase getProtoCase();
}
