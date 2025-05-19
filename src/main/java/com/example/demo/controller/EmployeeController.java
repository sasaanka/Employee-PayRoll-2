package com.example.demo.controller;

import com.example.demo.dto.EmployeeDTO;
import com.example.demo.model.Employee;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @PostMapping("/create")
    public Employee createEmployee(@RequestBody EmployeeDTO employeeDTO) {
        return new Employee(1, employeeDTO.getName(), employeeDTO.getSalary());
    }
}