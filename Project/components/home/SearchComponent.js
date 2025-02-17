import { View, Text, Image, Pressable, ScrollView, TextInput, BackHandler } from 'react-native'
import React, { useState, useEffect } from 'react'
import { Alert } from "react-native";
import { useNavigation } from "@react-navigation/native";
import { Link, Stack } from "expo-router";
import AntDesign from '@expo/vector-icons/AntDesign'
import FontAwesome from '@expo/vector-icons/FontAwesome';
import Images from '../../constants/Images'
import { Bold, Category, SubTitle } from '../Texts';
import facultades from '../../api/facultades.json'
import FontAwesome5 from '@expo/vector-icons/FontAwesome5';
import Entypo from '@expo/vector-icons/Entypo';

export default function SearchComponent() {
   const [search, onChangeSearch] = useState('');
   const [menuActive, setMenuActive] = useState(false);

   // const navigation = useNavigation();
   // useEffect(() => {
   //    const backAction = () => {
   //       setMenuActive(false)
   //   Alert.alert("¡Espera!", "¿Quieres salir de la aplicación?", [
   //     { text: "Cancelar", style: "cancel", onPress: () => {} },
   //     { text: "Salir", onPress: () => BackHandler.exitApp() },
   //   ]);
   //   return true; // Evitar que la app cierre automáticamente
   // };

   //    const backHandler = BackHandler.addEventListener("hardwareBackPress", backAction);

   //    return () => backHandler.remove();
   //  }, []);



   return (
      <View className="absolute top-3 left-0 z-30 w-full ">
         <View className="
               w-11/12 mx-auto bg-theme-white 
               rounded-full p-1 
               flex flex-row items-center
            ">
            <Link asChild href="/account">
               <Pressable>
                  <Image
                     source={Images.messi}
                     className="
                  object-cover object-center 
                  w-12 h-12 ml-0
                  rounded-full
                  "
                  />
               </Pressable>
            </Link>
            <View className="text-xl ml-2 w-[76%]">
               <TextInput
                  onPressOut={() => setMenuActive(!menuActive)}
                  className="text-xl w-full"
                  placeholder='Buscar facultad ...'
                  onChangeText={onChangeSearch}
                  value={search}
               />

            </View>
            {/* <Text className="text-xl ml-2 w-[76%]">Buscar ... </Text> */}
            <FontAwesome name="search"
               size={25}
               color="black"
               className="ml-2"
            />
         </View>
         <View className={`
               ${menuActive ? 'h-[93vh]' : 'h-0'}
               bg-theme-white overflow-hidden
               relative
            `}>
            {/* <View className="h-[0] bg-theme-white overflow-hidden"> */}
            <View className="flex flex-row items-center pt-5 pb-3 w-11/12 mx-auto">
               <Text className="text-lg">Facultades disponibles: </Text>
            </View>
            <Pressable
               onPressOut={() => {
                  setMenuActive(!menuActive)
                  console.log('close')
               }}
               className="absolute bottom-5 right-5 bg-gray-200 rounded-full p-2 z-50"
            >
               <Entypo name="chevron-left" size={32} color={`"#28A745"`} />
            </Pressable>
            <ScrollView className="w-11/12 mx-auto ">
               {facultades.map((facultad, index) => {
                  return (
                     <View key={index} className="flex flex-row gap-3 items-center p-3 rounded-md my-1 border-b-2 border-gray-200">
                        <View className="bg-gray-200 p-2 rounded-full">
                           <FontAwesome5 name="university" size={24} color="black" />
                        </View>
                        <View>
                           <View className="flex flex-row items-center">
                              <Bold className={"text-lg "}>{facultad.acronym}</Bold>
                              <Text className={"text-md bg-gray-200 py-1 px-2 ml-3 rounded-full"}>{facultad.degree.length} opciones</Text>
                           </View>
                           <Text className={"text-md mt-1 "}>{facultad.faculty}</Text>
                        </View>
                     </View>
                  )
               })}
               <View className="h-96">
               </View>
            </ScrollView>
         </View>
      </View>
   )
}