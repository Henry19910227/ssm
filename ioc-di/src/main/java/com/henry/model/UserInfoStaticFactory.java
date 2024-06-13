package com.henry.model;

public class UserInfoStaticFactory {
    public static final UserInfo getUserInfo() {
        return new UserInfo(1000, "新北市", "0900000000");
    }
}
