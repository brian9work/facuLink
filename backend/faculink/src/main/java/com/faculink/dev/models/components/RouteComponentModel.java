package com.faculink.dev.models.components;

public class RouteCimponentModel {
    Long id_stop;
    String longitude;
    String latitude;

    public Long getId_stop() {
        return id_stop;
    }

    public void setId_stop(Long id_stop) {
        this.id_stop = id_stop;
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
}
