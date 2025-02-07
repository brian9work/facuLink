import { View, Text, Image } from 'react-native'
import React from 'react'
import Constants from 'expo-constants'
import Images from '../../constants/Images'
import Long from '../../constants/Longitude'
import { SubTitle, Title } from '../../components/Texts'
import { PrincipalButtonText, SecundaryButtonText, TertiaryButtonText } from '../../components/Buttons'


export default function Login() {
   const long = Long('s')
   return (
      <View className="relative">
         <Image
            source={Images.image1}
            className="w-20 h-20 object-cover"
            style={{ ...long }}
         />
         <View
            className="absolute top-0 left-0 w-screen h-full bg-black/60 flex items-end justify-center"
         >
            <View className="flex justify-end z-10 self-end  text-white "
               style={{ width: long.width, height: long.height*.7 }}
            >
               <View className="text-center w-full flex items-center ">
                  <Title>
                     RutaLink
                  </Title>
                  <View className="w-8/12 mx-auto">
                     <SubTitle>
                        Llega desde cualquier facultad desde cualquier lado
                     </SubTitle>
                  </View>
                  <View className="mt-5"></View>
                  <PrincipalButtonText>
                     Inicio de sesion
                  </PrincipalButtonText>
                  <View className="mt-3"></View>
                  <SecundaryButtonText>
                     Registrarse
                  </SecundaryButtonText>
                  <View className="w-full flex justify-center items-center gap-3 mt-5 flex-row">
                     <View className="w-[30%] h-0.5 bg-gray-100"></View>
                     <Text className="text-gray-100 font-bold">O</Text>
                     <View className="w-[30%] h-0.5 bg-gray-100"></View>
                  </View>
                  <TertiaryButtonText>
                     Continuar sin iniciar sesion
                  </TertiaryButtonText>
               </View>
            </View>
         </View>
      </View>
   )
}