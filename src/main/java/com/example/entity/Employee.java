package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import lombok.Data;
//long id(主键)、string name 、double salary、long dept_id


@Entity
@Data
@NamedQueries({
@NamedQuery(name="findById",query="select e from Employee e where e.id = :id"),
@NamedQuery(name="findAll",query="select e from Employee e")
})
public class Employee {
	@Id
	private long id;
	private String name;
	private double salary;
	private long dept_id;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
