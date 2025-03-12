package com.faculink.dev.services;

import com.faculink.dev.models.components.NearbyStopComponentModel;
import com.faculink.dev.repositories.IStopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StopService {
    @Autowired
    IStopRepository stopRepository;

    // Metodo para obtener Las paradas (stop) mas cercanas
    public List<NearbyStopComponentModel> getNearbyStops(double latitude, double longitude, double distance) {
        List<Object[]> nearbyStopsData = stopRepository.getNearbyStops(latitude, longitude, distance);
        List<NearbyStopComponentModel> nearbyStop = new ArrayList<>();

        for (Object[] nsd : nearbyStopsData) {
            NearbyStopComponentModel nearbyStopLocal = new NearbyStopComponentModel();
            nearbyStopLocal.setStopId((int) nsd[0]);
            nearbyStopLocal.setLongitude((String) nsd[1]);
            nearbyStopLocal.setLatitude((String) nsd[2]);
            nearbyStopLocal.setStopName((String) nsd[3]);
            nearbyStopLocal.setStopImagen((String) nsd[4]);
            nearbyStopLocal.setDistance((double) nsd[5]);

            nearbyStop.add(nearbyStopLocal);
        }
        return nearbyStop;
    }


}
