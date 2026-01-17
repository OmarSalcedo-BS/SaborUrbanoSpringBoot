**BASE DE DATOS CODIGO SQL PARA INYECTAR LOS DATOS**

-- =============================================
-- LLENADO DE DATOS DE PRUEBA (SABOR URBANO)
-- =============================================

CREATE DATABASE restauranteSaborUrbano;

USE restauranteSaborUrbano;

-- 1. INSERTAR CATEGORÍAS (5 categorías)
INSERT INTO categoria (nombre_categoria) VALUES 
('Entradas'), ('Platos Fuertes'), ('Postres'), ('Bebidas'), ('Desayunos');

-- 2. INSERTAR USUARIOS (20 usuarios)
INSERT INTO usuarios (email, nombre_completo) VALUES
('lopezara@email.com', 'Ara perez'),
('juan.perez@email.com', 'Juan Pérez'),
('carlos.rodriguez@email.com', 'Carlos Rodríguez'), ('ana.martinez@email.com', 'Ana Martínez'),
('luis.sanchez@email.com', 'Luis Sánchez'), ('laura.lopez@email.com', 'Laura López'),
('pedro.gomez@email.com', 'Pedro Gómez'), ('elena.diaz@email.com', 'Elena Díaz'),
('sergio.torres@email.com', 'Sergio Torres'), ('isabel.ruiz@email.com', 'Isabel Ruiz'),
('david.vazquez@email.com', 'David Vázquez'), ('marta.castro@email.com', 'Marta Castro'),
('javier.morales@email.com', 'Javier Morales'), ('lucia.ortiz@email.com', 'Lucía Ortiz'),
('diego.gutierrez@email.com', 'Diego Gutiérrez'), ('carmen.reyes@email.com', 'Carmen Reyes'),
('pablo.jimenez@email.com', 'Pablo Jiménez'), ('adriana.silva@email.com', 'Adriana Silva'),
('oscar.nunez@email.com', 'Oscar Núñez'), ('sofia.leon@email.com', 'Sofía León');

-- 3. INSERTAR PLATILLOS (20 platillos variados)
-- IDs de categorías asumiendo que empezaron en 1 (1:Entradas, 2:Fuertes, 3:Postres, 4:Bebidas, 5:Desayunos)
INSERT INTO platillo (nombre, precio, id_categoria) VALUES 
('Nachos con Queso', 8.50, 1), ('Alitas BBQ', 12.00, 1), ('Bruschetta', 7.50, 1), ('Sopa de Tortilla', 6.00, 1),
('Corte New York', 25.99, 2), ('Salmon a la Parrilla', 22.50, 2), ('Pasta Carbonara', 14.00, 2), ('Tacos de Pastor', 10.50, 2), ('Hamburguesa Gourmet', 13.50, 2), ('Ensalada Caesar', 11.00, 2),
('Cheesecake de Fresa', 6.50, 3), ('Brownie con Helado', 7.00, 3), ('Tiramisú', 8.00, 3), ('Flan de la Casa', 5.50, 3),
('Limonada Imperial', 3.50, 4), ('Cerveza Artesanal', 5.50, 4), ('Vino Tinto Copa', 9.00, 4), ('Café Espresso', 2.50, 4),
('Chilaquiles Verdes', 11.00, 5), ('Omelette de Champiñones', 9.50, 5);

-- 4. INSERTAR COMENTARIOS (10 comentarios generales de perfil)
INSERT INTO comentario (fecha_publicacion, texto_comentario, id_usuario) VALUES 
(GETDATE(), 'Me encanta este restaurante, siempre vuelvo.', 1),
(GETDATE(), 'La atención fue un poco lenta hoy.', 3),
(GETDATE(), '¡Los mejores postres de la ciudad!', 5),
(GETDATE(), 'Precios razonables para la calidad.', 8),
(GETDATE(), 'El ambiente es muy acogedor.', 10),
(GETDATE(), 'Muy recomendado para cenas románticas.', 12),
(GETDATE(), 'Opciones vegetarianas limitadas.', 15),
(GETDATE(), 'Excelente selección de vinos.', 18),
(GETDATE(), 'El desayuno superó mis expectativas.', 20),
(GETDATE(), 'Volveré con mi familia el próximo domingo.', 2);


-- 5. INSERTAR REACCIONES A COMENTARIOS
INSERT INTO reaccion_comentario (tipo_reaccion, id_comentario, id_usuario) VALUES 
('Like', 1, 2), ('Like', 5, 4), ('Dislike', 2, 5), ('Like', 10, 6), ('Like', 18, 11);

-- 6. INSERTAR CALIFICACIONES (50 registros para análisis)
-- Se distribuyen puntuaciones entre 1 y 5 para que la gráfica en Python tenga variedad.
INSERT INTO calificacion (comentario_corto, puntuacion, id_platillo, id_usuario) VALUES 
('Excelente sabor', 5, 5, 1), ('Un poco salado', 3, 5, 2), ('Increíble', 5, 5, 3), ('Muy bueno', 4, 5, 4),
('Mejor de lo esperado', 5, 1, 5), ('Frío al llegar', 2, 1, 6), ('Normal', 3, 1, 7),
('Delicioso!', 5, 8, 8), ('Sabor auténtico', 5, 8, 9), ('Picante pero rico', 4, 8, 10),
('Muy dulce para mi gusto', 3, 11, 11), ('El mejor cheesecake', 5, 11, 12), ('Presentación impecable', 5, 11, 13),
('Refrescante', 4, 15, 14), ('Poca cantidad', 2, 15, 15),
('Corte perfecto', 5, 6, 16), ('Termino equivocado', 2, 6, 17), ('Jugoso', 4, 6, 18),
('Café fuerte y rico', 5, 18, 19), ('Un poco caro', 3, 18, 20),
('Porción generosa', 5, 19, 1), ('Falta sazón', 2, 19, 2), ('Buen desayuno', 4, 19, 3),
('Pasta al dente', 5, 7, 4), ('Mucha grasa', 2, 7, 5), ('Recomendado', 4, 7, 6),
('Alitas crujientes', 5, 2, 7), ('Salsa muy picante', 3, 2, 8), ('Buena entrada', 4, 2, 9),
('Vino excelente', 5, 17, 10), ('Copa mal servida', 2, 17, 11),
('Sopa reconfortante', 5, 4, 12), ('Le faltaba sal', 3, 4, 13),
('Hamburguesa masiva', 5, 9, 14), ('Pan seco', 2, 9, 15), ('Carne premium', 5, 9, 16),
('Bruschetta clásica', 4, 3, 17), ('Pocas rebanadas', 2, 3, 18),
('Cerveza bien fría', 5, 16, 19), ('Variedad limitada', 3, 16, 20),
('Flan suave', 4, 14, 1), ('Muy pequeño', 2, 14, 2),
('Ensalada fresca', 4, 10, 3), ('Mucho aderezo', 3, 10, 4),
('Omelette perfecto', 5, 20, 5), ('Poco queso', 2, 20, 6),
('Tiramisú auténtico', 5, 13, 7), ('Brownie tibio', 4, 12, 8), ('Exquisito', 5, 12, 9),
('Limonada natural', 5, 15, 10);


-- =============================================
-- 50 CALIFICACIONES ADICIONALES (Total 100)
-- =============================================

INSERT INTO calificacion (comentario_corto, puntuacion, id_platillo, id_usuario) VALUES 
('La mejor pasta que he probado', 5, 7, 10), ('Un poco frio el salmon', 3, 6, 11),
('El postre estaba increible', 5, 11, 12), ('Volvere por los tacos', 5, 8, 13),
('No me gusto la ensalada', 2, 10, 14), ('Cafe muy aromático', 5, 18, 15),
('La carne estaba en su punto', 5, 5, 16), ('Mucho tiempo de espera', 2, 9, 17),
('Porcion muy pequeña', 3, 1, 18), ('Los nachos son los mejores', 5, 1, 19),
('Muy picante para mi', 3, 19, 20), ('Desayuno muy completo', 5, 20, 1),
('El tiramisu es una delicia', 5, 13, 2), ('Vino de buena calidad', 4, 17, 3),
('Cerveza bien fria', 5, 16, 4), ('La limonada estaba agria', 2, 15, 5),
('Pan dulce muy fresco', 4, 12, 6), ('No vale lo que cuesta', 2, 3, 7),
('Sopa muy casera', 4, 4, 8), ('Alitas un poco quemadas', 3, 2, 9),
('Excelente servicio', 5, 5, 5), ('Muy recomendado', 5, 7, 15),
('Regresare con amigos', 4, 1, 12), ('El salmon estaba seco', 2, 6, 8),
('Pasta muy cremosa', 5, 7, 2), ('Me encanto la musica', 4, 9, 1),
('El flan es normal', 3, 14, 10), ('Chilaquiles muy picosos', 4, 19, 4),
('Omelette bien servido', 5, 20, 19), ('Cafe algo quemado', 2, 18, 11),
('Tacos de diez', 5, 8, 3), ('Corte NY espectacular', 5, 5, 14),
('Precios algo altos', 3, 13, 17), ('Brownie muy dulce', 4, 12, 13),
('Limonada refrescante', 5, 15, 7), ('La burger estaba ok', 3, 9, 6),
('Ensalada muy marchita', 1, 10, 16), ('Vino tinto excelente', 5, 17, 20),
('Bruschetta deliciosa', 4, 3, 5), ('Sopa de tortilla top', 5, 4, 9),
('No habia mesa disponible', 2, 7, 18), ('Pasta fria', 2, 7, 12),
('Amo el cheesecake', 5, 11, 4), ('Buena musica y comida', 4, 1, 2),
('Salmon muy fresco', 5, 6, 1), ('Tacos frios', 2, 8, 20),
('La mejor cerveza', 5, 16, 3), ('Porcion de fruta pequeña', 3, 19, 14),
('Omelette algo salado', 3, 20, 15), ('Desayuno excelente', 5, 19, 10);