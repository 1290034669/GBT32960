package com.yzxc.common.enums;

public enum TokenEnum {

    ADMIN(2,"long","long-token-"),
    USER(4,"long","long-short-token-"),
    GUEST(5,"short","short-token-");

    private final int weight;
    private final String name;
    private final String token;

    @Override
    public String toString() {
        return "UserEnum{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                ", token='" + token + '\'' +
                '}';
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public String getToken() {
        return token;
    }

    TokenEnum(int weight, String name, String token) {
        this.weight = weight;
        this.name = name;
        this.token = token;
    }

}
