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
public class TransportStopService {
    @Autowired
    ITransportStopRepository transportStopRepository;
    @Autowired
    IRouteCoordinatesRepository routeCoordinatesRepository;
    @Autowired
    IStopRoutesRepository stopRoutesRepository;

    public List<TransportComponentModel> getStops(Long idStop) {
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




            List<RouteCoordinatesModel> routeCoordinates = routeCoordinatesRepository.findByIdRoute(component.getTransportId());
            List<RouteComponentModel> routes = new ArrayList<>();
            for (RouteCoordinatesModel rc : routeCoordinates) {
                RouteComponentModel RouteLocal = new RouteComponentModel();
                RouteLocal.setStopId(rc.getId());
                RouteLocal.setLatitude(rc.getLatitude());
                RouteLocal.setLongitude(rc.getLongitude());

                routes.add(RouteLocal);
            }
            component.setRoute(routes);




            // Agregar los trayectos
            List<StopRouteModel> routesStopFirst = stopRoutesRepository.findByStopFrom(component.getFirstStop());
            List<StopRoutesExtraInfoComponentModel> stopsRouteInfoFirst = new ArrayList<>();
            for (StopRouteModel routeStopInd : routesStopFirst) {
                StopRoutesExtraInfoComponentModel newstopsRouteInfo = new StopRoutesExtraInfoComponentModel();
                newstopsRouteInfo.setStopRouteId(routeStopInd.getId());
                newstopsRouteInfo.setDistance(routeStopInd.getDistance());
                newstopsRouteInfo.setTime(routeStopInd.getTime());
                newstopsRouteInfo.setPrice(routeStopInd.getPrice());

                newstopsRouteInfo.setStopFromId(routeStopInd.getStopFrom().getId());
                newstopsRouteInfo.setStopFromName(routeStopInd.getStopFrom().getName());

                newstopsRouteInfo.setStopToId(routeStopInd.getStopTo().getId());
                newstopsRouteInfo.setStopToName(routeStopInd.getStopTo().getName());

                stopsRouteInfoFirst.add(newstopsRouteInfo);
            }
            StopRoutesExtraInfoComponentModel newStopsRouteInfoOrigin = stopsRouteInfoFirst.get(stopsRouteInfoFirst.size()-1);
            DestinationInfoComponentModel destinationInfoOrigin = new DestinationInfoComponentModel();

            destinationInfoOrigin.setPrice(newStopsRouteInfoOrigin.getPrice());
            destinationInfoOrigin.setOrigin(newStopsRouteInfoOrigin.getStopFromName());
            destinationInfoOrigin.setTime(newStopsRouteInfoOrigin.getTime());
            destinationInfoOrigin.setDistance(newStopsRouteInfoOrigin.getDistance());
            destinationInfoOrigin.setDestination(newStopsRouteInfoOrigin.getStopToName());
            component.setTrayectoInfoOrigin(destinationInfoOrigin);

            List<StopRouteModel> routesStopEnd = stopRoutesRepository.findByStopFrom(component.getEndStop());
            List<StopRoutesExtraInfoComponentModel> stopsRouteInfoEnd = new ArrayList<>();
            for (StopRouteModel routeStopInd : routesStopEnd) {
                StopRoutesExtraInfoComponentModel newstopsRouteInfo = new StopRoutesExtraInfoComponentModel();
                newstopsRouteInfo.setStopRouteId(routeStopInd.getId());
                newstopsRouteInfo.setDistance(routeStopInd.getDistance());
                newstopsRouteInfo.setTime(routeStopInd.getTime());
                newstopsRouteInfo.setPrice(routeStopInd.getPrice());

                newstopsRouteInfo.setStopFromId(routeStopInd.getStopFrom().getId());
                newstopsRouteInfo.setStopFromName(routeStopInd.getStopFrom().getName());

                newstopsRouteInfo.setStopToId(routeStopInd.getStopTo().getId());
                newstopsRouteInfo.setStopToName(routeStopInd.getStopTo().getName());

                stopsRouteInfoEnd.add(newstopsRouteInfo);
            }
            StopRoutesExtraInfoComponentModel newStopsRouteInfoEnd = stopsRouteInfoEnd.get(stopsRouteInfoEnd.size()-1);
            DestinationInfoComponentModel destinationInfoEnd = new DestinationInfoComponentModel();

            destinationInfoEnd.setPrice(newStopsRouteInfoEnd.getPrice());
            destinationInfoEnd.setOrigin(newStopsRouteInfoEnd.getStopFromName());
            destinationInfoEnd.setTime(newStopsRouteInfoEnd.getTime());
            destinationInfoEnd.setDistance(newStopsRouteInfoEnd.getDistance());
            destinationInfoEnd.setDestination(newStopsRouteInfoEnd.getStopToName());
            component.setTrayectoInfoDestination(destinationInfoEnd);

            component.setTrayectoOrigin(stopsRouteInfoFirst);
            component.setTrayectoDestination(stopsRouteInfoEnd);





            List<TransportStopModel> stopsByTransport = transportStopRepository.getStopsByTransport(component.getTransportId());
            List<TransportStopsComponentModel> newStopsByTransport = new ArrayList<>();
            for (TransportStopModel sbt : stopsByTransport) {
                TransportStopsComponentModel transportstopsLocal = new TransportStopsComponentModel();

                transportstopsLocal.setStopId(sbt.getStopModel().getId());
                transportstopsLocal.setLongitude(sbt.getStopModel().getLongitude());
                transportstopsLocal.setLatitude(sbt.getStopModel().getLatitude());
                transportstopsLocal.setName(sbt.getStopModel().getName());
                transportstopsLocal.setImagen(sbt.getStopModel().getImagen());

                newStopsByTransport.add(transportstopsLocal);
            }
            component.setTransportStops(newStopsByTransport);

            transportComponent.add(component);
        }


        return transportComponent;
    }
}
