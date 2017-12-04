package com.example.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;


/**
 * The persistent class for the department database table.
 * 
 */
@Entity
@Data
@Table(name="department")

public class Department implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) //主键自增方式
	private Long id;
	private String name;
	
	@OneToMany(mappedBy = "department", cascade = CascadeType.REMOVE)  
    private Set<Employee> employees;
}
	

