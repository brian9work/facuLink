import { View, Text, Image, Pressable } from 'react-native'
import React, { useEffect, useState } from 'react'
import { Bold, Category, Normal, SubTitle, Title } from '../Texts'
import data from "../../api/transports"
import MaterialIcons from '@expo/vector-icons/MaterialIcons';
import MaterialCommunityIcons from '@expo/vector-icons/MaterialCommunityIcons';
import FontAwesome6 from '@expo/vector-icons/FontAwesome6';
import Images from '../../constants/Images';
import FontAwesome5 from '@expo/vector-icons/FontAwesome5';
import { SkeletonResultOfTransports } from './ResultOfTransports';
import Api from '../../api/Api';

export default function SelectedStop({ data }) {
    if (data.length === 0) {
        return <View><Text>No hay base seleccionada</Text></View>
    }

    const [stops, setStops] = useState([])
    const [apiRoute, setApiRoute] = useState(Api.nearby.selectedStop(data.stopId))

    const getStops = async (route) => {
        console.log(route)
        const response = await fetch(route, {
            method: 'GET',
            headers: {
                'Content-Type': 'application/json',
            }
        })
        const data = await response.json()
        setStops(data)
        // const response = await useHttpRequest.sendRequest('GET', Api.static.getStops.stops100)
        console.log("_______________")
        // setStops(response)
    }

    useEffect(() => {
        getStops(apiRoute)
    }, [apiRoute])
    console.log(data)
    return (
        <View className="pb-80 ">
            {/* <Image
                source={Images.image}
                className="
                        object-cover object-center w-full h-52 ml-0
                    "
            /> */}
            <View className="py-5 px-6 ">
                <Title>Transporte Disponibles</Title>
                <Text className="text-xl mt-5">Transportes de:</Text>
                    <Text className="font-bold capitalize">{data.stopName}</Text>
                <View className="mt-2 ">
                    {console.log(stops)}
                    {stops.length === 0 ? <SkeletonResultOfTransports />
                        :
                        stops.map((item, index) => {
                            return (
                                <Pressable
                                    className="flex flex-row justify-between items-center gap-2 py-4 border-b border-gray-300"
                                    key={`transport-${item.transportId}`}
                                >
                                    <View className="">
                                        <View className="flex flex-row items-center gap-2">
                                            <Category>
                                                {item.transportName}
                                            </Category>
                                            <Normal className="px-3 py-1 bg-gray-100 capitalize rounded-xl text-sm">
                                                {item.transportTypeOfTransportName} -
                                                {item.transportLineOfTransportName}
                                            </Normal>
                                        </View>
                                        {item.trayectoInfoOrigin.destination !== null &&
                                            <SubCategory
                                                destination={item.trayectoInfoOrigin.destination}
                                                price={item.trayectoInfoOrigin.price}
                                                frequency={item.transportFrequency}
                                                distance={item.trayectoInfoOrigin.distance}
                                            />
                                        }
                                        {item.trayectoInfoDestination.destination !== null &&
                                            <SubCategory
                                                destination={item.trayectoInfoDestination.destination}
                                                price={item.trayectoInfoDestination.price}
                                                frequency={item.transportFrequency}
                                                distance={item.trayectoInfoDestination.distance}
                                            />
                                        }
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

const SubCategory = ({ destination, price, frequency, distance }) => {
    return (<View className="mt-2 ml-2">
        <Text>Rumbo a:
            <Text className="font-bold">
                {destination}
            </Text>
        </Text>
        <View className="flex flex-row gap-x-0.5 mt-2 ml-2">
            <View className="flex flex-row gap-x-2 ml-3 items-center">
                <MaterialIcons name="attach-money"
                    size={20}
                    className="p-2 bg-common-green/15 rounded-full"
                    color="#28A745"
                />
                <Normal className="text-lg">{price}</Normal>
            </View>
            <View className="flex flex-row gap-x2 ml-5 items-center gap-2">
                <MaterialCommunityIcons name="clock-time-three-outline"
                    size={20}
                    className="p-2 bg-common-blue/15 rounded-full"
                    color="#007BFF"
                />
                <Normal className="text-lg">{frequency}</Normal>
            </View>
            <View className="flex flex-row gap-x2 ml-5 items-center gap-2">
                <FontAwesome5 name="route"
                    size={20}
                    className="p-2 bg-common-blue/15 rounded-full"
                    color="#007BFF"
                />
                <Normal className="text-lg">{distance}</Normal>
            </View>
        </View>
    </View>)

}