package com.faculink.dev.controllers;

import com.faculink.dev.models.TransportStopModel;
import com.faculink.dev.models.components.NearbyStopComponentModel;
import com.faculink.dev.models.components.TransportComponentModel;
import com.faculink.dev.services.StopService;
import com.faculink.dev.services.TransportStopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ts")
public class TransportStopController {
    @Autowired
    private TransportStopService transportStopService;

    @GetMapping("/stops/{id}")
    public List<TransportComponentModel> getStops(
            @PathVariable Long id
    ) {
        return this.transportStopService.getStops(id);
    }
}
