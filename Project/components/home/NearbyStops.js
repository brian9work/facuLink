import { View, Text, Image, Pressable } from 'react-native'
import React from 'react'
import { Bold, Category, Normal, SubTitle, Title } from '../Texts'
import data from "../../api/transports"
import MaterialIcons from '@expo/vector-icons/MaterialIcons';
import MaterialCommunityIcons from '@expo/vector-icons/MaterialCommunityIcons';
import FontAwesome6 from '@expo/vector-icons/FontAwesome6';
import Images from '../../constants/Images';
import FontAwesome5 from '@expo/vector-icons/FontAwesome5';
import { SkeletonResultOfTransports } from './ResultOfTransports';

export default function NearbyStops({ data }) {
    return (
        <View className="pb-80 ">
            {/* <Image
                source={Images.image}
                className="
                        object-cover object-center w-full h-52 ml-0
                    "
            /> */}
            <View className="py-5 px-6 ">
                <Title>Bases cercanas</Title>
                <Text className="text-xl mt-5">Selecciona una ruta </Text>

                <View className="mt-2 ">
                    {data.length === 0 ? <SkeletonResultOfTransports />
                        :
                        data.map((item, index) => {
                            return (
                                <Pressable
                                    className="flex flex-row justify-between items-center gap-2 py-4 border-b border-gray-300"
                                    key={`baseEnable-${item.longitude}-${item.latitude}`}
                                >
                                    <View className="">
                                        <View className="flex flex-row items-center gap-2 max-w-96">
                                            <Category>
                                                {item.stopName}
                                            </Category>
                                        </View>
                                        <View className="flex flex-row gap-x-0.5 mt-2 ml-2">
                                            <View className="flex flex-row gap-x2 ml-5 items-center gap-2">
                                                <FontAwesome5 name="walking"
                                                    size={16}
                                                    className="py-2 px-3 bg-common-blue/15 rounded-full"
                                                    color="#007BFF"
                                                />
                                                <Normal className="text-lg">{parseFloat(item.distance).toFixed(0)} m.</Normal>
                                            </View>
                                        </View>
                                    </View>
                                    <View className="flex items-center">
                                        <MaterialCommunityIcons
                                            name="bus-stop-uncovered"
                                            size={24}
                                            color="#212529"
                                            className="p-2 bg-theme-black/10 rounded-full"
                                        />
                                    </View>
                                </Pressable>
                            )
                        })}
                </View>
            </View>
        </View>
    )
}