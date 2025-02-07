import { Link, Slot, Stack } from "expo-router";
import { Pressable, Text, View } from "react-native";
import RoutesApp from "../constants/Routes";
import "../global.css"
// import { Logo } from "../components/Logo";
// import { CircleInfoIcon } from "../components/Icons";

export default function Layout() {
  return (
    <View className="">
      {/* <Link href="/">index</Link> */}
      {/* <Link href={RoutesApp.auth.logup}>logup</Link> */}
      {/* <Link href={RoutesApp.auth.login}>Login</Link> */}
      <Slot />
    </View>
  );
}