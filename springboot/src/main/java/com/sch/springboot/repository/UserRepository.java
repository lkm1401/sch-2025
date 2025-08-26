package com.sch.springboot.repository;

import com.sch.springboot.dto.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    /**
     * login : 로그인 처리
     */
    public String login(User user) {
        String did = "test";
        String dpass = "1234";
        String result = "";

        if(user.getId().equals(did) && user.getPass().equals(dpass)){
            //로그인 성공
            result = "로그인 성공!!";
        } else {
            //로그인 실패
            result = "로그인 실패!!";
        }
        return result;
    }

}
