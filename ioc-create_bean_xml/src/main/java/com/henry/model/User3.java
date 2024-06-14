package com.henry.model;

public class User3 {
    private Integer id;
    private String email;
    private String nickname;
    private String createAt;
    private String updateAt;

    public User3 createUser() {
        return new User3(1, "user2@gmail.com", "user2", "2024-01-01 11:00:00", "2024-01-01 11:00:00");
    }

    public User3(Integer id, String email, String nickname, String createAt, String updateAt) {
        this.id = id;
        this.email = email;
        this.nickname = nickname;
        this.createAt = createAt;
        this.updateAt = updateAt;
    }

    public User3() {}

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
