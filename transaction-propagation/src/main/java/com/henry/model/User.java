package com.henry.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class User {
    @Autowired
    public JdbcTemplate jdbcTemplate;
}
