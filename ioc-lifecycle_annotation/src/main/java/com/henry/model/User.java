package com.henry.model;

import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class User {
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

    @PostConstruct
    public void init() {
        System.out.println("init !!!!!!");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("destroy !!!!!!");
    }
}
