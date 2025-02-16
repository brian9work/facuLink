import { View, Text, Image } from 'react-native'
import React from 'react'
import Images from '../constants/Images'
import Long from '../constants/Longitude'

export default function account() {
   const long = Long('s')
   return (
      <View className="relative bg-theme-white">
         <Image
            source={Images.image9}
            className="w-20 h-20 object-cover object-center"
            style={{ width: long.width, height: long.height * .25 }}
         />
         <Image
            source={Images.messi}
            className="
               absolute top-[28%] left-[50%] transform -translate-x-1/2
               w-52 h-52 
               object-cover object-center 
               rounded-full
            "
         />
         <Text
            className="pt-20 text-center text-xl font-bold"
         >account@account.com</Text>
         <View className="w-11/12 mx-auto rounded-lg p-3 mt-5">
            <Text
               className="text-xl "
            >gjckjhkkfjh kugkj</Text>
         </View>
      </View>
   )
}