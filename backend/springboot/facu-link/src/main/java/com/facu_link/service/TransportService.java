package com.facu_link.service;

import com.facu_link.exception.ResourceNotFoundException;
import com.facu_link.model.TransportModel;
import com.facu_link.repository.TransportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransportService {

    // OBTENER TODOS
    @Autowired
    private TransportRepository transportRepository;

    public List<TransportModel> getAll() {
        return transportRepository.findAll();
    }

    // OBTENER POR PAGINADO
    public Page<TransportModel> get(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);

        return (Page<TransportModel>) transportRepository.findAll(pageable);
    }

    // OBTENER POR NOMBRE
    public Page<TransportModel> getByName(String name, int page, int size) {
        Pageable pageable = PageRequest.of(page, size);

        return transportRepository.findByNameContaining(name, pageable);
    }

    // Metodo para obtener un TransportModel por su ID
    public TransportModel getById(Long id) {
        return transportRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Transporte no encontrado con ID: " + id));

    }

}
