package com.sch.springboot.controller;

import com.sch.springboot.dto.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000") // React 개발 서버 주소
public class RestEmployeeController {

    List<Employee> employees = new ArrayList<Employee>();

    /**
     * 사원 등록
     */
    @PostMapping("/employees/register")
    public String register(@RequestBody Employee employee) {
//        System.out.println(employee.getName());
//        System.out.println(employee.getAddress());
        employees.add(employee);

        return "ok";
    }

    /**
     * 사원 리스트 조회
     */
    @GetMapping("/employees")
    public  List<Employee> list() {
//        System.out.println(employees.size());
        return employees;
    }
}
