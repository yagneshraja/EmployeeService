package com.example.employeeservice.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@Getter
@Setter
@Entity
public class Employee extends BaseModel{

    private String name;
    private String address;
    private int age;
}
