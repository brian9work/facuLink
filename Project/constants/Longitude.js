import { Dimensions } from 'react-native';

function Long(type) {
    return Dimensions.get(type === 's' ? 'screen' : 'window');
}

export default Long;
