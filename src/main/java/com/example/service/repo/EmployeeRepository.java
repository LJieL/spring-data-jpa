package com.example.service.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Serializable>{
@Query("SELECT e FROM Employee e WHERE e.id = :id")
public Employee findById(@Param("id") long id);

@Modifying
@Query("UPDATE Employee e SET e.name = :1 WHERE e.id = 2")
public void updateNameById(String name ,long id);

@Modifying
@Query("DELETE   FROM Employee e Where e.id = ?id")
public int deleteById(@Param("id") long id);
}
