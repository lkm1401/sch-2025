package com.sch.springboot.repository;

import com.sch.springboot.entity.Member;

import java.util.List;

public interface MemberRepositoryInterface {
    String insert(Member member);
    List<Member> findAll();
    String delete(Long sno);
}
