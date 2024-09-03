# Inserciones de prueba

USE Konoha;

-- Inserción en la tabla Ninja
INSERT INTO Ninja (id, nombre, rango, aldea) VALUES 
(1, 'Pedro', 'Elfo', 'Campuslands'),
(2, 'Rubio', 'Rey', 'Del mundo'),
(3, 'Pepe', 'Cocinero', 'Mi casa'),
(4, 'Pablo', 'Bueno para nada', 'Zona Franca'),
(5, 'Portilla', 'Esclavo', 'Campuslands');

-- Inserción en la tabla Habilidad
INSERT INTO Habilidad (id_Ninja, nombre, descripcion) VALUES 
(1, 'Filtrar', 'Socio del rey'),
(2, 'Hacer trampa', 'El papá de los pollitos'),
(3, 'Comer', 'El mejor chef'),
(4, 'Nada', 'No hace ni mrd'),
(5, 'Hacer caso', 'Esclavo del rey');

-- Inserción en la tabla Mision
INSERT INTO Mision (id, descripcion, rango, recompensa) VALUES 
(1, 'Conseguir una elfa', 'Dificil', 'Un petuche'),
(2, 'Gobernar el mundo', 'Imposible', 'Poder'),
(3, 'Conseguir comida', 'Easy', 'Gemas'),
(4, 'Mamar gallo', 'Pan comido', 'Comida'),
(5, 'Solo hacer caso', 'Facil', 'Un petuche');

-- Inserción en la tabla MisionNinja
INSERT INTO MisionNinja (id_Ninja, id_Mision, fecha_inicio, fecha_fin) VALUES 
(1, 1, '2024-12-12', '2027-10-22'),
(2, 2, '2024-02-16', '2050-08-17'),
(3, 3, '2024-05-04', '2025-02-19'),
(4, 4, '2024-10-11', '2026-10-16'),
(5, 5, '2024-01-30', '2028-12-12');
