package com.sch.springboot.repository;

import com.sch.springboot.dto.Employee;

import java.util.List;

public interface EmployeeRepositoryInterface {
    List<Employee> selectAll();
    Long insert(Employee employee);
}
