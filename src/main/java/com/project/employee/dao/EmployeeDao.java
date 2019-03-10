package com.project.employee.dao;

import com.project.employee.domains.Employee;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDao extends JpaRepository<Employee,Long> {
    
}