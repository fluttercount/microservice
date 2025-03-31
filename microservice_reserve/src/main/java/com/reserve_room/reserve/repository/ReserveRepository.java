package com.reserve_room.reserve.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reserve_room.reserve.model.Reserve;

public interface ReserveRepository extends JpaRepository<Reserve, Long> {
    
}
