package com.example.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;




/**
 * The persistent class for the employee database table.
 * 
 */

@Entity
@Data
@Table(name="employee")//表名为t_employee
public class Employee implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
	private Long id;
	private String name;
	private Double salary;
	private Long deptId;
	
	
	@ManyToOne(cascade= {CascadeType.MERGE})
	@JoinColumn(name="cd_id",referencedColumnName="id")
	private Department department;
}