package com.facu_link.endpoint;

import com.facu_link.model.catalog.*;
import com.facu_link.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("fl/api/cat")
public class CatalogEndPoint {
    @Autowired
    private CatalogService catalogService;

    @GetMapping("/degree")
    public List<CatDegreeModel> getAllDegree() {
        List<CatDegreeModel> response = catalogService.getAllDegree();
        return response;
    }

    @GetMapping("/faculties")
    public List<CatFacultyModel> getAllFaculty() {
        List<CatFacultyModel> response = catalogService.getAllFaculty();
        return response;
    }
    @GetMapping("/activeFaculty")
    public List<CatFacultyModel> getAllFacultyActive() {
        return catalogService.getActiveFaculty();
    }

    @GetMapping("/lineOfTransport")
    public List<CatLineOfTransportModel> getAllLineOfTransport() {
        List<CatLineOfTransportModel> response = catalogService.getAllLineOfTransport();
        return response;
    }

    @GetMapping("/municipal")
    public List<CatMunicipalitiesModel> getAllMunicipalities() {
        List<CatMunicipalitiesModel> response = catalogService.getAllMunicipalities();
        return response;
    }

    @GetMapping("/typesOfTransport")
    public List<CatTypeOfTransportModel> getAllTypeOfTransport() {
        List<CatTypeOfTransportModel> response = catalogService.getAllTypeOfTransport();
        return response;
    }

}