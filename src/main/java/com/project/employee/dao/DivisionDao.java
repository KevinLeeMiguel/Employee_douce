package com.project.employee.dao;

import com.project.employee.domains.Division;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DivisionDao  extends JpaRepository<Division,Long>{
    
}