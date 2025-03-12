const originStatic = "http://3.146.206.1/api";

const Api ={
    static: {
        getStops: {
            stops100: originStatic + "response_100.json",
            stops250: originStatic + "response_250.json",
            stops500: originStatic + "response_500.json",
            stops1000: originStatic + "response_1000.json",
        }
    },
    nearby: {
        stops: (latitude, longitude, distance) => {
            return `${originStatic}/nearby?latitude=${latitude}&longitude=${longitude}&distance=${distance}`;
        },
        selectedStop: (idStop) => {
            return `${originStatic}/nearby/${idStop}`;
        }
    } 
}
export default Api;