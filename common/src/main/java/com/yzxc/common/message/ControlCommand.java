package com.yzxc.common.message;

public final class ControlCommand extends
        com.google.protobuf.GeneratedMessageV3 implements
        ControlCommandOrBuilder {
    private ControlCommand(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private ControlCommand() {
        requestTime_ = 0L;
        command_ = 0;
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
        return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }

    private ControlCommand(
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

                        requestTime_ = input.readInt64();
                        break;
                    }
                    case 16: {
                        int rawValue = input.readEnum();

                        command_ = rawValue;
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
        return Gbt3260.internal_static_com_ime_iov_gbt32960_ControlCommand_descriptor;
    }

    protected FieldAccessorTable
    internalGetFieldAccessorTable() {
        return Gbt3260.internal_static_com_ime_iov_gbt32960_ControlCommand_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                        ControlCommand.class, Builder.class);
    }

    public static final int REQUEST_TIME_FIELD_NUMBER = 1;
    private long requestTime_;

    /**
     * <code>optional int64 request_time = 1;</code>
     */
    public long getRequestTime() {
        return requestTime_;
    }

    public static final int COMMAND_FIELD_NUMBER = 2;
    private int command_;

    /**
     * <code>optional .CommandType command = 2;</code>
     */
    public int getCommandValue() {
        return command_;
    }

    /**
     * <code>optional .CommandType command = 2;</code>
     */
    public CommandType getCommand() {
        CommandType result = CommandType.valueOf(command_);
        return result == null ? CommandType.UNRECOGNIZED : result;
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
        if (requestTime_ != 0L) {
            output.writeInt64(1, requestTime_);
        }
        if (command_ != CommandType.UNUSED.getNumber()) {
            output.writeEnum(2, command_);
        }
    }

    public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) return size;

        size = 0;
        if (requestTime_ != 0L) {
            size += com.google.protobuf.CodedOutputStream
                    .computeInt64Size(1, requestTime_);
        }
        if (command_ != CommandType.UNUSED.getNumber()) {
            size += com.google.protobuf.CodedOutputStream
                    .computeEnumSize(2, command_);
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
        if (!(obj instanceof ControlCommand)) {
            return super.equals(obj);
        }
        ControlCommand other = (ControlCommand) obj;

        boolean result = true;
        result = result && (getRequestTime()
                == other.getRequestTime());
        result = result && command_ == other.command_;
        return result;
    }

    @Override
    public int hashCode() {
        if (memoizedHashCode != 0) {
            return memoizedHashCode;
        }
        int hash = 41;
        hash = (19 * hash) + getDescriptorForType().hashCode();
        hash = (37 * hash) + REQUEST_TIME_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                getRequestTime());
        hash = (37 * hash) + COMMAND_FIELD_NUMBER;
        hash = (53 * hash) + command_;
        hash = (29 * hash) + unknownFields.hashCode();
        memoizedHashCode = hash;
        return hash;
    }

    public static ControlCommand parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static ControlCommand parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static ControlCommand parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static ControlCommand parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static ControlCommand parseFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static ControlCommand parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static ControlCommand parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input);
    }

    public static ControlCommand parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static ControlCommand parseFrom(
            com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static ControlCommand parseFrom(
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

    public static Builder newBuilder(ControlCommand prototype) {
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
     * Protobuf type {@code ControlCommand}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
            // @@protoc_insertion_point(builder_implements:ControlCommand)
            ControlCommandOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return Gbt3260.internal_static_com_ime_iov_gbt32960_ControlCommand_descriptor;
        }

        protected FieldAccessorTable
        internalGetFieldAccessorTable() {
            return Gbt3260.internal_static_com_ime_iov_gbt32960_ControlCommand_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            ControlCommand.class, Builder.class);
        }

        // Construct using ControlCommand.newBuilder()
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
            requestTime_ = 0L;

            command_ = 0;

            return this;
        }

        public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
            return Gbt3260.internal_static_com_ime_iov_gbt32960_ControlCommand_descriptor;
        }

        public ControlCommand getDefaultInstanceForType() {
            return ControlCommand.getDefaultInstance();
        }

        public ControlCommand build() {
            ControlCommand result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        public ControlCommand buildPartial() {
            ControlCommand result = new ControlCommand(this);
            result.requestTime_ = requestTime_;
            result.command_ = command_;
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
            if (other instanceof ControlCommand) {
                return mergeFrom((ControlCommand) other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(ControlCommand other) {
            if (other == ControlCommand.getDefaultInstance()) return this;
            if (other.getRequestTime() != 0L) {
                setRequestTime(other.getRequestTime());
            }
            if (other.command_ != 0) {
                setCommandValue(other.getCommandValue());
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
            ControlCommand parsedMessage = null;
            try {
                parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                parsedMessage = (ControlCommand) e.getUnfinishedMessage();
                throw e.unwrapIOException();
            } finally {
                if (parsedMessage != null) {
                    mergeFrom(parsedMessage);
                }
            }
            return this;
        }

        private long requestTime_;

        /**
         * <code>optional int64 request_time = 1;</code>
         */
        public long getRequestTime() {
            return requestTime_;
        }

        /**
         * <code>optional int64 request_time = 1;</code>
         */
        public Builder setRequestTime(long value) {

            requestTime_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>optional int64 request_time = 1;</code>
         */
        public Builder clearRequestTime() {

            requestTime_ = 0L;
            onChanged();
            return this;
        }

        private int command_ = 0;

        /**
         * <code>optional .CommandType command = 2;</code>
         */
        public int getCommandValue() {
            return command_;
        }

        /**
         * <code>optional .CommandType command = 2;</code>
         */
        public Builder setCommandValue(int value) {
            command_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>optional .CommandType command = 2;</code>
         */
        public CommandType getCommand() {
            CommandType result = CommandType.valueOf(command_);
            return result == null ? CommandType.UNRECOGNIZED : result;
        }

        /**
         * <code>optional .CommandType command = 2;</code>
         */
        public Builder setCommand(CommandType value) {
            if (value == null) {
                throw new NullPointerException();
            }

            command_ = value.getNumber();
            onChanged();
            return this;
        }

        /**
         * <code>optional .CommandType command = 2;</code>
         */
        public Builder clearCommand() {

            command_ = 0;
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


        // @@protoc_insertion_point(builder_scope:ControlCommand)
    }

    // @@protoc_insertion_point(class_scope:ControlCommand)
    private static final ControlCommand DEFAULT_INSTANCE;

    static {
        DEFAULT_INSTANCE = new ControlCommand();
    }

    public static ControlCommand getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ControlCommand>
            PARSER = new com.google.protobuf.AbstractParser<ControlCommand>() {
        public ControlCommand parsePartialFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return new ControlCommand(input, extensionRegistry);
        }
    };

    public static com.google.protobuf.Parser<ControlCommand> parser() {
        return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<ControlCommand> getParserForType() {
        return PARSER;
    }

    public ControlCommand getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

}

