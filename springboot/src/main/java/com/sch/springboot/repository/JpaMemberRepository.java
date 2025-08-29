package com.sch.springboot.repository;

import com.sch.springboot.entity.Member;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JpaMemberRepository implements MemberRepositoryInterface {

    private final EntityManager em;

    @Autowired
    public JpaMemberRepository(EntityManager em) {
        this.em = em;
    }

    @Override
    public String delete(Long sno) {
        Member findMember = em.find(Member.class, sno);
        if(findMember != null) {
            em.remove(findMember);
        }
        return "ok";
    }

    @Override
    public String insert(Member member) {
        em.persist(member);
        return member.getName();
    }

    @Override
    public List<Member> findAll() {
        return em.createQuery("select m from Member m", Member.class).getResultList();
    }

}
