package com.yzxc.common.message;

public final class AccessRegistration extends
        com.google.protobuf.GeneratedMessageV3 implements
        AccessRegistrationOrBuilder {
    private AccessRegistration(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private AccessRegistration() {
        vin_ = "";
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
        return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }

    private AccessRegistration(
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
                    case 10: {
                        String s = input.readStringRequireUtf8();

                        vin_ = s;
                        break;
                    }
                    case 18: {
                        LoginRequest.Builder subBuilder = null;
                        if (messageCase_ == 2) {
                            subBuilder = ((LoginRequest) message_).toBuilder();
                        }
                        message_ =
                                input.readMessage(LoginRequest.parser(), extensionRegistry);
                        if (subBuilder != null) {
                            subBuilder.mergeFrom((LoginRequest) message_);
                            message_ = subBuilder.buildPartial();
                        }
                        messageCase_ = 2;
                        break;
                    }
                    case 26: {
                        LogoutRequest.Builder subBuilder = null;
                        if (messageCase_ == 3) {
                            subBuilder = ((LogoutRequest) message_).toBuilder();
                        }
                        message_ =
                                input.readMessage(LogoutRequest.parser(), extensionRegistry);
                        if (subBuilder != null) {
                            subBuilder.mergeFrom((LogoutRequest) message_);
                            message_ = subBuilder.buildPartial();
                        }
                        messageCase_ = 3;
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
        return Gbt3260.internal_static_com_ime_iov_gbt32960_AccessRegistration_descriptor;
    }

    protected FieldAccessorTable
    internalGetFieldAccessorTable() {
        return Gbt3260.internal_static_com_ime_iov_gbt32960_AccessRegistration_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                        AccessRegistration.class, Builder.class);
    }

    private int messageCase_ = 0;
    private Object message_;

    public enum MessageCase
            implements com.google.protobuf.Internal.EnumLite {
        LOGIN(2),
        LOGOUT(3),
        MESSAGE_NOT_SET(0);
        private final int value;

        private MessageCase(int value) {
            this.value = value;
        }

        @Deprecated
        public static MessageCase valueOf(int value) {
            return forNumber(value);
        }

        public static MessageCase forNumber(int value) {
            switch (value) {
                case 2:
                    return LOGIN;
                case 3:
                    return LOGOUT;
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

    public static final int VIN_FIELD_NUMBER = 1;
    private volatile Object vin_;

    public String getVin() {
        Object ref = vin_;
        if (ref instanceof String) {
            return (String) ref;
        } else {
            com.google.protobuf.ByteString bs =
                    (com.google.protobuf.ByteString) ref;
            String s = bs.toStringUtf8();
            vin_ = s;
            return s;
        }
    }

    public com.google.protobuf.ByteString
    getVinBytes() {
        Object ref = vin_;
        if (ref instanceof String) {
            com.google.protobuf.ByteString b =
                    com.google.protobuf.ByteString.copyFromUtf8(
                            (String) ref);
            vin_ = b;
            return b;
        } else {
            return (com.google.protobuf.ByteString) ref;
        }
    }

    public static final int LOGIN_FIELD_NUMBER = 2;

    public LoginRequest getLogin() {
        if (messageCase_ == 2) {
            return (LoginRequest) message_;
        }
        return LoginRequest.getDefaultInstance();
    }

    public LoginRequestOrBuilder getLoginOrBuilder() {
        if (messageCase_ == 2) {
            return (LoginRequest) message_;
        }
        return LoginRequest.getDefaultInstance();
    }

    public static final int LOGOUT_FIELD_NUMBER = 3;

    public LogoutRequest getLogout() {
        if (messageCase_ == 3) {
            return (LogoutRequest) message_;
        }
        return LogoutRequest.getDefaultInstance();
    }

    public LogoutRequestOrBuilder getLogoutOrBuilder() {
        if (messageCase_ == 3) {
            return (LogoutRequest) message_;
        }
        return LogoutRequest.getDefaultInstance();
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
        if (!getVinBytes().isEmpty()) {
            com.google.protobuf.GeneratedMessageV3.writeString(output, 1, vin_);
        }
        if (messageCase_ == 2) {
            output.writeMessage(2, (LoginRequest) message_);
        }
        if (messageCase_ == 3) {
            output.writeMessage(3, (LogoutRequest) message_);
        }
    }

    public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) return size;

        size = 0;
        if (!getVinBytes().isEmpty()) {
            size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, vin_);
        }
        if (messageCase_ == 2) {
            size += com.google.protobuf.CodedOutputStream
                    .computeMessageSize(2, (LoginRequest) message_);
        }
        if (messageCase_ == 3) {
            size += com.google.protobuf.CodedOutputStream
                    .computeMessageSize(3, (LogoutRequest) message_);
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
        if (!(obj instanceof AccessRegistration)) {
            return super.equals(obj);
        }
        AccessRegistration other = (AccessRegistration) obj;

        boolean result = true;
        result = result && getVin()
                .equals(other.getVin());
        result = result && getMessageCase().equals(
                other.getMessageCase());
        if (!result) return false;
        switch (messageCase_) {
            case 2:
                result = result && getLogin()
                        .equals(other.getLogin());
                break;
            case 3:
                result = result && getLogout()
                        .equals(other.getLogout());
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
        hash = (37 * hash) + VIN_FIELD_NUMBER;
        hash = (53 * hash) + getVin().hashCode();
        switch (messageCase_) {
            case 2:
                hash = (37 * hash) + LOGIN_FIELD_NUMBER;
                hash = (53 * hash) + getLogin().hashCode();
                break;
            case 3:
                hash = (37 * hash) + LOGOUT_FIELD_NUMBER;
                hash = (53 * hash) + getLogout().hashCode();
                break;
            case 0:
            default:
        }
        hash = (29 * hash) + unknownFields.hashCode();
        memoizedHashCode = hash;
        return hash;
    }

    public static AccessRegistration parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static AccessRegistration parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static AccessRegistration parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static AccessRegistration parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static AccessRegistration parseFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static AccessRegistration parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static AccessRegistration parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input);
    }

    public static AccessRegistration parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static AccessRegistration parseFrom(
            com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static AccessRegistration parseFrom(
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

    public static Builder newBuilder(AccessRegistration prototype) {
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

    public static final class Builder extends
            com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
            AccessRegistrationOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return Gbt3260.internal_static_com_ime_iov_gbt32960_AccessRegistration_descriptor;
        }

        protected FieldAccessorTable
        internalGetFieldAccessorTable() {
            return Gbt3260.internal_static_com_ime_iov_gbt32960_AccessRegistration_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            AccessRegistration.class, Builder.class);
        }

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
            vin_ = "";

            messageCase_ = 0;
            message_ = null;
            return this;
        }

        public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
            return Gbt3260.internal_static_com_ime_iov_gbt32960_AccessRegistration_descriptor;
        }

        public AccessRegistration getDefaultInstanceForType() {
            return AccessRegistration.getDefaultInstance();
        }

        public AccessRegistration build() {
            AccessRegistration result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        public AccessRegistration buildPartial() {
            AccessRegistration result = new AccessRegistration(this);
            result.vin_ = vin_;
            if (messageCase_ == 2) {
                if (loginBuilder_ == null) {
                    result.message_ = message_;
                } else {
                    result.message_ = loginBuilder_.build();
                }
            }
            if (messageCase_ == 3) {
                if (logoutBuilder_ == null) {
                    result.message_ = message_;
                } else {
                    result.message_ = logoutBuilder_.build();
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
            if (other instanceof AccessRegistration) {
                return mergeFrom((AccessRegistration) other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(AccessRegistration other) {
            if (other == AccessRegistration.getDefaultInstance()) return this;
            if (!other.getVin().isEmpty()) {
                vin_ = other.vin_;
                onChanged();
            }
            switch (other.getMessageCase()) {
                case LOGIN: {
                    mergeLogin(other.getLogin());
                    break;
                }
                case LOGOUT: {
                    mergeLogout(other.getLogout());
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
            AccessRegistration parsedMessage = null;
            try {
                parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                parsedMessage = (AccessRegistration) e.getUnfinishedMessage();
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


        private Object vin_ = "";

        public String getVin() {
            Object ref = vin_;
            if (!(ref instanceof String)) {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                vin_ = s;
                return s;
            } else {
                return (String) ref;
            }
        }

        public com.google.protobuf.ByteString
        getVinBytes() {
            Object ref = vin_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                vin_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public Builder setVin(
                String value) {
            if (value == null) {
                throw new NullPointerException();
            }

            vin_ = value;
            onChanged();
            return this;
        }

        public Builder clearVin() {

            vin_ = getDefaultInstance().getVin();
            onChanged();
            return this;
        }

        public Builder setVinBytes(
                com.google.protobuf.ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(value);

            vin_ = value;
            onChanged();
            return this;
        }

        private com.google.protobuf.SingleFieldBuilderV3<
                LoginRequest,LoginRequest.Builder,LoginRequestOrBuilder> loginBuilder_;

        public LoginRequest getLogin() {
            if (loginBuilder_ == null) {
                if (messageCase_ == 2) {
                    return (LoginRequest) message_;
                }
                return LoginRequest.getDefaultInstance();
            } else {
                if (messageCase_ == 2) {
                    return loginBuilder_.getMessage();
                }
                return LoginRequest.getDefaultInstance();
            }
        }

        public Builder setLogin(LoginRequest value) {
            if (loginBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                message_ = value;
                onChanged();
            } else {
                loginBuilder_.setMessage(value);
            }
            messageCase_ = 2;
            return this;
        }

        public Builder setLogin(
                LoginRequest.Builder builderForValue) {
            if (loginBuilder_ == null) {
                message_ = builderForValue.build();
                onChanged();
            } else {
                loginBuilder_.setMessage(builderForValue.build());
            }
            messageCase_ = 2;
            return this;
        }

        public Builder mergeLogin(LoginRequest value) {
            if (loginBuilder_ == null) {
                if (messageCase_ == 2 &&
                        message_ != LoginRequest.getDefaultInstance()) {
                    message_ = LoginRequest.newBuilder((LoginRequest) message_)
                            .mergeFrom(value).buildPartial();
                } else {
                    message_ = value;
                }
                onChanged();
            } else {
                if (messageCase_ == 2) {
                    loginBuilder_.mergeFrom(value);
                }
                loginBuilder_.setMessage(value);
            }
            messageCase_ = 2;
            return this;
        }

        public Builder clearLogin() {
            if (loginBuilder_ == null) {
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
                loginBuilder_.clear();
            }
            return this;
        }

        public LoginRequest.Builder getLoginBuilder() {
            return getLoginFieldBuilder().getBuilder();
        }

        public LoginRequestOrBuilder getLoginOrBuilder() {
            if ((messageCase_ == 2) && (loginBuilder_ != null)) {
                return loginBuilder_.getMessageOrBuilder();
            } else {
                if (messageCase_ == 2) {
                    return (LoginRequest) message_;
                }
                return LoginRequest.getDefaultInstance();
            }
        }

        private com.google.protobuf.SingleFieldBuilderV3<
                LoginRequest,LoginRequest.Builder,LoginRequestOrBuilder>
        getLoginFieldBuilder() {
            if (loginBuilder_ == null) {
                if (!(messageCase_ == 2)) {
                    message_ = LoginRequest.getDefaultInstance();
                }
                loginBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                        LoginRequest,LoginRequest.Builder,LoginRequestOrBuilder>(
                        (LoginRequest) message_,
                        getParentForChildren(),
                        isClean());
                message_ = null;
            }
            messageCase_ = 2;
            onChanged();
            ;
            return loginBuilder_;
        }

        private com.google.protobuf.SingleFieldBuilderV3<
                LogoutRequest,LogoutRequest.Builder,LogoutRequestOrBuilder> logoutBuilder_;

        public LogoutRequest getLogout() {
            if (logoutBuilder_ == null) {
                if (messageCase_ == 3) {
                    return (LogoutRequest) message_;
                }
                return LogoutRequest.getDefaultInstance();
            } else {
                if (messageCase_ == 3) {
                    return logoutBuilder_.getMessage();
                }
                return LogoutRequest.getDefaultInstance();
            }
        }

        public Builder setLogout(LogoutRequest value) {
            if (logoutBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                message_ = value;
                onChanged();
            } else {
                logoutBuilder_.setMessage(value);
            }
            messageCase_ = 3;
            return this;
        }

        public Builder setLogout(
                LogoutRequest.Builder builderForValue) {
            if (logoutBuilder_ == null) {
                message_ = builderForValue.build();
                onChanged();
            } else {
                logoutBuilder_.setMessage(builderForValue.build());
            }
            messageCase_ = 3;
            return this;
        }

        public Builder mergeLogout(LogoutRequest value) {
            if (logoutBuilder_ == null) {
                if (messageCase_ == 3 &&
                        message_ != LogoutRequest.getDefaultInstance()) {
                    message_ = LogoutRequest.newBuilder((LogoutRequest) message_)
                            .mergeFrom(value).buildPartial();
                } else {
                    message_ = value;
                }
                onChanged();
            } else {
                if (messageCase_ == 3) {
                    logoutBuilder_.mergeFrom(value);
                }
                logoutBuilder_.setMessage(value);
            }
            messageCase_ = 3;
            return this;
        }

        public Builder clearLogout() {
            if (logoutBuilder_ == null) {
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
                logoutBuilder_.clear();
            }
            return this;
        }

        public LogoutRequest.Builder getLogoutBuilder() {
            return getLogoutFieldBuilder().getBuilder();
        }

        public LogoutRequestOrBuilder getLogoutOrBuilder() {
            if ((messageCase_ == 3) && (logoutBuilder_ != null)) {
                return logoutBuilder_.getMessageOrBuilder();
            } else {
                if (messageCase_ == 3) {
                    return (LogoutRequest) message_;
                }
                return LogoutRequest.getDefaultInstance();
            }
        }

        private com.google.protobuf.SingleFieldBuilderV3<
                LogoutRequest,LogoutRequest.Builder,LogoutRequestOrBuilder>
        getLogoutFieldBuilder() {
            if (logoutBuilder_ == null) {
                if (!(messageCase_ == 3)) {
                    message_ = LogoutRequest.getDefaultInstance();
                }
                logoutBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                        LogoutRequest,LogoutRequest.Builder,LogoutRequestOrBuilder>(
                        (LogoutRequest) message_,
                        getParentForChildren(),
                        isClean());
                message_ = null;
            }
            messageCase_ = 3;
            onChanged();
            ;
            return logoutBuilder_;
        }

        public final Builder setUnknownFields(
                final com.google.protobuf.UnknownFieldSet unknownFields) {
            return this;
        }

        public final Builder mergeUnknownFields(
                final com.google.protobuf.UnknownFieldSet unknownFields) {
            return this;
        }


    }

    private static final AccessRegistration DEFAULT_INSTANCE;

    static {
        DEFAULT_INSTANCE = new AccessRegistration();
    }

    public static AccessRegistration getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AccessRegistration>
            PARSER = new com.google.protobuf.AbstractParser<AccessRegistration>() {
        public AccessRegistration parsePartialFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return new AccessRegistration(input, extensionRegistry);
        }
    };

    public static com.google.protobuf.Parser<AccessRegistration> parser() {
        return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<AccessRegistration> getParserForType() {
        return PARSER;
    }

    public AccessRegistration getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

}

