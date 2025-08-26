# 2일차

## 1. 정적 컨텐츠 : html, image 등
- 프로젝트\src\resources\static\정적컨텐츠 저장
- 스프링부트에서 실행하지 않고, 브라우저에 전달
- 브라우저 실행

## 2. View : 템플릿엔진(Thymleaf), 서블릿, JSP 파일 등
- 요청 시 스프링 부트의 실행 순서에 따라 호출
- DS(디스패처 서블릿) <--> 핸들러매핑 <--> 핸들러 어댑터 <--> 컨트롤러 실행결과
  <--> 뷰 리졸버  <---> 뷰 리턴
- 뷰를 실행한 결과를 브라우저에 반환

## 실습
- 브라우저 : http://localhost:8080/spring
- /spring 컨텍스트 패스 ---> SpringController.java
- SpringController.java 실행 결과 --> 'Hello~ Spring!!'


## @RequestParam 객체를 통해 데이터 전송 -> Member 객체 생성
- MemberController.java
```
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

```

## 파라미터로 전송된 데이터를 @ModelAttribute를 통해 Member 객체 매핑
- @ModelAttribute를 통해 매핑하는 경우, 파라미터의 name과 객체의 field명이 동일해야함!!
```
package com.sch.springboot.controller;

import com.sch.springboot.dto.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MemberController {
    @GetMapping("/member")
    public String memer(@ModelAttribute Member member,
                        Model model) {

        model.addAttribute("member", member);

        return "member";  //view name + model 객체
    }
}

```
## 입력폼 -- post 방식 전송 > @PostMapping()
```

```
## 로그인, 회원가입 - DTO, Controller, Service, Repository
- User.java
```
package com.sch.springboot.dto;

public class User {
    private String id;
    private String pass;
    private String name;
    private String email;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

```

- UserController.java
```
package com.sch.springboot.controller;

import com.sch.springboot.dto.User;
import com.sch.springboot.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class UserController {

    UserService userService = new UserService();

    @ResponseBody
    @PostMapping("/login")
    public Map<String, Object> login(User user){
        return userService.login(user);  //Map<String, Object>
    }


    @ResponseBody
    @PostMapping("/signup")
    public Map<String, String> signup(User user){
        return userService.signUp(user);
    }
}

```

- UserService.java
```
package com.sch.springboot.service;

import com.sch.springboot.dto.User;
import com.sch.springboot.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserService {

    UserRepository userRepository = new UserRepository();

    /**
     * login : 로그인 비즈니스 로직 처리
     */
    public Map<String, Object> login(User user) {
        System.out.println("UserService login ---> ");
        System.out.println(user.getId() + "," + user.getPass());
        return userRepository.login(user);  //Map<String, Object>
    }

    /**
     * signUp : 회원가입 비즈니스 로직 처리
     */
    public Map<String, String> signUp(User user) {
        return userRepository.signUp(user);
    }
}

```

- UserRepository.java
```
package com.sch.springboot.repository;

import com.sch.springboot.dto.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class UserRepository {
    /**
     * signUp : 회원가입 처리
     */
    public Map<String, String> signUp(User user) {
        Map<String, String> result = new HashMap<>();

        result.put("id", user.getId());
        result.put("pass", user.getPass());
        result.put("name", user.getName());
        result.put("email", user.getEmail());

        return result;
    }


    /**
     * login : 로그인 처리
     */
    public Map<String, Object> login(User user) {
        String did = "test";
        String dpass = "1234";
        Map<String, Object> result = new HashMap<String, Object>();

        if(user.getId().equals(did) && user.getPass().equals(dpass)){
            //로그인 성공
            result.put("status", "success");
            result.put("message", "로그인 성공!");
            result.put("id", user.getId());
        } else {
            //로그인 실패
            result.put("status", "fail");
            result.put("message", "로그인 실패!");
            result.put("id", user.getId());
        }
        return result;
    }

}

```




