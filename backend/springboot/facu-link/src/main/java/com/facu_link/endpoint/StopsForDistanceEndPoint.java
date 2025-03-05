package com.facu_link.endpoint;

import com.facu_link.model.StopRouteModel;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.facu_link.utils.MathClass;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("fl/api")
public class StopsForDistanceEndPoint {
    MathClass m = new MathClass();

    @GetMapping("/valors")
    public String getAll() {
        double resultadoAsin = Math.asin(0.5); // Devuelve 0.5235987755982989 (π/6 radianes)
        double resultadoSQRT = Math.sqrt(16); // Devuelve 4.0
        double resultadoSin = Math.sin(Math.PI / 2); // Devuelve 1.0 (seno de π/2 radianes)
        int numero = (int) 123.456; // Conversión explícita (casting)
        String texto = "123";
        int numeroDesdeTexto = Integer.parseInt(texto); // Conversión de String a int
        double grados = 180;
        double radianes = grados * (Math.PI / 180); // Devuelve π radianes (3.141592653589793)
        double resultadoCos = Math.cos(0); // Devuelve 1.0 (coseno de 0 radianes)
        double resultadoPow = Math.pow(2, 3); // Devuelve 8.0 (2 elevado a la 3)
//
        double lon = 19.41514082532041;
        double lat = -98.14024764753933;

//        String hola = (637100 * 2 * m.SIN(m.SQRT(m.))) + "";

        return "hola";




//        637100 * 2 * Math.asin(
//                Math.sqrt(
//                        Math.pow(Math.sin())
//                )
//        )

//        6371000 * 2 * ASIN(
//                SQRT(
//                        POWER(SIN((RADIANS(-98.14024764753933) - RADIANS(CAST(latitude AS DECIMAL(18, 15)))) / 2), 2) +
//                                COS(RADIANS(19.41514082532041)) *
//                                        COS(RADIANS(CAST(latitude AS DECIMAL(18, 15)))) *
//                                        POWER(SIN((RADIANS(19.41514082532041) - RADIANS(CAST(longitude AS DECIMAL(18, 15)))) / 2), 2)
//                )
//        )

//        return "Asin: "+resultadoAsin+" - SQRT: "+resultadoSQRT+" - Sin: "+resultadoSin+" - Cos: "+resultadoCos+" - Rad: "+radianes+" - Grados: "+grados+" - Pow: "+resultadoPow;
}
}
