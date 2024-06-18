package com.henry.controller;

import com.henry.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.List;

@RestController // 添加 RestController 等於 @Controller + @ResponseBody
@RequestMapping("user")
public class UserController {
    @GetMapping("test")
    public String test(@RequestParam(value = "name") String name,
                       @RequestParam(value = "age", required = false, defaultValue = "0") int age) {
        System.out.println("name: "+name + " age: "+age);
        return "success!";
    }

    @GetMapping("test2")
    public String test2(@RequestParam(value = "names") List<String> names) {
        System.out.println(names);
        return "success!";
    }

    @GetMapping("test3")
    public String test3(User user) {
        System.out.println(user);
        return "success!";
    }

    @GetMapping("/{uid}")
    public User getUser(@PathVariable(value = "uid") int uid) {
        return new User(uid, "henry@gmail.com", "Henry");
    }

    @PostMapping("/addUser")
    public String addUser(@RequestBody User user) {
        System.out.println(user);
        return "success!";
    }

    @GetMapping("/getHeader")
    public String getHeader(@RequestHeader("Host") String host) {
        System.out.println(host);
        return "success!";
    }
}
