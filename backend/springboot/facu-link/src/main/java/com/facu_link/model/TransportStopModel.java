package com.facu_link.model;

import jakarta.persistence.*;

@Entity
@Table(name = "transport_stop")
public class TransportStopModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_transport")
    private TransportModel transportModel;

    @ManyToOne
    @JoinColumn(name = "id_stop")
    private StopModel stopModel;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TransportModel getTransportModel() {
        return transportModel;
    }

    public void setTransportModel(TransportModel transportModel) {
        this.transportModel = transportModel;
    }

    public StopModel getStopModel() {
        return stopModel;
    }

    public void setStopModel(StopModel stopModel) {
        this.stopModel = stopModel;
    }
}
