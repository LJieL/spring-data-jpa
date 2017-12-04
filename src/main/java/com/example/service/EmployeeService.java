package com.example.service;

import java.io.Serializable;
import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.entity.Employee;
import com.example.service.repo.EmployeeRepository;


@Service
@Transactional
public class EmployeeService {
	
	@Autowired 
	private EmployeeRepository em;
	
	public void findById(Long id) {
		Employee employee = em.findById(id);
		System.out.println(employee);
	}
	
	
	@Transactional
	public void updateName(String name,Long id) {
		em.updateNameById(name, id);
	}
	
	@Transactional
	public int deleteById(Long id) {
		return em.deleteById(id);
	}
	
	public void save(Employee employee) {
		em.saveAndFlush(employee);
	}
}
