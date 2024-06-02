package com.henry.model;

import org.apache.ibatis.annotations.Param;

public interface CourseMapper {

    Course2 getCourse2ByID(@Param("id") int id);
    Course3 getCourse3ByID(@Param("id") int id);
    void insertCourse(Course course);
}
