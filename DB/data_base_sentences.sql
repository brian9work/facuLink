-- Seleccionar todas los camino de autobús que se encuentren a una distancia de 1 km de la ubicación (19.41514082532041, -98.14024764753933) en metros.
SELECT 
    s.*,
    6371000 * 2 * ASIN(
        SQRT(
            POWER(SIN((RADIANS(19.41514082532041) - RADIANS(CAST(latitude AS DECIMAL(18, 15)))) / 2), 2) +
            COS(RADIANS(-98.14024764753933)) * 
            COS(RADIANS(CAST(latitude AS DECIMAL(18, 15)))) *
            POWER(SIN((RADIANS(-98.14024764753933) - RADIANS(CAST(longitude AS DECIMAL(18, 15)))) / 2), 2)
        )
    ) AS distance_in_meters
FROM 
    stop s
WHERE 
    -- Filtro para paradas dentro de 10 metros
    6371000 * 2 * ASIN(
        SQRT(
            POWER(SIN((RADIANS(19.41514082532041) - RADIANS(CAST(latitude AS DECIMAL(18, 15)))) / 2), 2) +
            COS(RADIANS(-98.14024764753933)) * 
            COS(RADIANS(CAST(latitude AS DECIMAL(18, 15)))) *
            POWER(SIN((RADIANS(-98.14024764753933) - RADIANS(CAST(longitude AS DECIMAL(18, 15)))) / 2), 2)
        )
    ) <= 250 -- distancia en metros
ORDER BY 
    distance_in_meters;




-- Seleccionar los precios y datos de cada routa de transporte
    -- Seleccionar ruta
    SELECT * FROM transport WHERE id=6;
    -- Seleccionar toda las paradas de la ruta
    SELECT * FROM transport_stop WHERE id_transport=6;
    -- En este caso la primer parada es la *25* y la última es la *38*
    -- El usuario se encuentra en la parada *31*
    -- Ahora tenemos que seleccionar todas las paradas entre la *31* y la *38*
    SELECT * FROM transport_stop WHERE id_transport=6 AND id_stop BETWEEN 31 AND 38;
    -- Ahora las paradas de la ruta de regreso
    SELECT * FROM transport_stop WHERE id_transport=6 AND id_stop BETWEEN 25 AND 31 ORDER BY id DESC;
    -- Ahora tenemos que seleccionar todas las paradas entre la *25* y la *31*
    SELECT * FROM stop_routes WHERE stop_id_from = 31 AND stop_id_to BETWEEN 25 AND 31 ORDER BY id DESC;

-- Seleccionar los transportes en cada base
    -- Seleccionar todas las paradas de la base
    SELECT s.*, 6371000 * 2 * ASIN( SQRT( POWER(SIN((RADIANS(19.41514082532041) - RADIANS(CAST(latitude AS DECIMAL(18, 15)))) / 2), 2) + COS(RADIANS(-98.14024764753933)) * COS(RADIANS(CAST(latitude AS DECIMAL(18, 15)))) * POWER(SIN((RADIANS(-98.14024764753933) - RADIANS(CAST(longitude AS DECIMAL(18, 15)))) / 2), 2) ) ) AS distance_in_meters FROM stop s WHERE 6371000 * 2 * ASIN( SQRT( POWER(SIN((RADIANS(19.41514082532041) - RADIANS(CAST(latitude AS DECIMAL(18, 15)))) / 2), 2) + COS(RADIANS(-98.14024764753933)) * COS(RADIANS(CAST(latitude AS DECIMAL(18, 15)))) * POWER(SIN((RADIANS(-98.14024764753933) - RADIANS(CAST(longitude AS DECIMAL(18, 15)))) / 2), 2) ) ) <= 230 ORDER BY distance_in_meters;
    -- En este caso la distancia es de 50 metros y la unica base que se encuentra tiene el id 31
    -- Con ese Id ahora seleccionamos todos los transportes que pasan por esa base
    SELECT * FROM transport_stop WHERE id_stop=31;
    -- Salieron los transporte 5, 6, 7
    -- Ahora seleccionamos los datos de los transportes
    SELECT * FROM transport WHERE id=5 OR id=6 OR id=7;













