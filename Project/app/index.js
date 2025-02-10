import { View, Text, ScrollView, StyleSheet, Pressable } from 'react-native'
import React, { useState } from 'react'
import RouteOfTransport from '../components/home/RouteOfTransport'
import ResultOfTransports from '../components/home/ResultOfTransports'
// import MapView, { PROVIDER_GOOGLE } from 'react-native-maps'
import MapView, { PROVIDER_GOOGLE } from 'react-native-maps';
import AntDesign from '@expo/vector-icons/AntDesign';
import Map from '../components/home/Map'
import BottonCloseMenu from '../components/home/components/BottonCloseMenu';
import Search from '../components/home/Search';

export default function index() {
   const [menu, setMenu] = useState(true)
   return (
      <View className="relative">
         <Search />
         <Map />
         <View className={`
              w-full
              ${menu ? 'mt-[35rem]' : 'mt-[100rem]'}
              bg-gray-100 mx-auto
              rounded-tl-[2rem] rounded-tr-[2rem]
              overflow-hidden
              relative
            `}>
            <BottonCloseMenu menu={menu} setMenu={setMenu} />
            <ScrollView >
               <ResultOfTransports />
               <RouteOfTransport />
            </ScrollView>

         </View>
         {/* <Text>Gola</Text>
     <MapView
       provider={PROVIDER_GOOGLE} // remove if not using Google Maps
       style={{width: 400, height: 400}}
       region={{
         latitude: 37.78825,
         longitude: -122.4324,
         latitudeDelta: 0.015,
         longitudeDelta: 0.0121,
       }}
     >
     </MapView> */}
         {/* <MapView style={StyleSheet.absoluteFill} provider={PROVIDER_GOOGLE}/> */}
         {/* <Text>Hola mundo</Text> */}
         {/* 
      <View className="
      w-full
        mt-[30rem]
        bg-gray-100 mx-auto
        rounded-tl-[3rem] rounded-tr-[3rem]
        ">
        <ScrollView >
          <ResultOfTransports />
          <RouteOfTransport />
        </ScrollView>

      </View> 
      */}
      </View>
   )
}