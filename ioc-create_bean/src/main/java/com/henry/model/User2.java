package com.henry.model;

public class User2 {
    private Integer id;
    private String email;
    private String nickname;
    private String createAt;
    private String updateAt;

    public static User2 createUser() {
        User2 user = new User2(1, "user2@gmail.com", "user2", "2024-01-01 11:00:00", "2024-01-01 11:00:00");
        return user;
    }

    public User2(Integer id, String email, String nickname, String createAt, String updateAt) {
        this.id = id;
        this.email = email;
        this.nickname = nickname;
        this.createAt = createAt;
        this.updateAt = updateAt;
    }

    public User2() {}

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
