package com.sch.springboot.controller;

import com.sch.springboot.entity.Member;
import com.sch.springboot.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = {"http://localhost:3001"})
public class RestMemberController {

    private MemberService memberService;

    @Autowired
    public RestMemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    //회원 등록
    @PostMapping("/members/register")
    public String registerMember(@RequestBody Member member) {
        return memberService.save(member);
    }

    //회원 리스트
    @GetMapping("/members")
    public List<Member> getMembers() {
        return memberService.list();
    }

}











