package com.room.microserviceroom.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.room.microserviceroom.model.Room;

public interface RoomRepository extends JpaRepository<Room, Long>{

    
} 