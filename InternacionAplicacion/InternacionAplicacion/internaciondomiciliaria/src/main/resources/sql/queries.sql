
SELECT*from equipos;
SELECT* from pacientes;
SELECT* from choferes;
SELECT * FROM visitas;

 
 -- veo cada paciente con su visita y chofer asignado, por zona 
SELECT  p.nombre, 
	p.calle_altura,
	p.localidad,
	p.zona, 
	c.nombre_chofer,
	c.vehiculo, 
	v.fecha,
	v.hora_inicio,
	v.hora_fin,
	v.coordinado,
	v.concretado
FROM visitas v
JOIN pacientes p 
ON v.zona = p.zona
INNER JOIN choferes c 
ON v.zona = c.zona
ORDER BY p.nombre ASC;
 
 -- completo el chofer en la tabla visitas segun la zona de la tabla chofer 
 UPDATE visitas v
SET id_chofer = (
    SELECT c.id_chofer
    FROM choferes c
    WHERE c.zona = v.zona)
WHERE v.id_chofer IS NULL;
SELECT * FROM visitas;

-- consultar los pacientes y equipos con la fecha de visita
SELECT
	p.zona zona,
    p.nombre paciente,
    e.descripcion,
    v.fecha
FROM visitas v
JOIN pacientes p 
ON v.zona = p.zona
JOIN equipos e 
ON e.id_paciente = p.id_paciente
order by p.nombre asc;

-- cambiar el la direccion de un paciente 
SELECT nombre, calle_altura
FROM pacientes
WHERE nombre  = 'Bastista, Salomon';

UPDATE pacientes
SET calle_altura = 'Av Monroe 4500'
WHERE nombre = 'Bastista, Salomon';

-- ordenar las visitas por fecha y luego horario 
SELECT p.nombre, 
	v.fecha, 
	v.hora_inicio, 
	v.hora_fin, 
	v.coordinado
FROM visitas v
INNER JOIN pacientes p
ON v.id_paciente = p.id_paciente
ORDER BY fecha, hora_inicio;

-- reviso que pacientes tienen cual equipo en que direccion (figueroa tiene cama electrica)       
SELECT p.nombre, p.calle_altura, e.descripcion
FROM pacientes p
JOIN equipos e ON p.id_paciente = e.id_paciente;
      
-- consulto los pacientes que tienen vigente colchon de aire 
SELECT p.nombre, e.descripcion
FROM pacientes p
INNER JOIN equipos e
ON p.id_paciente = e.id_paciente
WHERE e.descripcion = 'Colchon de aire'; 

-- agrego cama ortopedica a los pacientes que ya tenian colchon de aire 
INSERT INTO equipos (id_paciente, descripcion, codigo_interno, cantidad)
SELECT p.id_paciente, 'Cama ortopedica con colchon hospitalario y juego de barandas','0101',1
FROM pacientes p
INNER JOIN equipos e ON p.id_paciente = e.id_paciente
WHERE e.descripcion = 'Colchon de aire';

