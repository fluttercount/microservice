package com.users.microserviceusers.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.users.microserviceusers.model.Users;
import com.users.microserviceusers.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public List<Users> getAllUsers() {
        return repository.findAll();
    }

    public Users createUser(Users users) {
        return repository.save(users);
    }

    public Optional<Users> buscarPorEmail(String email) {
        return repository.findByEmail(email);
    }
}