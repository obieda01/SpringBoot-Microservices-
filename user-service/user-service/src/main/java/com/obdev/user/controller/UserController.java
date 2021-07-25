package com.obdev.user.controller;

import com.obdev.user.VO.ResponseTempleteVO;
import com.obdev.user.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.obdev.user.service.UserService;

@RestController
@Slf4j
@RequestMapping("/users")

public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User user){
        log.info("Inside saveUser of userService");
        return userService.addUser(user);
    }
    @GetMapping("/{id}")
    public ResponseTempleteVO getUserWithDepartment(@PathVariable int id){
        return userService.getUserWithDepartment(id);
    }
}