package com.falk.personajaxdemo.controller;

import com.falk.personajaxdemo.model.User;
import com.falk.personajaxdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("api/add")
    public ResponseEntity<User> addUser(@RequestBody User req){
        System.out.println("api/add kaldet med " + req.getName());
        User newUser = new User(req.getName());
        userService.addUser(newUser);
        return ResponseEntity.ok(newUser);
    }
}
