package com.facu_link.repository;

import com.facu_link.model.StopModel;
import com.facu_link.model.TransportModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransportRepository extends JpaRepository<TransportModel, Long> {
        List<TransportModel> findAll();
        Page<TransportModel> findAll(Pageable pageable);

        Page<TransportModel> findByNameContaining(String name, Pageable pageable);

        boolean existsById(Long id);

}
