package com.henry.model;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PlanMapper {
    Plan getPlanByID(@Param("id") int id);
    int insertPlan(Plan plan);

    List<Plan> getPlansByCourseID(int courseID);
}
