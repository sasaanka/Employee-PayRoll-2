package com.example.demo.service;

import com.example.demo.dto.EmployeeDTO;
import com.example.demo.model.Employee;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    public Employee createEmployee(EmployeeDTO dto) {
        return new Employee(1, dto.getName(), dto.getSalary());
    }
}