package com.sch.springboot.service;

import com.sch.springboot.dto.Employee;
import com.sch.springboot.repository.JpaEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class EmployeeService {

    private final JpaEmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(JpaEmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    //사원리스트
    public List<Employee> findAll(){
        return employeeRepository.selectAll();
    }

    //사원등록
    public Long register(Employee employee) {
        return employeeRepository.insert(employee);
    }
}
