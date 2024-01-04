package com.example.employeeservice.controllers;

import com.example.employeeservice.models.Employee;
import com.example.employeeservice.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService SelfEmployeeService;

    @GetMapping("")
    public String getAllEmployees(){
        return "Getting all Employees";
    }
    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable("id") long id){
//        return "Getting Employee";
        return SelfEmployeeService.getEmployee(id);
    }

    @PostMapping()
    public Employee createEmployee(@RequestBody Employee employee){
        return SelfEmployeeService.createEmployee(employee);
    }

}
