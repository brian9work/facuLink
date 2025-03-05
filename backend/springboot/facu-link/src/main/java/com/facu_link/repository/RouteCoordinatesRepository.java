package com.facu_link.repository;

import com.facu_link.model.RouteCoordinatesModel;
import com.facu_link.model.StopRouteModel;
import com.facu_link.model.TransportModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RouteCoordinatesRepository extends JpaRepository<RouteCoordinatesModel, Long> {
        List<RouteCoordinatesModel> findAll();

        @Query("SELECT rc FROM RouteCoordinatesModel rc WHERE rc.transportModel.id = :idRoute ")
        List<RouteCoordinatesModel> findByIdRoute(@Param("idRoute") Long idRoute);

        List<RouteCoordinatesModel> findByLongitudeContaining(String longitude);
        List<RouteCoordinatesModel> findByLatitudeContaining(String latitude);


        boolean existsById(Long id);

}
