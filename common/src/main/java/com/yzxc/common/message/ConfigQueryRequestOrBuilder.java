package com.yzxc.common.message;

public interface ConfigQueryRequestOrBuilder extends
        com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int64 query_time = 1;</code>
     */
    long getQueryTime();

    /**
     * <code>repeated int32 parameter_ids = 2;</code>
     */
    java.util.List<Integer> getParameterIdsList();

    /**
     * <code>repeated int32 parameter_ids = 2;</code>
     */
    int getParameterIdsCount();

    /**
     * <code>repeated int32 parameter_ids = 2;</code>
     */
    int getParameterIds(int index);
}
