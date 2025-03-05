package com.facu_link.repository.catalog;

import com.facu_link.model.catalog.CatDegreeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CatDegreeRepository extends JpaRepository<CatDegreeModel, Long> {
        List<CatDegreeModel> findAll();
        boolean existsById(Long id);

}
