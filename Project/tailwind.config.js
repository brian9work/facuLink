/** @type {import('tailwindcss').Config} */
module.exports = {
   // NOTE: Update this to include the paths to all of your component files.
   content: [
      "./App.{js,jsx,ts,tsx}",
      "./components/**/*.{js,jsx,ts,tsx}",
      "./app/**/*.{js,jsx,ts,tsx}",
      "./app/*.{js,jsx,ts,tsx}"
   ],
   presets: [require("nativewind/preset")],
   theme: {
      extend: {
         colors: {
            common: {
               blue: "#007BFF",
               green: "#28A745",
               yellow: "#FFC107",
               orange: "#FD7E14",
            },
            theme: {
               black: "#212529",
               white: "#F8F9FA",
            },
         }
      },
   },
   plugins: [],
}