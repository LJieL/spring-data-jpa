package com.example.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.entity.Employee;
@Service

public class EmployeeSevice {
	@PersistenceContext
	EntityManager em;
	

	
	//createNameQuery的方式
	public void findById(long id){
		Query query = em.createNamedQuery("findById", Employee.class);
		query.setParameter(1, id);
		
		Employee e =(Employee) query.getSingleResult();
		System.out.println(e);
		}
	
	public void findAll() {
		List<Employee> l =(List<Employee>) em.createNamedQuery("findAll", Employee.class);
		System.err.println(l);
	}
	
	//createQuery方式 更新和删除需要使用事务
	public Employee findByIdAndName(long id,String name) {
		Employee emp = new Employee();
		emp = em.createQuery("SELECT e FROM Employee e WHERE e.id=?1 AND e.name = :l", Employee.class)
				.setParameter(1, id)
				.setParameter("l", name)
				.getSingleResult();
		
		return emp;
		
	}
	@Transactional
	public void updateEmployee(String name , long id) {
		em.createQuery("UPDATE Employee e SET e.name = :1 WHERE e.id = 2")
			.setParameter(1, "name")
			.setParameter(2, id)
			.executeUpdate();
	}
	@Transactional
	public void deleteEmployee(long id) {
		Query query =em.createQuery("DELETE  e FROM Employee e Where e.id = ?id")
				.setParameter("id",id );
				query.executeUpdate();
		
	}
	}
