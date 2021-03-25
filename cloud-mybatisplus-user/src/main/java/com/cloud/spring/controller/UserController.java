package com.cloud.spring.controller;

import com.cloud.spring.entities.User;
import com.cloud.spring.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/user/create")
    public int create(@RequestBody User user){
        return userService.create(user);
    }
    @GetMapping(value = "/user/delete/{id}")
    public int deleteById(@PathVariable("id") Long id){
        return userService.deleteById(id);
    }
    @GetMapping(value = "/user/get/{id}")
    public User findById(@PathVariable("id") Long id){
        return userService.findById(id);
    }
}
