package com.sch.springboot.service;

import com.sch.springboot.dto.Employee;
import com.sch.springboot.repository.EmployeeRepository;
import com.sch.springboot.repository.JdbcTemplateEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final JdbcTemplateEmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(JdbcTemplateEmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    //사원리스트
    public List<Employee> findAll(){
        return employeeRepository.selectAll();
    }

    //사원등록
    public int register(Employee employee) {
        return employeeRepository.insert(employee);
    }
}
