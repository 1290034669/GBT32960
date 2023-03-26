package com.yzxc.common.message;

public enum CommandType
        implements com.google.protobuf.ProtocolMessageEnum {
    UNUSED(0),
    UPGRADE(1),
    SHUTDOWN(2),
    TERMINAL_RESET(3),
    FACTORY_RESET(4),
    DISCONNECT(5),
    WARNING(6),
    SAMPLING_CHECK(7),
    UNRECOGNIZED(-1),
    ;

    public static final int UNUSED_VALUE = 0;
    public static final int UPGRADE_VALUE = 1;
    public static final int SHUTDOWN_VALUE = 2;
    public static final int TERMINAL_RESET_VALUE = 3;
    public static final int FACTORY_RESET_VALUE = 4;
    public static final int DISCONNECT_VALUE = 5;
    public static final int WARNING_VALUE = 6;
    public static final int SAMPLING_CHECK_VALUE = 7;


    public final int getNumber() {
        if (this == UNRECOGNIZED) {
            throw new IllegalArgumentException(
                    "Can't get the number of an unknown enum value.");
        }
        return value;
    }

    @Deprecated
    public static CommandType valueOf(int value) {
        return forNumber(value);
    }

    public static CommandType forNumber(int value) {
        switch (value) {
            case 0:
                return UNUSED;
            case 1:
                return UPGRADE;
            case 2:
                return SHUTDOWN;
            case 3:
                return TERMINAL_RESET;
            case 4:
                return FACTORY_RESET;
            case 5:
                return DISCONNECT;
            case 6:
                return WARNING;
            case 7:
                return SAMPLING_CHECK;
            default:
                return null;
        }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<CommandType>
    internalGetValueMap() {
        return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<
            CommandType> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<CommandType>() {
                public CommandType findValueByNumber(int number) {
                    return CommandType.forNumber(number);
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
        return Gbt3260.getDescriptor()
                .getEnumTypes().get(0);
    }

    private static final CommandType[] VALUES = values();

    public static CommandType valueOf(
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

    private CommandType(int value) {
        this.value = value;
    }

}

