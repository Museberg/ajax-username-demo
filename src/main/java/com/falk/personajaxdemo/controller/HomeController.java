package com.falk.personajaxdemo.controller;

import com.falk.personajaxdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    UserService userService;

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("users", userService.getUsers());
        return "index";
    }
}
