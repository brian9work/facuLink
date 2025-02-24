-- Seleccionar todas las paradas de autobús que se encuentren a una distancia de 1 km de la ubicación (19.41514082532041, -98.14024764753933) en metros.
SELECT 
    s.id AS id_stop,
    s.longitude,
    s.latitude,
    s.name AS stop_name,
    s.imagen AS stop_imagen,
    t.id AS id_transport,
    t.frequency,
    t.name AS transport_name,
    t.imagen As transport_imagen,
    t.origin,
    t.destination,
    clt.id AS id_line_of_transport,
    clt.name AS line_of_transport_name,
    clt.complete_name,
    clt.imagen AS line_of_transport_imagen,
    ctt.id AS id_type_of_transport,
    ctt.name AS type_of_transport_name,
    ctt.imagen AS type_of_transport_imagen,
    6371000 * 2 * ASIN(
        SQRT(
            POWER(SIN((RADIANS(-98.14024764753933) - RADIANS(CAST(latitude AS DECIMAL(18, 15)))) / 2), 2) +
            COS(RADIANS(19.41514082532041)) * 
            COS(RADIANS(CAST(latitude AS DECIMAL(18, 15)))) *
            POWER(SIN((RADIANS(19.41514082532041) - RADIANS(CAST(longitude AS DECIMAL(18, 15)))) / 2), 2)
        )
    ) AS distance_in_meters
FROM 
    stop s
JOIN 
    transport_stop ts ON ts.id_stop = s.id
JOIN 
    transport t ON ts.id_transport = t.id
JOIN 
    cat_line_of_transport clt ON clt.id = t.id_type_of_transport
JOIN 
    cat_type_of_transport ctt ON ctt.id = t.id_type_of_transport
WHERE 
    -- Filtro para paradas dentro de 10 metros
    6371000 * 2 * ASIN(
        SQRT(
            POWER(SIN((RADIANS(-98.14024764753933) - RADIANS(CAST(latitude AS DECIMAL(18, 15)))) / 2), 2) +
            COS(RADIANS(19.41514082532041)) * 
            COS(RADIANS(CAST(latitude AS DECIMAL(18, 15)))) *
            POWER(SIN((RADIANS(19.41514082532041) - RADIANS(CAST(longitude AS DECIMAL(18, 15)))) / 2), 2)
        )
    ) <= 1000 -- distancia en metros
ORDER BY 
    distance_in_meters;





SELECT 
    s.id AS stop_id, 
    s.name AS stop_name, 
    s.latitude AS stop_latitude, 
    s.longitude AS stop_longitude,
    t.id AS transport_id, 
    t.name AS transport_name, 
    t.frequency AS transport_frequency,
    -- Cálculo de la distancia en metros
    6371000 * 2 * ASIN(
        SQRT(
            POWER(SIN((RADIANS(19.41514082532041) - RADIANS(CAST(s.latitude AS DECIMAL(18, 15)))) / 2), 2) +
            COS(RADIANS(19.41514082532041)) * 
            COS(RADIANS(CAST(s.latitude AS DECIMAL(18, 15)))) *
            POWER(SIN((RADIANS(-98.14024764753933) - RADIANS(CAST(s.longitude AS DECIMAL(18, 15)))) / 2), 2)
        )
    ) AS distance_in_meters
FROM 
    stop s
JOIN 
    transport_stop ts ON s.id = ts.id_stop
JOIN 
    transport t ON ts.id_transport = t.id
WHERE 
    -- Filtro para paradas dentro de 10 metros
    6371000 * 2 * ASIN(
        SQRT(
            POWER(SIN((RADIANS(19.41514082532041) - RADIANS(CAST(s.latitude AS DECIMAL(18, 15)))) / 2), 2) +
            COS(RADIANS(19.41514082532041)) * 
            COS(RADIANS(CAST(s.latitude AS DECIMAL(18, 15)))) *
            POWER(SIN((RADIANS(-98.14024764753933) - RADIANS(CAST(s.longitude AS DECIMAL(18, 15)))) / 2), 2)
        )
    ) <= 1000 // distancia en metros
ORDER BY 
    distance_in_meters;













