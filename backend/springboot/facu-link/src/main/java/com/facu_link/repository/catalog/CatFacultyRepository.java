package com.facu_link.repository.catalog;

import com.facu_link.model.catalog.CatFacultyModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.BitSet;
import java.util.List;

@Repository
public interface CatFacultyRepository extends JpaRepository<CatFacultyModel, Long> {
        List<CatFacultyModel> findAll();

        @Query("SELECT fm FROM CatFacultyModel fm WHERE fm.is_active=1")
        List<CatFacultyModel> findByActive();

        boolean existsById(Long id);

}
