package com.yzxc.common.message;

public final class PlatformMessage extends
        com.google.protobuf.GeneratedMessageV3 implements
        PlatformMessageOrBuilder {
    private PlatformMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private PlatformMessage() {
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
        return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }

    private PlatformMessage(
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
                    case 18: {
                        ConfigQueryRequest.Builder subBuilder = null;
                        if (messageCase_ == 2) {
                            subBuilder = ((ConfigQueryRequest) message_).toBuilder();
                        }
                        message_ =
                                input.readMessage(ConfigQueryRequest.parser(), extensionRegistry);
                        if (subBuilder != null) {
                            subBuilder.mergeFrom((ConfigQueryRequest) message_);
                            message_ = subBuilder.buildPartial();
                        }
                        messageCase_ = 2;
                        break;
                    }
                    case 26: {
                        ConfigSetupRequest.Builder subBuilder = null;
                        if (messageCase_ == 3) {
                            subBuilder = ((ConfigSetupRequest) message_).toBuilder();
                        }
                        message_ =
                                input.readMessage(ConfigSetupRequest.parser(), extensionRegistry);
                        if (subBuilder != null) {
                            subBuilder.mergeFrom((ConfigSetupRequest) message_);
                            message_ = subBuilder.buildPartial();
                        }
                        messageCase_ = 3;
                        break;
                    }
                    case 34: {
                        RemoteUpgradeCommand.Builder subBuilder = null;
                        if (messageCase_ == 4) {
                            subBuilder = ((RemoteUpgradeCommand) message_).toBuilder();
                        }
                        message_ =
                                input.readMessage(RemoteUpgradeCommand.parser(), extensionRegistry);
                        if (subBuilder != null) {
                            subBuilder.mergeFrom((RemoteUpgradeCommand) message_);
                            message_ = subBuilder.buildPartial();
                        }
                        messageCase_ = 4;
                        break;
                    }
                    case 42: {
                        Warning.Builder subBuilder = null;
                        if (messageCase_ == 5) {
                            subBuilder = ((Warning) message_).toBuilder();
                        }
                        message_ =
                                input.readMessage(Warning.parser(), extensionRegistry);
                        if (subBuilder != null) {
                            subBuilder.mergeFrom((Warning) message_);
                            message_ = subBuilder.buildPartial();
                        }
                        messageCase_ = 5;
                        break;
                    }
                    case 50: {
                        ControlCommand.Builder subBuilder = null;
                        if (messageCase_ == 6) {
                            subBuilder = ((ControlCommand) message_).toBuilder();
                        }
                        message_ =
                                input.readMessage(ControlCommand.parser(), extensionRegistry);
                        if (subBuilder != null) {
                            subBuilder.mergeFrom((ControlCommand) message_);
                            message_ = subBuilder.buildPartial();
                        }
                        messageCase_ = 6;
                        break;
                    }
                    case 58: {
                        TerminalClockCorrect.Builder subBuilder = null;
                        if (messageCase_ == 7) {
                            subBuilder = ((TerminalClockCorrect) message_).toBuilder();
                        }
                        message_ =
                                input.readMessage(TerminalClockCorrect.parser(), extensionRegistry);
                        if (subBuilder != null) {
                            subBuilder.mergeFrom((TerminalClockCorrect) message_);
                            message_ = subBuilder.buildPartial();
                        }
                        messageCase_ = 7;
                        break;
                    }
                    case 66: {
                        EmptyResponse.Builder subBuilder = null;
                        if (messageCase_ == 8) {
                            subBuilder = ((EmptyResponse) message_).toBuilder();
                        }
                        message_ =
                                input.readMessage(EmptyResponse.parser(), extensionRegistry);
                        if (subBuilder != null) {
                            subBuilder.mergeFrom((EmptyResponse) message_);
                            message_ = subBuilder.buildPartial();
                        }
                        messageCase_ = 8;
                        break;
                    }
                    case 74: {
                        ProtoResponse.Builder subBuilder = null;
                        if (messageCase_ == 9) {
                            subBuilder = ((ProtoResponse) message_).toBuilder();
                        }
                        message_ =
                                input.readMessage(ProtoResponse.parser(), extensionRegistry);
                        if (subBuilder != null) {
                            subBuilder.mergeFrom((ProtoResponse) message_);
                            message_ = subBuilder.buildPartial();
                        }
                        messageCase_ = 9;
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
        return Gbt3260.internal_static_com_ime_iov_gbt32960_PlatformMessage_descriptor;
    }

    protected FieldAccessorTable
    internalGetFieldAccessorTable() {
        return Gbt3260.internal_static_com_ime_iov_gbt32960_PlatformMessage_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                        PlatformMessage.class, Builder.class);
    }

    private int messageCase_ = 0;
    private Object message_;

    public enum MessageCase
            implements com.google.protobuf.Internal.EnumLite {
        CONFIG_QUERY(2),
        CONFIG_SETUP(3),
        UPGRADE(4),
        WARNING(5),
        CONTROL(6),
        CLOCK_CORRECT(7),
        EMPTY_RESPONSE(8),
        PROTO_RESPONSE(9),
        MESSAGE_NOT_SET(0);
        private final int value;

        private MessageCase(int value) {
            this.value = value;
        }

        /**
         * @deprecated Use {@link #forNumber(int)} instead.
         */
        @Deprecated
        public static MessageCase valueOf(int value) {
            return forNumber(value);
        }

        public static MessageCase forNumber(int value) {
            switch (value) {
                case 2:
                    return CONFIG_QUERY;
                case 3:
                    return CONFIG_SETUP;
                case 4:
                    return UPGRADE;
                case 5:
                    return WARNING;
                case 6:
                    return CONTROL;
                case 7:
                    return CLOCK_CORRECT;
                case 8:
                    return EMPTY_RESPONSE;
                case 9:
                    return PROTO_RESPONSE;
                case 0:
                    return MESSAGE_NOT_SET;
                default:
                    return null;
            }
        }

        public int getNumber() {
            return this.value;
        }
    }

    ;

    public MessageCase
    getMessageCase() {
        return MessageCase.forNumber(
                messageCase_);
    }

    public static final int CONFIG_QUERY_FIELD_NUMBER = 2;

    /**
     * <code>optional .ConfigQueryRequest config_query = 2;</code>
     */
    public ConfigQueryRequest getConfigQuery() {
        if (messageCase_ == 2) {
            return (ConfigQueryRequest) message_;
        }
        return ConfigQueryRequest.getDefaultInstance();
    }

    /**
     * <code>optional .ConfigQueryRequest config_query = 2;</code>
     */
    public ConfigQueryRequestOrBuilder getConfigQueryOrBuilder() {
        if (messageCase_ == 2) {
            return (ConfigQueryRequest) message_;
        }
        return ConfigQueryRequest.getDefaultInstance();
    }

    public static final int CONFIG_SETUP_FIELD_NUMBER = 3;

    /**
     * <code>optional .ConfigSetupRequest config_setup = 3;</code>
     */
    public ConfigSetupRequest getConfigSetup() {
        if (messageCase_ == 3) {
            return (ConfigSetupRequest) message_;
        }
        return ConfigSetupRequest.getDefaultInstance();
    }

    /**
     * <code>optional .ConfigSetupRequest config_setup = 3;</code>
     */
    public ConfigSetupRequestOrBuilder getConfigSetupOrBuilder() {
        if (messageCase_ == 3) {
            return (ConfigSetupRequest) message_;
        }
        return ConfigSetupRequest.getDefaultInstance();
    }

    public static final int UPGRADE_FIELD_NUMBER = 4;

    /**
     * <code>optional .RemoteUpgradeCommand upgrade = 4;</code>
     */
    public RemoteUpgradeCommand getUpgrade() {
        if (messageCase_ == 4) {
            return (RemoteUpgradeCommand) message_;
        }
        return RemoteUpgradeCommand.getDefaultInstance();
    }

    /**
     * <code>optional .RemoteUpgradeCommand upgrade = 4;</code>
     */
    public RemoteUpgradeCommandOrBuilder getUpgradeOrBuilder() {
        if (messageCase_ == 4) {
            return (RemoteUpgradeCommand) message_;
        }
        return RemoteUpgradeCommand.getDefaultInstance();
    }

    public static final int WARNING_FIELD_NUMBER = 5;

    /**
     * <code>optional .Warning warning = 5;</code>
     */
    public Warning getWarning() {
        if (messageCase_ == 5) {
            return (Warning) message_;
        }
        return Warning.getDefaultInstance();
    }

    /**
     * <code>optional .Warning warning = 5;</code>
     */
    public WarningOrBuilder getWarningOrBuilder() {
        if (messageCase_ == 5) {
            return (Warning) message_;
        }
        return Warning.getDefaultInstance();
    }

    public static final int CONTROL_FIELD_NUMBER = 6;

    /**
     * <code>optional .ControlCommand control = 6;</code>
     */
    public ControlCommand getControl() {
        if (messageCase_ == 6) {
            return (ControlCommand) message_;
        }
        return ControlCommand.getDefaultInstance();
    }

    /**
     * <code>optional .ControlCommand control = 6;</code>
     */
    public ControlCommandOrBuilder getControlOrBuilder() {
        if (messageCase_ == 6) {
            return (ControlCommand) message_;
        }
        return ControlCommand.getDefaultInstance();
    }

    public static final int CLOCK_CORRECT_FIELD_NUMBER = 7;

    /**
     * <code>optional .TerminalClockCorrect clock_correct = 7;</code>
     */
    public TerminalClockCorrect getClockCorrect() {
        if (messageCase_ == 7) {
            return (TerminalClockCorrect) message_;
        }
        return TerminalClockCorrect.getDefaultInstance();
    }

    /**
     * <code>optional .TerminalClockCorrect clock_correct = 7;</code>
     */
    public TerminalClockCorrectOrBuilder getClockCorrectOrBuilder() {
        if (messageCase_ == 7) {
            return (TerminalClockCorrect) message_;
        }
        return TerminalClockCorrect.getDefaultInstance();
    }

    public static final int EMPTY_RESPONSE_FIELD_NUMBER = 8;

    /**
     * <code>optional .EmptyResponse empty_response = 8;</code>
     */
    public EmptyResponse getEmptyResponse() {
        if (messageCase_ == 8) {
            return (EmptyResponse) message_;
        }
        return EmptyResponse.getDefaultInstance();
    }

    /**
     * <code>optional .EmptyResponse empty_response = 8;</code>
     */
    public EmptyResponseOrBuilder getEmptyResponseOrBuilder() {
        if (messageCase_ == 8) {
            return (EmptyResponse) message_;
        }
        return EmptyResponse.getDefaultInstance();
    }

    public static final int PROTO_RESPONSE_FIELD_NUMBER = 9;

    /**
     * <code>optional .ProtoResponse proto_response = 9;</code>
     */
    public ProtoResponse getProtoResponse() {
        if (messageCase_ == 9) {
            return (ProtoResponse) message_;
        }
        return ProtoResponse.getDefaultInstance();
    }

    /**
     * <code>optional .ProtoResponse proto_response = 9;</code>
     */
    public ProtoResponseOrBuilder getProtoResponseOrBuilder() {
        if (messageCase_ == 9) {
            return (ProtoResponse) message_;
        }
        return ProtoResponse.getDefaultInstance();
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
        if (messageCase_ == 2) {
            output.writeMessage(2, (ConfigQueryRequest) message_);
        }
        if (messageCase_ == 3) {
            output.writeMessage(3, (ConfigSetupRequest) message_);
        }
        if (messageCase_ == 4) {
            output.writeMessage(4, (RemoteUpgradeCommand) message_);
        }
        if (messageCase_ == 5) {
            output.writeMessage(5, (Warning) message_);
        }
        if (messageCase_ == 6) {
            output.writeMessage(6, (ControlCommand) message_);
        }
        if (messageCase_ == 7) {
            output.writeMessage(7, (TerminalClockCorrect) message_);
        }
        if (messageCase_ == 8) {
            output.writeMessage(8, (EmptyResponse) message_);
        }
        if (messageCase_ == 9) {
            output.writeMessage(9, (ProtoResponse) message_);
        }
    }

    public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) return size;

        size = 0;
        if (messageCase_ == 2) {
            size += com.google.protobuf.CodedOutputStream
                    .computeMessageSize(2, (ConfigQueryRequest) message_);
        }
        if (messageCase_ == 3) {
            size += com.google.protobuf.CodedOutputStream
                    .computeMessageSize(3, (ConfigSetupRequest) message_);
        }
        if (messageCase_ == 4) {
            size += com.google.protobuf.CodedOutputStream
                    .computeMessageSize(4, (RemoteUpgradeCommand) message_);
        }
        if (messageCase_ == 5) {
            size += com.google.protobuf.CodedOutputStream
                    .computeMessageSize(5, (Warning) message_);
        }
        if (messageCase_ == 6) {
            size += com.google.protobuf.CodedOutputStream
                    .computeMessageSize(6, (ControlCommand) message_);
        }
        if (messageCase_ == 7) {
            size += com.google.protobuf.CodedOutputStream
                    .computeMessageSize(7, (TerminalClockCorrect) message_);
        }
        if (messageCase_ == 8) {
            size += com.google.protobuf.CodedOutputStream
                    .computeMessageSize(8, (EmptyResponse) message_);
        }
        if (messageCase_ == 9) {
            size += com.google.protobuf.CodedOutputStream
                    .computeMessageSize(9, (ProtoResponse) message_);
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
        if (!(obj instanceof PlatformMessage)) {
            return super.equals(obj);
        }
        PlatformMessage other = (PlatformMessage) obj;

        boolean result = true;
        result = result && getMessageCase().equals(
                other.getMessageCase());
        if (!result) return false;
        switch (messageCase_) {
            case 2:
                result = result && getConfigQuery()
                        .equals(other.getConfigQuery());
                break;
            case 3:
                result = result && getConfigSetup()
                        .equals(other.getConfigSetup());
                break;
            case 4:
                result = result && getUpgrade()
                        .equals(other.getUpgrade());
                break;
            case 5:
                result = result && getWarning()
                        .equals(other.getWarning());
                break;
            case 6:
                result = result && getControl()
                        .equals(other.getControl());
                break;
            case 7:
                result = result && getClockCorrect()
                        .equals(other.getClockCorrect());
                break;
            case 8:
                result = result && getEmptyResponse()
                        .equals(other.getEmptyResponse());
                break;
            case 9:
                result = result && getProtoResponse()
                        .equals(other.getProtoResponse());
                break;
            case 0:
            default:
        }
        return result;
    }

    @Override
    public int hashCode() {
        if (memoizedHashCode != 0) {
            return memoizedHashCode;
        }
        int hash = 41;
        hash = (19 * hash) + getDescriptorForType().hashCode();
        switch (messageCase_) {
            case 2:
                hash = (37 * hash) + CONFIG_QUERY_FIELD_NUMBER;
                hash = (53 * hash) + getConfigQuery().hashCode();
                break;
            case 3:
                hash = (37 * hash) + CONFIG_SETUP_FIELD_NUMBER;
                hash = (53 * hash) + getConfigSetup().hashCode();
                break;
            case 4:
                hash = (37 * hash) + UPGRADE_FIELD_NUMBER;
                hash = (53 * hash) + getUpgrade().hashCode();
                break;
            case 5:
                hash = (37 * hash) + WARNING_FIELD_NUMBER;
                hash = (53 * hash) + getWarning().hashCode();
                break;
            case 6:
                hash = (37 * hash) + CONTROL_FIELD_NUMBER;
                hash = (53 * hash) + getControl().hashCode();
                break;
            case 7:
                hash = (37 * hash) + CLOCK_CORRECT_FIELD_NUMBER;
                hash = (53 * hash) + getClockCorrect().hashCode();
                break;
            case 8:
                hash = (37 * hash) + EMPTY_RESPONSE_FIELD_NUMBER;
                hash = (53 * hash) + getEmptyResponse().hashCode();
                break;
            case 9:
                hash = (37 * hash) + PROTO_RESPONSE_FIELD_NUMBER;
                hash = (53 * hash) + getProtoResponse().hashCode();
                break;
            case 0:
            default:
        }
        hash = (29 * hash) + unknownFields.hashCode();
        memoizedHashCode = hash;
        return hash;
    }

    public static PlatformMessage parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static PlatformMessage parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static PlatformMessage parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static PlatformMessage parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static PlatformMessage parseFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static PlatformMessage parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static PlatformMessage parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input);
    }

    public static PlatformMessage parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static PlatformMessage parseFrom(
            com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static PlatformMessage parseFrom(
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

    public static Builder newBuilder(PlatformMessage prototype) {
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
     * Protobuf type {@code PlatformMessage}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
            // @@protoc_insertion_point(builder_implements:PlatformMessage)
            PlatformMessageOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return Gbt3260.internal_static_com_ime_iov_gbt32960_PlatformMessage_descriptor;
        }

        protected FieldAccessorTable
        internalGetFieldAccessorTable() {
            return Gbt3260.internal_static_com_ime_iov_gbt32960_PlatformMessage_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            PlatformMessage.class, Builder.class);
        }

        // Construct using PlatformMessage.newBuilder()
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
            messageCase_ = 0;
            message_ = null;
            return this;
        }

        public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
            return Gbt3260.internal_static_com_ime_iov_gbt32960_PlatformMessage_descriptor;
        }

        public PlatformMessage getDefaultInstanceForType() {
            return PlatformMessage.getDefaultInstance();
        }

        public PlatformMessage build() {
            PlatformMessage result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        public PlatformMessage buildPartial() {
            PlatformMessage result = new PlatformMessage(this);
            if (messageCase_ == 2) {
                if (configQueryBuilder_ == null) {
                    result.message_ = message_;
                } else {
                    result.message_ = configQueryBuilder_.build();
                }
            }
            if (messageCase_ == 3) {
                if (configSetupBuilder_ == null) {
                    result.message_ = message_;
                } else {
                    result.message_ = configSetupBuilder_.build();
                }
            }
            if (messageCase_ == 4) {
                if (upgradeBuilder_ == null) {
                    result.message_ = message_;
                } else {
                    result.message_ = upgradeBuilder_.build();
                }
            }
            if (messageCase_ == 5) {
                if (warningBuilder_ == null) {
                    result.message_ = message_;
                } else {
                    result.message_ = warningBuilder_.build();
                }
            }
            if (messageCase_ == 6) {
                if (controlBuilder_ == null) {
                    result.message_ = message_;
                } else {
                    result.message_ = controlBuilder_.build();
                }
            }
            if (messageCase_ == 7) {
                if (clockCorrectBuilder_ == null) {
                    result.message_ = message_;
                } else {
                    result.message_ = clockCorrectBuilder_.build();
                }
            }
            if (messageCase_ == 8) {
                if (emptyResponseBuilder_ == null) {
                    result.message_ = message_;
                } else {
                    result.message_ = emptyResponseBuilder_.build();
                }
            }
            if (messageCase_ == 9) {
                if (protoResponseBuilder_ == null) {
                    result.message_ = message_;
                } else {
                    result.message_ = protoResponseBuilder_.build();
                }
            }
            result.messageCase_ = messageCase_;
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
            if (other instanceof PlatformMessage) {
                return mergeFrom((PlatformMessage) other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(PlatformMessage other) {
            if (other == PlatformMessage.getDefaultInstance()) return this;
            switch (other.getMessageCase()) {
                case CONFIG_QUERY: {
                    mergeConfigQuery(other.getConfigQuery());
                    break;
                }
                case CONFIG_SETUP: {
                    mergeConfigSetup(other.getConfigSetup());
                    break;
                }
                case UPGRADE: {
                    mergeUpgrade(other.getUpgrade());
                    break;
                }
                case WARNING: {
                    mergeWarning(other.getWarning());
                    break;
                }
                case CONTROL: {
                    mergeControl(other.getControl());
                    break;
                }
                case CLOCK_CORRECT: {
                    mergeClockCorrect(other.getClockCorrect());
                    break;
                }
                case EMPTY_RESPONSE: {
                    mergeEmptyResponse(other.getEmptyResponse());
                    break;
                }
                case PROTO_RESPONSE: {
                    mergeProtoResponse(other.getProtoResponse());
                    break;
                }
                case MESSAGE_NOT_SET: {
                    break;
                }
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
            PlatformMessage parsedMessage = null;
            try {
                parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                parsedMessage = (PlatformMessage) e.getUnfinishedMessage();
                throw e.unwrapIOException();
            } finally {
                if (parsedMessage != null) {
                    mergeFrom(parsedMessage);
                }
            }
            return this;
        }

        private int messageCase_ = 0;
        private Object message_;

        public MessageCase
        getMessageCase() {
            return MessageCase.forNumber(
                    messageCase_);
        }

        public Builder clearMessage() {
            messageCase_ = 0;
            message_ = null;
            onChanged();
            return this;
        }


        private com.google.protobuf.SingleFieldBuilderV3<
                ConfigQueryRequest,ConfigQueryRequest.Builder,ConfigQueryRequestOrBuilder> configQueryBuilder_;

        /**
         * <code>optional .ConfigQueryRequest config_query = 2;</code>
         */
        public ConfigQueryRequest getConfigQuery() {
            if (configQueryBuilder_ == null) {
                if (messageCase_ == 2) {
                    return (ConfigQueryRequest) message_;
                }
                return ConfigQueryRequest.getDefaultInstance();
            } else {
                if (messageCase_ == 2) {
                    return configQueryBuilder_.getMessage();
                }
                return ConfigQueryRequest.getDefaultInstance();
            }
        }

        /**
         * <code>optional .ConfigQueryRequest config_query = 2;</code>
         */
        public Builder setConfigQuery(ConfigQueryRequest value) {
            if (configQueryBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                message_ = value;
                onChanged();
            } else {
                configQueryBuilder_.setMessage(value);
            }
            messageCase_ = 2;
            return this;
        }

        /**
         * <code>optional .ConfigQueryRequest config_query = 2;</code>
         */
        public Builder setConfigQuery(
                ConfigQueryRequest.Builder builderForValue) {
            if (configQueryBuilder_ == null) {
                message_ = builderForValue.build();
                onChanged();
            } else {
                configQueryBuilder_.setMessage(builderForValue.build());
            }
            messageCase_ = 2;
            return this;
        }

        /**
         * <code>optional .ConfigQueryRequest config_query = 2;</code>
         */
        public Builder mergeConfigQuery(ConfigQueryRequest value) {
            if (configQueryBuilder_ == null) {
                if (messageCase_ == 2 &&
                        message_ != ConfigQueryRequest.getDefaultInstance()) {
                    message_ = ConfigQueryRequest.newBuilder((ConfigQueryRequest) message_)
                            .mergeFrom(value).buildPartial();
                } else {
                    message_ = value;
                }
                onChanged();
            } else {
                if (messageCase_ == 2) {
                    configQueryBuilder_.mergeFrom(value);
                }
                configQueryBuilder_.setMessage(value);
            }
            messageCase_ = 2;
            return this;
        }

        /**
         * <code>optional .ConfigQueryRequest config_query = 2;</code>
         */
        public Builder clearConfigQuery() {
            if (configQueryBuilder_ == null) {
                if (messageCase_ == 2) {
                    messageCase_ = 0;
                    message_ = null;
                    onChanged();
                }
            } else {
                if (messageCase_ == 2) {
                    messageCase_ = 0;
                    message_ = null;
                }
                configQueryBuilder_.clear();
            }
            return this;
        }

        /**
         * <code>optional .ConfigQueryRequest config_query = 2;</code>
         */
        public ConfigQueryRequest.Builder getConfigQueryBuilder() {
            return getConfigQueryFieldBuilder().getBuilder();
        }

        /**
         * <code>optional .ConfigQueryRequest config_query = 2;</code>
         */
        public ConfigQueryRequestOrBuilder getConfigQueryOrBuilder() {
            if ((messageCase_ == 2) && (configQueryBuilder_ != null)) {
                return configQueryBuilder_.getMessageOrBuilder();
            } else {
                if (messageCase_ == 2) {
                    return (ConfigQueryRequest) message_;
                }
                return ConfigQueryRequest.getDefaultInstance();
            }
        }

        /**
         * <code>optional .ConfigQueryRequest config_query = 2;</code>
         */
        private com.google.protobuf.SingleFieldBuilderV3<
                ConfigQueryRequest,ConfigQueryRequest.Builder,ConfigQueryRequestOrBuilder>
        getConfigQueryFieldBuilder() {
            if (configQueryBuilder_ == null) {
                if (!(messageCase_ == 2)) {
                    message_ = ConfigQueryRequest.getDefaultInstance();
                }
                configQueryBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                        ConfigQueryRequest,ConfigQueryRequest.Builder,ConfigQueryRequestOrBuilder>(
                        (ConfigQueryRequest) message_,
                        getParentForChildren(),
                        isClean());
                message_ = null;
            }
            messageCase_ = 2;
            onChanged();
            ;
            return configQueryBuilder_;
        }

        private com.google.protobuf.SingleFieldBuilderV3<
                ConfigSetupRequest,ConfigSetupRequest.Builder,ConfigSetupRequestOrBuilder> configSetupBuilder_;

        /**
         * <code>optional .ConfigSetupRequest config_setup = 3;</code>
         */
        public ConfigSetupRequest getConfigSetup() {
            if (configSetupBuilder_ == null) {
                if (messageCase_ == 3) {
                    return (ConfigSetupRequest) message_;
                }
                return ConfigSetupRequest.getDefaultInstance();
            } else {
                if (messageCase_ == 3) {
                    return configSetupBuilder_.getMessage();
                }
                return ConfigSetupRequest.getDefaultInstance();
            }
        }

        /**
         * <code>optional .ConfigSetupRequest config_setup = 3;</code>
         */
        public Builder setConfigSetup(ConfigSetupRequest value) {
            if (configSetupBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                message_ = value;
                onChanged();
            } else {
                configSetupBuilder_.setMessage(value);
            }
            messageCase_ = 3;
            return this;
        }

        /**
         * <code>optional .ConfigSetupRequest config_setup = 3;</code>
         */
        public Builder setConfigSetup(
                ConfigSetupRequest.Builder builderForValue) {
            if (configSetupBuilder_ == null) {
                message_ = builderForValue.build();
                onChanged();
            } else {
                configSetupBuilder_.setMessage(builderForValue.build());
            }
            messageCase_ = 3;
            return this;
        }

        /**
         * <code>optional .ConfigSetupRequest config_setup = 3;</code>
         */
        public Builder mergeConfigSetup(ConfigSetupRequest value) {
            if (configSetupBuilder_ == null) {
                if (messageCase_ == 3 &&
                        message_ != ConfigSetupRequest.getDefaultInstance()) {
                    message_ = ConfigSetupRequest.newBuilder((ConfigSetupRequest) message_)
                            .mergeFrom(value).buildPartial();
                } else {
                    message_ = value;
                }
                onChanged();
            } else {
                if (messageCase_ == 3) {
                    configSetupBuilder_.mergeFrom(value);
                }
                configSetupBuilder_.setMessage(value);
            }
            messageCase_ = 3;
            return this;
        }

        /**
         * <code>optional .ConfigSetupRequest config_setup = 3;</code>
         */
        public Builder clearConfigSetup() {
            if (configSetupBuilder_ == null) {
                if (messageCase_ == 3) {
                    messageCase_ = 0;
                    message_ = null;
                    onChanged();
                }
            } else {
                if (messageCase_ == 3) {
                    messageCase_ = 0;
                    message_ = null;
                }
                configSetupBuilder_.clear();
            }
            return this;
        }

        /**
         * <code>optional .ConfigSetupRequest config_setup = 3;</code>
         */
        public ConfigSetupRequest.Builder getConfigSetupBuilder() {
            return getConfigSetupFieldBuilder().getBuilder();
        }

        /**
         * <code>optional .ConfigSetupRequest config_setup = 3;</code>
         */
        public ConfigSetupRequestOrBuilder getConfigSetupOrBuilder() {
            if ((messageCase_ == 3) && (configSetupBuilder_ != null)) {
                return configSetupBuilder_.getMessageOrBuilder();
            } else {
                if (messageCase_ == 3) {
                    return (ConfigSetupRequest) message_;
                }
                return ConfigSetupRequest.getDefaultInstance();
            }
        }

        /**
         * <code>optional .ConfigSetupRequest config_setup = 3;</code>
         */
        private com.google.protobuf.SingleFieldBuilderV3<
                ConfigSetupRequest,ConfigSetupRequest.Builder,ConfigSetupRequestOrBuilder>
        getConfigSetupFieldBuilder() {
            if (configSetupBuilder_ == null) {
                if (!(messageCase_ == 3)) {
                    message_ = ConfigSetupRequest.getDefaultInstance();
                }
                configSetupBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                        ConfigSetupRequest,ConfigSetupRequest.Builder,ConfigSetupRequestOrBuilder>(
                        (ConfigSetupRequest) message_,
                        getParentForChildren(),
                        isClean());
                message_ = null;
            }
            messageCase_ = 3;
            onChanged();
            ;
            return configSetupBuilder_;
        }

        private com.google.protobuf.SingleFieldBuilderV3<
                RemoteUpgradeCommand,RemoteUpgradeCommand.Builder,RemoteUpgradeCommandOrBuilder> upgradeBuilder_;

        /**
         * <code>optional .RemoteUpgradeCommand upgrade = 4;</code>
         */
        public RemoteUpgradeCommand getUpgrade() {
            if (upgradeBuilder_ == null) {
                if (messageCase_ == 4) {
                    return (RemoteUpgradeCommand) message_;
                }
                return RemoteUpgradeCommand.getDefaultInstance();
            } else {
                if (messageCase_ == 4) {
                    return upgradeBuilder_.getMessage();
                }
                return RemoteUpgradeCommand.getDefaultInstance();
            }
        }

        /**
         * <code>optional .RemoteUpgradeCommand upgrade = 4;</code>
         */
        public Builder setUpgrade(RemoteUpgradeCommand value) {
            if (upgradeBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                message_ = value;
                onChanged();
            } else {
                upgradeBuilder_.setMessage(value);
            }
            messageCase_ = 4;
            return this;
        }

        /**
         * <code>optional .RemoteUpgradeCommand upgrade = 4;</code>
         */
        public Builder setUpgrade(
                RemoteUpgradeCommand.Builder builderForValue) {
            if (upgradeBuilder_ == null) {
                message_ = builderForValue.build();
                onChanged();
            } else {
                upgradeBuilder_.setMessage(builderForValue.build());
            }
            messageCase_ = 4;
            return this;
        }

        /**
         * <code>optional .RemoteUpgradeCommand upgrade = 4;</code>
         */
        public Builder mergeUpgrade(RemoteUpgradeCommand value) {
            if (upgradeBuilder_ == null) {
                if (messageCase_ == 4 &&
                        message_ != RemoteUpgradeCommand.getDefaultInstance()) {
                    message_ = RemoteUpgradeCommand.newBuilder((RemoteUpgradeCommand) message_)
                            .mergeFrom(value).buildPartial();
                } else {
                    message_ = value;
                }
                onChanged();
            } else {
                if (messageCase_ == 4) {
                    upgradeBuilder_.mergeFrom(value);
                }
                upgradeBuilder_.setMessage(value);
            }
            messageCase_ = 4;
            return this;
        }

        /**
         * <code>optional .RemoteUpgradeCommand upgrade = 4;</code>
         */
        public Builder clearUpgrade() {
            if (upgradeBuilder_ == null) {
                if (messageCase_ == 4) {
                    messageCase_ = 0;
                    message_ = null;
                    onChanged();
                }
            } else {
                if (messageCase_ == 4) {
                    messageCase_ = 0;
                    message_ = null;
                }
                upgradeBuilder_.clear();
            }
            return this;
        }

        /**
         * <code>optional .RemoteUpgradeCommand upgrade = 4;</code>
         */
        public RemoteUpgradeCommand.Builder getUpgradeBuilder() {
            return getUpgradeFieldBuilder().getBuilder();
        }

        /**
         * <code>optional .RemoteUpgradeCommand upgrade = 4;</code>
         */
        public RemoteUpgradeCommandOrBuilder getUpgradeOrBuilder() {
            if ((messageCase_ == 4) && (upgradeBuilder_ != null)) {
                return upgradeBuilder_.getMessageOrBuilder();
            } else {
                if (messageCase_ == 4) {
                    return (RemoteUpgradeCommand) message_;
                }
                return RemoteUpgradeCommand.getDefaultInstance();
            }
        }

        /**
         * <code>optional .RemoteUpgradeCommand upgrade = 4;</code>
         */
        private com.google.protobuf.SingleFieldBuilderV3<
                RemoteUpgradeCommand,RemoteUpgradeCommand.Builder,RemoteUpgradeCommandOrBuilder>
        getUpgradeFieldBuilder() {
            if (upgradeBuilder_ == null) {
                if (!(messageCase_ == 4)) {
                    message_ = RemoteUpgradeCommand.getDefaultInstance();
                }
                upgradeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                        RemoteUpgradeCommand,RemoteUpgradeCommand.Builder,RemoteUpgradeCommandOrBuilder>(
                        (RemoteUpgradeCommand) message_,
                        getParentForChildren(),
                        isClean());
                message_ = null;
            }
            messageCase_ = 4;
            onChanged();
            ;
            return upgradeBuilder_;
        }

        private com.google.protobuf.SingleFieldBuilderV3<
                Warning,Warning.Builder,WarningOrBuilder> warningBuilder_;

        /**
         * <code>optional .Warning warning = 5;</code>
         */
        public Warning getWarning() {
            if (warningBuilder_ == null) {
                if (messageCase_ == 5) {
                    return (Warning) message_;
                }
                return Warning.getDefaultInstance();
            } else {
                if (messageCase_ == 5) {
                    return warningBuilder_.getMessage();
                }
                return Warning.getDefaultInstance();
            }
        }

        /**
         * <code>optional .Warning warning = 5;</code>
         */
        public Builder setWarning(Warning value) {
            if (warningBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                message_ = value;
                onChanged();
            } else {
                warningBuilder_.setMessage(value);
            }
            messageCase_ = 5;
            return this;
        }

        /**
         * <code>optional .Warning warning = 5;</code>
         */
        public Builder setWarning(
                Warning.Builder builderForValue) {
            if (warningBuilder_ == null) {
                message_ = builderForValue.build();
                onChanged();
            } else {
                warningBuilder_.setMessage(builderForValue.build());
            }
            messageCase_ = 5;
            return this;
        }

        /**
         * <code>optional .Warning warning = 5;</code>
         */
        public Builder mergeWarning(Warning value) {
            if (warningBuilder_ == null) {
                if (messageCase_ == 5 &&
                        message_ != Warning.getDefaultInstance()) {
                    message_ = Warning.newBuilder((Warning) message_)
                            .mergeFrom(value).buildPartial();
                } else {
                    message_ = value;
                }
                onChanged();
            } else {
                if (messageCase_ == 5) {
                    warningBuilder_.mergeFrom(value);
                }
                warningBuilder_.setMessage(value);
            }
            messageCase_ = 5;
            return this;
        }

        /**
         * <code>optional .Warning warning = 5;</code>
         */
        public Builder clearWarning() {
            if (warningBuilder_ == null) {
                if (messageCase_ == 5) {
                    messageCase_ = 0;
                    message_ = null;
                    onChanged();
                }
            } else {
                if (messageCase_ == 5) {
                    messageCase_ = 0;
                    message_ = null;
                }
                warningBuilder_.clear();
            }
            return this;
        }

        /**
         * <code>optional .Warning warning = 5;</code>
         */
        public Warning.Builder getWarningBuilder() {
            return getWarningFieldBuilder().getBuilder();
        }

        /**
         * <code>optional .Warning warning = 5;</code>
         */
        public WarningOrBuilder getWarningOrBuilder() {
            if ((messageCase_ == 5) && (warningBuilder_ != null)) {
                return warningBuilder_.getMessageOrBuilder();
            } else {
                if (messageCase_ == 5) {
                    return (Warning) message_;
                }
                return Warning.getDefaultInstance();
            }
        }

        /**
         * <code>optional .Warning warning = 5;</code>
         */
        private com.google.protobuf.SingleFieldBuilderV3<
                Warning,Warning.Builder,WarningOrBuilder>
        getWarningFieldBuilder() {
            if (warningBuilder_ == null) {
                if (!(messageCase_ == 5)) {
                    message_ = Warning.getDefaultInstance();
                }
                warningBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                        Warning,Warning.Builder,WarningOrBuilder>(
                        (Warning) message_,
                        getParentForChildren(),
                        isClean());
                message_ = null;
            }
            messageCase_ = 5;
            onChanged();
            ;
            return warningBuilder_;
        }

        private com.google.protobuf.SingleFieldBuilderV3<
                ControlCommand,ControlCommand.Builder,ControlCommandOrBuilder> controlBuilder_;

        /**
         * <code>optional .ControlCommand control = 6;</code>
         */
        public ControlCommand getControl() {
            if (controlBuilder_ == null) {
                if (messageCase_ == 6) {
                    return (ControlCommand) message_;
                }
                return ControlCommand.getDefaultInstance();
            } else {
                if (messageCase_ == 6) {
                    return controlBuilder_.getMessage();
                }
                return ControlCommand.getDefaultInstance();
            }
        }

        /**
         * <code>optional .ControlCommand control = 6;</code>
         */
        public Builder setControl(ControlCommand value) {
            if (controlBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                message_ = value;
                onChanged();
            } else {
                controlBuilder_.setMessage(value);
            }
            messageCase_ = 6;
            return this;
        }

        /**
         * <code>optional .ControlCommand control = 6;</code>
         */
        public Builder setControl(
                ControlCommand.Builder builderForValue) {
            if (controlBuilder_ == null) {
                message_ = builderForValue.build();
                onChanged();
            } else {
                controlBuilder_.setMessage(builderForValue.build());
            }
            messageCase_ = 6;
            return this;
        }

        /**
         * <code>optional .ControlCommand control = 6;</code>
         */
        public Builder mergeControl(ControlCommand value) {
            if (controlBuilder_ == null) {
                if (messageCase_ == 6 &&
                        message_ != ControlCommand.getDefaultInstance()) {
                    message_ = ControlCommand.newBuilder((ControlCommand) message_)
                            .mergeFrom(value).buildPartial();
                } else {
                    message_ = value;
                }
                onChanged();
            } else {
                if (messageCase_ == 6) {
                    controlBuilder_.mergeFrom(value);
                }
                controlBuilder_.setMessage(value);
            }
            messageCase_ = 6;
            return this;
        }

        /**
         * <code>optional .ControlCommand control = 6;</code>
         */
        public Builder clearControl() {
            if (controlBuilder_ == null) {
                if (messageCase_ == 6) {
                    messageCase_ = 0;
                    message_ = null;
                    onChanged();
                }
            } else {
                if (messageCase_ == 6) {
                    messageCase_ = 0;
                    message_ = null;
                }
                controlBuilder_.clear();
            }
            return this;
        }

        /**
         * <code>optional .ControlCommand control = 6;</code>
         */
        public ControlCommand.Builder getControlBuilder() {
            return getControlFieldBuilder().getBuilder();
        }

        /**
         * <code>optional .ControlCommand control = 6;</code>
         */
        public ControlCommandOrBuilder getControlOrBuilder() {
            if ((messageCase_ == 6) && (controlBuilder_ != null)) {
                return controlBuilder_.getMessageOrBuilder();
            } else {
                if (messageCase_ == 6) {
                    return (ControlCommand) message_;
                }
                return ControlCommand.getDefaultInstance();
            }
        }

        /**
         * <code>optional .ControlCommand control = 6;</code>
         */
        private com.google.protobuf.SingleFieldBuilderV3<
                ControlCommand,ControlCommand.Builder,ControlCommandOrBuilder>
        getControlFieldBuilder() {
            if (controlBuilder_ == null) {
                if (!(messageCase_ == 6)) {
                    message_ = ControlCommand.getDefaultInstance();
                }
                controlBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                        ControlCommand,ControlCommand.Builder,ControlCommandOrBuilder>(
                        (ControlCommand) message_,
                        getParentForChildren(),
                        isClean());
                message_ = null;
            }
            messageCase_ = 6;
            onChanged();
            ;
            return controlBuilder_;
        }

        private com.google.protobuf.SingleFieldBuilderV3<
                TerminalClockCorrect,TerminalClockCorrect.Builder,TerminalClockCorrectOrBuilder> clockCorrectBuilder_;

        /**
         * <code>optional .TerminalClockCorrect clock_correct = 7;</code>
         */
        public TerminalClockCorrect getClockCorrect() {
            if (clockCorrectBuilder_ == null) {
                if (messageCase_ == 7) {
                    return (TerminalClockCorrect) message_;
                }
                return TerminalClockCorrect.getDefaultInstance();
            } else {
                if (messageCase_ == 7) {
                    return clockCorrectBuilder_.getMessage();
                }
                return TerminalClockCorrect.getDefaultInstance();
            }
        }

        /**
         * <code>optional .TerminalClockCorrect clock_correct = 7;</code>
         */
        public Builder setClockCorrect(TerminalClockCorrect value) {
            if (clockCorrectBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                message_ = value;
                onChanged();
            } else {
                clockCorrectBuilder_.setMessage(value);
            }
            messageCase_ = 7;
            return this;
        }

        /**
         * <code>optional .TerminalClockCorrect clock_correct = 7;</code>
         */
        public Builder setClockCorrect(
                TerminalClockCorrect.Builder builderForValue) {
            if (clockCorrectBuilder_ == null) {
                message_ = builderForValue.build();
                onChanged();
            } else {
                clockCorrectBuilder_.setMessage(builderForValue.build());
            }
            messageCase_ = 7;
            return this;
        }

        /**
         * <code>optional .TerminalClockCorrect clock_correct = 7;</code>
         */
        public Builder mergeClockCorrect(TerminalClockCorrect value) {
            if (clockCorrectBuilder_ == null) {
                if (messageCase_ == 7 &&
                        message_ != TerminalClockCorrect.getDefaultInstance()) {
                    message_ = TerminalClockCorrect.newBuilder((TerminalClockCorrect) message_)
                            .mergeFrom(value).buildPartial();
                } else {
                    message_ = value;
                }
                onChanged();
            } else {
                if (messageCase_ == 7) {
                    clockCorrectBuilder_.mergeFrom(value);
                }
                clockCorrectBuilder_.setMessage(value);
            }
            messageCase_ = 7;
            return this;
        }

        /**
         * <code>optional .TerminalClockCorrect clock_correct = 7;</code>
         */
        public Builder clearClockCorrect() {
            if (clockCorrectBuilder_ == null) {
                if (messageCase_ == 7) {
                    messageCase_ = 0;
                    message_ = null;
                    onChanged();
                }
            } else {
                if (messageCase_ == 7) {
                    messageCase_ = 0;
                    message_ = null;
                }
                clockCorrectBuilder_.clear();
            }
            return this;
        }

        /**
         * <code>optional .TerminalClockCorrect clock_correct = 7;</code>
         */
        public TerminalClockCorrect.Builder getClockCorrectBuilder() {
            return getClockCorrectFieldBuilder().getBuilder();
        }

        /**
         * <code>optional .TerminalClockCorrect clock_correct = 7;</code>
         */
        public TerminalClockCorrectOrBuilder getClockCorrectOrBuilder() {
            if ((messageCase_ == 7) && (clockCorrectBuilder_ != null)) {
                return clockCorrectBuilder_.getMessageOrBuilder();
            } else {
                if (messageCase_ == 7) {
                    return (TerminalClockCorrect) message_;
                }
                return TerminalClockCorrect.getDefaultInstance();
            }
        }

        /**
         * <code>optional .TerminalClockCorrect clock_correct = 7;</code>
         */
        private com.google.protobuf.SingleFieldBuilderV3<
                TerminalClockCorrect,TerminalClockCorrect.Builder,TerminalClockCorrectOrBuilder>
        getClockCorrectFieldBuilder() {
            if (clockCorrectBuilder_ == null) {
                if (!(messageCase_ == 7)) {
                    message_ = TerminalClockCorrect.getDefaultInstance();
                }
                clockCorrectBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                        TerminalClockCorrect,TerminalClockCorrect.Builder,TerminalClockCorrectOrBuilder>(
                        (TerminalClockCorrect) message_,
                        getParentForChildren(),
                        isClean());
                message_ = null;
            }
            messageCase_ = 7;
            onChanged();
            ;
            return clockCorrectBuilder_;
        }

        private com.google.protobuf.SingleFieldBuilderV3<
                EmptyResponse,EmptyResponse.Builder,EmptyResponseOrBuilder> emptyResponseBuilder_;

        /**
         * <code>optional .EmptyResponse empty_response = 8;</code>
         */
        public EmptyResponse getEmptyResponse() {
            if (emptyResponseBuilder_ == null) {
                if (messageCase_ == 8) {
                    return (EmptyResponse) message_;
                }
                return EmptyResponse.getDefaultInstance();
            } else {
                if (messageCase_ == 8) {
                    return emptyResponseBuilder_.getMessage();
                }
                return EmptyResponse.getDefaultInstance();
            }
        }

        /**
         * <code>optional .EmptyResponse empty_response = 8;</code>
         */
        public Builder setEmptyResponse(EmptyResponse value) {
            if (emptyResponseBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                message_ = value;
                onChanged();
            } else {
                emptyResponseBuilder_.setMessage(value);
            }
            messageCase_ = 8;
            return this;
        }

        /**
         * <code>optional .EmptyResponse empty_response = 8;</code>
         */
        public Builder setEmptyResponse(
                EmptyResponse.Builder builderForValue) {
            if (emptyResponseBuilder_ == null) {
                message_ = builderForValue.build();
                onChanged();
            } else {
                emptyResponseBuilder_.setMessage(builderForValue.build());
            }
            messageCase_ = 8;
            return this;
        }

        /**
         * <code>optional .EmptyResponse empty_response = 8;</code>
         */
        public Builder mergeEmptyResponse(EmptyResponse value) {
            if (emptyResponseBuilder_ == null) {
                if (messageCase_ == 8 &&
                        message_ != EmptyResponse.getDefaultInstance()) {
                    message_ = EmptyResponse.newBuilder((EmptyResponse) message_)
                            .mergeFrom(value).buildPartial();
                } else {
                    message_ = value;
                }
                onChanged();
            } else {
                if (messageCase_ == 8) {
                    emptyResponseBuilder_.mergeFrom(value);
                }
                emptyResponseBuilder_.setMessage(value);
            }
            messageCase_ = 8;
            return this;
        }

        /**
         * <code>optional .EmptyResponse empty_response = 8;</code>
         */
        public Builder clearEmptyResponse() {
            if (emptyResponseBuilder_ == null) {
                if (messageCase_ == 8) {
                    messageCase_ = 0;
                    message_ = null;
                    onChanged();
                }
            } else {
                if (messageCase_ == 8) {
                    messageCase_ = 0;
                    message_ = null;
                }
                emptyResponseBuilder_.clear();
            }
            return this;
        }

        /**
         * <code>optional .EmptyResponse empty_response = 8;</code>
         */
        public EmptyResponse.Builder getEmptyResponseBuilder() {
            return getEmptyResponseFieldBuilder().getBuilder();
        }

        /**
         * <code>optional .EmptyResponse empty_response = 8;</code>
         */
        public EmptyResponseOrBuilder getEmptyResponseOrBuilder() {
            if ((messageCase_ == 8) && (emptyResponseBuilder_ != null)) {
                return emptyResponseBuilder_.getMessageOrBuilder();
            } else {
                if (messageCase_ == 8) {
                    return (EmptyResponse) message_;
                }
                return EmptyResponse.getDefaultInstance();
            }
        }

        /**
         * <code>optional .EmptyResponse empty_response = 8;</code>
         */
        private com.google.protobuf.SingleFieldBuilderV3<
                EmptyResponse,EmptyResponse.Builder,EmptyResponseOrBuilder>
        getEmptyResponseFieldBuilder() {
            if (emptyResponseBuilder_ == null) {
                if (!(messageCase_ == 8)) {
                    message_ = EmptyResponse.getDefaultInstance();
                }
                emptyResponseBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                        EmptyResponse,EmptyResponse.Builder,EmptyResponseOrBuilder>(
                        (EmptyResponse) message_,
                        getParentForChildren(),
                        isClean());
                message_ = null;
            }
            messageCase_ = 8;
            onChanged();
            ;
            return emptyResponseBuilder_;
        }

        private com.google.protobuf.SingleFieldBuilderV3<
                ProtoResponse,ProtoResponse.Builder,ProtoResponseOrBuilder> protoResponseBuilder_;

        /**
         * <code>optional .ProtoResponse proto_response = 9;</code>
         */
        public ProtoResponse getProtoResponse() {
            if (protoResponseBuilder_ == null) {
                if (messageCase_ == 9) {
                    return (ProtoResponse) message_;
                }
                return ProtoResponse.getDefaultInstance();
            } else {
                if (messageCase_ == 9) {
                    return protoResponseBuilder_.getMessage();
                }
                return ProtoResponse.getDefaultInstance();
            }
        }

        /**
         * <code>optional .ProtoResponse proto_response = 9;</code>
         */
        public Builder setProtoResponse(ProtoResponse value) {
            if (protoResponseBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                message_ = value;
                onChanged();
            } else {
                protoResponseBuilder_.setMessage(value);
            }
            messageCase_ = 9;
            return this;
        }

        /**
         * <code>optional .ProtoResponse proto_response = 9;</code>
         */
        public Builder setProtoResponse(
                ProtoResponse.Builder builderForValue) {
            if (protoResponseBuilder_ == null) {
                message_ = builderForValue.build();
                onChanged();
            } else {
                protoResponseBuilder_.setMessage(builderForValue.build());
            }
            messageCase_ = 9;
            return this;
        }

        /**
         * <code>optional .ProtoResponse proto_response = 9;</code>
         */
        public Builder mergeProtoResponse(ProtoResponse value) {
            if (protoResponseBuilder_ == null) {
                if (messageCase_ == 9 &&
                        message_ != ProtoResponse.getDefaultInstance()) {
                    message_ = ProtoResponse.newBuilder((ProtoResponse) message_)
                            .mergeFrom(value).buildPartial();
                } else {
                    message_ = value;
                }
                onChanged();
            } else {
                if (messageCase_ == 9) {
                    protoResponseBuilder_.mergeFrom(value);
                }
                protoResponseBuilder_.setMessage(value);
            }
            messageCase_ = 9;
            return this;
        }

        /**
         * <code>optional .ProtoResponse proto_response = 9;</code>
         */
        public Builder clearProtoResponse() {
            if (protoResponseBuilder_ == null) {
                if (messageCase_ == 9) {
                    messageCase_ = 0;
                    message_ = null;
                    onChanged();
                }
            } else {
                if (messageCase_ == 9) {
                    messageCase_ = 0;
                    message_ = null;
                }
                protoResponseBuilder_.clear();
            }
            return this;
        }

        /**
         * <code>optional .ProtoResponse proto_response = 9;</code>
         */
        public ProtoResponse.Builder getProtoResponseBuilder() {
            return getProtoResponseFieldBuilder().getBuilder();
        }

        /**
         * <code>optional .ProtoResponse proto_response = 9;</code>
         */
        public ProtoResponseOrBuilder getProtoResponseOrBuilder() {
            if ((messageCase_ == 9) && (protoResponseBuilder_ != null)) {
                return protoResponseBuilder_.getMessageOrBuilder();
            } else {
                if (messageCase_ == 9) {
                    return (ProtoResponse) message_;
                }
                return ProtoResponse.getDefaultInstance();
            }
        }

        /**
         * <code>optional .ProtoResponse proto_response = 9;</code>
         */
        private com.google.protobuf.SingleFieldBuilderV3<
                ProtoResponse,ProtoResponse.Builder,ProtoResponseOrBuilder>
        getProtoResponseFieldBuilder() {
            if (protoResponseBuilder_ == null) {
                if (!(messageCase_ == 9)) {
                    message_ = ProtoResponse.getDefaultInstance();
                }
                protoResponseBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                        ProtoResponse,ProtoResponse.Builder,ProtoResponseOrBuilder>(
                        (ProtoResponse) message_,
                        getParentForChildren(),
                        isClean());
                message_ = null;
            }
            messageCase_ = 9;
            onChanged();
            ;
            return protoResponseBuilder_;
        }

        public final Builder setUnknownFields(
                final com.google.protobuf.UnknownFieldSet unknownFields) {
            return this;
        }

        public final Builder mergeUnknownFields(
                final com.google.protobuf.UnknownFieldSet unknownFields) {
            return this;
        }


        // @@protoc_insertion_point(builder_scope:PlatformMessage)
    }

    // @@protoc_insertion_point(class_scope:PlatformMessage)
    private static final PlatformMessage DEFAULT_INSTANCE;

    static {
        DEFAULT_INSTANCE = new PlatformMessage();
    }

    public static PlatformMessage getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PlatformMessage>
            PARSER = new com.google.protobuf.AbstractParser<PlatformMessage>() {
        public PlatformMessage parsePartialFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return new PlatformMessage(input, extensionRegistry);
        }
    };

    public static com.google.protobuf.Parser<PlatformMessage> parser() {
        return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<PlatformMessage> getParserForType() {
        return PARSER;
    }

    public PlatformMessage getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

}

