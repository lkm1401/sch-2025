package com.sch.springboot.controller;

import com.sch.springboot.dto.Employee;
import com.sch.springboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class RestEmployeeController {

    EmployeeService employeeService;

    //생성자를 이용한 Loose 커플링 DI
    @Autowired
    public RestEmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/register")
    public String register(Employee employee){
        String result = employeeService.register(employee);
        System.out.println(result);
        return result;
    }

}
