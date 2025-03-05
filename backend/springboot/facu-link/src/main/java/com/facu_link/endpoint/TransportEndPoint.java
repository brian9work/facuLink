package com.facu_link.endpoint;

import com.facu_link.model.PaginatedResponse;
import com.facu_link.model.StopModel;
import com.facu_link.model.TransportModel;
import com.facu_link.service.StopService;
import com.facu_link.service.TransportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("fl/api")
public class TransportEndPoint {
    @Autowired
    private TransportService transportService;

    @GetMapping("/transport/all")
    public List<TransportModel> getAll() {
        return transportService.getAll();
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/transport")
    public PaginatedResponse<TransportModel> get(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "0") int size) {
        Page<TransportModel> resultPage = transportService.get(page, size);
        return new PaginatedResponse<>(resultPage);
    }


    @CrossOrigin(origins = "*")
    @GetMapping("/transport/name/{name}")
    public PaginatedResponse<TransportModel> getStopByName(
            @PathVariable String name,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "15") int size) {

        Page<TransportModel> resultPage = transportService.getByName(name, page, size);
        return new PaginatedResponse<>(resultPage);
    }


    @CrossOrigin(origins = "*")
    @GetMapping("/transport/id/{id}")
    public ResponseEntity<TransportModel> getById(@PathVariable Long id) {
        TransportModel transport =  transportService.getById(id);
        return ResponseEntity.ok(transport);
    }
}