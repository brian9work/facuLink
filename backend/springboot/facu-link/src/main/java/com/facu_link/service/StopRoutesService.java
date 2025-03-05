package com.facu_link.service;

import com.facu_link.exception.ResourceNotFoundException;
import com.facu_link.model.StopRouteModel;
import com.facu_link.model.TransportModel;
import com.facu_link.repository.StopRoutesRepository;
import com.facu_link.repository.TransportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StopRoutesService {

    // OBTENER TODOS
    @Autowired
    private StopRoutesRepository stopRoutesRepository;

    public List<StopRouteModel> getAll() {
        return stopRoutesRepository.findAll();
    }

    public List<StopRouteModel> getByStopFrom(Long id){
        return stopRoutesRepository.findByStopFrom(id);
    }

    public List<StopRouteModel> getByStopTo(Long id){
        return stopRoutesRepository.findByStopTo(id);
    }



}
