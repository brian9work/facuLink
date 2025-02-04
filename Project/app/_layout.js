import { Link, Slot, Stack } from "expo-router";
import { Pressable, Text, View } from "react-native";
// import { Logo } from "../components/Logo";
// import { CircleInfoIcon } from "../components/Icons";

export default function Layout() {
  return (
    <View className="flex-1 bg-red-700">
      <Text>Holaaa</Text>
      <Link href="/">index</Link>
      <Link href="/login">Login</Link>
      <Link href="/logup">Logup</Link>
      <Slot />
    </View>
  );
}