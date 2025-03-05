package com.facu_link.service;

import com.facu_link.model.catalog.*;
import com.facu_link.repository.catalog.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogService {
    @Autowired
    private CatDegreeRepository catDegreeRepository;
    public List<CatDegreeModel> getAllDegree() {
        return catDegreeRepository.findAll();
    }

    @Autowired
    private CatFacultyRepository catFacultyRepository;
    public List<CatFacultyModel> getAllFaculty() {
        return catFacultyRepository.findAll();
    }
    public List<CatFacultyModel> getActiveFaculty() {
        return catFacultyRepository.findByActive();
    }

    @Autowired
    private CatLineOfTransportRepository catLineOfTransportRepository;
    public List<CatLineOfTransportModel> getAllLineOfTransport() {
        return catLineOfTransportRepository.findAll();
    }

    @Autowired
    private CatMunicipalitiesRepository catMunicipalitiesRepository;
    public List<CatMunicipalitiesModel> getAllMunicipalities() {
        return catMunicipalitiesRepository.findAll();
    }

    @Autowired
    private CatTypeOfTransportRepository catTypeOfTransportRepository;
    public List<CatTypeOfTransportModel> getAllTypeOfTransport() {
        return catTypeOfTransportRepository.findAll();
    }





}
