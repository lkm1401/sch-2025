package com.sch.springboot.controller;

import com.sch.springboot.domain.Hello;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HelloController {

    /** Hello 객체 정의 */
//    class Hello{
//        private String name;
//        private int age;
//
//        public String getName() {
//            return name;
//        }
//        public int getAge() {
//            return age;
//        }
//
//        public void setName(String name) {
//            this.name = name;
//        }
//
//        public void setAge(int age) {
//            this.age = age;
//        }
//    }

    @ResponseBody
    @GetMapping("/spring-json")
    public Hello springJson(@RequestParam("name") String name, @RequestParam("age") int age) {
        Hello helloObject = new Hello();
        helloObject.setName(name);
        helloObject.setAge(age);

        return helloObject;
    }

    @GetMapping("/spring-api")
    @ResponseBody
    public String springApi(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name);
        return model.toString();
    }


    @GetMapping("/spring-mvc")
    public String springMvc(Model model) {
        //msg="홍길동 친구"
        model.addAttribute("msg", "홍길동 친구");
        return "spring-mvc";  //templates > spring-mvc.html
    }


    @GetMapping("/hello")
    public String hello(Model model) {
        //hello.html view에게 데이터 전달  --> Model
        model.addAttribute("msg", "홍길동");
        return "hello";  //view name :  msg="홍길동"
    }

}
