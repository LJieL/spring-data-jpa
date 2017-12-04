package com.example.service.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Serializable> {
  @Modifying
  @Query("DELETE  d FROM Department d Where e.id = ?id")
  public  int deleteById(@Param("id") long id);
}
