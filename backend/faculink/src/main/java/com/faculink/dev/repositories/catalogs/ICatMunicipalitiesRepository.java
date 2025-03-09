package com.faculink.faculink.repositories.catalogs;

import com.faculink.faculink.models.catalogs.CatMunicipalitiesModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICatMunicipalitiesRepository extends JpaRepository<CatMunicipalitiesModel, Long> {
}

