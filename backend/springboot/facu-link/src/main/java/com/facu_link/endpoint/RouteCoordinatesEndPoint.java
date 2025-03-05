package com.facu_link.endpoint;

import com.facu_link.model.PaginatedResponse;
import com.facu_link.model.RouteCoordinatesModel;
import com.facu_link.model.TransportModel;
import com.facu_link.service.RouteCoordinatesService;
import com.facu_link.service.TransportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("fl/api")
public class RouteCoordinatesEndPoint {
    @Autowired
    private RouteCoordinatesService routeCoordinatesService;

    @GetMapping("/routecoo")
    public List<RouteCoordinatesModel> getAll() {
        return routeCoordinatesService.getAll();
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/routecoo/{id}")
    public List<RouteCoordinatesModel> getById(@PathVariable Long id) {
        return routeCoordinatesService.getById(id);
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/routecoo/lon/{lon}")
    public List<RouteCoordinatesModel> getByLongitude(@PathVariable String lon) {
        return routeCoordinatesService.getByLongitude(lon);
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/routecoo/lat/{lat}")
    public List<RouteCoordinatesModel> getByLatitude(@PathVariable String lat) {
        return routeCoordinatesService.getByLatitude(lat);
    }
}