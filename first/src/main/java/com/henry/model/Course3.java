package com.henry.model;

import java.util.List;

public class Course3 {
    private int id;
    private String name;
    private String intro;
    private String createAt;
    private String updateAt;
    private List<Plan> plans;

    public Course3(int id, String name, String intro, String createAt, String updateAt, List<Plan> plans) {
        this.id = id;
        this.name = name;
        this.intro = intro;
        this.createAt = createAt;
        this.updateAt = updateAt;
        this.plans = plans;
    }

    public Course3(){}

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

    public List<Plan> getPlans() {
        return plans;
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

    public void setPlans(List<Plan> plans) {
        this.plans = plans;
    }

    @Override
    public String toString() {
        return "Course3{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", intro='" + intro + '\'' +
                ", createAt='" + createAt + '\'' +
                ", updateAt='" + updateAt + '\'' +
                ", plans=" + plans +
                '}';
    }
}
