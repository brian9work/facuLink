package com.facu_link.model.catalog;

import jakarta.persistence.*;

@Entity
@Table(name = "cat_municipalities")
public class CatMunicipalitiesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
