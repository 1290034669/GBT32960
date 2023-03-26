package com.yzxc.common.message;

public final class EmptyResponse extends
        com.google.protobuf.GeneratedMessageV3 implements
        EmptyResponseOrBuilder {
    private EmptyResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private EmptyResponse() {
        messsageType_ = 0;
        result_ = 0;
        hasTime_ = false;
        time_ = 0L;
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
        return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }

    private EmptyResponse(
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

                        messsageType_ = input.readInt32();
                        break;
                    }
                    case 16: {

                        result_ = input.readInt32();
                        break;
                    }
                    case 24: {

                        hasTime_ = input.readBool();
                        break;
                    }
                    case 32: {

                        time_ = input.readInt64();
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
        return Gbt3260.internal_static_com_ime_iov_gbt32960_EmptyResponse_descriptor;
    }

    protected FieldAccessorTable
    internalGetFieldAccessorTable() {
        return Gbt3260.internal_static_com_ime_iov_gbt32960_EmptyResponse_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                        EmptyResponse.class, Builder.class);
    }

    public static final int MESSSAGE_TYPE_FIELD_NUMBER = 1;
    private int messsageType_;

    /**
     * <code>optional int32 messsage_type = 1;</code>
     */
    public int getMesssageType() {
        return messsageType_;
    }

    public static final int RESULT_FIELD_NUMBER = 2;
    private int result_;

    /**
     * <code>optional int32 result = 2;</code>
     */
    public int getResult() {
        return result_;
    }

    public static final int HAS_TIME_FIELD_NUMBER = 3;
    private boolean hasTime_;

    /**
     * <code>optional bool has_time = 3;</code>
     */
    public boolean getHasTime() {
        return hasTime_;
    }

    public static final int TIME_FIELD_NUMBER = 4;
    private long time_;

    /**
     * <code>optional int64 time = 4;</code>
     */
    public long getTime() {
        return time_;
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
        if (messsageType_ != 0) {
            output.writeInt32(1, messsageType_);
        }
        if (result_ != 0) {
            output.writeInt32(2, result_);
        }
        if (hasTime_ != false) {
            output.writeBool(3, hasTime_);
        }
        if (time_ != 0L) {
            output.writeInt64(4, time_);
        }
    }

    public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) return size;

        size = 0;
        if (messsageType_ != 0) {
            size += com.google.protobuf.CodedOutputStream
                    .computeInt32Size(1, messsageType_);
        }
        if (result_ != 0) {
            size += com.google.protobuf.CodedOutputStream
                    .computeInt32Size(2, result_);
        }
        if (hasTime_ != false) {
            size += com.google.protobuf.CodedOutputStream
                    .computeBoolSize(3, hasTime_);
        }
        if (time_ != 0L) {
            size += com.google.protobuf.CodedOutputStream
                    .computeInt64Size(4, time_);
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
        if (!(obj instanceof EmptyResponse)) {
            return super.equals(obj);
        }
        EmptyResponse other = (EmptyResponse) obj;

        boolean result = true;
        result = result && (getMesssageType()
                == other.getMesssageType());
        result = result && (getResult()
                == other.getResult());
        result = result && (getHasTime()
                == other.getHasTime());
        result = result && (getTime()
                == other.getTime());
        return result;
    }

    @Override
    public int hashCode() {
        if (memoizedHashCode != 0) {
            return memoizedHashCode;
        }
        int hash = 41;
        hash = (19 * hash) + getDescriptorForType().hashCode();
        hash = (37 * hash) + MESSSAGE_TYPE_FIELD_NUMBER;
        hash = (53 * hash) + getMesssageType();
        hash = (37 * hash) + RESULT_FIELD_NUMBER;
        hash = (53 * hash) + getResult();
        hash = (37 * hash) + HAS_TIME_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
                getHasTime());
        hash = (37 * hash) + TIME_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                getTime());
        hash = (29 * hash) + unknownFields.hashCode();
        memoizedHashCode = hash;
        return hash;
    }

    public static EmptyResponse parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static EmptyResponse parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static EmptyResponse parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static EmptyResponse parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static EmptyResponse parseFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static EmptyResponse parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static EmptyResponse parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input);
    }

    public static EmptyResponse parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static EmptyResponse parseFrom(
            com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static EmptyResponse parseFrom(
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

    public static Builder newBuilder(EmptyResponse prototype) {
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
     * Protobuf type {@code EmptyResponse}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
            // @@protoc_insertion_point(builder_implements:EmptyResponse)
            EmptyResponseOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return Gbt3260.internal_static_com_ime_iov_gbt32960_EmptyResponse_descriptor;
        }

        protected FieldAccessorTable
        internalGetFieldAccessorTable() {
            return Gbt3260.internal_static_com_ime_iov_gbt32960_EmptyResponse_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            EmptyResponse.class, Builder.class);
        }

        // Construct using EmptyResponse.newBuilder()
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
            messsageType_ = 0;

            result_ = 0;

            hasTime_ = false;

            time_ = 0L;

            return this;
        }

        public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
            return Gbt3260.internal_static_com_ime_iov_gbt32960_EmptyResponse_descriptor;
        }

        public EmptyResponse getDefaultInstanceForType() {
            return EmptyResponse.getDefaultInstance();
        }

        public EmptyResponse build() {
            EmptyResponse result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        public EmptyResponse buildPartial() {
            EmptyResponse result = new EmptyResponse(this);
            result.messsageType_ = messsageType_;
            result.result_ = result_;
            result.hasTime_ = hasTime_;
            result.time_ = time_;
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
            if (other instanceof EmptyResponse) {
                return mergeFrom((EmptyResponse) other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(EmptyResponse other) {
            if (other == EmptyResponse.getDefaultInstance()) return this;
            if (other.getMesssageType() != 0) {
                setMesssageType(other.getMesssageType());
            }
            if (other.getResult() != 0) {
                setResult(other.getResult());
            }
            if (other.getHasTime() != false) {
                setHasTime(other.getHasTime());
            }
            if (other.getTime() != 0L) {
                setTime(other.getTime());
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
            EmptyResponse parsedMessage = null;
            try {
                parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                parsedMessage = (EmptyResponse) e.getUnfinishedMessage();
                throw e.unwrapIOException();
            } finally {
                if (parsedMessage != null) {
                    mergeFrom(parsedMessage);
                }
            }
            return this;
        }

        private int messsageType_;

        /**
         * <code>optional int32 messsage_type = 1;</code>
         */
        public int getMesssageType() {
            return messsageType_;
        }

        /**
         * <code>optional int32 messsage_type = 1;</code>
         */
        public Builder setMesssageType(int value) {

            messsageType_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>optional int32 messsage_type = 1;</code>
         */
        public Builder clearMesssageType() {

            messsageType_ = 0;
            onChanged();
            return this;
        }

        private int result_;

        /**
         * <code>optional int32 result = 2;</code>
         */
        public int getResult() {
            return result_;
        }

        /**
         * <code>optional int32 result = 2;</code>
         */
        public Builder setResult(int value) {

            result_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>optional int32 result = 2;</code>
         */
        public Builder clearResult() {

            result_ = 0;
            onChanged();
            return this;
        }

        private boolean hasTime_;

        /**
         * <code>optional bool has_time = 3;</code>
         */
        public boolean getHasTime() {
            return hasTime_;
        }

        /**
         * <code>optional bool has_time = 3;</code>
         */
        public Builder setHasTime(boolean value) {

            hasTime_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>optional bool has_time = 3;</code>
         */
        public Builder clearHasTime() {

            hasTime_ = false;
            onChanged();
            return this;
        }

        private long time_;

        /**
         * <code>optional int64 time = 4;</code>
         */
        public long getTime() {
            return time_;
        }

        /**
         * <code>optional int64 time = 4;</code>
         */
        public Builder setTime(long value) {

            time_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>optional int64 time = 4;</code>
         */
        public Builder clearTime() {

            time_ = 0L;
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


        // @@protoc_insertion_point(builder_scope:EmptyResponse)
    }

    // @@protoc_insertion_point(class_scope:EmptyResponse)
    private static final EmptyResponse DEFAULT_INSTANCE;

    static {
        DEFAULT_INSTANCE = new EmptyResponse();
    }

    public static EmptyResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EmptyResponse>
            PARSER = new com.google.protobuf.AbstractParser<EmptyResponse>() {
        public EmptyResponse parsePartialFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return new EmptyResponse(input, extensionRegistry);
        }
    };

    public static com.google.protobuf.Parser<EmptyResponse> parser() {
        return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<EmptyResponse> getParserForType() {
        return PARSER;
    }

    public EmptyResponse getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

}

