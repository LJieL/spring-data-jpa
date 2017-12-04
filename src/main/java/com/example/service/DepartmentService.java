package com.example.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.entity.Department;
import com.example.service.repo.DepartmentRepository;

public class DepartmentService {
	@Autowired
	private DepartmentRepository dep;
	

	@Transactional
	public int deleteById(Long id) {
		return dep.deleteById(id);
	}
	
	public Department findById(Long id) {
		return dep.findOne(id);
	}
	
	public Department saveDept(Department department) {
		Department d = dep.saveAndFlush(department);
		return d;
	}
	
}
