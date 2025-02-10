import { View, Text, Image, Pressable } from 'react-native'
import React, { useState } from 'react'
import { Bold, Category, Normal, SubTitle, Title } from '../Texts'
import data from "../../api/Route.json"
import { PrincipalButton, PrincipalButtonText } from '../Buttons'
import MaterialIcons from '@expo/vector-icons/MaterialIcons';
import MaterialCommunityIcons from '@expo/vector-icons/MaterialCommunityIcons';
import FontAwesome6 from '@expo/vector-icons/FontAwesome6';
import AntDesign from '@expo/vector-icons/AntDesign';
import FontAwesome5 from '@expo/vector-icons/FontAwesome5';
import FontAwesome from '@expo/vector-icons/FontAwesome';
import GetStars from './components/GetStars';
import { Picker } from "@react-native-picker/picker";
import Separator from '../global/Separator'
import BoxWhitBorder from './components/BoxWhitBorder'
import Images from '../../constants/Images'


export default function RouteOfTransport() {
    const [selectedOpcionValueFrom, setSelectedOpcionValueFrom] = useState(data.stops[0].name);
    const [destination, setDestination] = useState(data.stops.filter((item) => item.name === selectedOpcionValueFrom));
    const [selectedOpcionValueTo, setSelectedOpcionValueTo] = useState(destination[destination.length - 1].route[destination[destination.length - 1].route.length - 1].name);
    const [actuallRoute, setActuallRoute] = useState(data.stops.filter((item) => item.name === selectedOpcionValueFrom)[0].route);
    return (
        <View className="pb-80 ">
            <Image
                source={Images.image8}
                className="
                    object-cover object-center w-full h-52 ml-0
                "
            />
            <View className="py-5 px-6 ">
                <View>
                    <Text className={"text-3xl uppercase font-bold"}>{data.name}</Text>
                    <Normal className="text-lg">{data.typeOfTransport}</Normal>
                </View>
                <View>
                    <GetStars calif={data.califications} stars={data.starts} />
                </View>
                <View className="mt-5">
                    <View className="flex justify-between flex-row mb-3">
                        <View className="w-[49%]">
                            <BoxWhitBorder
                                tit={"Costo del pasaje"}
                                text={"$ " + data.price}
                                color={"text-common-green"}
                            />
                        </View>
                        <View className="w-[49%]">
                            <BoxWhitBorder
                                tit={"Tiempo Aproximado"}
                                text={data.time}
                                color={"text-common-blue"}
                            />
                        </View>
                    </View>
                    <BoxWhitBorder
                        tit={"Salida cada"}
                        text={data.frequency}
                        color={"text-common-orange"}
                    />
                </View>
                <Separator />
                <View>
                    <Category>Seleccione una opción:</Category>
                    <View className="flex flex-row justify-center items-center gap-1.5 mt-2">
                        <View className="w-[45.5%] border-2 border-gray-200 rounded-xl">
                            <Picker
                                selectedValue={selectedOpcionValueFrom}
                                onValueChange={(itemValue) => {
                                    setSelectedOpcionValueFrom(itemValue)
                                    setDestination(data.stops.filter((item) => item.name === itemValue))
                                    setActuallRoute(data.stops.filter((item) => item.name === itemValue)[0].route)
                                }}
                            >
                                {data.stops.map((item, index) => {
                                    return <Picker.Item key={index} label={item.name} value={item.name} />
                                })}
                            </Picker>
                        </View>
                        <View>
                            <FontAwesome6 name="arrow-right" size={20} color="black" className="mx-1" />
                        </View>
                        <View className="w-[45.5%] border-2 border-gray-200 rounded-xl">
                            <Picker
                                selectedValue={selectedOpcionValueTo}
                                onValueChange={(itemValue) => {
                                    setSelectedOpcionValueTo(itemValue)
                                }}
                            >
                                {destination[0].route.map((item, index) => {
                                    return <Picker.Item key={index} label={item.name} value={item.name} />
                                })}
                            </Picker>
                        </View>
                    </View>
                    <View className="flex flex-col mt-1">
                        <View className="flex justify-between flex-row mt-3">
                            <View className="w-[49%]">
                                <BoxWhitBorder
                                    tit={"Costo del pasaje"}
                                    text={"$ " + (actuallRoute.filter((item) => item.name === selectedOpcionValueTo))[0].price}
                                    color={"text-common-green"}
                                />
                            </View>
                            <View className="w-[49%]">
                                <BoxWhitBorder
                                    tit={"Tiempo Aproximado"}
                                    text={"$ " + (actuallRoute.filter((item) => item.name === selectedOpcionValueTo))[0].time}
                                    color={"text-common-blue"}
                                />
                            </View>
                        </View>
                    </View>
                    <Separator />
                    <View className="mt-5 flex px-2">
                        <View className="border-l-8 border-gray-200 pl-5">
                            <RouteComponent
                                icon="bus-stop-covered"
                                from={selectedOpcionValueFrom}
                                price={0}
                                time={0}
                            />
                            {actuallRoute.map((item, index) => {
                                return (
                                    <RouteComponent
                                        key={index}
                                        icon={
                                            item.name === selectedOpcionValueTo
                                                ? "bus-stop"
                                                : "bus-side"
                                        }
                                        from={item.name}
                                        price={item.price}
                                        time={item.time}
                                    />
                                )
                            })}
                        </View>
                    </View>
                </View>
            </View>
        </View>
    )
}

const RouteComponent = ({ icon, from, price, time }) => {
    return (
        <View className="my-3 flex flex-row justify-between items-center">
            <View className="flex flex-row gap-3 items-center">
                <MaterialCommunityIcons name={icon} size={25} color="#515151" />
                <Text className="text-lg">{from}</Text>
                {/* <Bold>
                    {from}
                </Bold> */}
            </View>
            <View className="flex flex-row gap-2 items-center">
                <View className="flex flex-row gap-0.5 items-center">
                    <MaterialIcons name="attach-money"
                        size={15}
                        className="p-2 bg-common-green/15 rounded-full"
                        color="#28A745"
                    />
                    <Text className="text-md"> ${price}</Text>
                </View>
                <View className="flex flex-row gap-0.5 items-center">
                    <MaterialCommunityIcons name="clock-time-three-outline"
                        size={15}
                        className="p-2 bg-common-blue/15 rounded-full"
                        color="#007BFF"
                    />
                    <Text className="text-md"> {time}</Text>
                </View>
            </View>
        </View>

    )
}