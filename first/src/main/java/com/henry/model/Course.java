package com.henry.model;

import java.io.Serializable;

public class Course implements Serializable {
      private int id;
      private int userID;
      private String name;
      private String intro;
      private String createAt;
      private String updateAt;

    public Course(int id, int userID, String name, String intro, String createAt, String updateAt) {
        this.id = id;
        this.userID = userID;
        this.name = name;
        this.intro = intro;
        this.createAt = createAt;
        this.updateAt = updateAt;
    }

    public Course() {}

    public int getId() {
        return id;
    }

    public int getUserID() {
        return userID;
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

    public void setId(int id) {
        this.id = id;
    }

    public void setUserID(int userID) {
        this.userID = userID;
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

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", userID=" + userID +
                ", name='" + name + '\'' +
                ", intro='" + intro + '\'' +
                ", createAt='" + createAt + '\'' +
                ", updateAt='" + updateAt + '\'' +
                '}';
    }
}
