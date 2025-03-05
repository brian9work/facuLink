import React, { useState } from 'react'
import MapView, { MapMarker, Marker, Polyline, PROVIDER_GOOGLE } from 'react-native-maps'
import { StatusBar } from 'expo-status-bar';
import { StyleSheet, Text, View, Dimensions, Image } from 'react-native';
import "./global.css"

const MapStyle = [
   { "featureType": "administrative", "elementType": "geometry", "stylers": [{ "visibility": "off" }] },
   { "featureType": "poi", "stylers": [{ "visibility": "off" }] },
   { "featureType": "road", "elementType": "labels.icon", "stylers": [{ "visibility": "off" }] },
   { "featureType": "transit", "stylers": [{ "visibility": "off" }] }
];

export default function App() {
   const [stops, setStops] = useState({
      "database": "facu_link",
      "data": [
         {
            "id_stop": "31",
            "longitude": "19.41312615065407",
            "latitude": "-98.13948520478034",
            "stop_name": "BRIDGESTONE",
            "stop_imagen": null,
            "id_transport": "5",
            "frequency": "15",
            "transport_name": "Apizaco - Tetla",
            "transport_imagen": "",
            "origin": "Apizaco",
            "destination": "Tetla",
            "id_line_of_transport": "1",
            "line_of_transport_name": "atha",
            "complete_name": "Autotransportes Tlaxcala, Apizaco, Huamantla",
            "line_of_transport_imagen": "",
            "id_type_of_transport": "1",
            "type_of_transport_name": "combi",
            "type_of_transport_imagen": "",
            "distance_in_meters": "22.04993385989039"
         },
         {
            "id_stop": "31",
            "longitude": "19.41312615065407",
            "latitude": "-98.13948520478034",
            "stop_name": "BRIDGESTONE",
            "stop_imagen": null,
            "id_transport": "6",
            "frequency": "30",
            "transport_name": "Apizaco - Coporo",
            "transport_imagen": "",
            "origin": "Apizaco",
            "destination": "Coporo",
            "id_line_of_transport": "1",
            "line_of_transport_name": "atha",
            "complete_name": "Autotransportes Tlaxcala, Apizaco, Huamantla",
            "line_of_transport_imagen": "",
            "id_type_of_transport": "1",
            "type_of_transport_name": "combi",
            "type_of_transport_imagen": "",
            "distance_in_meters": "22.04993385989039"
         },
         {
            "id_stop": "31",
            "longitude": "19.41312615065407",
            "latitude": "-98.13948520478034",
            "stop_name": "BRIDGESTONE",
            "stop_imagen": null,
            "id_transport": "7",
            "frequency": "30",
            "transport_name": "Apizaco - Flores",
            "transport_imagen": "",
            "origin": "Apizaco",
            "destination": "Flores",
            "id_line_of_transport": "1",
            "line_of_transport_name": "atha",
            "complete_name": "Autotransportes Tlaxcala, Apizaco, Huamantla",
            "line_of_transport_imagen": "",
            "id_type_of_transport": "1",
            "type_of_transport_name": "combi",
            "type_of_transport_imagen": "",
            "distance_in_meters": "22.04993385989039"
         },
         {
            "id_stop": "28",
            "longitude": "19.409902564878873",
            "latitude": "-98.14226970398333",
            "stop_name": "Av. Hidalgo x C. Hidalgo",
            "stop_imagen": null,
            "id_transport": "5",
            "frequency": "15",
            "transport_name": "Apizaco - Tetla",
            "transport_imagen": "",
            "origin": "Apizaco",
            "destination": "Tetla",
            "id_line_of_transport": "1",
            "line_of_transport_name": "atha",
            "complete_name": "Autotransportes Tlaxcala, Apizaco, Huamantla",
            "line_of_transport_imagen": "",
            "id_type_of_transport": "1",
            "type_of_transport_name": "combi",
            "type_of_transport_imagen": "",
            "distance_in_meters": "72.35574514059009"
         },
         {
            "id_stop": "28",
            "longitude": "19.409902564878873",
            "latitude": "-98.14226970398333",
            "stop_name": "Av. Hidalgo x C. Hidalgo",
            "stop_imagen": null,
            "id_transport": "6",
            "frequency": "30",
            "transport_name": "Apizaco - Coporo",
            "transport_imagen": "",
            "origin": "Apizaco",
            "destination": "Coporo",
            "id_line_of_transport": "1",
            "line_of_transport_name": "atha",
            "complete_name": "Autotransportes Tlaxcala, Apizaco, Huamantla",
            "line_of_transport_imagen": "",
            "id_type_of_transport": "1",
            "type_of_transport_name": "combi",
            "type_of_transport_imagen": "",
            "distance_in_meters": "72.35574514059009"
         },
         {
            "id_stop": "28",
            "longitude": "19.409902564878873",
            "latitude": "-98.14226970398333",
            "stop_name": "Av. Hidalgo x C. Hidalgo",
            "stop_imagen": null,
            "id_transport": "7",
            "frequency": "30",
            "transport_name": "Apizaco - Flores",
            "transport_imagen": "",
            "origin": "Apizaco",
            "destination": "Flores",
            "id_line_of_transport": "1",
            "line_of_transport_name": "atha",
            "complete_name": "Autotransportes Tlaxcala, Apizaco, Huamantla",
            "line_of_transport_imagen": "",
            "id_type_of_transport": "1",
            "type_of_transport_name": "combi",
            "type_of_transport_imagen": "",
            "distance_in_meters": "72.35574514059009"
         },
         {
            "id_stop": "32",
            "longitude": "19.414921631387042",
            "latitude": "-98.1385478498916",
            "stop_name": "Paleteria",
            "stop_imagen": null,
            "id_transport": "5",
            "frequency": "15",
            "transport_name": "Apizaco - Tetla",
            "transport_imagen": "",
            "origin": "Apizaco",
            "destination": "Tetla",
            "id_line_of_transport": "1",
            "line_of_transport_name": "atha",
            "complete_name": "Autotransportes Tlaxcala, Apizaco, Huamantla",
            "line_of_transport_imagen": "",
            "id_type_of_transport": "1",
            "type_of_transport_name": "combi",
            "type_of_transport_imagen": "",
            "distance_in_meters": "188.7989359370717"
         },
         {
            "id_stop": "32",
            "longitude": "19.414921631387042",
            "latitude": "-98.1385478498916",
            "stop_name": "Paleteria",
            "stop_imagen": null,
            "id_transport": "6",
            "frequency": "30",
            "transport_name": "Apizaco - Coporo",
            "transport_imagen": "",
            "origin": "Apizaco",
            "destination": "Coporo",
            "id_line_of_transport": "1",
            "line_of_transport_name": "atha",
            "complete_name": "Autotransportes Tlaxcala, Apizaco, Huamantla",
            "line_of_transport_imagen": "",
            "id_type_of_transport": "1",
            "type_of_transport_name": "combi",
            "type_of_transport_imagen": "",
            "distance_in_meters": "188.7989359370717"
         },
         {
            "id_stop": "32",
            "longitude": "19.414921631387042",
            "latitude": "-98.1385478498916",
            "stop_name": "Paleteria",
            "stop_imagen": null,
            "id_transport": "7",
            "frequency": "30",
            "transport_name": "Apizaco - Flores",
            "transport_imagen": "",
            "origin": "Apizaco",
            "destination": "Flores",
            "id_line_of_transport": "1",
            "line_of_transport_name": "atha",
            "complete_name": "Autotransportes Tlaxcala, Apizaco, Huamantla",
            "line_of_transport_imagen": "",
            "id_type_of_transport": "1",
            "type_of_transport_name": "combi",
            "type_of_transport_imagen": "",
            "distance_in_meters": "188.7989359370717"
         }
      ]
   })

   const long = Dimensions.get('screen');
   return (
      <View className='bg-theme-white h-full flex items-center justify-center'>
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
            <MapMarker
               coordinate={{
                  longitude: 19.41514082532041,
                  latitude: -98.14024764753933,
               }}
               title={"My location"}
            >
            </MapMarker>

            {/* <Polyline
               coordinates={[
                  { latitude: 19.4905751, longitude: -98.53916 },
                  { latitude: 19.4927188, longitude: -98.53758 },
                  { latitude: 19.4918528, longitude: -98.53587 },
                  { latitude: 19.4935400, longitude: -98.53482 },
                  { latitude: 19.4953832, longitude: -98.53370 },
                  { latitude: 19.4962922, longitude: -98.53312 },
                  { latitude: 19.4975083, longitude: -98.53143 },
                  { latitude: 19.4994506, longitude: -98.52827 },
                  { latitude: 19.5013814, longitude: -98.52461 },
                  { latitude: 19.5043241, longitude: -98.51915 },
                  { latitude: 19.5068163, longitude: -98.51455 },
                  { latitude: 19.5105613, longitude: -98.50755 },
                  { latitude: 19.5144135, longitude: -98.50050 },
                  { latitude: 19.5176873, longitude: -98.49456 },
                  { latitude: 19.5192349, longitude: -98.49242 },
                  { latitude: 19.5206635, longitude: -98.49053 },
                  { latitude: 19.5221345, longitude: -98.48872 },
                  { latitude: 19.5247025, longitude: -98.48532 },
                  { latitude: 19.5263861, longitude: -98.48336 },
                  { latitude: 19.5280697, longitude: -98.48120 },
                  { latitude: 19.5309057, longitude: -98.48292 },
                  { latitude: 19.5369402, longitude: -98.48671 },
                  { latitude: 19.5420023, longitude: -98.48971 },
                  { latitude: 19.5489640, longitude: -98.49406 },
                  { latitude: 19.5564183, longitude: -98.49865 },
                  { latitude: 19.5628023, longitude: -98.50257 },
                  { latitude: 19.5679597, longitude: -98.50576 },
                  { latitude: 19.5703641, longitude: -98.50718 },
                  { latitude: 19.5720832, longitude: -98.50796 },
                  { latitude: 19.5726963, longitude: -98.50837 },
                  { latitude: 19.5730690, longitude: -98.50864 },
                  { latitude: 19.5734537, longitude: -98.50916 },
                  { latitude: 19.5742952, longitude: -98.51136 },
                  { latitude: 19.5751126, longitude: -98.51365 },
                  { latitude: 19.5794042, longitude: -98.52556 },
                  { latitude: 19.5826739, longitude: -98.53478 },
                  { latitude: 19.5846271, longitude: -98.54037 },
                  { latitude: 19.5867141, longitude: -98.54625 },
                  { latitude: 19.5884295, longitude: -98.55145 },
                  { latitude: 19.5901738, longitude: -98.55623 },
                  { latitude: 19.5884298, longitude: -98.55681 },
                  { latitude: 19.5872862, longitude: -98.55712 },
                  { latitude: 19.5858925, longitude: -98.55757 },
                  { latitude: 19.5841842, longitude: -98.55747 },
                  { latitude: 19.5824188, longitude: -98.55713 },
                  { latitude: 19.5811965, longitude: -98.55701 },
                  { latitude: 19.5811751, longitude: -98.55757 },
                  { latitude: 19.5822544, longitude: -98.55950 },
                  { latitude: 19.5828548, longitude: -98.56077 },
                  { latitude: 19.5836696, longitude: -98.56220 },
                  { latitude: 19.5846274, longitude: -98.56417 },
                  { latitude: 19.5851920, longitude: -98.56524 },
                  { latitude: 19.5856852, longitude: -98.56590 }
               ]}
               strokeColor="black"
               strokeWidth={3}
            /> */}
            <Polyline
               coordinates={[
                  {  latitude: 19.41312615065407,
                     longitude: -98.13948520478034 
                  },
                  {  latitude: 19.41312615065407,
                     longitude: -98.13948520478034 
                  },
                  {  latitude: 19.41312615065407,
                     longitude: -98.13948520478034 
                  },
                  {  latitude: 19.409902564878873,
                     longitude: -98.14226970398333 
                  },
                  {  latitude: 19.409902564878873,
                     longitude: -98.14226970398333
                   }

               ]}
               strokeColor="black"
               strokeWidth={10}
            />

            {stops.data.map((stop, i) => {
               console.log(stop.longitude + " - " + stop.latitude)
               return (
                  <MapMarker
                     key={"markerTrue-" + i}
                     coordinate={{
                        longitude: parseFloat(stop.latitude),
                        latitude: parseFloat(stop.longitude),
                     }}
                     title={stop.stop_name}
                     description={stop.longitude + " - " + stop.latitude}
                  >
                     <Image
                        source={require('./assets/icon.png')}
                        style={{ width: 40, height: 40 }}
                     />
                  </MapMarker>
               )
            })
            }
         </MapView>
      </View>
   );
}

