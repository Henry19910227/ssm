package com.henry.model;

public interface UserMapper {
    User selectUser(int id);
    int insertUser(User user);

    void updateUser(User user);

    void deleteUser(int id);
}
