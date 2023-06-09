drop database if exists freedb_intdom;
create database freedb_intdom;
use freedb_intdom;

create table pacientes(
	id_paciente int auto_increment primary key,
    nombre varchar(150) not null,
    nro_socio int(10),
    cliente varchar(50) not null,
    celular int (15) not null,
    calle_altura varchar(150) not null,
    piso_departamento varchar(150),
    entrecalles varchar(150),
    localidad varchar (100) not null, 
    zona varchar(30)
    );

create table equipos(
    id_paciente int (10),
    id_equipo int(10) auto_increment primary key, 
    descripcion VARCHAR(300) not null,
    codigo_interno INT (20) not null,
    cantidad INT(10) not null
);

create table visitas(
    id_visita INT(5) auto_increment primary key, 
    id_chofer INT(10) ,
    id_paciente int(10), 
    zona VARCHAR(30),
    fecha DATE not null,
    hora_inicio TIME, 
    hora_fin TIME, 
    coordinado VARCHAR(100)not null, 
    concretado VARCHAR (100)not null
);

create table choferes(
    id_chofer INT (10)auto_increment primary key, 
    id_visita INT(5),
    zona VARCHAR(30),
    vehiculo VARCHAR(100)not null,
    nombre_chofer VARCHAR (50) not null
);

ALTER TABLE `freedb_intdom`.`equipos` 
ADD INDEX `pacientes_idx` (`id_paciente` ASC) ;
;
ALTER TABLE `freedb_intdom`.`equipos` 
ADD CONSTRAINT `idpacientes`
  FOREIGN KEY (`id_paciente`)
  REFERENCES `freedb_intdom`.`pacientes` (`id_paciente`);
 

ALTER TABLE `freedb_intdom`.`visitas` 
ADD INDEX `depacientes_idx` (`id_paciente` ASC) ;
ALTER TABLE `freedb_intdom`.`visitas` 
ADD CONSTRAINT `apacientes`
  FOREIGN KEY (`id_paciente`)
  REFERENCES `freedb_intdom`.`pacientes` (`id_paciente`);

