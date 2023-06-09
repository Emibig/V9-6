-- Insertar datos en la tabla "pacientes"
INSERT INTO pacientes (nombre, nro_socio, cliente, celular, calle_altura, entrecalles, piso_departamento, localidad,zona)
VALUES
    ('Abad, Jose', '3645223', 'Swiss Medical S.A.', 1511111, 'A Lamas 2263', NULL, '', 'CABA','dos'),
    ('Bastista, Salomon', '62360030', 'MEDICUS', 1522222,'J B Alberdi 3047 4A', '', '', 'CABA','tres'),
    ('Centenario, Mariana', '7777473', 'Hospital Alemán',1533333, 'zapiola 600', '', '', 'MERLO','oeste'),
    ('Dieguez, Martha Edith', '625725603', 'Hospital Alemán',1544444, 'juncal 2676', '', '', 'CABA','dos'),
    ('Guerrero, Liliana', '70352723', 'Swiss Medical S.A.',1555555,'Gurruchaga 440', 'Corrientes y Camargo', '4ºD', 'CABA','dos'),
    ('Figueroa, Eduardo Pablo', '7277563', 'Swiss Medical S.A.', 156666666,'Eizaguirre 3774', '(e/Ombu y Zapiola)','', 'SAN JUSTO', 'oeste'),
    ('Huergo, Vicenta', '1238', 'AIRMED S.R.L.',15666666, 'De los Reseros 700 - Residencia', '', '', 'PARQUE LELOIR','oeste'),
    ('Ibañez, Sebastian', '05266453', 'Swiss Medical',1577777, 'J M Campos 2276 ', '','PB B Ed 22', 'SAN ANDRES', 'norte'),
	('Juarez, Grandi', '1245', 'BC&B', 1010101, 'Plaza 2000', '', '', 'CABA','uno'),
    ('Lauria, Susana Alicia', '3537002', 'Swiss Medical', 151111111, 'Aviador Saint Wxupery 2460', 'fredes y breiriot', '', 'EL PALOMAR','oeste'),
    ('Mendoza, Elvira Elina', '637045002', 'OSDE',1512121212, 'Jose Fusch 3737', '', '', 'MORÓN','oeste'),
    ('Niev, Amparo', '3740700', 'OMINT S.A.', 151111189,'Luis de Sarro 342', '', '', 'MONTE GRANDE','sur'),
    ('Perez, Eduardo', '5678', 'AIRMED S.R.L.',15115151,  'Estanislao Zeballos 720', 'E Alvarez y Cervino','', 'MORENO', 'oeste'),
    ('Zabatino, David Guillermo', '60077073', 'Swiss Medical ', 1512367, 'Panama 724', '7° A', '', 'CABA','dos');
    select* from pacientes;


INSERT INTO equipos (id_paciente, id_equipo, descripcion, codigo_interno, cantidad)
VALUES
    (1, 1, 'Cama ortopedica con colchon hospitalario y juego de barandas', 0101, 1),
    (2, 2, 'Colchon de aire', 0201, 1),
    (3, 3, 'Bomba de infusión enteral', 1100, 1),
    (4, 4, 'Silla de ruedas', 0300, 1),
    (5, 5, 'Elevador de inodoro aluminio', 0405, 1),
	(6, 6, 'Cama ortopedica electrica con colchon hospitalario y barandas', 0102, 1),
    (7, 7, 'Colchon de aire peso especial', 0202, 1),
    (8, 8, 'Pie de suero', 0109, 1),
    (9, 9, 'Silla de ruedas peso especial', 0306, 1),
    (10, 10, 'Andador con ruedas', 0502, 1),
	(11, 11, 'Silla de ruedas', 0300, 1),
    (12, 12, 'Colchon de aire', 0201, 1),
    (13, 13, 'Colchon de aire', 0201, 1),
    (14, 14, 'Silla de ruedas', 0300, 1);
    
    
    insert into choferes(zona,vehiculo,nombre_chofer)values
		('norte','Fiorino','Renzo'),
		('uno','Fiorino','Renzo'),
		('sur','Ducato','Gabriel'),
		('tres','Ducato','Gabriel'),
		('oeste','Fiorino','Tuti'),
		('dos','Fiorino','Tuti');
    -- select*from choferes;    
    
     
    INSERT INTO visitas (fecha, hora_inicio, hora_fin, coordinado, concretado, zona)
VALUES
	('2023-05-22', '08:30:00', '12:30:00', 'OK', 'estado a confirmar', 'uno'),
	('2023-05-22', '12:30:00', '17:30:00', 'OK', 'estado a confirmar', 'norte'),
    ('2023-05-23', '08:30:00', '12:30:00', 'OK', 'estado a confirmar', 'dos'),
    ('2023-05-23', '12:30:00', '17:30:00', 'OK', 'estado a confirmar', 'sur'),
    ('2023-05-24', '08:30:00', '12:30:00', 'OK', 'estado a confirmar', 'tres'),
	('2023-05-24', '12:30:00', '17:30:00', 'OK', 'estado a confirmar', 'oeste');
   
    
        
    
