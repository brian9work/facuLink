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

export default function Map() {
   const long = Long('s')
   const [route, setRoute] = React.useState([
      { latitude: 19.58569482681491, longitude: -98.56612045355924, title: "la glorieta" },
      { latitude: 19.590059651663207, longitude: -98.55623741235102, title: "goodyear" },
      { latitude: 19.583318743426126, longitude: -98.53676197804252, title: "hospital general de calpupalpan" },
      { latitude: 19.568616484193765, longitude: -98.50614127372214, title: "san jose" },
      { latitude: 19.528028911216445, longitude: -98.48128959045366, title: "madero" },
      { latitude: 19.51968004294305, longitude: -98.47552846325945, title: "domingo arenas" },
      { latitude: 19.503473153068928, longitude: -98.39517413411234, title: "colonia adolfo lopez mateos" },
      { latitude: 19.485281047210094, longitude: -98.37345646754277, title: "recoba" },
      { latitude: 19.46926490683652, longitude: -98.34702903608117, title: "hueyotlipan" },
      { latitude: 19.476366065304553, longitude: -98.3090865702999, title: "santiago tlalpan" },
      { latitude: 19.482067187260565, longitude: -98.2928777487693, title: "san simeon ximetzingo" },
      { latitude: 19.421638510089895, longitude: -98.21192822766295, title: "xaltocan" },
      { latitude: 19.38750835207665, longitude: -98.17792334147524, title: "paradero la y" },
      { latitude: 19.415226799693915, longitude: -98.15951384562182, title: "aurrera" },
      { latitude: 19.416521817173017, longitude: -98.14915004835883, title: "el azador" },
      { latitude: 19.416062911899722, longitude: -98.14815193021263, title: "michelin" },
      { latitude: 19.414565694806264, longitude: -98.14472942428723, title: "higienicos aneks" },
      { latitude: 19.412077269534358, longitude: -98.1431454812659, title: "atha" },
   ]);

   return (
      <View style={{ width: '100%', height: '100%', position: 'absolute', left: 0, top: 0 }}>

         <View style={{ flex: 1 }}>
            <MapView
               // cacheEnabled={true}

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
               <Polyline
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
               />
               {route.map((item, i) => {
                  return (
                     <Marker
                        key={"markermap-" + i}
                        coordinate={{
                           longitude: item.longitude,
                           latitude: item.latitude,
                        }}
                        title={item.title}
                        description={item.longitude + " " + item.latitude}
                     >
                        <Image
                           source={require('../../assets/marker.png')}
                           style={{ width: 40, height: 40 }}
                        />
                     </Marker>
                  )
               })}
            </MapView>
         </View>
      </View>
   )
}