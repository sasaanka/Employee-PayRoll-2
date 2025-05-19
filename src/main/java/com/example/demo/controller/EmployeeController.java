package com.example.demo.controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Employee Payroll App";
    }
}