package com.faculink.faculink.models.catalogs;
import jakarta.persistence.*;

@Entity
@Table(name = "catMunicipalities")
public class CatMunicipalitiesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
