package com.falk.personajaxdemo;

import com.falk.personajaxdemo.model.User;
import com.falk.personajaxdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class DemoData {

    @Autowired
    UserService userService;

    @EventListener
    public void appReady(ApplicationReadyEvent event){
        // Adding some test users
        userService.addUser(new User("Ammad"));
        userService.addUser(new User("Michael"));
        userService.addUser(new User("Rasmus"));
        userService.addUser(new User("Julius"));
    }
}

