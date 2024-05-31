package com.henry.model;

public class Course2 {
    private int id;
    private String name;
    private String intro;
    private String createAt;
    private String updateAt;
    private User user;

    public Course2(int id, String name, String intro, String createAt, String updateAt, User user) {
        this.id = id;
        this.name = name;
        this.intro = intro;
        this.createAt = createAt;
        this.updateAt = updateAt;
        this.user = user;
    }

    public Course2(){};

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getIntro() {
        return intro;
    }

    public String getCreateAt() {
        return createAt;
    }

    public String getUpdateAt() {
        return updateAt;
    }

    public User getUser() {
        return user;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public void setUpdateAt(String updateAt) {
        this.updateAt = updateAt;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
