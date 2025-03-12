package com.faculink.dev.services;
import com.faculink.dev.models.RouteCoordinatesModel;
import com.faculink.dev.models.StopRouteModel;
import com.faculink.dev.models.TransportStopModel;
import com.faculink.dev.models.components.*;
import com.faculink.dev.repositories.IRouteCoordinatesRepository;
import com.faculink.dev.repositories.IStopRepository;
import com.faculink.dev.repositories.IStopRoutesRepository;
import com.faculink.dev.repositories.ITransportStopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NearbyStopService {
    @Autowired
    IStopRepository stopRepository;
    @Autowired
    ITransportStopRepository transportStopRepository;
    @Autowired
    IRouteCoordinatesRepository routeCoordinatesRepository;
    @Autowired
    IStopRoutesRepository stopRoutesRepository;

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

    public List<TransportComponentModel> getNearbyTransportForStop(Long idStop){
        List<TransportStopModel> transportStopModels = transportStopRepository.getStops(idStop);
        List<TransportComponentModel> transportComponent = new ArrayList<>();

        for (TransportStopModel tsm : transportStopModels) {
            TransportComponentModel component = new TransportComponentModel();
            component.setTransportId(tsm.getTransportModel().getId());
            component.setTransportName(tsm.getTransportModel().getName());
            component.setTransportImagen(tsm.getTransportModel().getImagen());
            component.setTransportFrequency(tsm.getTransportModel().getFrequency());
            component.setTransportOrigin(tsm.getTransportModel().getOrigin());
            component.setTransportDestination(tsm.getTransportModel().getDestination());

            component.setTransportTypeOfTransportName(tsm.getTransportModel().getCatTypeOfTransportModel().getName());
            component.setTransportTypeOfTransportImagen(tsm.getTransportModel().getCatTypeOfTransportModel().getImagen());

            component.setTransportLineOfTransportName(tsm.getTransportModel().getCatLineOfTransportModel().getName());
            component.setTransportLineOfTransportCompleteName(tsm.getTransportModel().getCatLineOfTransportModel().getImagen());
            component.setTransportLineOfTransportImagen(tsm.getTransportModel().getCatLineOfTransportModel().getImagen());


            component.setFirstStop(
                    Long.valueOf(
                            transportStopRepository.getByFirstStop(
                                    component.getTransportId()
                            ).get(0).split(",")[1]
                    )
            );
            component.setEndStop(
                    Long.valueOf(
                            transportStopRepository.getByEndStop(
                                    component.getTransportId()
                            ).get(0).split(",")[1]
                    )
            );




            List<Object[]> routesStopListFirst = stopRoutesRepository.getRoutesBeetwenTwoStops(
                    component.getFirstStop(),
                    tsm.getStopModel().getId()
            );
//            DestinationInfoComponentModel destinationsInfoOrigin = getDestinationInfoComponentModel(routesStopListFirst);
//            component.setTrayectoInfoOrigin(destinationsInfoOrigin);
            DestinationInfoComponentModel destinationsInfoOrigin = new DestinationInfoComponentModel();
            if(!routesStopListFirst.isEmpty()){
                Object[] routesStopFirst = routesStopListFirst.get(0);
                destinationsInfoOrigin.setId(String.valueOf((int) routesStopFirst[0]));
                destinationsInfoOrigin.setDistance(String.valueOf((int) routesStopFirst[1]));
                destinationsInfoOrigin.setTime(String.valueOf((int) routesStopFirst[2]));
                destinationsInfoOrigin.setPrice(String.valueOf((float) routesStopFirst[3]));
                destinationsInfoOrigin.setOrigin((String) routesStopFirst[5]);
                destinationsInfoOrigin.setDestination((String) routesStopFirst[4]);
            }
            component.setTrayectoInfoOrigin(destinationsInfoOrigin);



            List<Object[]> routesStopListEnd = stopRoutesRepository.getRoutesBeetwenTwoStops(
                    tsm.getStopModel().getId(),
                    component.getEndStop()
            );
            DestinationInfoComponentModel destinationsInfoEnd = new DestinationInfoComponentModel();
            if(!routesStopListEnd.isEmpty()){
                Object[] routesStopEnd = routesStopListEnd.get(0);
                destinationsInfoEnd.setId(String.valueOf((int) routesStopEnd[0]));
                destinationsInfoEnd.setDistance(String.valueOf((int) routesStopEnd[1]));
                destinationsInfoEnd.setTime(String.valueOf((int) routesStopEnd[2]));
                destinationsInfoEnd.setPrice(String.valueOf((float) routesStopEnd[3]));
                destinationsInfoEnd.setOrigin((String) routesStopEnd[4]);
                destinationsInfoEnd.setDestination((String) routesStopEnd[5]);
            }
            component.setTrayectoInfoDestination(destinationsInfoEnd);


            transportComponent.add(component);
        }

        return transportComponent;
    }



    public TransportComponentModel getAllInformationOfTransport(Long idTransport){
        return new TransportComponentModel();
    }



}
