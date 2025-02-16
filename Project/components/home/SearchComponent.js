import { View, Text, Image, Pressable } from 'react-native'
import React from 'react'
import { Link, Stack } from "expo-router";
import AntDesign from '@expo/vector-icons/AntDesign'
import FontAwesome from '@expo/vector-icons/FontAwesome';
import Images from '../../constants/Images'

export default function SearchComponent() {
   return (
      <View className="absolute top-3 left-0 z-50 w-full ">
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
            <Text className="text-xl ml-2 w-[76%]">Buscar ... </Text>
            <FontAwesome name="search"
               size={25}
               color="black"
               className="ml-2"
            />
         </View>
      </View>
   )
}