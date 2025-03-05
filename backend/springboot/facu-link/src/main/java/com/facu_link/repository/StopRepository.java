package com.facu_link.repository;

import com.facu_link.model.StopModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.facu_link.model.StopRouteModel;
import java.util.List;

@Repository
public interface StopRepository extends JpaRepository<StopModel, Long> {
        List<StopModel> findAll();
        Page<StopModel> findAll(Pageable pageable);

        Page<StopModel> findByNameContaining(String name, Pageable pageable);
        boolean existsById(Long id);

        @Query(value = "SELECT " +
                "s.id AS id_stop, " +
                "s.longitude, " +
                "s.latitude, " +
                "s.name AS stop_name, " +
                "s.imagen AS stop_imagen, " +
                "t.id AS id_transport, " +
                "t.frequency, " +
                "t.name AS transport_name, " +
                "t.imagen As transport_imagen, " +
                "t.origin, " +
                "t.destination, " +
                "clt.id AS id_line_of_transport, " +
                "clt.name AS line_of_transport_name, " +
                "clt.complete_name, " +
                "clt.imagen AS line_of_transport_imagen, " +
                "ctt.id AS id_type_of_transport, " +
                "ctt.name AS type_of_transport_name, " +
                "ctt.imagen AS type_of_transport_imagen, " +
                "6371000 * 2 * ASIN(SQRT(POWER(SIN((RADIANS(:latitude) - RADIANS(CAST(s.latitude AS DECIMAL(18, 15)))) / 2), 2) + " +
                "COS(RADIANS(:longitude)) * " +
                "COS(RADIANS(CAST(s.latitude AS DECIMAL(18, 15)))) * " +
                "POWER(SIN((RADIANS(:longitude) - RADIANS(CAST(s.longitude AS DECIMAL(18, 15)))) / 2), 2))) AS distance_in_meters " +
                "FROM stop s " +
                "JOIN transport_stop ts ON ts.id_stop = s.id " +
                "JOIN  transport t ON ts.id_transport = t.id " +
                "JOIN  cat_line_of_transport clt ON clt.id = t.id_type_of_transport " +
                "JOIN  cat_type_of_transport ctt ON ctt.id = t.id_type_of_transport " +
                "WHERE " +
                "6371000 * 2 * ASIN(SQRT(POWER(SIN((RADIANS(:latitude) - RADIANS(CAST(s.latitude AS DECIMAL(18, 15)))) / 2), 2) + " +
                "COS(RADIANS(:longitude)) * " +
                "COS(RADIANS(CAST(s.latitude AS DECIMAL(18, 15)))) * " +
                "POWER(SIN((RADIANS(:longitude) - RADIANS(CAST(s.longitude AS DECIMAL(18, 15)))) / 2), 2))) <= :distance " +
                "ORDER BY distance_in_meters ", nativeQuery = true)
        List<Object[]> findNearbyStops(@Param("latitude") double latitude,
                                       @Param("longitude") double longitude,
                                       @Param("distance") double distance);

}
