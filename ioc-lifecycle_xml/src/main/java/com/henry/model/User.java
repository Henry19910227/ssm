package com.henry.model;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class User implements InitializingBean, DisposableBean {
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

    public User() {}

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet!!!!!");
    }

    public void init() {
        System.out.println("init!!!!!");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy!!!!!");
    }

    public void remove() {
        System.out.println("remove!!!!!");
    }

    
    @Override
    public String toString() {
        return "com.henry.model.User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", nickname='" + nickname + '\'' +
                ", createAt='" + createAt + '\'' +
                ", updateAt='" + updateAt + '\'' +
                '}';
    }


}
