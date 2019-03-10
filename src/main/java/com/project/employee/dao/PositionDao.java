package com.project.employee.dao;

import com.project.employee.domains.Position;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PositionDao extends JpaRepository<Position,Long>{
    
}