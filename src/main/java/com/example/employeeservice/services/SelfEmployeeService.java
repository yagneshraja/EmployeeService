package com.example.employeeservice.services;

import com.example.employeeservice.models.Employee;
import com.example.employeeservice.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SelfEmployeeService implements  EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public Employee getEmployee(long id) {
        return employeeRepository.findEmployeeById(id);
    }

    @Override
    public Employee createEmployee(Employee employee) {

        return  employeeRepository.save(employee);
    }
}
