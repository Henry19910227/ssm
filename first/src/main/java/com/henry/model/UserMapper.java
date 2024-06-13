package com.henry.model;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    User getUserByID(@Param("id") int id);

    int insertUser(User user);

    void updateUser(User user);

    void deleteUser(int id);

    List<User> getAllUsers();

    @Select("SELECT * FROM ssm.user WHERE age = #{age}")
    List<User> getUsersByAge(@Param("age") int age);

    List<User> getUsersByUsername(@Param("username") String username);

    List<User> getUsersByEmail(@Param("email") String email);
}
