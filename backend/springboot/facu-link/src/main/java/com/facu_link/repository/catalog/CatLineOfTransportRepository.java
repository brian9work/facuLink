package com.facu_link.repository.catalog;

import com.facu_link.model.catalog.CatLineOfTransportModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CatLineOfTransportRepository extends JpaRepository<CatLineOfTransportModel, Long> {
        List<CatLineOfTransportModel> findAll();
        boolean existsById(Long id);

}
