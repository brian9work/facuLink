const origin = 'http://localhost:3000'
export default Api ={
    auth: {
            login: ()=> `${origin}/auth/login`,
            signin: ()=> `${origin}/auth/signin`,
    },
    faculty: {
        get: ()=> `${origin}/faculty/get`,
    },
}
    
   