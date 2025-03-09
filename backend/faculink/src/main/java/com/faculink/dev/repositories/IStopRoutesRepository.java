package com.faculink.dev.repositories;

import com.faculink.dev.models.RouteCoordinatesModel;
import com.faculink.dev.models.StopRouteModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IStopRoutesRepository extends JpaRepository<StopRouteModel, Long> {
    @Query("SELECT sr FROM StopRouteModel sr WHERE sr.stop_from.id = :idRoute ")
    List<StopRouteModel> findByStopFrom(@Param("idRoute") Long idRoute);

    @Query("SELECT sr FROM StopRouteModel sr WHERE sr.stop_to.id = :idRoute ")
    List<StopRouteModel> findByStopTo(@Param("idRoute") Long idRoute);

    @Query("SELECT sr FROM StopRouteModel sr WHERE sr.stop_from.id = :idStopFrom AND " +
            "sr.stop_to.id BETWEEN :idFirstStop AND :idEndStop " +
            " ORDER BY sr.id ASC")
    List<StopRouteModel> getByStopFromAndBeetweenStopToAsc(
            @Param("idStopFrom") Long idStopFrom,
            @Param("idFirstStop") Long idFirstStop,
            @Param("idEndStop") Long idEndStop
    );
    @Query("SELECT sr FROM StopRouteModel sr WHERE sr.stop_from.id = :idStopFrom AND " +
            "sr.stop_to.id BETWEEN :idFirstStop AND :idEndStop " +
            " ORDER BY sr.id DESC")
    List<StopRouteModel> getByStopFromAndBeetweenStopToDes(
            @Param("idStopFrom") Long idStopFrom,
            @Param("idFirstStop") Long idFirstStop,
            @Param("idEndStop") Long idEndStop
    );
}
