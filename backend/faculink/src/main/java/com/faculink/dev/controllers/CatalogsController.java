package com.faculink.dev.controllers;

import com.faculink.dev.models.catalogs.*;
import com.faculink.dev.services.CatalogsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cat")
public class CatalogsController {
    @Autowired
    private CatalogsService catalogsService;

    @GetMapping("/degree")
    public List<CatDegreeModel> getDegree() {
        return this.catalogsService.getAllDegree();
    }

    @GetMapping("/faculty")
    public List<CatFacultyModel> getFaculty() {
        return this.catalogsService.getAllFaculty();
    }

    @GetMapping("/municipality")
    public List<CatMunicipalitiesModel> getMunicipalities() {
        return this.catalogsService.getAllMunicipalities();
    }

    @GetMapping("/typeTransport")
    public List<CatTypeOfTransportModel> getTypeOfTransport() {
        return this.catalogsService.getAllTypeOfTransport();
    }

    @GetMapping("/lineTransport")
    public List<CatLineOfTransportModel> getLineOfTransport() {
        return this.catalogsService.getAllLineOfTransport();
    }
}
