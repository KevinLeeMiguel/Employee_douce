package com.project.employee.dao;

import com.project.employee.domains.Level;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LevelDao extends JpaRepository<Level,Long>{
    
}