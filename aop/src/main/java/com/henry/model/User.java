package com.henry.model;

import org.springframework.stereotype.Component;

@Component
public class User {
    public User getUser() {
        return new User();
    }
}
