import { View, Text } from 'react-native'
import React from 'react'
import FontAwesome from '@expo/vector-icons/FontAwesome';
import { Bold, Normal } from '../../Texts';

export default function GetStars({ calif, stars }) {
    return (
        <View>
            <View className="flex flex-row items-center gap-2 mt-2">
                <View className="flex flex-row gap-1">
                    {[...Array(5)].map((_, index) => {
                        return <FontAwesome
                            key={index}
                            name="star"
                            size={24}
                            color={index < stars ? "#FFC107" : "#DBDBDB"}
                            className="text-common-yellow"
                        />
                    })}
                    {/* <FontAwesome name="star" size={24} color="black" />
                <FontAwesome name="star-o" size={24} color="black" />
                <FontAwesome name="star-half-empty" size={24} color="black" /> */}
                </View>
                <Bold >{stars}</Bold>
                <Normal className="text-md ">- {calif} calificaciones</Normal>
            </View>
        </View>
    )
}