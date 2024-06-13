package com.henry.model;

import java.io.Serializable;

public class Plan implements Serializable {
    private int id;
    private int courseID;
    private String name;
    private String createAt;
    private String updateAt;

    public Plan(int id, int courseID, String name, String createAt, String updateAt) {
        this.id = id;
        this.courseID = courseID;
        this.name = name;
        this.createAt = createAt;
        this.updateAt = updateAt;
    }

    public Plan(){}

    public void setId(int id) {
        this.id = id;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public void setUpdateAt(String updateAt) {
        this.updateAt = updateAt;
    }

    public int getId() {
        return id;
    }

    public int getCourseID() {
        return courseID;
    }

    public String getName() {
        return name;
    }

    public String getCreateAt() {
        return createAt;
    }

    public String getUpdateAt() {
        return updateAt;
    }

    @Override
    public String toString() {
        return "Plan{" +
                "id=" + id +
                ", courseID=" + courseID +
                ", name='" + name + '\'' +
                ", createAt='" + createAt + '\'' +
                ", updateAt='" + updateAt + '\'' +
                '}';
    }
}
