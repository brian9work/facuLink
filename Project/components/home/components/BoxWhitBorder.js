import { View, Text } from 'react-native'
import React from 'react'
import { Normal } from '../../Texts'

export default function BoxWhitBorder({tit, text, color}) {
    return (
        <View className="flex flex-col justify-center items-center gap-1 rounded-xl border-2 border-gray-200 py-3 w-full">
            <Normal>
                {tit}
            </Normal>
            <Text className={`text-3xl font-bold ${color}`}>
                {text}
            </Text>
        </View>
    )
}