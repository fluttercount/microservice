package com.users.microserviceusers.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.users.microserviceusers.model.Users;

public interface  UserRepository extends JpaRepository<Users, Long>{

    Optional<Users> findByEmail(String email);
}
