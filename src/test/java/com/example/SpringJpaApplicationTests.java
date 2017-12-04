package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.service.DepartmentService;
import com.example.service.EmployeeSevice;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringJpaApplicationTests {
	@Autowired
	EmployeeSevice employeeSevice ;
	

	@Test
	public void contextLoads() {

}
	@Test
	public void findByIDTest() {
		employeeSevice.findById(1);
	}
	@Test
	public void findByIdAndNameTest() {
		employeeSevice.findByIdAndName(2,"yyf" );
	}
	
	@Test
	public void findAllTest() {
		employeeSevice.findAll();
	}
	
	@Test
	public void UpdateTest() {
		employeeSevice.updateEmployee("llj",1);
	}
	
	@Test
	public void deleteTest() {
		employeeSevice.deleteEmployee(2);
	}
	
}
