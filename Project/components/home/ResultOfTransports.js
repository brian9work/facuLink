import { View, Text, Image, Pressable } from 'react-native'
import React from 'react'
import { Bold, Category, Normal, SubTitle, Title } from '../Texts'
import data from "../../api/transports"
import MaterialIcons from '@expo/vector-icons/MaterialIcons';
import MaterialCommunityIcons from '@expo/vector-icons/MaterialCommunityIcons';
import FontAwesome6 from '@expo/vector-icons/FontAwesome6';
import Images from '../../constants/Images';

export function SkeletonResultOfTransports() {
    const Skeleton = () => {
        return (
            <View
                className="flex flex-row justify-between items-center gap-2 py-4 border-b border-gray-300"
            >
                <View className="">
                    <View className="flex flex-row items-center gap-2">
                        <View className="w-5/12 bg-gray-300 h-6 rounded-xl"></View>
                        <View className="w-2/12 bg-gray-300 h-4 rounded-xl"></View>
                    </View>
                    <View className="flex flex-row gap-x-0.5 mt-2 ml-2">
                        <View className="flex flex-row gap-x-2 ml-3 items-center">
                            <View className="w-10 h-10 bg-common-green/15 rounded-full">
                            </View>
                            <View className="w-3/12 bg-gray-300 h-4 rounded-xl"></View>
                        </View>
                        <View className="flex flex-row gap-x-2 ml-3 items-center">
                            <View className="w-10 h-10 bg-common-blue/15 rounded-full">
                            </View>
                            <View className="w-3/12 bg-gray-300 h-4 rounded-xl"></View>
                        </View>
                    </View>
                </View>
                <View className="flex items-center w-12 h-12 bg-theme-black/10 rounded-full">
                </View>
            </View>
        )
    }

    return (
        <>
            <Skeleton />
            <Skeleton />
            <Skeleton />
            <Skeleton />
            <Skeleton />
        </>
    )
}

export default function ResultOfTransports({ data }) {
    return (
        <View className="pb-80 ">
            <Image
                source={Images.image}
                className="
                        object-cover object-center w-full h-52 ml-0
                    "
            />
            <View className="py-5 px-6 ">
                <Title>Rutas Disponibles</Title>
                <Text className="text-xl mt-5">Seleccione una ruta </Text>
                <View className="mt-2 ">
                    {data.length === 0 ? <SkeletonResultOfTransports />
                        :
                        data.map((item, index) => {
                            return (
                                <Pressable
                                    className="flex flex-row justify-between items-center gap-2 py-4 border-b border-gray-300"
                                    key={index}
                                >
                                    <View className="">
                                        <View className="flex flex-row items-center gap-2">
                                            <Category>
                                                {item.transport_name}
                                            </Category>
                                            <Normal className="px-3 py-1 bg-gray-100 capitalize rounded-xl text-sm">{item.typeOfTransport}</Normal>
                                        </View>
                                        <View className="flex flex-row gap-x-0.5 mt-2 ml-2">
                                            <View className="flex flex-row gap-x-2 ml-3 items-center">
                                                <MaterialIcons name="attach-money"
                                                    size={20}
                                                    className="p-2 bg-common-green/15 rounded-full"
                                                    color="#28A745"
                                                />
                                                <Normal className="text-lg">{item.price}</Normal>
                                            </View>
                                            <View className="flex flex-row gap-x2 ml-5 items-center gap-2">
                                                <MaterialCommunityIcons name="clock-time-three-outline"
                                                    size={20}
                                                    className="p-2 bg-common-blue/15 rounded-full"
                                                    color="#007BFF"
                                                />
                                                <Normal className="text-lg">{item.frequency}</Normal>
                                            </View>
                                        </View>
                                    </View>
                                    <View className="flex items-center">
                                        <FontAwesome6 name="bus"
                                            size={20}
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