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
public class EmployeeServiceTest {
	@Autowired 
	private EmployeeService emps;
	@Autowired
	private DepartmentService deps;
	
	@Test
	public void findById() {
		emps.findById(1L);
	}

	@Test 
	public void updateName() {
		emps.updateName("yyf2", 2L);
	}
	
	@Test
	public void deleteByIdTest() {
		Assert.assertEquals(1, emps.deleteById(3L));
	}
	
	@Test
	public void saveTest() {
	;
		Department d = deps.findById(3L);
		Employee emp = new Employee();
		emp.setDepartment(d);
	
		emp.setName("ysh");
		emp.setDeptId(5L);
		emp.setSalary(4000.0);
		
		emps.save(emp);
		
	}
}

