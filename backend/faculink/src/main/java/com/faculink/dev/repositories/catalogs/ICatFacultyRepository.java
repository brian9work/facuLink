package com.faculink.faculink.repositories.catalogs;

import com.faculink.faculink.models.catalogs.CatFacultyModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICatFacultyRepository extends JpaRepository<CatFacultyModel, Long> {
}