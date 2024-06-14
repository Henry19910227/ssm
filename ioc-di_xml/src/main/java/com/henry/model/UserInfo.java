package com.henry.model;

public class UserInfo {
    private Integer userId;
    private String address;
    private String phone;

    public UserInfo(Integer userId, String address, String phone) {
        this.userId = userId;
        this.address = address;
        this.phone = phone;
    }

    public UserInfo() {}

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "userId=" + userId +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
