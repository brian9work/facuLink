import { View, Text, Pressable } from 'react-native'
import React from 'react'
import AntDesign from '@expo/vector-icons/AntDesign'

export default function BottonCloseMenu({ menu, setMenu }) {
    return (
        <Pressable
            onPressOut={() => {
                setMenu(!menu)
                console.log('close')
            }}
            className="
                     absolute top-3 right-3
                     bg-theme-black
                     rounded-full z-50
                     border-2 border-transparent
                     "
        >
            <AntDesign name="closecircle"
                size={36}
                color="white"
            />
        </Pressable>
    )
}