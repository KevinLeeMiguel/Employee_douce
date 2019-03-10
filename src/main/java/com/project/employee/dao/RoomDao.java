package com.project.employee.dao;

import com.project.employee.domains.Room;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomDao extends JpaRepository<Room,Long> {
    
}