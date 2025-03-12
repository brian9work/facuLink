package com.faculink.dev.models.components;

import java.util.List;

public class StopRouteComponentModel {
    int stopId;
    String longitude;
    String latitude;
    String stopName;
    String stopImagen;
    int transportID;
    String frequency;
    String name;
    String imagen;
    String origin;
    String destination;
    int lineOfTransportId;
    String lineOfTransportName;
    String lineOfTransportCompleteName;
    String lineOfTransportImagen;
    int typeOfTransportId;
    String typeOfTransportName;
    String typeOfTransportImagen;
    double distance;
    Long firstStop;
    Long endStop;
    List<StopRoutesExtraInfoComponentModel> info;

    public int getStopId() {
        return stopId;
    }

    public void setStopId(int stopId) {
        this.stopId = stopId;
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

    public String getStopName() {
        return stopName;
    }

    public void setStopName(String stopName) {
        this.stopName = stopName;
    }

    public String getStopImagen() {
        return stopImagen;
    }

    public void setStopImagen(String stopImagen) {
        this.stopImagen = stopImagen;
    }

    public int getTransportID() {
        return transportID;
    }

    public void setTransportID(int transportID) {
        this.transportID = transportID;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getLineOfTransportId() {
        return lineOfTransportId;
    }

    public void setLineOfTransportId(int lineOfTransportId) {
        this.lineOfTransportId = lineOfTransportId;
    }

    public String getLineOfTransportName() {
        return lineOfTransportName;
    }

    public void setLineOfTransportName(String lineOfTransportName) {
        this.lineOfTransportName = lineOfTransportName;
    }

    public String getLineOfTransportCompleteName() {
        return lineOfTransportCompleteName;
    }

    public void setLineOfTransportCompleteName(String lineOfTransportCompleteName) {
        this.lineOfTransportCompleteName = lineOfTransportCompleteName;
    }

    public String getLineOfTransportImagen() {
        return lineOfTransportImagen;
    }

    public void setLineOfTransportImagen(String lineOfTransportImagen) {
        this.lineOfTransportImagen = lineOfTransportImagen;
    }

    public int getTypeOfTransportId() {
        return typeOfTransportId;
    }

    public void setTypeOfTransportId(int typeOfTransportId) {
        this.typeOfTransportId = typeOfTransportId;
    }

    public String getTypeOfTransportName() {
        return typeOfTransportName;
    }

    public void setTypeOfTransportName(String typeOfTransportName) {
        this.typeOfTransportName = typeOfTransportName;
    }

    public String getTypeOfTransportImagen() {
        return typeOfTransportImagen;
    }

    public void setTypeOfTransportImagen(String typeOfTransportImagen) {
        this.typeOfTransportImagen = typeOfTransportImagen;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public Long getFirstStop() {
        return firstStop;
    }

    public void setFirstStop(Long firstStop) {
        this.firstStop = firstStop;
    }

    public Long getEndStop() {
        return endStop;
    }

    public void setEndStop(Long endStop) {
        this.endStop = endStop;
    }

    public List<StopRoutesExtraInfoComponentModel> getInfo() {
        return info;
    }

    public void setInfo(List<StopRoutesExtraInfoComponentModel> info) {
        this.info = info;
    }
}
