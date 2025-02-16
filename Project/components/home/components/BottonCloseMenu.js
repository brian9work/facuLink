import { View, Text, Pressable } from 'react-native'
import React from 'react'
import AntDesign from '@expo/vector-icons/AntDesign'
import Entypo from '@expo/vector-icons/Entypo';

export default function BottonCloseMenu({ menu, setMenu }) {
    return (
        <Pressable
            onPressOut={() => {
                setMenu(!menu)
                console.log('close')
            }}
            className={`
                     absolute ${menu ? "top-3" : "-top-[43rem]" } right-3
                     ${menu ? "bg-common-red/40" : "bg-common-green/40" }
                   
                     rounded-full z-50
                     p-1
                     `}
        >
            <Entypo name={`${menu ? "cross" : "chevron-up" }`}size={32} color={`${menu ? "#FF3C3C" : "#28A745" }`} />
            {/* <Entypo name="chevron-up" size={24} color="black" /> */}
            {/* <AntDesign name="closecircle"
                size={36}
                color="#FF3C3C"
            /> */}
        </Pressable>
    )
}