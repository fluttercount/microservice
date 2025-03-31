package com.room.microserviceroom.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.room.microserviceroom.model.Room;
import com.room.microserviceroom.repository.RoomRepository;

@Service
public class RoomService {

     @Autowired
    private RoomRepository repository;

    public List<Room> getAllRoom() {
        return repository.findAll();
    }

    public Room createRoom(Room room) {
        return repository.save(room);
    }
}
