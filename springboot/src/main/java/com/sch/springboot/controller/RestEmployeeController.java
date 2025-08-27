package com.sch.springboot.controller;

import com.sch.springboot.dto.Employee;
import com.sch.springboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
        return employeeService.register(employee);  //success or fail
    }

    @GetMapping("/list")
    public String list(Model model){
        List<Employee> list = employeeService.findAll();
        model.addAttribute("list",list);
        return "employeeList";
    }

}








