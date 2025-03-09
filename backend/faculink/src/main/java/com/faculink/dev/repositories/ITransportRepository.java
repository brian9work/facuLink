package com.faculink.dev.repositories;

import com.faculink.dev.models.TransportModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITransportRepository extends JpaRepository<TransportModel, Long> {
}
