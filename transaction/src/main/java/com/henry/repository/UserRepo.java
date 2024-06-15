package com.henry.repository;

import jdk.jfr.Registered;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class UserRepo {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public UserRepo(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void UpdateNickname(String nickname) {
        jdbcTemplate.update("UPDATE ssm.users SET nickname = ? WHERE id = ?", nickname, 1);
    }
}
