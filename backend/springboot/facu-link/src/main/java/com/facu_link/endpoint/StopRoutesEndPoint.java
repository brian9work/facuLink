package com.facu_link.endpoint;

import com.facu_link.model.PaginatedResponse;
import com.facu_link.model.StopModel;
import com.facu_link.model.StopRouteModel;
import com.facu_link.model.TransportModel;
import com.facu_link.service.StopRoutesService;
import com.facu_link.service.StopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("fl/api")
public class StopRoutesEndPoint {
    @Autowired
    private StopRoutesService stopRoutesService;

    @GetMapping("/stopRoute/all")
    public List<StopRouteModel> getAll() {
        return stopRoutesService.getAll();
    }

    @GetMapping("/stopRoute/from/{id}")
    public List<StopRouteModel> getByStopFrom(@PathVariable Long id) {
        return stopRoutesService.getByStopFrom(id);
    }

    @GetMapping("/stopRoute/to/{id}")
    public List<StopRouteModel> getByStopTo(@PathVariable Long id) {
        return stopRoutesService.getByStopTo(id);
    }

}