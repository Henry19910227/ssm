package com.henry.mapper;

import com.henry.model.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.context.annotation.Bean;

import java.util.List;


public interface UserMapper {
    List<User> getAllUsers();
}
