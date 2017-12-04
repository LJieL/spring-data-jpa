package com.example.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.SpringDataJpaApplication;
import com.example.entity.Department;
import com.example.entity.Employee;
import com.example.service.DepartmentService;
import com.example.service.EmployeeService;

import junit.framework.Assert;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=SpringDataJpaApplication.class)
public class DeptpartmentServiceTest {
	@Autowired 
	private DepartmentService deps;
	
	@Test
	public void deleteTest() {

		Assert.assertEquals(1, deps.deleteById(3L));
	}
	
	@Test
	public void findTest() {
		deps.findById(1L);
	}

	@Test
	public void saveDept() {
		Department department= new Department();
		
		department.setName("人事");
		deps.saveDept(department);
	}
}
