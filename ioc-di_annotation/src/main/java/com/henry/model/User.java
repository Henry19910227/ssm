package com.henry.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class User {
    private Integer id;
    private String email;
    private String nickname;
    private String createAt;
    private String updateAt;

    private Info userInfo;

    public User(Integer id, String email, String nickname, String createAt, String updateAt, Info userInfo) {
        this.id = id;
        this.email = email;
        this.nickname = nickname;
        this.createAt = createAt;
        this.updateAt = updateAt;
        this.userInfo = userInfo;
    }

    public User() {}

    @Value("1")
    public void setId(Integer id) {
        this.id = id;
    }

    @Value("${jdbc.email}")
    public void setEmail(String email) {
        this.email = email;
    }

    @Autowired
    @Qualifier(value = "userInfoDetail")
    public void setUserInfo(Info userInfo) {
        this.userInfo = userInfo;
    }

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
