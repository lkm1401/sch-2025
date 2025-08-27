package com.sch.springboot.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestEmployeeController {

    @PostMapping("/register")
    public String register(){
        return "Rest API";
    }
}
