package com.yzxc.common.message;

public interface ControlCommandOrBuilder extends
        com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int64 request_time = 1;</code>
     */
    long getRequestTime();

    /**
     * <code>optional .CommandType command = 2;</code>
     */
    int getCommandValue();

    /**
     * <code>optional .CommandType command = 2;</code>
     */
    CommandType getCommand();
}
