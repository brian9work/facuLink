package com.facu_link.repository.catalog;

import com.facu_link.model.catalog.CatTypeOfTransportModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface CatTypeOfTransportRepository extends JpaRepository<CatTypeOfTransportModel, Long> {
        List<CatTypeOfTransportModel> findAll();
        boolean existsById(Long id);

}
