package com.reserve_room.reserve.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reserve_room.reserve.model.Reserve;
import com.reserve_room.reserve.repository.ReserveRepository;

@Service
public class ReserveService {
    
    @Autowired
    private ReserveRepository repository;

    public List<Reserve> listar() {
        return repository.findAll();
    }

    public Reserve salvar(Reserve reserve) {
        return repository.save(reserve);
    }
}
