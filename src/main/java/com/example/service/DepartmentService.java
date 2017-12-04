package com.example.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.entity.Department;
@Service
@Transactional
public class DepartmentService {
	@PersistenceContext
	EntityManager em;
	public void insertDepartmentService() {
		Department dep = new Department();
		dep.setDept_id(1);
		dep.setName("llj");
	}
		
}
