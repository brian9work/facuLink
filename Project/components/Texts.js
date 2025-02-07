import React from 'react'
import { Text, View } from 'react-native'


export function HeaderTitle({className, children}) {
  return (
    <Text className={`${className}`}>
      {children}
    </Text>
  )
}
export function Title({mode="light",className, children}) {
  return (
    <Text className={`text-3xl uppercase text-center font-bold ${mode==="dark" ? "text-white" : "text-black"} ${className}`}> 
      {children}
    </Text>
  )
}
export function SubTitle({mode="light", className, children}) {
  return (
    <Text className={`text-2xl text-center font-bold ${mode==="dark" ? "text-white" : "text-black"} ${className}`}> 
      {children}
    </Text>
  )
}
export function Category({className, children}) {
  return (
    <Text className={"text-2xl font-bold "+className}>
      {children}
    </Text>
  )
}
export function Bold({className, children}) {
  return (
    <Text className={"text-lg font-bold "+className}>
      {children}
    </Text>
  )
}
export function Normal({className, children}) {
  return (
    <Text className={"text-lg "+className}>
      {children}
    </Text>
  )
}
