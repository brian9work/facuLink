import { View, Text, Image, Pressable } from 'react-native'
import React from 'react'
import { Bold, Category, Normal, SubTitle, Title } from '../Texts'
import data from "../../api/transports"
import Images from '../../constants/Images'
import Icons from '../../constants/Icons'
import MaterialIcons from '@expo/vector-icons/MaterialIcons';
import MaterialCommunityIcons from '@expo/vector-icons/MaterialCommunityIcons';
import FontAwesome6 from '@expo/vector-icons/FontAwesome6';

export default function ResultOfTransports() {
    console.log(data)
    return (
        <View>
            <Title>Rutas Disponibles</Title>
            <View className="mt-5 w-10/12 mx-auto">
                {data.map((item, index) => {
                    return (
                        <Pressable
                            className="flex flex-row justify-between items-center gap-2 py-4 border-b border-gray-300"
                            key={index}
                        >
                            <View className="">
                                <View className="flex flex-row items-center gap-2">
                                    <Category>
                                        {item.nameRoute}
                                    </Category>
                                    <Normal className="px-3 py-1 bg-gray-100 capitalize rounded-xl text-sm">{item.typeOfTransport}</Normal>
                                </View>
                                <View className="flex flex-row gap-x-0.5 mt-4 ml-2">
                                    <View className="flex flex-row gap-x-2 ml-3 items-center">
                                        <MaterialIcons name="attach-money" 
                                            size={24} 
                                            className="p-2 bg-common-green/15 rounded-full"
                                            color="#28A745"
                                        />
                                        <Normal className="text-xl">{item.price}</Normal>
                                    </View>
                                    <View className="flex flex-row gap-x2 ml-5 items-center gap-2">
                                        <MaterialCommunityIcons name="clock-time-three-outline" 
                                            size={24} 
                                            className="p-2 bg-common-blue/15 rounded-full"
                                            color="#007BFF"
                                        />
                                        <Normal className="text-xl">{item.time}</Normal>
                                    </View>
                                </View>
                            </View>
                            <View className="flex items-center">
                                <FontAwesome6 name="bus" 
                                    size={24} 
                                    color="#212529" 
                                    className="p-4 bg-theme-black/10 rounded-full"
                                />
                            </View>
                        </Pressable>
                    )
                })}
            </View>

            <Text>ResultOfTransports</Text>
        </View>
    )
}