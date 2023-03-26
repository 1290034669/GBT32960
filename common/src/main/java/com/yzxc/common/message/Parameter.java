
package com.yzxc.common.message;

public final class Parameter extends
        com.google.protobuf.GeneratedMessageV3 implements
        ParameterOrBuilder {
    private Parameter(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private Parameter() {
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
        return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }

    private Parameter(
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
                        parameterCase_ = 1;
                        parameter_ = input.readInt32();
                        break;
                    }
                    case 16: {
                        parameterCase_ = 2;
                        parameter_ = input.readInt32();
                        break;
                    }
                    case 24: {
                        parameterCase_ = 3;
                        parameter_ = input.readInt32();
                        break;
                    }
                    case 32: {
                        parameterCase_ = 4;
                        parameter_ = input.readInt32();
                        break;
                    }
                    case 42: {
                        String s = input.readStringRequireUtf8();
                        parameterCase_ = 5;
                        parameter_ = s;
                        break;
                    }
                    case 48: {
                        parameterCase_ = 6;
                        parameter_ = input.readInt32();
                        break;
                    }
                    case 58: {
                        String s = input.readStringRequireUtf8();
                        parameterCase_ = 7;
                        parameter_ = s;
                        break;
                    }
                    case 66: {
                        String s = input.readStringRequireUtf8();
                        parameterCase_ = 8;
                        parameter_ = s;
                        break;
                    }
                    case 72: {
                        parameterCase_ = 9;
                        parameter_ = input.readInt32();
                        break;
                    }
                    case 80: {
                        parameterCase_ = 10;
                        parameter_ = input.readInt32();
                        break;
                    }
                    case 88: {
                        parameterCase_ = 11;
                        parameter_ = input.readInt32();
                        break;
                    }
                    case 96: {
                        parameterCase_ = 12;
                        parameter_ = input.readInt32();
                        break;
                    }
                    case 104: {
                        parameterCase_ = 13;
                        parameter_ = input.readInt32();
                        break;
                    }
                    case 114: {
                        String s = input.readStringRequireUtf8();
                        parameterCase_ = 14;
                        parameter_ = s;
                        break;
                    }
                    case 120: {
                        parameterCase_ = 15;
                        parameter_ = input.readInt32();
                        break;
                    }
                    case 128: {
                        int rawValue = input.readEnum();
                        parameterCase_ = 16;
                        parameter_ = rawValue;
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
        return Gbt3260.internal_static_com_ime_iov_gbt32960_Parameter_descriptor;
    }

    protected FieldAccessorTable
    internalGetFieldAccessorTable() {
        return Gbt3260.internal_static_com_ime_iov_gbt32960_Parameter_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                        Parameter.class, Builder.class);
    }

    /**
     * Protobuf enum {@code Parameter.SamplingState}
     */
    public enum SamplingState
            implements com.google.protobuf.ProtocolMessageEnum {
        /**
         * <code>UNKNOWN = 0;</code>
         */
        UNKNOWN(0),
        /**
         * <code>ON = 1;</code>
         */
        ON(1),
        /**
         * <code>OFF = 2;</code>
         */
        OFF(2),
        /**
         * <code>EXCEPTION = 254;</code>
         */
        EXCEPTION(254),
        /**
         * <code>INVALID = 255;</code>
         */
        INVALID(255),
        UNRECOGNIZED(-1),
        ;

        /**
         * <code>UNKNOWN = 0;</code>
         */
        public static final int UNKNOWN_VALUE = 0;
        /**
         * <code>ON = 1;</code>
         */
        public static final int ON_VALUE = 1;
        /**
         * <code>OFF = 2;</code>
         */
        public static final int OFF_VALUE = 2;
        /**
         * <code>EXCEPTION = 254;</code>
         */
        public static final int EXCEPTION_VALUE = 254;
        /**
         * <code>INVALID = 255;</code>
         */
        public static final int INVALID_VALUE = 255;


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
        public static SamplingState valueOf(int value) {
            return forNumber(value);
        }

        public static SamplingState forNumber(int value) {
            switch (value) {
                case 0:
                    return UNKNOWN;
                case 1:
                    return ON;
                case 2:
                    return OFF;
                case 254:
                    return EXCEPTION;
                case 255:
                    return INVALID;
                default:
                    return null;
            }
        }

        public static com.google.protobuf.Internal.EnumLiteMap<SamplingState>
        internalGetValueMap() {
            return internalValueMap;
        }

        private static final com.google.protobuf.Internal.EnumLiteMap<
                SamplingState> internalValueMap =
                new com.google.protobuf.Internal.EnumLiteMap<SamplingState>() {
                    public SamplingState findValueByNumber(int number) {
                        return SamplingState.forNumber(number);
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
            return Parameter.getDescriptor().getEnumTypes().get(0);
        }

        private static final SamplingState[] VALUES = values();

        public static SamplingState valueOf(
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

        private SamplingState(int value) {
            this.value = value;
        }

        // @@protoc_insertion_point(enum_scope:Parameter.SamplingState)
    }

    private int parameterCase_ = 0;
    private Object parameter_;

    public enum ParameterCase
            implements com.google.protobuf.Internal.EnumLite {
        STORAGE_PERIOD(1),
        NORMAL_REPORT_INTERVAL(2),
        ALARM_REPORT_INTERVAL(3),
        MANAGEMENT_PLATFORM_DOMAIN_LENGTH(4),
        MANAGEMENT_PLATFORM_DOMAIN(5),
        MANAGEMENT_PLATFORM_PORT(6),
        HARDWARE_VERSION(7),
        FIRMWARE_VERSION(8),
        HEARBEAT_INTERVAL(9),
        TERMINAL_RESPONSE_TIMEOUT(10),
        PLATFORM_RESPONSE_TIMEOUT(11),
        LOGIN_RETRY_INTERVAL(12),
        PUBLIC_PLATFORM_DOMAIN_LENGTH(13),
        PUBLIC_PLATFORM_DOMAIN(14),
        PUBLIC_PLATFORM_PORT(15),
        SAMPLING(16),
        PARAMETER_NOT_SET(0);
        private final int value;

        private ParameterCase(int value) {
            this.value = value;
        }

        /**
         * @deprecated Use {@link #forNumber(int)} instead.
         */
        @Deprecated
        public static ParameterCase valueOf(int value) {
            return forNumber(value);
        }

        public static ParameterCase forNumber(int value) {
            switch (value) {
                case 1:
                    return STORAGE_PERIOD;
                case 2:
                    return NORMAL_REPORT_INTERVAL;
                case 3:
                    return ALARM_REPORT_INTERVAL;
                case 4:
                    return MANAGEMENT_PLATFORM_DOMAIN_LENGTH;
                case 5:
                    return MANAGEMENT_PLATFORM_DOMAIN;
                case 6:
                    return MANAGEMENT_PLATFORM_PORT;
                case 7:
                    return HARDWARE_VERSION;
                case 8:
                    return FIRMWARE_VERSION;
                case 9:
                    return HEARBEAT_INTERVAL;
                case 10:
                    return TERMINAL_RESPONSE_TIMEOUT;
                case 11:
                    return PLATFORM_RESPONSE_TIMEOUT;
                case 12:
                    return LOGIN_RETRY_INTERVAL;
                case 13:
                    return PUBLIC_PLATFORM_DOMAIN_LENGTH;
                case 14:
                    return PUBLIC_PLATFORM_DOMAIN;
                case 15:
                    return PUBLIC_PLATFORM_PORT;
                case 16:
                    return SAMPLING;
                case 0:
                    return PARAMETER_NOT_SET;
                default:
                    return null;
            }
        }

        public int getNumber() {
            return this.value;
        }
    }

    ;

    public ParameterCase
    getParameterCase() {
        return ParameterCase.forNumber(
                parameterCase_);
    }

    public static final int STORAGE_PERIOD_FIELD_NUMBER = 1;

    /**
     * <code>optional int32 storage_period = 1;</code>
     */
    public int getStoragePeriod() {
        if (parameterCase_ == 1) {
            return (Integer) parameter_;
        }
        return 0;
    }

    public static final int NORMAL_REPORT_INTERVAL_FIELD_NUMBER = 2;

    /**
     * <code>optional int32 normal_report_interval = 2;</code>
     */
    public int getNormalReportInterval() {
        if (parameterCase_ == 2) {
            return (Integer) parameter_;
        }
        return 0;
    }

    public static final int ALARM_REPORT_INTERVAL_FIELD_NUMBER = 3;

    /**
     * <code>optional int32 alarm_report_interval = 3;</code>
     */
    public int getAlarmReportInterval() {
        if (parameterCase_ == 3) {
            return (Integer) parameter_;
        }
        return 0;
    }

    public static final int MANAGEMENT_PLATFORM_DOMAIN_LENGTH_FIELD_NUMBER = 4;

    /**
     * <code>optional int32 management_platform_domain_length = 4;</code>
     */
    public int getManagementPlatformDomainLength() {
        if (parameterCase_ == 4) {
            return (Integer) parameter_;
        }
        return 0;
    }

    public static final int MANAGEMENT_PLATFORM_DOMAIN_FIELD_NUMBER = 5;

    /**
     * <code>optional string management_platform_domain = 5;</code>
     */
    public String getManagementPlatformDomain() {
        Object ref = "";
        if (parameterCase_ == 5) {
            ref = parameter_;
        }
        if (ref instanceof String) {
            return (String) ref;
        } else {
            com.google.protobuf.ByteString bs =
                    (com.google.protobuf.ByteString) ref;
            String s = bs.toStringUtf8();
            if (parameterCase_ == 5) {
                parameter_ = s;
            }
            return s;
        }
    }

    /**
     * <code>optional string management_platform_domain = 5;</code>
     */
    public com.google.protobuf.ByteString
    getManagementPlatformDomainBytes() {
        Object ref = "";
        if (parameterCase_ == 5) {
            ref = parameter_;
        }
        if (ref instanceof String) {
            com.google.protobuf.ByteString b =
                    com.google.protobuf.ByteString.copyFromUtf8(
                            (String) ref);
            if (parameterCase_ == 5) {
                parameter_ = b;
            }
            return b;
        } else {
            return (com.google.protobuf.ByteString) ref;
        }
    }

    public static final int MANAGEMENT_PLATFORM_PORT_FIELD_NUMBER = 6;

    /**
     * <code>optional int32 management_platform_port = 6;</code>
     */
    public int getManagementPlatformPort() {
        if (parameterCase_ == 6) {
            return (Integer) parameter_;
        }
        return 0;
    }

    public static final int HARDWARE_VERSION_FIELD_NUMBER = 7;

    /**
     * <code>optional string hardware_version = 7;</code>
     */
    public String getHardwareVersion() {
        Object ref = "";
        if (parameterCase_ == 7) {
            ref = parameter_;
        }
        if (ref instanceof String) {
            return (String) ref;
        } else {
            com.google.protobuf.ByteString bs =
                    (com.google.protobuf.ByteString) ref;
            String s = bs.toStringUtf8();
            if (parameterCase_ == 7) {
                parameter_ = s;
            }
            return s;
        }
    }

    /**
     * <code>optional string hardware_version = 7;</code>
     */
    public com.google.protobuf.ByteString
    getHardwareVersionBytes() {
        Object ref = "";
        if (parameterCase_ == 7) {
            ref = parameter_;
        }
        if (ref instanceof String) {
            com.google.protobuf.ByteString b =
                    com.google.protobuf.ByteString.copyFromUtf8(
                            (String) ref);
            if (parameterCase_ == 7) {
                parameter_ = b;
            }
            return b;
        } else {
            return (com.google.protobuf.ByteString) ref;
        }
    }

    public static final int FIRMWARE_VERSION_FIELD_NUMBER = 8;

    /**
     * <code>optional string firmware_version = 8;</code>
     */
    public String getFirmwareVersion() {
        Object ref = "";
        if (parameterCase_ == 8) {
            ref = parameter_;
        }
        if (ref instanceof String) {
            return (String) ref;
        } else {
            com.google.protobuf.ByteString bs =
                    (com.google.protobuf.ByteString) ref;
            String s = bs.toStringUtf8();
            if (parameterCase_ == 8) {
                parameter_ = s;
            }
            return s;
        }
    }

    /**
     * <code>optional string firmware_version = 8;</code>
     */
    public com.google.protobuf.ByteString
    getFirmwareVersionBytes() {
        Object ref = "";
        if (parameterCase_ == 8) {
            ref = parameter_;
        }
        if (ref instanceof String) {
            com.google.protobuf.ByteString b =
                    com.google.protobuf.ByteString.copyFromUtf8(
                            (String) ref);
            if (parameterCase_ == 8) {
                parameter_ = b;
            }
            return b;
        } else {
            return (com.google.protobuf.ByteString) ref;
        }
    }

    public static final int HEARBEAT_INTERVAL_FIELD_NUMBER = 9;

    /**
     * <code>optional int32 hearbeat_interval = 9;</code>
     */
    public int getHearbeatInterval() {
        if (parameterCase_ == 9) {
            return (Integer) parameter_;
        }
        return 0;
    }

    public static final int TERMINAL_RESPONSE_TIMEOUT_FIELD_NUMBER = 10;

    /**
     * <code>optional int32 terminal_response_timeout = 10;</code>
     */
    public int getTerminalResponseTimeout() {
        if (parameterCase_ == 10) {
            return (Integer) parameter_;
        }
        return 0;
    }

    public static final int PLATFORM_RESPONSE_TIMEOUT_FIELD_NUMBER = 11;

    /**
     * <code>optional int32 platform_response_timeout = 11;</code>
     */
    public int getPlatformResponseTimeout() {
        if (parameterCase_ == 11) {
            return (Integer) parameter_;
        }
        return 0;
    }

    public static final int LOGIN_RETRY_INTERVAL_FIELD_NUMBER = 12;

    /**
     * <code>optional int32 login_retry_interval = 12;</code>
     */
    public int getLoginRetryInterval() {
        if (parameterCase_ == 12) {
            return (Integer) parameter_;
        }
        return 0;
    }

    public static final int PUBLIC_PLATFORM_DOMAIN_LENGTH_FIELD_NUMBER = 13;

    /**
     * <code>optional int32 public_platform_domain_length = 13;</code>
     */
    public int getPublicPlatformDomainLength() {
        if (parameterCase_ == 13) {
            return (Integer) parameter_;
        }
        return 0;
    }

    public static final int PUBLIC_PLATFORM_DOMAIN_FIELD_NUMBER = 14;

    /**
     * <code>optional string public_platform_domain = 14;</code>
     */
    public String getPublicPlatformDomain() {
        Object ref = "";
        if (parameterCase_ == 14) {
            ref = parameter_;
        }
        if (ref instanceof String) {
            return (String) ref;
        } else {
            com.google.protobuf.ByteString bs =
                    (com.google.protobuf.ByteString) ref;
            String s = bs.toStringUtf8();
            if (parameterCase_ == 14) {
                parameter_ = s;
            }
            return s;
        }
    }

    /**
     * <code>optional string public_platform_domain = 14;</code>
     */
    public com.google.protobuf.ByteString
    getPublicPlatformDomainBytes() {
        Object ref = "";
        if (parameterCase_ == 14) {
            ref = parameter_;
        }
        if (ref instanceof String) {
            com.google.protobuf.ByteString b =
                    com.google.protobuf.ByteString.copyFromUtf8(
                            (String) ref);
            if (parameterCase_ == 14) {
                parameter_ = b;
            }
            return b;
        } else {
            return (com.google.protobuf.ByteString) ref;
        }
    }

    public static final int PUBLIC_PLATFORM_PORT_FIELD_NUMBER = 15;

    /**
     * <code>optional int32 public_platform_port = 15;</code>
     */
    public int getPublicPlatformPort() {
        if (parameterCase_ == 15) {
            return (Integer) parameter_;
        }
        return 0;
    }

    public static final int SAMPLING_FIELD_NUMBER = 16;

    /**
     * <code>optional .Parameter.SamplingState sampling = 16;</code>
     */
    public int getSamplingValue() {
        if (parameterCase_ == 16) {
            return (Integer) parameter_;
        }
        return 0;
    }

    /**
     * <code>optional .Parameter.SamplingState sampling = 16;</code>
     */
    public SamplingState getSampling() {
        if (parameterCase_ == 16) {
            SamplingState result = SamplingState.valueOf(
                    (Integer) parameter_);
            return result == null ? SamplingState.UNRECOGNIZED : result;
        }
        return SamplingState.UNKNOWN;
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
        if (parameterCase_ == 1) {
            output.writeInt32(
                    1, (int) ((Integer) parameter_));
        }
        if (parameterCase_ == 2) {
            output.writeInt32(
                    2, (int) ((Integer) parameter_));
        }
        if (parameterCase_ == 3) {
            output.writeInt32(
                    3, (int) ((Integer) parameter_));
        }
        if (parameterCase_ == 4) {
            output.writeInt32(
                    4, (int) ((Integer) parameter_));
        }
        if (parameterCase_ == 5) {
            com.google.protobuf.GeneratedMessageV3.writeString(output, 5, parameter_);
        }
        if (parameterCase_ == 6) {
            output.writeInt32(
                    6, (int) ((Integer) parameter_));
        }
        if (parameterCase_ == 7) {
            com.google.protobuf.GeneratedMessageV3.writeString(output, 7, parameter_);
        }
        if (parameterCase_ == 8) {
            com.google.protobuf.GeneratedMessageV3.writeString(output, 8, parameter_);
        }
        if (parameterCase_ == 9) {
            output.writeInt32(
                    9, (int) ((Integer) parameter_));
        }
        if (parameterCase_ == 10) {
            output.writeInt32(
                    10, (int) ((Integer) parameter_));
        }
        if (parameterCase_ == 11) {
            output.writeInt32(
                    11, (int) ((Integer) parameter_));
        }
        if (parameterCase_ == 12) {
            output.writeInt32(
                    12, (int) ((Integer) parameter_));
        }
        if (parameterCase_ == 13) {
            output.writeInt32(
                    13, (int) ((Integer) parameter_));
        }
        if (parameterCase_ == 14) {
            com.google.protobuf.GeneratedMessageV3.writeString(output, 14, parameter_);
        }
        if (parameterCase_ == 15) {
            output.writeInt32(
                    15, (int) ((Integer) parameter_));
        }
        if (parameterCase_ == 16) {
            output.writeEnum(16, ((Integer) parameter_));
        }
    }

    public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) return size;

        size = 0;
        if (parameterCase_ == 1) {
            size += com.google.protobuf.CodedOutputStream
                    .computeInt32Size(
                            1, (int) ((Integer) parameter_));
        }
        if (parameterCase_ == 2) {
            size += com.google.protobuf.CodedOutputStream
                    .computeInt32Size(
                            2, (int) ((Integer) parameter_));
        }
        if (parameterCase_ == 3) {
            size += com.google.protobuf.CodedOutputStream
                    .computeInt32Size(
                            3, (int) ((Integer) parameter_));
        }
        if (parameterCase_ == 4) {
            size += com.google.protobuf.CodedOutputStream
                    .computeInt32Size(
                            4, (int) ((Integer) parameter_));
        }
        if (parameterCase_ == 5) {
            size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, parameter_);
        }
        if (parameterCase_ == 6) {
            size += com.google.protobuf.CodedOutputStream
                    .computeInt32Size(
                            6, (int) ((Integer) parameter_));
        }
        if (parameterCase_ == 7) {
            size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, parameter_);
        }
        if (parameterCase_ == 8) {
            size += com.google.protobuf.GeneratedMessageV3.computeStringSize(8, parameter_);
        }
        if (parameterCase_ == 9) {
            size += com.google.protobuf.CodedOutputStream
                    .computeInt32Size(
                            9, (int) ((Integer) parameter_));
        }
        if (parameterCase_ == 10) {
            size += com.google.protobuf.CodedOutputStream
                    .computeInt32Size(
                            10, (int) ((Integer) parameter_));
        }
        if (parameterCase_ == 11) {
            size += com.google.protobuf.CodedOutputStream
                    .computeInt32Size(
                            11, (int) ((Integer) parameter_));
        }
        if (parameterCase_ == 12) {
            size += com.google.protobuf.CodedOutputStream
                    .computeInt32Size(
                            12, (int) ((Integer) parameter_));
        }
        if (parameterCase_ == 13) {
            size += com.google.protobuf.CodedOutputStream
                    .computeInt32Size(
                            13, (int) ((Integer) parameter_));
        }
        if (parameterCase_ == 14) {
            size += com.google.protobuf.GeneratedMessageV3.computeStringSize(14, parameter_);
        }
        if (parameterCase_ == 15) {
            size += com.google.protobuf.CodedOutputStream
                    .computeInt32Size(
                            15, (int) ((Integer) parameter_));
        }
        if (parameterCase_ == 16) {
            size += com.google.protobuf.CodedOutputStream
                    .computeEnumSize(16, ((Integer) parameter_));
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
        if (!(obj instanceof Parameter)) {
            return super.equals(obj);
        }
        Parameter other = (Parameter) obj;

        boolean result = true;
        result = result && getParameterCase().equals(
                other.getParameterCase());
        if (!result) return false;
        switch (parameterCase_) {
            case 1:
                result = result && (getStoragePeriod()
                        == other.getStoragePeriod());
                break;
            case 2:
                result = result && (getNormalReportInterval()
                        == other.getNormalReportInterval());
                break;
            case 3:
                result = result && (getAlarmReportInterval()
                        == other.getAlarmReportInterval());
                break;
            case 4:
                result = result && (getManagementPlatformDomainLength()
                        == other.getManagementPlatformDomainLength());
                break;
            case 5:
                result = result && getManagementPlatformDomain()
                        .equals(other.getManagementPlatformDomain());
                break;
            case 6:
                result = result && (getManagementPlatformPort()
                        == other.getManagementPlatformPort());
                break;
            case 7:
                result = result && getHardwareVersion()
                        .equals(other.getHardwareVersion());
                break;
            case 8:
                result = result && getFirmwareVersion()
                        .equals(other.getFirmwareVersion());
                break;
            case 9:
                result = result && (getHearbeatInterval()
                        == other.getHearbeatInterval());
                break;
            case 10:
                result = result && (getTerminalResponseTimeout()
                        == other.getTerminalResponseTimeout());
                break;
            case 11:
                result = result && (getPlatformResponseTimeout()
                        == other.getPlatformResponseTimeout());
                break;
            case 12:
                result = result && (getLoginRetryInterval()
                        == other.getLoginRetryInterval());
                break;
            case 13:
                result = result && (getPublicPlatformDomainLength()
                        == other.getPublicPlatformDomainLength());
                break;
            case 14:
                result = result && getPublicPlatformDomain()
                        .equals(other.getPublicPlatformDomain());
                break;
            case 15:
                result = result && (getPublicPlatformPort()
                        == other.getPublicPlatformPort());
                break;
            case 16:
                result = result && getSamplingValue()
                        == other.getSamplingValue();
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
        switch (parameterCase_) {
            case 1:
                hash = (37 * hash) + STORAGE_PERIOD_FIELD_NUMBER;
                hash = (53 * hash) + getStoragePeriod();
                break;
            case 2:
                hash = (37 * hash) + NORMAL_REPORT_INTERVAL_FIELD_NUMBER;
                hash = (53 * hash) + getNormalReportInterval();
                break;
            case 3:
                hash = (37 * hash) + ALARM_REPORT_INTERVAL_FIELD_NUMBER;
                hash = (53 * hash) + getAlarmReportInterval();
                break;
            case 4:
                hash = (37 * hash) + MANAGEMENT_PLATFORM_DOMAIN_LENGTH_FIELD_NUMBER;
                hash = (53 * hash) + getManagementPlatformDomainLength();
                break;
            case 5:
                hash = (37 * hash) + MANAGEMENT_PLATFORM_DOMAIN_FIELD_NUMBER;
                hash = (53 * hash) + getManagementPlatformDomain().hashCode();
                break;
            case 6:
                hash = (37 * hash) + MANAGEMENT_PLATFORM_PORT_FIELD_NUMBER;
                hash = (53 * hash) + getManagementPlatformPort();
                break;
            case 7:
                hash = (37 * hash) + HARDWARE_VERSION_FIELD_NUMBER;
                hash = (53 * hash) + getHardwareVersion().hashCode();
                break;
            case 8:
                hash = (37 * hash) + FIRMWARE_VERSION_FIELD_NUMBER;
                hash = (53 * hash) + getFirmwareVersion().hashCode();
                break;
            case 9:
                hash = (37 * hash) + HEARBEAT_INTERVAL_FIELD_NUMBER;
                hash = (53 * hash) + getHearbeatInterval();
                break;
            case 10:
                hash = (37 * hash) + TERMINAL_RESPONSE_TIMEOUT_FIELD_NUMBER;
                hash = (53 * hash) + getTerminalResponseTimeout();
                break;
            case 11:
                hash = (37 * hash) + PLATFORM_RESPONSE_TIMEOUT_FIELD_NUMBER;
                hash = (53 * hash) + getPlatformResponseTimeout();
                break;
            case 12:
                hash = (37 * hash) + LOGIN_RETRY_INTERVAL_FIELD_NUMBER;
                hash = (53 * hash) + getLoginRetryInterval();
                break;
            case 13:
                hash = (37 * hash) + PUBLIC_PLATFORM_DOMAIN_LENGTH_FIELD_NUMBER;
                hash = (53 * hash) + getPublicPlatformDomainLength();
                break;
            case 14:
                hash = (37 * hash) + PUBLIC_PLATFORM_DOMAIN_FIELD_NUMBER;
                hash = (53 * hash) + getPublicPlatformDomain().hashCode();
                break;
            case 15:
                hash = (37 * hash) + PUBLIC_PLATFORM_PORT_FIELD_NUMBER;
                hash = (53 * hash) + getPublicPlatformPort();
                break;
            case 16:
                hash = (37 * hash) + SAMPLING_FIELD_NUMBER;
                hash = (53 * hash) + getSamplingValue();
                break;
            case 0:
            default:
        }
        hash = (29 * hash) + unknownFields.hashCode();
        memoizedHashCode = hash;
        return hash;
    }

    public static Parameter parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static Parameter parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static Parameter parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static Parameter parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static Parameter parseFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static Parameter parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static Parameter parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input);
    }

    public static Parameter parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static Parameter parseFrom(
            com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static Parameter parseFrom(
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

    public static Builder newBuilder(Parameter prototype) {
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
     * Protobuf type {@code Parameter}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
            // @@protoc_insertion_point(builder_implements:Parameter)
            ParameterOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return Gbt3260.internal_static_com_ime_iov_gbt32960_Parameter_descriptor;
        }

        protected FieldAccessorTable
        internalGetFieldAccessorTable() {
            return Gbt3260.internal_static_com_ime_iov_gbt32960_Parameter_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            Parameter.class, Builder.class);
        }

        // Construct using Parameter.newBuilder()
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
            parameterCase_ = 0;
            parameter_ = null;
            return this;
        }

        public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
            return Gbt3260.internal_static_com_ime_iov_gbt32960_Parameter_descriptor;
        }

        public Parameter getDefaultInstanceForType() {
            return Parameter.getDefaultInstance();
        }

        public Parameter build() {
            Parameter result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        public Parameter buildPartial() {
            Parameter result = new Parameter(this);
            if (parameterCase_ == 1) {
                result.parameter_ = parameter_;
            }
            if (parameterCase_ == 2) {
                result.parameter_ = parameter_;
            }
            if (parameterCase_ == 3) {
                result.parameter_ = parameter_;
            }
            if (parameterCase_ == 4) {
                result.parameter_ = parameter_;
            }
            if (parameterCase_ == 5) {
                result.parameter_ = parameter_;
            }
            if (parameterCase_ == 6) {
                result.parameter_ = parameter_;
            }
            if (parameterCase_ == 7) {
                result.parameter_ = parameter_;
            }
            if (parameterCase_ == 8) {
                result.parameter_ = parameter_;
            }
            if (parameterCase_ == 9) {
                result.parameter_ = parameter_;
            }
            if (parameterCase_ == 10) {
                result.parameter_ = parameter_;
            }
            if (parameterCase_ == 11) {
                result.parameter_ = parameter_;
            }
            if (parameterCase_ == 12) {
                result.parameter_ = parameter_;
            }
            if (parameterCase_ == 13) {
                result.parameter_ = parameter_;
            }
            if (parameterCase_ == 14) {
                result.parameter_ = parameter_;
            }
            if (parameterCase_ == 15) {
                result.parameter_ = parameter_;
            }
            if (parameterCase_ == 16) {
                result.parameter_ = parameter_;
            }
            result.parameterCase_ = parameterCase_;
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
            if (other instanceof Parameter) {
                return mergeFrom((Parameter) other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(Parameter other) {
            if (other == Parameter.getDefaultInstance()) return this;
            switch (other.getParameterCase()) {
                case STORAGE_PERIOD: {
                    setStoragePeriod(other.getStoragePeriod());
                    break;
                }
                case NORMAL_REPORT_INTERVAL: {
                    setNormalReportInterval(other.getNormalReportInterval());
                    break;
                }
                case ALARM_REPORT_INTERVAL: {
                    setAlarmReportInterval(other.getAlarmReportInterval());
                    break;
                }
                case MANAGEMENT_PLATFORM_DOMAIN_LENGTH: {
                    setManagementPlatformDomainLength(other.getManagementPlatformDomainLength());
                    break;
                }
                case MANAGEMENT_PLATFORM_DOMAIN: {
                    parameterCase_ = 5;
                    parameter_ = other.parameter_;
                    onChanged();
                    break;
                }
                case MANAGEMENT_PLATFORM_PORT: {
                    setManagementPlatformPort(other.getManagementPlatformPort());
                    break;
                }
                case HARDWARE_VERSION: {
                    parameterCase_ = 7;
                    parameter_ = other.parameter_;
                    onChanged();
                    break;
                }
                case FIRMWARE_VERSION: {
                    parameterCase_ = 8;
                    parameter_ = other.parameter_;
                    onChanged();
                    break;
                }
                case HEARBEAT_INTERVAL: {
                    setHearbeatInterval(other.getHearbeatInterval());
                    break;
                }
                case TERMINAL_RESPONSE_TIMEOUT: {
                    setTerminalResponseTimeout(other.getTerminalResponseTimeout());
                    break;
                }
                case PLATFORM_RESPONSE_TIMEOUT: {
                    setPlatformResponseTimeout(other.getPlatformResponseTimeout());
                    break;
                }
                case LOGIN_RETRY_INTERVAL: {
                    setLoginRetryInterval(other.getLoginRetryInterval());
                    break;
                }
                case PUBLIC_PLATFORM_DOMAIN_LENGTH: {
                    setPublicPlatformDomainLength(other.getPublicPlatformDomainLength());
                    break;
                }
                case PUBLIC_PLATFORM_DOMAIN: {
                    parameterCase_ = 14;
                    parameter_ = other.parameter_;
                    onChanged();
                    break;
                }
                case PUBLIC_PLATFORM_PORT: {
                    setPublicPlatformPort(other.getPublicPlatformPort());
                    break;
                }
                case SAMPLING: {
                    setSamplingValue(other.getSamplingValue());
                    break;
                }
                case PARAMETER_NOT_SET: {
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
            Parameter parsedMessage = null;
            try {
                parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                parsedMessage = (Parameter) e.getUnfinishedMessage();
                throw e.unwrapIOException();
            } finally {
                if (parsedMessage != null) {
                    mergeFrom(parsedMessage);
                }
            }
            return this;
        }

        private int parameterCase_ = 0;
        private Object parameter_;

        public ParameterCase
        getParameterCase() {
            return ParameterCase.forNumber(
                    parameterCase_);
        }

        public Builder clearParameter() {
            parameterCase_ = 0;
            parameter_ = null;
            onChanged();
            return this;
        }


        /**
         * <code>optional int32 storage_period = 1;</code>
         */
        public int getStoragePeriod() {
            if (parameterCase_ == 1) {
                return (Integer) parameter_;
            }
            return 0;
        }

        /**
         * <code>optional int32 storage_period = 1;</code>
         */
        public Builder setStoragePeriod(int value) {
            parameterCase_ = 1;
            parameter_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>optional int32 storage_period = 1;</code>
         */
        public Builder clearStoragePeriod() {
            if (parameterCase_ == 1) {
                parameterCase_ = 0;
                parameter_ = null;
                onChanged();
            }
            return this;
        }

        /**
         * <code>optional int32 normal_report_interval = 2;</code>
         */
        public int getNormalReportInterval() {
            if (parameterCase_ == 2) {
                return (Integer) parameter_;
            }
            return 0;
        }

        /**
         * <code>optional int32 normal_report_interval = 2;</code>
         */
        public Builder setNormalReportInterval(int value) {
            parameterCase_ = 2;
            parameter_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>optional int32 normal_report_interval = 2;</code>
         */
        public Builder clearNormalReportInterval() {
            if (parameterCase_ == 2) {
                parameterCase_ = 0;
                parameter_ = null;
                onChanged();
            }
            return this;
        }

        /**
         * <code>optional int32 alarm_report_interval = 3;</code>
         */
        public int getAlarmReportInterval() {
            if (parameterCase_ == 3) {
                return (Integer) parameter_;
            }
            return 0;
        }

        /**
         * <code>optional int32 alarm_report_interval = 3;</code>
         */
        public Builder setAlarmReportInterval(int value) {
            parameterCase_ = 3;
            parameter_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>optional int32 alarm_report_interval = 3;</code>
         */
        public Builder clearAlarmReportInterval() {
            if (parameterCase_ == 3) {
                parameterCase_ = 0;
                parameter_ = null;
                onChanged();
            }
            return this;
        }

        /**
         * <code>optional int32 management_platform_domain_length = 4;</code>
         */
        public int getManagementPlatformDomainLength() {
            if (parameterCase_ == 4) {
                return (Integer) parameter_;
            }
            return 0;
        }

        /**
         * <code>optional int32 management_platform_domain_length = 4;</code>
         */
        public Builder setManagementPlatformDomainLength(int value) {
            parameterCase_ = 4;
            parameter_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>optional int32 management_platform_domain_length = 4;</code>
         */
        public Builder clearManagementPlatformDomainLength() {
            if (parameterCase_ == 4) {
                parameterCase_ = 0;
                parameter_ = null;
                onChanged();
            }
            return this;
        }

        /**
         * <code>optional string management_platform_domain = 5;</code>
         */
        public String getManagementPlatformDomain() {
            Object ref = "";
            if (parameterCase_ == 5) {
                ref = parameter_;
            }
            if (!(ref instanceof String)) {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                if (parameterCase_ == 5) {
                    parameter_ = s;
                }
                return s;
            } else {
                return (String) ref;
            }
        }

        /**
         * <code>optional string management_platform_domain = 5;</code>
         */
        public com.google.protobuf.ByteString
        getManagementPlatformDomainBytes() {
            Object ref = "";
            if (parameterCase_ == 5) {
                ref = parameter_;
            }
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                if (parameterCase_ == 5) {
                    parameter_ = b;
                }
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>optional string management_platform_domain = 5;</code>
         */
        public Builder setManagementPlatformDomain(
                String value) {
            if (value == null) {
                throw new NullPointerException();
            }
            parameterCase_ = 5;
            parameter_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>optional string management_platform_domain = 5;</code>
         */
        public Builder clearManagementPlatformDomain() {
            if (parameterCase_ == 5) {
                parameterCase_ = 0;
                parameter_ = null;
                onChanged();
            }
            return this;
        }

        /**
         * <code>optional string management_platform_domain = 5;</code>
         */
        public Builder setManagementPlatformDomainBytes(
                com.google.protobuf.ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(value);
            parameterCase_ = 5;
            parameter_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>optional int32 management_platform_port = 6;</code>
         */
        public int getManagementPlatformPort() {
            if (parameterCase_ == 6) {
                return (Integer) parameter_;
            }
            return 0;
        }

        /**
         * <code>optional int32 management_platform_port = 6;</code>
         */
        public Builder setManagementPlatformPort(int value) {
            parameterCase_ = 6;
            parameter_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>optional int32 management_platform_port = 6;</code>
         */
        public Builder clearManagementPlatformPort() {
            if (parameterCase_ == 6) {
                parameterCase_ = 0;
                parameter_ = null;
                onChanged();
            }
            return this;
        }

        /**
         * <code>optional string hardware_version = 7;</code>
         */
        public String getHardwareVersion() {
            Object ref = "";
            if (parameterCase_ == 7) {
                ref = parameter_;
            }
            if (!(ref instanceof String)) {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                if (parameterCase_ == 7) {
                    parameter_ = s;
                }
                return s;
            } else {
                return (String) ref;
            }
        }

        /**
         * <code>optional string hardware_version = 7;</code>
         */
        public com.google.protobuf.ByteString
        getHardwareVersionBytes() {
            Object ref = "";
            if (parameterCase_ == 7) {
                ref = parameter_;
            }
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                if (parameterCase_ == 7) {
                    parameter_ = b;
                }
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>optional string hardware_version = 7;</code>
         */
        public Builder setHardwareVersion(
                String value) {
            if (value == null) {
                throw new NullPointerException();
            }
            parameterCase_ = 7;
            parameter_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>optional string hardware_version = 7;</code>
         */
        public Builder clearHardwareVersion() {
            if (parameterCase_ == 7) {
                parameterCase_ = 0;
                parameter_ = null;
                onChanged();
            }
            return this;
        }

        /**
         * <code>optional string hardware_version = 7;</code>
         */
        public Builder setHardwareVersionBytes(
                com.google.protobuf.ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(value);
            parameterCase_ = 7;
            parameter_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>optional string firmware_version = 8;</code>
         */
        public String getFirmwareVersion() {
            Object ref = "";
            if (parameterCase_ == 8) {
                ref = parameter_;
            }
            if (!(ref instanceof String)) {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                if (parameterCase_ == 8) {
                    parameter_ = s;
                }
                return s;
            } else {
                return (String) ref;
            }
        }

        /**
         * <code>optional string firmware_version = 8;</code>
         */
        public com.google.protobuf.ByteString
        getFirmwareVersionBytes() {
            Object ref = "";
            if (parameterCase_ == 8) {
                ref = parameter_;
            }
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                if (parameterCase_ == 8) {
                    parameter_ = b;
                }
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>optional string firmware_version = 8;</code>
         */
        public Builder setFirmwareVersion(
                String value) {
            if (value == null) {
                throw new NullPointerException();
            }
            parameterCase_ = 8;
            parameter_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>optional string firmware_version = 8;</code>
         */
        public Builder clearFirmwareVersion() {
            if (parameterCase_ == 8) {
                parameterCase_ = 0;
                parameter_ = null;
                onChanged();
            }
            return this;
        }

        /**
         * <code>optional string firmware_version = 8;</code>
         */
        public Builder setFirmwareVersionBytes(
                com.google.protobuf.ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(value);
            parameterCase_ = 8;
            parameter_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>optional int32 hearbeat_interval = 9;</code>
         */
        public int getHearbeatInterval() {
            if (parameterCase_ == 9) {
                return (Integer) parameter_;
            }
            return 0;
        }

        /**
         * <code>optional int32 hearbeat_interval = 9;</code>
         */
        public Builder setHearbeatInterval(int value) {
            parameterCase_ = 9;
            parameter_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>optional int32 hearbeat_interval = 9;</code>
         */
        public Builder clearHearbeatInterval() {
            if (parameterCase_ == 9) {
                parameterCase_ = 0;
                parameter_ = null;
                onChanged();
            }
            return this;
        }

        /**
         * <code>optional int32 terminal_response_timeout = 10;</code>
         */
        public int getTerminalResponseTimeout() {
            if (parameterCase_ == 10) {
                return (Integer) parameter_;
            }
            return 0;
        }

        /**
         * <code>optional int32 terminal_response_timeout = 10;</code>
         */
        public Builder setTerminalResponseTimeout(int value) {
            parameterCase_ = 10;
            parameter_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>optional int32 terminal_response_timeout = 10;</code>
         */
        public Builder clearTerminalResponseTimeout() {
            if (parameterCase_ == 10) {
                parameterCase_ = 0;
                parameter_ = null;
                onChanged();
            }
            return this;
        }

        /**
         * <code>optional int32 platform_response_timeout = 11;</code>
         */
        public int getPlatformResponseTimeout() {
            if (parameterCase_ == 11) {
                return (Integer) parameter_;
            }
            return 0;
        }

        /**
         * <code>optional int32 platform_response_timeout = 11;</code>
         */
        public Builder setPlatformResponseTimeout(int value) {
            parameterCase_ = 11;
            parameter_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>optional int32 platform_response_timeout = 11;</code>
         */
        public Builder clearPlatformResponseTimeout() {
            if (parameterCase_ == 11) {
                parameterCase_ = 0;
                parameter_ = null;
                onChanged();
            }
            return this;
        }

        /**
         * <code>optional int32 login_retry_interval = 12;</code>
         */
        public int getLoginRetryInterval() {
            if (parameterCase_ == 12) {
                return (Integer) parameter_;
            }
            return 0;
        }

        /**
         * <code>optional int32 login_retry_interval = 12;</code>
         */
        public Builder setLoginRetryInterval(int value) {
            parameterCase_ = 12;
            parameter_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>optional int32 login_retry_interval = 12;</code>
         */
        public Builder clearLoginRetryInterval() {
            if (parameterCase_ == 12) {
                parameterCase_ = 0;
                parameter_ = null;
                onChanged();
            }
            return this;
        }

        /**
         * <code>optional int32 public_platform_domain_length = 13;</code>
         */
        public int getPublicPlatformDomainLength() {
            if (parameterCase_ == 13) {
                return (Integer) parameter_;
            }
            return 0;
        }

        /**
         * <code>optional int32 public_platform_domain_length = 13;</code>
         */
        public Builder setPublicPlatformDomainLength(int value) {
            parameterCase_ = 13;
            parameter_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>optional int32 public_platform_domain_length = 13;</code>
         */
        public Builder clearPublicPlatformDomainLength() {
            if (parameterCase_ == 13) {
                parameterCase_ = 0;
                parameter_ = null;
                onChanged();
            }
            return this;
        }

        /**
         * <code>optional string public_platform_domain = 14;</code>
         */
        public String getPublicPlatformDomain() {
            Object ref = "";
            if (parameterCase_ == 14) {
                ref = parameter_;
            }
            if (!(ref instanceof String)) {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                if (parameterCase_ == 14) {
                    parameter_ = s;
                }
                return s;
            } else {
                return (String) ref;
            }
        }

        /**
         * <code>optional string public_platform_domain = 14;</code>
         */
        public com.google.protobuf.ByteString
        getPublicPlatformDomainBytes() {
            Object ref = "";
            if (parameterCase_ == 14) {
                ref = parameter_;
            }
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                if (parameterCase_ == 14) {
                    parameter_ = b;
                }
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>optional string public_platform_domain = 14;</code>
         */
        public Builder setPublicPlatformDomain(
                String value) {
            if (value == null) {
                throw new NullPointerException();
            }
            parameterCase_ = 14;
            parameter_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>optional string public_platform_domain = 14;</code>
         */
        public Builder clearPublicPlatformDomain() {
            if (parameterCase_ == 14) {
                parameterCase_ = 0;
                parameter_ = null;
                onChanged();
            }
            return this;
        }

        /**
         * <code>optional string public_platform_domain = 14;</code>
         */
        public Builder setPublicPlatformDomainBytes(
                com.google.protobuf.ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(value);
            parameterCase_ = 14;
            parameter_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>optional int32 public_platform_port = 15;</code>
         */
        public int getPublicPlatformPort() {
            if (parameterCase_ == 15) {
                return (Integer) parameter_;
            }
            return 0;
        }

        /**
         * <code>optional int32 public_platform_port = 15;</code>
         */
        public Builder setPublicPlatformPort(int value) {
            parameterCase_ = 15;
            parameter_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>optional int32 public_platform_port = 15;</code>
         */
        public Builder clearPublicPlatformPort() {
            if (parameterCase_ == 15) {
                parameterCase_ = 0;
                parameter_ = null;
                onChanged();
            }
            return this;
        }

        /**
         * <code>optional .Parameter.SamplingState sampling = 16;</code>
         */
        public int getSamplingValue() {
            if (parameterCase_ == 16) {
                return ((Integer) parameter_).intValue();
            }
            return 0;
        }

        /**
         * <code>optional .Parameter.SamplingState sampling = 16;</code>
         */
        public Builder setSamplingValue(int value) {
            parameterCase_ = 16;
            parameter_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>optional .Parameter.SamplingState sampling = 16;</code>
         */
        public SamplingState getSampling() {
            if (parameterCase_ == 16) {
                SamplingState result = SamplingState.valueOf(
                        (Integer) parameter_);
                return result == null ? SamplingState.UNRECOGNIZED : result;
            }
            return SamplingState.UNKNOWN;
        }

        /**
         * <code>optional .Parameter.SamplingState sampling = 16;</code>
         */
        public Builder setSampling(SamplingState value) {
            if (value == null) {
                throw new NullPointerException();
            }
            parameterCase_ = 16;
            parameter_ = value.getNumber();
            onChanged();
            return this;
        }

        /**
         * <code>optional .Parameter.SamplingState sampling = 16;</code>
         */
        public Builder clearSampling() {
            if (parameterCase_ == 16) {
                parameterCase_ = 0;
                parameter_ = null;
                onChanged();
            }
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


        // @@protoc_insertion_point(builder_scope:Parameter)
    }

    // @@protoc_insertion_point(class_scope:Parameter)
    private static final Parameter DEFAULT_INSTANCE;

    static {
        DEFAULT_INSTANCE = new Parameter();
    }

    public static Parameter getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Parameter>
            PARSER = new com.google.protobuf.AbstractParser<Parameter>() {
        public Parameter parsePartialFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return new Parameter(input, extensionRegistry);
        }
    };

    public static com.google.protobuf.Parser<Parameter> parser() {
        return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<Parameter> getParserForType() {
        return PARSER;
    }

    public Parameter getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

}

