package com.facu_link.service;

import com.facu_link.exception.ResourceNotFoundException;
import com.facu_link.model.RouteCoordinatesModel;
import com.facu_link.model.TransportModel;
import com.facu_link.repository.RouteCoordinatesRepository;
import com.facu_link.repository.TransportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RouteCoordinatesService {

    // OBTENER TODOS
    @Autowired
    private RouteCoordinatesRepository routeCoordinatesRepository;

    public List<RouteCoordinatesModel> getAll() {
        return routeCoordinatesRepository.findAll();
    }

    // OBTENER POR ID ROUTE
    public List<RouteCoordinatesModel> getById(Long idRoute) {
        return routeCoordinatesRepository.findByIdRoute(idRoute);
    }

    // OBTENER POR LONGITUDE
    public List<RouteCoordinatesModel> getByLongitude(String longitude) {
        return routeCoordinatesRepository.findByLongitudeContaining(longitude);
    }

    // OBTENER POR LATITUDE
    public List<RouteCoordinatesModel> getByLatitude(String latitude) {
        return routeCoordinatesRepository.findByLatitudeContaining(latitude);
    }

}
