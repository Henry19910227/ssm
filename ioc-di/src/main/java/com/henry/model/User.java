package com.henry.model;

public class User {
    private Integer id;
    private String email;
    private String nickname;
    private String createAt;
    private String updateAt;

    private UserInfo userInfo;

    public User(Integer id, String email, String nickname, String createAt, String updateAt, UserInfo userInfo) {
        this.id = id;
        this.email = email;
        this.nickname = nickname;
        this.createAt = createAt;
        this.updateAt = updateAt;
        this.userInfo = userInfo;
    }

    public User() {}

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", nickname='" + nickname + '\'' +
                ", createAt='" + createAt + '\'' +
                ", updateAt='" + updateAt + '\'' +
                ", userInfo=" + userInfo +
                '}';
    }
}
