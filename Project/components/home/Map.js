import { View, Text, StyleSheet, Image } from 'react-native'
// import MapView, { PROVIDER_GOOGLE } from 'react-native-maps'
import React from 'react'
import MapView, { Marker, PROVIDER_GOOGLE } from 'react-native-maps'
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
    // console.log("Long:", long);
    // console.log("MapStyle:", MapStyle);
    // console.log("Marker:", Marker);

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

                    {marcas.map((item, i) => {
                        return (
                            <Marker
                                key={item.id}
                                coordinate={{
                                    longitude: item.longitude,
                                    latitude: item.latitude,
                                }}
                                title="Ubicación"
                                description="Este es un marcador de prueba"
                                // image={require('../../assets/marker.png')}
                            >
                                <Image
                                    source={require('../../assets/marker.png')}
                                    style={{ width: 40, height: 40 }}
                                />

                            </Marker>
                        )
                    })}

                    <Marker
                        coordinate={{
                            latitude: 19.414693337816825,
                            longitude: -98.14004773086025
                        }}
                        title="Ubicación"
                        description="Este es un marcador de prueba"
                    />

                    <Marker
                        title={"sds"}
                        key={"marker-2"}
                        coordinate={{
                            longitude: -98.14004773086025,
                            latitude: 19.414693337816825,
                        }}
                    />
                </MapView>
            </View>
        </View>
    )
}