package com.yzxc.common.message;

public interface EngineOrBuilder extends
        com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * 发动机状态
     * </pre>
     *
     * <code>optional .Engine.EngineState engine_state = 1;</code>
     */
    int getEngineStateValue();

    /**
     * <pre>
     * 发动机状态
     * </pre>
     *
     * <code>optional .Engine.EngineState engine_state = 1;</code>
     */
    Engine.EngineState getEngineState();

    /**
     * <pre>
     * 曲轴转速
     * </pre>
     *
     * <code>optional int32 crankshaft_speed = 2;</code>
     */
    int getCrankshaftSpeed();

    /**
     * <pre>
     * 燃料消耗率
     * </pre>
     *
     * <code>optional double fuel_consumption_rate = 3;</code>
     */
    double getFuelConsumptionRate();
}
