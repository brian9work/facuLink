package com.facu_link.endpoint;

import com.facu_link.model.*;
import com.facu_link.model.PaginatedResponse;
import com.facu_link.modelToReturn.StopInfo;
import com.facu_link.service.CatalogService;
import com.facu_link.service.StopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("fl/api")
public class StopEndPoint {
    @Autowired
    private StopService stopService;

    @GetMapping("/stop/all")
    public List<StopModel> getAll() {
        return stopService.getAll();
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/stop")
    public PaginatedResponse<StopModel> get(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "0") int size) {
        Page<StopModel> resultPage = stopService.get(page, size);
        return new PaginatedResponse<>(resultPage);
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/stop/name/{name}")
    public PaginatedResponse<StopModel> getByName(
            @PathVariable String name,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "15") int size) {

        Page<StopModel> resultPage = stopService.getByName(name, page, size);
        return new PaginatedResponse<>(resultPage);
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/stop/id/{id}")
    public ResponseEntity<StopModel> getById(@PathVariable Long id) {
        StopModel stop =  stopService.getById(id);
        return ResponseEntity.ok(stop);
    }


    @CrossOrigin(origins = "*")
    @GetMapping("/stop/nearby")
    public List<StopInfo> getNearbyStops(
            @RequestParam(defaultValue = "0") double latitude,
            @RequestParam(defaultValue = "0") double longitude,
            @RequestParam(defaultValue = "100") double distance
    ) {
        return  stopService.getNearbyStops(latitude, longitude, distance);
    }


    @CrossOrigin(origins = "*")
    @GetMapping("/stop/nearby2")
    public List<StopInfo> getNearbyStops2(
            @RequestParam(defaultValue = "0") double latitude,
            @RequestParam(defaultValue = "0") double longitude,
            @RequestParam(defaultValue = "100") double distance
    ) {
        return  stopService.getNearbyStops(latitude, longitude, distance);
    }
}