package com.faculink.faculink.repositories.catalogs;

import com.faculink.faculink.models.catalogs.CatDegreeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICatDegreeRepository extends JpaRepository<CatDegreeModel, Long> {
}