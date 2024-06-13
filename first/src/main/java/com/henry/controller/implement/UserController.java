package com.henry.controller.implement;

import com.henry.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class UserController implements com.henry.controller.UserController {
    private UserService service;


    @Autowired(required = false)
    public UserController(UserService service) {
        this.service = service;
    }

    @Autowired
    @Qualifier("userService")
    public void setService(UserService service) {
        this.service = service;
    }

    @Override
    public String toString() {
        return "UserController{" +
                "service=" + service +
                '}';
    }
}
