package com.facu_link.endpoint;

import com.facu_link.model.StopRouteModel;
import com.facu_link.model.TransportStopModel;
import com.facu_link.service.StopRoutesService;
import com.facu_link.service.TransportService;
import com.facu_link.service.TransportStopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("fl/api/transportstop")
public class TransportStopEndPoint {
    @Autowired
    private TransportStopService transportStopService;

    @GetMapping("/all")
    public List<TransportStopModel> getAll() {
        return transportStopService.getAll();
    }

    @GetMapping("/transport/{id}")
    public List<TransportStopModel> getTransport(@PathVariable Long id) {
        return transportStopService.getByTransport(id);
    }

    @GetMapping("/stop/{id}")
    public List<TransportStopModel> getStop(@PathVariable Long id) {
        return transportStopService.getByStop(id);
    }
}