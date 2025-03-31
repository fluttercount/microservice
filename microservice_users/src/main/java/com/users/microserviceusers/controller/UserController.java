package com.users.microserviceusers.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.users.microserviceusers.model.Users;
import com.users.microserviceusers.service.UserService;



@RestController
@RequestMapping("api/user")
public class UserController {
    
    @Autowired
    private UserService userService;
   
    @GetMapping
    public List<Users> getAllUsers() {
        try {
            return userService.getAllUsers();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao buscar usuários", e);
        }
    }

    @PostMapping("saveUser")
    public ResponseEntity<Users> createUser(@RequestBody Users users) {
    
        try {
            Users savedUser = userService.createUser(users);
            return ResponseEntity.ok(savedUser);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(null);
        }
        
    }
    


    
}
