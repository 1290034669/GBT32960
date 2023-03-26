package com.yzxc.common.enums;

public enum AlarmEnum {

    TEST("TEST"),
    DEBUG("DEBUG"),
    INFO("INFO"),
    WARNING("WARNING"),
    ERROR("ERROR"),
    FATAL("FATAL"),
    HBASE_TABLE("warning_information");

    private final String name;

    AlarmEnum(String name) {
        this.name = name;
    }

    public static boolean isMax(String level) {
        if (level.equals(TEST.getName()))
            return true;
        if (level.equals(FATAL.getName()))
            return true;
        return level.equals(ERROR.getName());
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "AlarmEnum{" +
                "name='" + name + '\'' +
                '}';
    }
}
