package com.henry.model;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {
    User selectUser(int id);
    int insertUser(User user);

    void updateUser(User user);

    void deleteUser(int id);

    User login(String username, String password);

    @Select("SELECT * FROM ssm.t_user WHERE username = #{username} AND password = #{password}")
    User login2(@Param("username") String username, @Param("password") String password);
}
