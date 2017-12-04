package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Department{
	@Id
	private long dept_id;
	private String name;
	
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
