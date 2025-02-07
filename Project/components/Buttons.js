import { View, Text, Pressable } from 'react-native'
import React from 'react'

export function PrincipalButton({ children, mode = "dark" }) {
    return (
        <Pressable className={`${mode==="dark" ? "bg-theme-white" : "bg-theme-black" } w-[70%] text-center h-14 rounded-2xl mx-auto flex justify-center`}>
            {children}
        </Pressable>
    )
}
export function PrincipalButtonText({ children, mode = "dark" }) {
    return (
        <Pressable className={`${mode==="dark" ? "bg-theme-white" : "bg-theme-black" } w-[70%] text-center h-14 rounded-2xl mx-auto flex justify-center items-center`}>
            <Text className={`${mode==="dark" ? "text-theme-black" : "text-theme-white" } text-lg font-bold uppercase `}>
                {children}
            </Text>
        </Pressable>
    )
}
export function SecundaryButtonText({ children, mode = "dark" }) {
    return (
        <Pressable className={`border-4 ${mode==="dark" ? "border-theme-white bg-theme-black" : "border-theme-black bg-theme-white" } w-[70%] text-center h-14 rounded-2xl mx-auto flex justify-center items-center`}>
            <Text className={`${mode==="dark" ? "text-theme-white" : "text-theme-black" } text-lg font-bold uppercase `}>
                {children}
            </Text>
        </Pressable>
    )
}

export function TertiaryButtonText({ children, mode = "dark" }) {
    return (
        <Pressable className={`${mode==="dark" ? "" : "" } w-[70%] text-center h-14 rounded-2xl mx-auto flex justify-center items-center`}>
            <Text className={`${mode!=="dark" ? "text-theme-black" : "text-theme-white" } text-lg font-bold uppercase `}>
                {children}
            </Text>
        </Pressable>
    )
}
