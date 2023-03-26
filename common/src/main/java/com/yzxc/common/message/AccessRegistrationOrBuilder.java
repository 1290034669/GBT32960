package com.yzxc.common.message;

public interface AccessRegistrationOrBuilder extends
        com.google.protobuf.MessageOrBuilder {

    String getVin();

    com.google.protobuf.ByteString
    getVinBytes();

    LoginRequest getLogin();

    LoginRequestOrBuilder getLoginOrBuilder();

    LogoutRequest getLogout();

    LogoutRequestOrBuilder getLogoutOrBuilder();

    public AccessRegistration.MessageCase getMessageCase();
}
