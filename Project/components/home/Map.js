import { View, Text, StyleSheet, Image } from 'react-native'
// import MapView, { PROVIDER_GOOGLE } from 'react-native-maps'
import React from 'react'
import MapView, { Marker, Polyline, PROVIDER_GOOGLE } from 'react-native-maps'
import Long from '../../constants/Longitude'
import marcas from "../../local/Rutas.json"

const MapStyle = [
   { "featureType": "administrative", "elementType": "geometry", "stylers": [{ "visibility": "off" }] },
   { "featureType": "poi", "stylers": [{ "visibility": "off" }] },
   { "featureType": "road", "elementType": "labels.icon", "stylers": [{ "visibility": "off" }] },
   { "featureType": "transit", "stylers": [{ "visibility": "off" }] }
];

export default function Map({ stops, setSelectedStop }) {
   const long = Long('s')
   return (
      <View style={{ width: '100%', height: '100%', position: 'absolute', left: 0, top: 0 }}>

         <View style={{ flex: 1 }}>
            <MapView
               provider={PROVIDER_GOOGLE}
               style={{ width: long.width, height: long.height }}
               initialRegion={{
                  latitude: 19.414693337816825,
                  longitude: -98.14004773086025,
                  latitudeDelta: 0.01,
                  longitudeDelta: 0.01
               }}
               customMapStyle={MapStyle}
               showsUserLocation={true}
               showsMyLocationButton={true}
            >

               {stops.length === 0 ? <></>
                  :
                  stops.map((stop, i) => {
                     return (
                        <Marker
                           key={"markerTrue-" + stop.longitude + " - " + stop.latitude}
                           coordinate={{
                              longitude: parseFloat(stop.longitude),
                              latitude: parseFloat(stop.latitude),
                           }}
                           title={stop.stopName}
                           description={stop.longitude + " - " + stop.latitude}
                           onPress={() => {
                              setSelectedStop(stop)
                              // console.log(stop)
                           }}
                        >
                           <Image
                              source={require('../../assets/marker.png')}
                              style={{ width: 40, height: 40 }}
                           />
                        </Marker>
                     )
                  })
               }
            </MapView>
         </View>
      </View>
   )
}