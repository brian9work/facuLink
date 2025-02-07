import { Dimensions } from 'react-native';

function Dim(type = 'w') {
    const { width, height } = Dimensions.get(type === 's' ? 'screen' : 'window');
    return { width, height };
}


export default Dim;

// const { width, height } = Dimensions.get('screen');

// console.log(`Ancho: ${width}, Alto: ${height}`);
