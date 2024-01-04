package com.example.employeeservice.repositories;

import com.example.employeeservice.models.Employee;
import com.example.employeeservice.services.EmployeeService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

    @Override
    Employee save(Employee employee);

//    @Query("Select * from employee where id = id")
    Employee findEmployeeById(long id);
}
