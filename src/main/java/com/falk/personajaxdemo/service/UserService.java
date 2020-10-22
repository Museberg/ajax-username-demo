package com.falk.personajaxdemo.service;

import com.falk.personajaxdemo.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private List<User> users = new ArrayList<>();

    public UserService(){ }

    public void addUser(User user){
        System.out.printf("Added user with username '%s'%n", user.getName());
        users.add(0, user);
    }

    public List<User> getUsers(){
        return users;
    }

}
