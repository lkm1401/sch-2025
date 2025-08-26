package com.sch.springboot.controller;

import com.sch.springboot.dto.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MemberController {
    @GetMapping("/member")
    public String memer(@RequestParam("name") String name,
                        @RequestParam("age") int age,
                        @RequestParam("address") String address,
                        Model model) {

        Member member = new Member();
        member.setName(name);
        member.setAge(age);
        member.setAddress(address);

        model.addAttribute("member", member);

        return "member";  //view name + model 객체
    }
}
