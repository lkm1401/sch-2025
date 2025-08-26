package com.sch.springboot.controller;

import com.sch.springboot.dto.User;
import com.sch.springboot.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    UserService userService = new UserService();

    @ResponseBody
    @PostMapping("/login")
    public String login(User user){
        return userService.login(user);
    }


    @ResponseBody
    @PostMapping("/signup")
    public User signup(User user){
        return user;
    }
}
