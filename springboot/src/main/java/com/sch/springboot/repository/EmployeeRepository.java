package com.sch.springboot.repository;

import com.sch.springboot.dto.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepository {

    //사원객체를 저장하는 List<Employee>
    private List<Employee> list = new ArrayList<Employee>();

    public String insert(Employee employee) {
        list.add(employee);
        return "success";
    }
}
