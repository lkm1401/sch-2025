package com.sch.springboot.service;

import com.sch.springboot.dto.Employee;
import com.sch.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    //생성자를 이용하여 EmployeeRepository를 Loose -> DI
    EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    //사원리스트
    public List<Employee> findAll(){
        return employeeRepository.selectAll();
    }

    //사원등록
    public String register(Employee employee) {
        return employeeRepository.insert(employee);
    }
}
