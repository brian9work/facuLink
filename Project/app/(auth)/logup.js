import { View, Text, Image } from 'react-native'
import React from 'react'
import Long from '../../constants/Longitude'
import Images from '../../constants/Images'
import { Title } from '../../components/Texts'
import { PrincipalButton, PrincipalButtonText, SecundaryButtonText, TertiaryButtonText } from '../../components/Buttons'

export default function Logup() {
   const long = Long('s')
   return (
      <View className="relative">
         <Image
            source={Images.image1}
            className="w-20 h-20 object-cover"
            style={{ ...long }}
         />
         {/* style={{ ...long }}  */}

         <View
            className="absolute top-0 left-0 w-screen h-full bg-black/60 flex items-end justify-center"
         >
            <View className="flex justify-end z-10 self-end  text-white "
               style={{ width: long.width, height: long.height * .7 }}
            >
               <View className="text-center w-full flex items-center ">
                  <Title mode="dark">Inicio de Sesion</Title>
                  <View className="flex w-[100%] gap-3 mt-5">
                     <PrincipalButton>
                        <View className="w-11/12 mx-auto gap-3 items-center flex flex-row">
                           <Image
                              source={Images.icon}
                              className="object-cover w-12 h-12 ml-0"
                           />
                           <Text className="text-black text-lg font-semibold ">
                              Continuar con Google
                           </Text>
                        </View>
                     </PrincipalButton>
                     <PrincipalButton>
                        <View className="w-11/12 mx-auto gap-3 items-center flex flex-row">
                           <Image
                              source={Images.icon}
                              className="object-cover w-12 h-12 ml-0"
                           />
                           <Text className="text-black text-lg font-semibold ">
                              Continuar con Correo
                           </Text>
                        </View>
                     </PrincipalButton>
                  </View>
                  <View className="w-full flex justify-center items-center gap-3 mt-5 flex-row">
                     <View className="w-[30%] h-0.5 bg-gray-100"></View>
                     <Text className="text-gray-100 font-bold">O</Text>
                     <View className="w-[30%] h-0.5 bg-gray-100"></View>
                  </View>
                  <TertiaryButtonText>Continuar sin iniciar sesion</TertiaryButtonText>
               </View>
            </View>
         </View>
      </View>
   )
}