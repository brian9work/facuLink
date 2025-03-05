package com.facu_link.model;

import com.facu_link.model.catalog.CatLineOfTransportModel;
import com.facu_link.model.catalog.CatTypeOfTransportModel;
import jakarta.persistence.*;

@Entity
@Table(name = "stop_routes")
public class StopRouteModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private String distance;
    private String time;
    private String price;

    @ManyToOne
    @JoinColumn(name = "stop_id_from")
    private StopModel stop_from;

    @ManyToOne
    @JoinColumn(name = "stop_id_to")
    private StopModel stop_to;

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public StopModel getStop_from() {
        return stop_from;
    }

    public void setStop_from(StopModel stop_from) {
        this.stop_from = stop_from;
    }

    public StopModel getStop_to() {
        return stop_to;
    }

    public void setStop_to(StopModel stop_to) {
        this.stop_to = stop_to;
    }
}
