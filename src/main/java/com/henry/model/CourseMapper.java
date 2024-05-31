package com.henry.model;

import org.apache.ibatis.annotations.Param;

public interface CourseMapper {

    Course getCourseByID(@Param("id") int id);

    void insertCourse(Course course);
}
