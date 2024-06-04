package com.henry.model;

import java.io.Serializable;

public class User implements Serializable {
    private Integer id;
    private String email;
    private String nickname;
    private String createAt;
    private String updateAt;

    public User(Integer id, String email, String nickname, String createAt, String updateAt) {
        this.id = id;
        this.email = email;
        this.nickname = nickname;
        this.createAt = createAt;
        this.updateAt = updateAt;
    }

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }
    public String getNickname() {
        return nickname;
    }
    public String getCreateAt() {
        return createAt;
    }
    public String getUpdateAt() {
        return updateAt;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }
    public void setUpdateAt(String updateAt) {
        this.updateAt = updateAt;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", nickname='" + nickname + '\'' +
                ", createAt='" + createAt + '\'' +
                ", updateAt='" + updateAt + '\'' +
                '}';
    }
}
