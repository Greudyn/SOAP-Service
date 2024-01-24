CREATE DATABASE IF NOT EXISTS parameta;

USE parameta;

CREATE TABLE IF NOT EXISTS Empleado (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombres VARCHAR(255) NOT NULL,
    apellidos VARCHAR(255) NOT NULL,
    tipoDocumento VARCHAR(50) NOT NULL,
    numeroDocumento VARCHAR(20) NOT NULL,
    fechaNacimiento DATE NOT NULL,
    fechaVinculacion DATE NOT NULL,
    cargo VARCHAR(100) NOT NULL,
    salario DOUBLE NOT NULL
);