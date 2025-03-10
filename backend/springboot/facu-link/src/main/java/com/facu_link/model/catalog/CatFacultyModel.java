package com.facu_link.model.catalog;

import jakarta.persistence.*;

@Entity
@Table(name = "cat_faculty")
public class CatFacultyModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String name;
    private String acronym;
    private String longitude;
    private String latitude;
    private int is_active;

    public String getAcronym() { return acronym; }
    public void setAcronym(String acronym) { this.acronym = acronym; }

    public String getLongitude() { return longitude; }
    public void setLongitude(String longitude) { this.longitude = longitude; }

    public String getLatitude() { return latitude; }
    public void setLatitude(String latitude) { this.latitude = latitude; }

    public int getIs_active() { return is_active; }
    public void setIs_active(int is_active) { this.is_active = is_active; }

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
