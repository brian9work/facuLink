package com.facu_link.repository.catalog;

import com.facu_link.model.catalog.CatMunicipalitiesModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CatMunicipalitiesRepository extends JpaRepository<CatMunicipalitiesModel, Long> {
        List<CatMunicipalitiesModel> findAll();
        boolean existsById(Long id);

}
