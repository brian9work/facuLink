package com.facu_link.repository;

import com.facu_link.model.TransportStopModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransportStopRepository extends JpaRepository<TransportStopModel, Long> {
        List<TransportStopModel> findAll();

        @Query("SELECT ts FROM TransportStopModel ts WHERE ts.transportModel.id = :idTransport ")
        List<TransportStopModel> getByTransports(@Param("idTransport") Long idTransport);

        @Query("SELECT ts FROM TransportStopModel ts WHERE ts.stopModel.id  = :idStop ")
        List<TransportStopModel> getByStops(@Param("idStop") Long idStop);

}
