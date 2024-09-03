-- Creación de la base de datos
CREATE DATABASE Konoha;

-- Selección de la base de datos
USE Konoha;

-- Creación de la tabla Ninja
CREATE TABLE Ninja (
    id INT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    rango VARCHAR(100) NOT NULL,
    aldea VARCHAR(255) NOT NULL
);

-- Creación de la tabla Habilidad
CREATE TABLE Habilidad (
    id_Ninja INT,
    nombre VARCHAR(100) NOT NULL,
    descripcion VARCHAR(255) NOT NULL,
    FOREIGN KEY(id_Ninja) REFERENCES Ninja(id)
);

-- Creación de la tabla Mision
CREATE TABLE Mision (
    id INT PRIMARY KEY,
    descripcion VARCHAR(255) NOT NULL,
    rango VARCHAR(100) NOT NULL,
    recompensa ENUM('Un petuche', 'Oro', 'Comida', 'Gemas', 'Poder')
);

-- Creación de la tabla MisionNinja
CREATE TABLE MisionNinja (
    id_Ninja INT,
    id_Mision INT,
    fecha_inicio DATE NOT NULL,
    fecha_fin DATE NOT NULL,
    FOREIGN KEY(id_Ninja) REFERENCES Ninja(id),
    FOREIGN KEY(id_Mision) REFERENCES Mision(id)
);

SHOW TABLES;