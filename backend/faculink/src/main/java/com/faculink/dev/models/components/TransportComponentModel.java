package com.faculink.dev.models.components;

import java.util.List;



public class TransportComponentModel {
    Long transportId;
    String transportName;
    String transportImagen;
    String transportFrequency;
    String transportOrigin;
    String transportDestination;
    String transportTypeOfTransportName;
    String transportTypeOfTransportImagen;
    String transportLineOfTransportName;
    String transportLineOfTransportCompleteName;
    String transportLineOfTransportImagen;
    Long firstStop;
    Long endStop;
    DestinationInfoComponentModel trayectoInfoOrigin;
    DestinationInfoComponentModel trayectoInfoDestination;
    List<StopRoutesExtraInfoComponentModel> trayectoOrigin;
    List<StopRoutesExtraInfoComponentModel> trayectoDestination;
    List<RouteComponentModel> route;
    List<TransportStopsComponentModel> transportStops;

    public Long getTransportId() {
        return transportId;
    }

    public void setTransportId(Long transportId) {
        this.transportId = transportId;
    }

    public String getTransportName() {
        return transportName;
    }

    public void setTransportName(String transportName) {
        this.transportName = transportName;
    }

    public String getTransportImagen() {
        return transportImagen;
    }

    public void setTransportImagen(String transportImagen) {
        this.transportImagen = transportImagen;
    }

    public String getTransportFrequency() {
        return transportFrequency;
    }

    public void setTransportFrequency(String transportFrequency) {
        this.transportFrequency = transportFrequency;
    }

    public String getTransportOrigin() {
        return transportOrigin;
    }

    public void setTransportOrigin(String transportOrigin) {
        this.transportOrigin = transportOrigin;
    }

    public String getTransportDestination() {
        return transportDestination;
    }

    public void setTransportDestination(String transportDestination) {
        this.transportDestination = transportDestination;
    }

    public String getTransportTypeOfTransportName() {
        return transportTypeOfTransportName;
    }

    public void setTransportTypeOfTransportName(String transportTypeOfTransportName) {
        this.transportTypeOfTransportName = transportTypeOfTransportName;
    }

    public String getTransportTypeOfTransportImagen() {
        return transportTypeOfTransportImagen;
    }

    public void setTransportTypeOfTransportImagen(String transportTypeOfTransportImagen) {
        this.transportTypeOfTransportImagen = transportTypeOfTransportImagen;
    }

    public String getTransportLineOfTransportName() {
        return transportLineOfTransportName;
    }

    public void setTransportLineOfTransportName(String transportLineOfTransportName) {
        this.transportLineOfTransportName = transportLineOfTransportName;
    }

    public String getTransportLineOfTransportCompleteName() {
        return transportLineOfTransportCompleteName;
    }

    public void setTransportLineOfTransportCompleteName(String transportLineOfTransportCompleteName) {
        this.transportLineOfTransportCompleteName = transportLineOfTransportCompleteName;
    }

    public String getTransportLineOfTransportImagen() {
        return transportLineOfTransportImagen;
    }

    public void setTransportLineOfTransportImagen(String transportLineOfTransportImagen) {
        this.transportLineOfTransportImagen = transportLineOfTransportImagen;
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

    public DestinationInfoComponentModel getTrayectoInfoOrigin() {
        return trayectoInfoOrigin;
    }

    public void setTrayectoInfoOrigin(DestinationInfoComponentModel trayectoInfoOrigin) {
        this.trayectoInfoOrigin = trayectoInfoOrigin;
    }

    public DestinationInfoComponentModel getTrayectoInfoDestination() {
        return trayectoInfoDestination;
    }

    public void setTrayectoInfoDestination(DestinationInfoComponentModel trayectoInfoDestination) {
        this.trayectoInfoDestination = trayectoInfoDestination;
    }

    public List<StopRoutesExtraInfoComponentModel> getTrayectoOrigin() {
        return trayectoOrigin;
    }

    public void setTrayectoOrigin(List<StopRoutesExtraInfoComponentModel> trayectoOrigin) {
        this.trayectoOrigin = trayectoOrigin;
    }

    public List<StopRoutesExtraInfoComponentModel> getTrayectoDestination() {
        return trayectoDestination;
    }

    public void setTrayectoDestination(List<StopRoutesExtraInfoComponentModel> trayectoDestination) {
        this.trayectoDestination = trayectoDestination;
    }

    public List<RouteComponentModel> getRoute() {
        return route;
    }

    public void setRoute(List<RouteComponentModel> route) {
        this.route = route;
    }

    public List<TransportStopsComponentModel> getTransportStops() {
        return transportStops;
    }

    public void setTransportStops(List<TransportStopsComponentModel> transportStops) {
        this.transportStops = transportStops;
    }
}
