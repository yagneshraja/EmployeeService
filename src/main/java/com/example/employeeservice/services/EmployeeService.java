package com.example.employeeservice.services;


import com.example.employeeservice.models.Employee;

public interface EmployeeService {

    Employee getEmployee(long id);

    Employee createEmployee(Employee employee);
}
