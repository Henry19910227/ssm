package com.henry.model;

import org.apache.ibatis.annotations.Param;

public interface PlanMapper {
    Plan getPlanByID(@Param("id") int id);
    int insertPlan(Plan plan);
}
