package com.henry.model;

import org.springframework.stereotype.Component;

@Component
public class User2 {
    private Integer id;
    private String email;
    private String nickname;
    private String createAt;
    private String updateAt;

    public User2(Integer id, String email, String nickname, String createAt, String updateAt) {
        this.id = id;
        this.email = email;
        this.nickname = nickname;
        this.createAt = createAt;
        this.updateAt = updateAt;
    }

    public User2() {}
}
