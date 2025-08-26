package com.sch.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MemberController {
    @GetMapping("/member")
    public String memer(@RequestParam("name") String name,
                        @RequestParam("age") int age,
                        @RequestParam("address") String address) {
        System.out.println(name);
        System.out.println(age);
        System.out.println(address);
        return "member";  //view name
    }
}
