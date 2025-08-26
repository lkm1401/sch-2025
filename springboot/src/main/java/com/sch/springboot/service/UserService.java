package com.sch.springboot.service;

import com.sch.springboot.dto.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    /**
     * login : 로그인 비즈니스 로직 처리
     */
    public String login(User user) {
        System.out.println("UserService login ---> ");
        System.out.println(user.getId() + "," + user.getPass());
        return "userService --> login";
    }

    /**
     * signUp : 회원가입 비즈니스 로직 처리
     */
    public void signUp(User user) {
        System.out.println("UserService signUp ---> ");
        System.out.println(user.getId()
                + "," + user.getPass()
                + "," + user.getEmail()
                + "," + user.getName());
    }
}
