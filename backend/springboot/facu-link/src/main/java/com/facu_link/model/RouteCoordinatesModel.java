package com.facu_link.model;

import jakarta.persistence.*;

@Entity
@Table(name = "route_cordinates")
public class RouteCoordinatesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String longitude;
    private String latitude;

    @ManyToOne
    @JoinColumn(name = "id_route")
    private TransportModel transportModel;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public TransportModel getTransportModel() {
        return transportModel;
    }

    public void setTransportModel(TransportModel transportModel) {
        this.transportModel = transportModel;
    }
}
