package com.project.employee.dao;

import com.project.employee.domains.Department;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentDao extends JpaRepository<Department,Long> {

}