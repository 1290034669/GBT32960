package com.yzxc.common.message;

public final class Engine extends
        com.google.protobuf.GeneratedMessageV3 implements
        EngineOrBuilder {
    private Engine(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private Engine() {
        engineState_ = 0;
        crankshaftSpeed_ = 0;
        fuelConsumptionRate_ = 0D;
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
        return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }

    private Engine(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        this();
        int mutable_bitField0_ = 0;
        try {
            boolean done = false;
            while (!done) {
                int tag = input.readTag();
                switch (tag) {
                    case 0:
                        done = true;
                        break;
                    default: {
                        if (!input.skipField(tag)) {
                            done = true;
                        }
                        break;
                    }
                    case 8: {
                        int rawValue = input.readEnum();

                        engineState_ = rawValue;
                        break;
                    }
                    case 16: {

                        crankshaftSpeed_ = input.readInt32();
                        break;
                    }
                    case 25: {

                        fuelConsumptionRate_ = input.readDouble();
                        break;
                    }
                }
            }
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(this);
        } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(
                    e).setUnfinishedMessage(this);
        } finally {
            makeExtensionsImmutable();
        }
    }

    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
        return Gbt3260.internal_static_com_ime_iov_gbt32960_Engine_descriptor;
    }

    protected FieldAccessorTable
    internalGetFieldAccessorTable() {
        return Gbt3260.internal_static_com_ime_iov_gbt32960_Engine_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                        Engine.class, Builder.class);
    }

    /**
     * Protobuf enum {@code Engine.EngineState}
     */
    public enum EngineState
            implements com.google.protobuf.ProtocolMessageEnum {
        /**
         * <pre>
         * unused
         * </pre>
         *
         * <code>_1 = 0;</code>
         */
        _1(0),
        /**
         * <pre>
         * 启动
         * </pre>
         *
         * <code>START = 1;</code>
         */
        START(1),
        /**
         * <pre>
         * 关闭
         * </pre>
         *
         * <code>CLOSE = 2;</code>
         */
        CLOSE(2),
        /**
         * <code>ENGINE_EXCEPTION = 254;</code>
         */
        ENGINE_EXCEPTION(254),
        /**
         * <code>ENGINE_INVALID = 255;</code>
         */
        ENGINE_INVALID(255),
        UNRECOGNIZED(-1),
        ;

        /**
         * <pre>
         * unused
         * </pre>
         *
         * <code>_1 = 0;</code>
         */
        public static final int _1_VALUE = 0;
        /**
         * <pre>
         * 启动
         * </pre>
         *
         * <code>START = 1;</code>
         */
        public static final int START_VALUE = 1;
        /**
         * <pre>
         * 关闭
         * </pre>
         *
         * <code>CLOSE = 2;</code>
         */
        public static final int CLOSE_VALUE = 2;
        /**
         * <code>ENGINE_EXCEPTION = 254;</code>
         */
        public static final int ENGINE_EXCEPTION_VALUE = 254;
        /**
         * <code>ENGINE_INVALID = 255;</code>
         */
        public static final int ENGINE_INVALID_VALUE = 255;


        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new IllegalArgumentException(
                        "Can't get the number of an unknown enum value.");
            }
            return value;
        }

        /**
         * @deprecated Use {@link #forNumber(int)} instead.
         */
        @Deprecated
        public static EngineState valueOf(int value) {
            return forNumber(value);
        }

        public static EngineState forNumber(int value) {
            switch (value) {
                case 0:
                    return _1;
                case 1:
                    return START;
                case 2:
                    return CLOSE;
                case 254:
                    return ENGINE_EXCEPTION;
                case 255:
                    return ENGINE_INVALID;
                default:
                    return null;
            }
        }

        public static com.google.protobuf.Internal.EnumLiteMap<EngineState>
        internalGetValueMap() {
            return internalValueMap;
        }

        private static final com.google.protobuf.Internal.EnumLiteMap<
                EngineState> internalValueMap =
                new com.google.protobuf.Internal.EnumLiteMap<EngineState>() {
                    public EngineState findValueByNumber(int number) {
                        return EngineState.forNumber(number);
                    }
                };

        public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
            return getDescriptor().getValues().get(ordinal());
        }

        public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
            return getDescriptor();
        }

        public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
            return Engine.getDescriptor().getEnumTypes().get(0);
        }

        private static final EngineState[] VALUES = values();

        public static EngineState valueOf(
                com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != getDescriptor()) {
                throw new IllegalArgumentException(
                        "EnumValueDescriptor is not for this type.");
            }
            if (desc.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[desc.getIndex()];
        }

        private final int value;

        private EngineState(int value) {
            this.value = value;
        }

        // @@protoc_insertion_point(enum_scope:Engine.EngineState)
    }

    public static final int ENGINE_STATE_FIELD_NUMBER = 1;
    private int engineState_;

    /**
     * <pre>
     * 发动机状态
     * </pre>
     *
     * <code>optional .Engine.EngineState engine_state = 1;</code>
     */
    public int getEngineStateValue() {
        return engineState_;
    }

    /**
     * <pre>
     * 发动机状态
     * </pre>
     *
     * <code>optional .Engine.EngineState engine_state = 1;</code>
     */
    public EngineState getEngineState() {
        EngineState result = EngineState.valueOf(engineState_);
        return result == null ? EngineState.UNRECOGNIZED : result;
    }

    public static final int CRANKSHAFT_SPEED_FIELD_NUMBER = 2;
    private int crankshaftSpeed_;

    /**
     * <pre>
     * 曲轴转速
     * </pre>
     *
     * <code>optional int32 crankshaft_speed = 2;</code>
     */
    public int getCrankshaftSpeed() {
        return crankshaftSpeed_;
    }

    public static final int FUEL_CONSUMPTION_RATE_FIELD_NUMBER = 3;
    private double fuelConsumptionRate_;

    /**
     * <pre>
     * 燃料消耗率
     * </pre>
     *
     * <code>optional double fuel_consumption_rate = 3;</code>
     */
    public double getFuelConsumptionRate() {
        return fuelConsumptionRate_;
    }

    private byte memoizedIsInitialized = -1;

    public final boolean isInitialized() {
        byte isInitialized = memoizedIsInitialized;
        if (isInitialized == 1) return true;
        if (isInitialized == 0) return false;

        memoizedIsInitialized = 1;
        return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
            throws java.io.IOException {
        if (engineState_ != EngineState._1.getNumber()) {
            output.writeEnum(1, engineState_);
        }
        if (crankshaftSpeed_ != 0) {
            output.writeInt32(2, crankshaftSpeed_);
        }
        if (fuelConsumptionRate_ != 0D) {
            output.writeDouble(3, fuelConsumptionRate_);
        }
    }

    public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) return size;

        size = 0;
        if (engineState_ != EngineState._1.getNumber()) {
            size += com.google.protobuf.CodedOutputStream
                    .computeEnumSize(1, engineState_);
        }
        if (crankshaftSpeed_ != 0) {
            size += com.google.protobuf.CodedOutputStream
                    .computeInt32Size(2, crankshaftSpeed_);
        }
        if (fuelConsumptionRate_ != 0D) {
            size += com.google.protobuf.CodedOutputStream
                    .computeDoubleSize(3, fuelConsumptionRate_);
        }
        memoizedSize = size;
        return size;
    }

    private static final long serialVersionUID = 0L;

    @Override
    public boolean equals(final Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Engine)) {
            return super.equals(obj);
        }
        Engine other = (Engine) obj;

        boolean result = true;
        result = result && engineState_ == other.engineState_;
        result = result && (getCrankshaftSpeed()
                == other.getCrankshaftSpeed());
        result = result && (
                Double.doubleToLongBits(getFuelConsumptionRate())
                        == Double.doubleToLongBits(
                        other.getFuelConsumptionRate()));
        return result;
    }

    @Override
    public int hashCode() {
        if (memoizedHashCode != 0) {
            return memoizedHashCode;
        }
        int hash = 41;
        hash = (19 * hash) + getDescriptorForType().hashCode();
        hash = (37 * hash) + ENGINE_STATE_FIELD_NUMBER;
        hash = (53 * hash) + engineState_;
        hash = (37 * hash) + CRANKSHAFT_SPEED_FIELD_NUMBER;
        hash = (53 * hash) + getCrankshaftSpeed();
        hash = (37 * hash) + FUEL_CONSUMPTION_RATE_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                Double.doubleToLongBits(getFuelConsumptionRate()));
        hash = (29 * hash) + unknownFields.hashCode();
        memoizedHashCode = hash;
        return hash;
    }

    public static Engine parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static Engine parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static Engine parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static Engine parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static Engine parseFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static Engine parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static Engine parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input);
    }

    public static Engine parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static Engine parseFrom(
            com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static Engine parseFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(Engine prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE
                ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
            BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
    }

    /**
     * <pre>
     * 发动机数据
     * </pre>
     * <p>
     * Protobuf type {@code Engine}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
            // @@protoc_insertion_point(builder_implements:Engine)
            EngineOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return Gbt3260.internal_static_com_ime_iov_gbt32960_Engine_descriptor;
        }

        protected FieldAccessorTable
        internalGetFieldAccessorTable() {
            return Gbt3260.internal_static_com_ime_iov_gbt32960_Engine_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            Engine.class, Builder.class);
        }

        // Construct using Engine.newBuilder()
        private Builder() {
            maybeForceBuilderInitialization();
        }

        private Builder(
                BuilderParent parent) {
            super(parent);
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            if (com.google.protobuf.GeneratedMessageV3
                    .alwaysUseFieldBuilders) {
            }
        }

        public Builder clear() {
            super.clear();
            engineState_ = 0;

            crankshaftSpeed_ = 0;

            fuelConsumptionRate_ = 0D;

            return this;
        }

        public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
            return Gbt3260.internal_static_com_ime_iov_gbt32960_Engine_descriptor;
        }

        public Engine getDefaultInstanceForType() {
            return Engine.getDefaultInstance();
        }

        public Engine build() {
            Engine result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        public Engine buildPartial() {
            Engine result = new Engine(this);
            result.engineState_ = engineState_;
            result.crankshaftSpeed_ = crankshaftSpeed_;
            result.fuelConsumptionRate_ = fuelConsumptionRate_;
            onBuilt();
            return result;
        }

        public Builder clone() {
            return (Builder) super.clone();
        }

        public Builder setField(
                com.google.protobuf.Descriptors.FieldDescriptor field,
                Object value) {
            return (Builder) super.setField(field, value);
        }

        public Builder clearField(
                com.google.protobuf.Descriptors.FieldDescriptor field) {
            return (Builder) super.clearField(field);
        }

        public Builder clearOneof(
                com.google.protobuf.Descriptors.OneofDescriptor oneof) {
            return (Builder) super.clearOneof(oneof);
        }

        public Builder setRepeatedField(
                com.google.protobuf.Descriptors.FieldDescriptor field,
                int index, Object value) {
            return (Builder) super.setRepeatedField(field, index, value);
        }

        public Builder addRepeatedField(
                com.google.protobuf.Descriptors.FieldDescriptor field,
                Object value) {
            return (Builder) super.addRepeatedField(field, value);
        }

        public Builder mergeFrom(com.google.protobuf.Message other) {
            if (other instanceof Engine) {
                return mergeFrom((Engine) other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(Engine other) {
            if (other == Engine.getDefaultInstance()) return this;
            if (other.engineState_ != 0) {
                setEngineStateValue(other.getEngineStateValue());
            }
            if (other.getCrankshaftSpeed() != 0) {
                setCrankshaftSpeed(other.getCrankshaftSpeed());
            }
            if (other.getFuelConsumptionRate() != 0D) {
                setFuelConsumptionRate(other.getFuelConsumptionRate());
            }
            onChanged();
            return this;
        }

        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            Engine parsedMessage = null;
            try {
                parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                parsedMessage = (Engine) e.getUnfinishedMessage();
                throw e.unwrapIOException();
            } finally {
                if (parsedMessage != null) {
                    mergeFrom(parsedMessage);
                }
            }
            return this;
        }

        private int engineState_ = 0;

        /**
         * <pre>
         * 发动机状态
         * </pre>
         *
         * <code>optional .Engine.EngineState engine_state = 1;</code>
         */
        public int getEngineStateValue() {
            return engineState_;
        }

        /**
         * <pre>
         * 发动机状态
         * </pre>
         *
         * <code>optional .Engine.EngineState engine_state = 1;</code>
         */
        public Builder setEngineStateValue(int value) {
            engineState_ = value;
            onChanged();
            return this;
        }

        /**
         * <pre>
         * 发动机状态
         * </pre>
         *
         * <code>optional .Engine.EngineState engine_state = 1;</code>
         */
        public EngineState getEngineState() {
            EngineState result = EngineState.valueOf(engineState_);
            return result == null ? EngineState.UNRECOGNIZED : result;
        }

        /**
         * <pre>
         * 发动机状态
         * </pre>
         *
         * <code>optional .Engine.EngineState engine_state = 1;</code>
         */
        public Builder setEngineState(EngineState value) {
            if (value == null) {
                throw new NullPointerException();
            }

            engineState_ = value.getNumber();
            onChanged();
            return this;
        }

        /**
         * <pre>
         * 发动机状态
         * </pre>
         *
         * <code>optional .Engine.EngineState engine_state = 1;</code>
         */
        public Builder clearEngineState() {

            engineState_ = 0;
            onChanged();
            return this;
        }

        private int crankshaftSpeed_;

        /**
         * <pre>
         * 曲轴转速
         * </pre>
         *
         * <code>optional int32 crankshaft_speed = 2;</code>
         */
        public int getCrankshaftSpeed() {
            return crankshaftSpeed_;
        }

        /**
         * <pre>
         * 曲轴转速
         * </pre>
         *
         * <code>optional int32 crankshaft_speed = 2;</code>
         */
        public Builder setCrankshaftSpeed(int value) {

            crankshaftSpeed_ = value;
            onChanged();
            return this;
        }

        /**
         * <pre>
         * 曲轴转速
         * </pre>
         *
         * <code>optional int32 crankshaft_speed = 2;</code>
         */
        public Builder clearCrankshaftSpeed() {

            crankshaftSpeed_ = 0;
            onChanged();
            return this;
        }

        private double fuelConsumptionRate_;

        /**
         * <pre>
         * 燃料消耗率
         * </pre>
         *
         * <code>optional double fuel_consumption_rate = 3;</code>
         */
        public double getFuelConsumptionRate() {
            return fuelConsumptionRate_;
        }

        /**
         * <pre>
         * 燃料消耗率
         * </pre>
         *
         * <code>optional double fuel_consumption_rate = 3;</code>
         */
        public Builder setFuelConsumptionRate(double value) {

            fuelConsumptionRate_ = value;
            onChanged();
            return this;
        }

        /**
         * <pre>
         * 燃料消耗率
         * </pre>
         *
         * <code>optional double fuel_consumption_rate = 3;</code>
         */
        public Builder clearFuelConsumptionRate() {

            fuelConsumptionRate_ = 0D;
            onChanged();
            return this;
        }

        public final Builder setUnknownFields(
                final com.google.protobuf.UnknownFieldSet unknownFields) {
            return this;
        }

        public final Builder mergeUnknownFields(
                final com.google.protobuf.UnknownFieldSet unknownFields) {
            return this;
        }


        // @@protoc_insertion_point(builder_scope:Engine)
    }

    // @@protoc_insertion_point(class_scope:Engine)
    private static final Engine DEFAULT_INSTANCE;

    static {
        DEFAULT_INSTANCE = new Engine();
    }

    public static Engine getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Engine>
            PARSER = new com.google.protobuf.AbstractParser<Engine>() {
        public Engine parsePartialFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return new Engine(input, extensionRegistry);
        }
    };

    public static com.google.protobuf.Parser<Engine> parser() {
        return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<Engine> getParserForType() {
        return PARSER;
    }

    public Engine getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

}

