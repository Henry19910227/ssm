package com.henry.model;

public class User4 {
    private Integer id;
    private String email;
    private String nickname;
    private String createAt;
    private String updateAt;
    private UserInfo userInfo;

    public User4(Integer id, String email, String nickname, String createAt, String updateAt, UserInfo userInfo) {
        this.id = id;
        this.email = email;
        this.nickname = nickname;
        this.createAt = createAt;
        this.updateAt = updateAt;
        this.userInfo = userInfo;
    }

    public User4() {}

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

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    @Override
    public String toString() {
        return "User4{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", nickname='" + nickname + '\'' +
                ", createAt='" + createAt + '\'' +
                ", updateAt='" + updateAt + '\'' +
                ", userInfo=" + userInfo +
                '}';
    }
}
