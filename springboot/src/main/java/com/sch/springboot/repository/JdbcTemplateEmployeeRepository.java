package com.sch.springboot.repository;

import com.sch.springboot.dto.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class JdbcTemplateEmployeeRepository implements EmployeeRepositoryInterface{
    public List<Employee> selectAll() {
        List<Employee> list = new ArrayList<Employee>();

        return list;
    }

    public String insert(Employee employee){
        return "";
    }
}
