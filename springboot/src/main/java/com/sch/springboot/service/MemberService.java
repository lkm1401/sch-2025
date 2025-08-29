package com.sch.springboot.service;

import com.sch.springboot.entity.Member;
import com.sch.springboot.repository.JpaMemberRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class MemberService {

    private JpaMemberRepository memberRepository;

    @Autowired
    public MemberService(JpaMemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public String save(Member member) {
        return memberRepository.insert(member);
    }

    public List<Member> list() {
        return memberRepository.findAll();
    }

}
