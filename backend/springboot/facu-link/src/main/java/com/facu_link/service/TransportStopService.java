package com.facu_link.service;

import com.facu_link.model.StopRouteModel;
import com.facu_link.model.TransportStopModel;
import com.facu_link.repository.StopRoutesRepository;
import com.facu_link.repository.TransportStopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransportStopService {

    // OBTENER TODOS
    @Autowired
    private TransportStopRepository transportStopRepository;

    public List<TransportStopModel> getAll() {
        return transportStopRepository.findAll();
    }

    public  List<TransportStopModel> getByTransport(Long id){
        return transportStopRepository.getByTransports(id);
    }

    public  List<TransportStopModel> getByStop(Long id){
        return transportStopRepository.getByStops(id);
    }

}
