import { View, Text, StyleSheet } from 'react-native'
// import MapView, { PROVIDER_GOOGLE } from 'react-native-maps'
import React from 'react'
import MapView, { PROVIDER_GOOGLE } from 'react-native-maps'
import Long from '../../constants/Longitude'

export default function Map() {
    const long = Long('s')
    return (
        <View className="w-full h-full absolute left-0 top-0">

            <View style={{ flex: 1 }}>
                <MapView
                    provider={PROVIDER_GOOGLE} // remove if not using Google Maps
                    style={{ width: long.width, height: long.height }}
                    region={{
                        latitude: 19.414693337816825,
                        longitude: -98.14004773086025,
                        latitudeDelta: 0.015,
                        longitudeDelta: 0.0121,
                    }}
                />
                {/* <MapView style={StyleSheet.absoluteFill} provider={PROVIDER_GOOGLE}/> */}
                <Text>Find del mapa</Text>
            </View>
        </View>
    )
}