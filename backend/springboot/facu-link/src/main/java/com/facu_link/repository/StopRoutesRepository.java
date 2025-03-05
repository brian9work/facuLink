package com.facu_link.repository;

import com.facu_link.model.StopRouteModel;
import com.facu_link.model.TransportModel;
import com.facu_link.model.catalog.CatFacultyModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StopRoutesRepository extends JpaRepository<StopRouteModel, Long> {
        List<StopRouteModel> findAll();

        @Query("SELECT sr FROM StopRouteModel sr WHERE sr.stop_from.id = :idRoute ")
        List<StopRouteModel> findByStopFrom(@Param("idRoute") Long idRoute);

        @Query("SELECT sr FROM StopRouteModel sr WHERE sr.stop_to.id = :idRoute ")
        List<StopRouteModel> findByStopTo(@Param("idRoute") Long idRoute);

}
