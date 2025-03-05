package com.facu_link.service;

import com.facu_link.exception.ResourceNotFoundException;
import com.facu_link.model.*;
import com.facu_link.modelToReturn.StopInfo;
import com.facu_link.repository.StopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StopService {

    // OBTENER TODOS
    @Autowired
    private StopRepository stopRepository;

    public List<StopModel> getAll() {
        return stopRepository.findAll();
    }

    // OBTENER POR PAGINADO
    public Page<StopModel> get(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);

        return (Page<StopModel>) stopRepository.findAll(pageable);
    }

    // OBTENER POR NOMBRE
    public Page<StopModel> getByName(String name, int page, int size) {
        Pageable pageable = PageRequest.of(page, size);

        return stopRepository.findByNameContaining(name, pageable);
    }

    // Metodo para obtener un StopModel por su ID
    public StopModel getById(Long id) {
        return stopRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Stop no encontrado con ID: " + id));

    }

    // Metodo para obtener un StopModel por su ID
    public List<StopInfo> getNearbyStops(double latitude, double longitude, double distance) {
        List<Object[]> results = stopRepository.findNearbyStops(latitude, longitude, distance);
        List<StopInfo> stops = new ArrayList<>();

        for (Object[] result : results) {
            StopInfo stopInfo = new StopInfo();
            stopInfo.setId_stop((int) result[0]);
            stopInfo.setLongitude((String) result[1]);
            stopInfo.setLatitude((String) result[2]);
            stopInfo.setStop_name((String) result[3]);
            stopInfo.setStop_imagen((String) result[4]);
            stopInfo.setId_transport((int) result[5]);
            stopInfo.setFrequency((String) result[6]);
            stopInfo.setName((String) result[7]);
            stopInfo.setImagen((String) result[8]);
            stopInfo.setOrigin((String) result[9]);
            stopInfo.setDestination((String) result[10]);
            stopInfo.setId_line_of_transport((int) result[11]);
            stopInfo.setLine_of_transport_name((String) result[12]);
            stopInfo.setComplete_name((String) result[13]);
            stopInfo.setLine_of_transport_imagen((String) result[14]);
            stopInfo.setId_type_of_transport((int) result[15]);
            stopInfo.setType_of_transport_name((String) result[16]);
            stopInfo.setType_of_transport_imagen((String) result[17]);
            stopInfo.setDistance_in_meters((double) result[18]);

            stops.add(stopInfo);
        }

        return stops;
//        return stopRepository.findNearbyStops(latitude, longitude, distance);

    }

}
