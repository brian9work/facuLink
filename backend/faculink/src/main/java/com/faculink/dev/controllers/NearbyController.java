package com.faculink.dev.controllers;

import com.faculink.dev.models.components.NearbyStopComponentModel;
import com.faculink.dev.models.components.TransportComponentModel;
import com.faculink.dev.services.NearbyStopService;
import com.faculink.dev.services.StopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/nearby")
public class NearbyController {
    @Autowired
    private NearbyStopService nearbyStopService;

    @GetMapping
    public List<NearbyStopComponentModel> getNearbyStops(
            @RequestParam(defaultValue = "0") double latitude,
            @RequestParam(defaultValue = "0") double longitude,
            @RequestParam(defaultValue = "0") double distance )
    {
        return this.nearbyStopService.getNearbyStops(latitude, longitude, distance);
    }

    @GetMapping("/{idStop}")
    public List<TransportComponentModel> getNearbyTransportForStop( @PathVariable Long idStop )
    {
        return this.nearbyStopService.getNearbyTransportForStop(idStop);
    }

    @GetMapping("/transport/{id}")
    public TransportComponentModel getAllInformationOfTransport( @PathVariable Long id )
    {
        return this.nearbyStopService.getAllInformationOfTransport(id);
    }
}
