package com.faculink.faculink.repositories.catalogs;

import com.faculink.faculink.models.catalogs.CatLineOfTransportModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICatLineOfTransportRepository extends JpaRepository<CatLineOfTransportModel, Long> {
}
