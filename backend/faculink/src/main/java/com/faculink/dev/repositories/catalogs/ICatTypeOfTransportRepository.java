package com.faculink.faculink.repositories.catalogs;

import com.faculink.faculink.models.catalogs.CatTypeOfTransportModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICatTypeOfTransportRepository  extends JpaRepository<CatTypeOfTransportModel, Long> {
}
