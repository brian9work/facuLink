package com.faculink.dev.controllers;

import com.faculink.dev.models.components.NearbyStopComponentModel;
import com.faculink.dev.services.StopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/stops")
public class StopsController {
    @Autowired
    private StopService stopService;

    @GetMapping("/nearby")
    public List<NearbyStopComponentModel> getNearbyStops(
            @RequestParam(defaultValue = "0") double latitude,
            @RequestParam(defaultValue = "0") double longitude,
            @RequestParam(defaultValue = "0") double distance
    ) {
        return this.stopService.getNearbyStops(latitude, longitude, distance);
    }
}
