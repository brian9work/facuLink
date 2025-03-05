package com.facu_link.model.catalog;

import jakarta.persistence.*;

@Entity
@Table(name = "cat_degree")
public class CatDegreeModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String name;
    private String is_active;

    @ManyToOne
    @JoinColumn(name = "id_faculty")
    private CatFacultyModel facultyModel;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIs_active() {
        return is_active;
    }

    public void setIs_active(String is_active) {
        this.is_active = is_active;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
