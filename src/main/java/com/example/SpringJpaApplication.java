package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.service.DepartmentService;
import com.example.service.EmployeeSevice;

@SpringBootApplication
public class SpringJpaApplication {
@Autowired
EmployeeSevice employeeSevice;
@Autowired
DepartmentService departmentService;
	public static void main(String[] args) {
		SpringApplication.run(SpringJpaApplication.class, args);
		
	}
}
