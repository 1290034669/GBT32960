package com.yzxc.common.enums;

public enum ResultEnum {

    SUCCESS(2000,"Success"),
    EXCEPTION(3000,"Exception"),
    ERROR(5000, "Error");

    private final int value;
    private final String reasonPhrase;

    ResultEnum(int value, String reasonPhrase) {
        this.value = value;
        this.reasonPhrase = reasonPhrase;
    }

    public int value() {
        return this.value;
    }

    public String getReasonPhrase() {
        return reasonPhrase;
    }

    @Override
    public String toString() {
        return "ResultEnum{" +
                "value=" + value +
                ", reasonPhrase='" + reasonPhrase + '\'' +
                '}';
    }
}
