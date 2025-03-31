package com.room.microserviceroom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.room.microserviceroom.model.Room;
import com.room.microserviceroom.service.RoomService;

@RestController
@RequestMapping("api/room")
public class RoomController {
    
    @Autowired
    private RoomService service;

    @GetMapping
    public List<Room> getAllRoom() {
        try {
            return service.getAllRoom();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao buscar usuários", e);
        }
    }

    @PostMapping("/createRoom")
    public ResponseEntity<Room> createRoom(@RequestBody Room room) {
        try {
            Room novaSala = service.createRoom(room);  
            return ResponseEntity.status(HttpStatus.CREATED).body(novaSala);  
        } catch (Exception e) {
        
            return ResponseEntity.internalServerError().body(null);
        }
    }

}
