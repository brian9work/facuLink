import { View, Text, ScrollView, StyleSheet, Pressable } from 'react-native'
import React, { useEffect, useState } from 'react'
import RouteOfTransport from '../components/home/RouteOfTransport'
import ResultOfTransports from '../components/home/ResultOfTransports'
// import MapView, { PROVIDER_GOOGLE } from 'react-native-maps'
import MapView, { PROVIDER_GOOGLE } from 'react-native-maps';
import AntDesign from '@expo/vector-icons/AntDesign';
import Map from '../components/home/Map'
import BottonCloseMenu from '../components/home/components/BottonCloseMenu';
import Search from '../components/home/SearchComponent';
import SearchComponent from '../components/home/SearchComponent';
import Api from '../api/Api';
import useHttpRequest from '../hooks/Responses';

export default function index() {
   const [menu, setMenu] = useState(true)
   const [search, setSearch] = useState(false)
   const [stops, setstops] = useState([])
   const [apiRoute, setApiRoute] = useState(Api.static.getStops.stops1000)

   const getStops = async (route) => {
      const response = await fetch(route, {
         method: 'GET',
         headers: {
            'Content-Type': 'application/json',
         }
      })
      const data = await response.json()
      // console.log(data)
      setstops(data.data)
      // const response = await useHttpRequest.sendRequest('GET', Api.static.getStops.stops100)
      console.log("_______________")
      // setstops(response)
   }

   useEffect(() => {
      getStops(apiRoute)
   }, [apiRoute])


   return (
      <View className="relative">
         <SearchComponent />
         <Map stops={stops} />
         <View className={`
              w-full
              ${menu ? 'mt-[25rem]' : 'mt-[100rem]'}
              bg-gray-100 mx-auto
              rounded-tl-[1.5rem] rounded-tr-[1.5rem]
              relative
              `}>
            {/* // overflow-hidden */}
            <BottonCloseMenu menu={menu} setMenu={setMenu} />
            <ScrollView >
               <View className="flex flex-row gap-2">
                  <Pressable 
                     className="bg-gray-200 p-2 rounded-md"
                     onPressOut={() => { 
                        setstops([])
                        setApiRoute(Api.static.getStops.stops100)
                     }}
                  >
                     <Text>
                        100m
                     </Text>
                  </Pressable>
                  <Pressable 
                     className="bg-gray-200 p-2 rounded-md"
                     onPressOut={() => { 
                        setstops([])
                        setApiRoute(Api.static.getStops.stops250)
                     }}
                  >
                     <Text>
                        250m
                     </Text>
                  </Pressable>
                  <Pressable 
                     className="bg-gray-200 p-2 rounded-md"
                     onPressOut={() => { 
                        setstops([])
                        setApiRoute(Api.static.getStops.stops500)
                     }}
                  >
                     <Text>
                        500m
                     </Text>
                  </Pressable>
                  <Pressable 
                     className="bg-gray-200 p-2 rounded-md"
                     onPressOut={() => { 
                        setstops([])
                        setApiRoute(Api.static.getStops.stops1000)
                     }}
                  >
                     <Text>
                        1000m
                     </Text>
                  </Pressable>
               </View>
               <ResultOfTransports data={stops} />
               {/* <RouteOfTransport /> */}
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