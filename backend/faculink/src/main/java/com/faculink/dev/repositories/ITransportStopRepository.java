package com.faculink.dev.repositories;

import com.faculink.dev.models.*;
import com.faculink.dev.models.TransportStopModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.lang.reflect.Array;
import java.util.Objects;
import java.util.List;

@Repository
public interface ITransportStopRepository extends JpaRepository<TransportStopModel, Long> {
    List<TransportStopModel> findAll();

    @Query("SELECT ts FROM TransportStopModel ts WHERE ts.transportModel.id = :idTransport ")
    List<TransportStopModel> getByTransports(@Param("idTransport") Long idTransport);

    @Query("SELECT ts FROM TransportStopModel ts WHERE ts.stopModel.id  = :idStop ")
    List<TransportStopModel> getByStops(@Param("idStop") Long idStop);

    // Seleccionar las paradas entre dos bases
    @Query("SELECT ts FROM TransportStopModel ts " +
            "WHERE ts.transportModel.id = :transportId AND " +
            "ts.stopModel.id BETWEEN :idFirstStop AND :idEndStop ")
    List<TransportStopModel> getByStopsBetween(
            @Param("transportId") Long transportId,
            @Param("idFirstStop") Long idFirstStop,
            @Param("idEndStop") Long idEndStop
    );

    @Query(value = "SELECT id, id_stop FROM transport_stop " +
            "WHERE id_transport = :idTransport " +
            "ORDER BY id ASC LIMIT 1 ",
            nativeQuery = true)
    List<String> getByFirstStop(@Param("idTransport") Long idTransport);

    @Query(value = "SELECT id, id_stop FROM transport_stop " +
            "WHERE id_transport = :idTransport " +
            "ORDER BY id DESC LIMIT 1",
            nativeQuery = true)
    List<String> getByEndStop(@Param("idTransport") Long idTransport);
}
