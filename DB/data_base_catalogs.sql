-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Feb 14, 2025 at 12:13 AM
-- Server version: 8.3.0
-- PHP Version: 8.2.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `facu_link`
--

USE `facu_link` ;
-- --------------------------------------------------------



-- -----------------------------------------------------
-- Table `cat_type_of_transport`
-- -----------------------------------------------------
INSERT INTO `cat_type_of_transport` (`name`, `imagen`) VALUES
('combi', ''),
('micro', ''),
('autobus', ''),
('colectivo', ''),
('ban', ''),
('otro', '');



-- -----------------------------------------------------
-- Table `cat_line_of_transport`
-- -----------------------------------------------------
INSERT INTO `cat_line_of_transport` (`name`, `complete_name`, `imagen`) VALUES
('atha', 'Autotransportes Tlaxcala, Apizaco, Huamantla', ''),
('expreso', '', ''),
('flecha azul', '', ''),
('tepetitla', '', ''),
('sit', 'servicios intermunicipales de transporte', ''),
('aust', 'autotransportes urbanos y suburbanos texcalac', ''),
('colectivo', '', ''),
('otro', '', '');


-- -----------------------------------------------------
-- Table `cat_municipalities`
-- -----------------------------------------------------
INSERT INTO `cat_municipalities` (`id`, `name`) VALUES
(1, 'Amaxac de Guerrero'),
(2, 'Apetatitlán de Antonio Carvajal'),
(3, 'Atlangatepec'),
(4, 'Atltzayanca'),
(5, 'Apizaco'),
(6, 'Calpulalpan'),
(7, 'El Carmen Tequexquitla'),
(8, 'Cuapiaxtla'),
(9, 'Cuaxomulco'),
(10, 'Chiautempan'),
(11, 'Muñoz de Domingo Arenas'),
(12, 'Españita'),
(13, 'Huamantla'),
(14, 'Hueyotlipan'),
(15, 'Ixtacuixtla de Mariano Matamoros'),
(16, 'Ixtenco'),
(17, 'Mazatecochco de José María Morelos'),
(18, 'Contla de Juan Cuamatzi'),
(19, 'Tepetitla de Lardizábal'),
(20, 'Sanctórum de Lázaro Cárdenas'),
(21, 'Nanacamilpa de Mariano Arista'),
(22, 'Acuamanala de Miguel Hidalgo'),
(23, 'Natívitas'),
(24, 'Panotla'),
(25, 'San Pablo del Monte'),
(26, 'Santa Cruz Tlaxcala'),
(27, 'Tenancingo'),
(28, 'Teolocholco'),
(29, 'Tepeyanco'),
(30, 'Terrenate'),
(31, 'Tetla de la Solidaridad'),
(32, 'Tetlatlahuca'),
(33, 'Tlaxcala'),
(34, 'Tlaxco'),
(35, 'Tocatlán'),
(36, 'Totolac'),
(37, 'Ziltlaltépec de Trinidad Sánchez Santos'),
(38, 'Tzompantepec'),
(39, 'Xaloztoc'),
(40, 'Xaltocan'),
(41, 'Papalotla de Xicohténcatl'),
(42, 'Xicohtzinco'),
(43, 'Yauhquemehcan'),
(44, 'Zacatelco'),
(45, 'Benito Juárez'),
(46, 'Emiliano Zapata'),
(47, 'Lázaro Cárdenas'),
(48, 'La Magdalena Tlaltelulco'),
(49, 'San Damián Texóloc'),
(50, 'San Francisco Tetlanohcan'),
(51, 'San Jerónimo Zacualpan'),
(52, 'San José Teacalco'),
(53, 'San Juan Huactzinco'),
(54, 'San Lorenzo Axocomanitla'),
(55, 'San Lucas Tecopilco'),
(56, 'Santa Ana Nopalucan'),
(57, 'Santa Apolonia Teacalco'),
(58, 'Santa Catarina Ayometla'),
(59, 'Santa Cruz Quilehtla'),
(60, 'Santa Isabel Xiloxoxtla')
;


-- -----------------------------------------------------
-- Table `cat_faculty`
-- -----------------------------------------------------
INSERT INTO `cat_faculty` (`id`, `acronym`, `name`, `longitude`, `latitude`, `is_active`) VALUES
    (1, 'FA', 'Facultad de Agrobiología', '0', '0', 1),
    (2, 'FCS', 'Facultad de Ciencias de la Salud', '0', '0', 1),
    (3, 'FO', 'Facultad de Odontología', '0', '0', 1),
    (4, 'FCBIyT', 'Facultad de Ciencias Básicas Ingeniería y Tecnología', '0', '0', 1),
    (5, 'FCEA', 'Facultad de Ciencias Económico Administrativas', '0', '0', 1),
    (6, 'FDCPC', 'Facultad de Derecho, Ciencias Políticas y Criminología', '0', '0', 1),
    (7, 'FTSSyP', 'Facultad de Trabajo Social, Sociología y Psicología', '0', '0', 1),
    (8, 'FCE', 'Facultad de Ciencias de la Educación', '0', '0', 1),
    (9, 'FFL', 'Facultad de Filosofía y Letras', '0', '0', 1),
    (10, 'FCDH', 'Facultad de Ciencias para el Desarrollo Humano', '0', '0', 1),
    (11, 'FDAA', 'Facultad de Diseño, Arte y Arquitectura', '0', '0', 1),
    (12, 'UAMCC', 'Unidad Académica Multidisciplinaria campus Calpulalpan', '0', '0', 1),
    (13, 'CTBC', 'Centro Tlaxcala de Biología de la Conducta', '0', '0', 1),
    (14, 'CICB', 'Centro de Investigación de Ciencias Biológicas', '0', '0', 1),
    (15, 'CIGA', 'Centro de Investigación en Genética y Ambiente', '0', '0', 1),
    (16, 'CIJP', 'Centro de Investigaciones Jurídico-Políticas', '0', '0', 1),
    (17, 'CICA', 'Centro de Investigación en Ciencias Administrativas', '0', '0', 1),
    (18, 'CIISDR', 'Centro de Investigaciones Interdisciplinarias Sobre Desarrollo Regional', '0', '0', 1),
    (19, 'CIE', 'Centro de Investigación Educativa', '0', '0', 1);



-- -----------------------------------------------------
-- Table `cat_degree`
-- -----------------------------------------------------
-- Facultad de Agrobiología (id = 1)
INSERT INTO `cat_degree` (`id_faculty`, `name`, `is_active`) VALUES
    (1, 'Licenciatura en Biología', 1),
    (1, 'Licenciatura en Ciencias Ambientales', 1),
    (1, 'Licenciatura en Medicina Veterinaria y Zootecnia', 1),
    (1, 'Licenciatura en Naturopatía', 1),
    (1, 'Maestría en Ciencias en Gestión Integral de Cuencas Hidrográficas', 1),
    (1, 'Maestría en Etología Veterinaria', 1);

-- Facultad de Ciencias de la Salud (id = 2)
INSERT INTO `cat_degree` (`id_faculty`, `name`, `is_active`) VALUES
    (2, 'Licenciatura en Enfermería y Obstetricia', 1),
    (2, 'Licenciatura en Fisioterapia', 1),
    (2, 'Licenciatura en Médico Cirujano', 1),
    (2, 'Licenciatura en Nutrición', 1),
    (2, 'Licenciatura en Química Clínica', 1),
    (2, 'Especialidad en Enfermería Perinatal', 1),
    (2, 'Especialidad en Salud Pública', 1),
    (2, 'Maestría en Ciencias de la Salud Pública', 1);

-- Facultad de Odontología (id = 3)
INSERT INTO `cat_degree` (`id_faculty`, `name`, `is_active`) VALUES
    (3, 'Licenciatura en Cirujano Dentista', 1),
    (3, 'Especialidad en Endodoncia', 1),
    (3, 'Maestría en Estomatología Integral del Niño y el Adolescente', 1);

-- Facultad de Ciencias Básicas Ingeniería y Tecnología (id = 4)
INSERT INTO `cat_degree` (`id_faculty`, `name`, `is_active`) VALUES
    (4, 'Licenciatura en Ingeniería en Computación', 1),
    (4, 'Licenciatura en Ingeniería en Sistemas Electrónicos', 1),
    (4, 'Licenciatura en Ingeniería Mecánica', 1),
    (4, 'Licenciatura en Ingeniería Química', 1),
    (4, 'Licenciatura en Inteligencia Artificial', 1),
    (4, 'Licenciatura en Matemáticas Aplicadas', 1),
    (4, 'Licenciatura en Química Industrial', 1),
    (4, 'Maestría en Ciencias de la Calidad', 1),
    (4, 'Maestría en Ciencias en Ingeniería Química', 1),
    (4, 'Maestría en Ciencias en Sistemas Computacionales y Electrónicos', 1),
    (4, 'Maestría en Ingeniería de Software', 1),
    (4, 'Maestría en Matemáticas', 1),
    (4, 'Maestría en Uso y Gestión de las Tecnologías de la Información', 1),
    (4, 'Doctorado en Ciencias en Ingeniería Química', 1),
    (4, 'Doctorado en Ciencias en Sistemas Computacionales y Electrónicos', 1);

-- Facultad de Ciencias Económico Administrativas (id = 5)
INSERT INTO `cat_degree` (`id_faculty`, `name`, `is_active`) VALUES
    (5, 'Licenciatura en Administración', 1),
    (5, 'Licenciatura en Contaduría Pública', 1),
    (5, 'Licenciatura en Economía y Finanzas', 1),
    (5, 'Licenciatura en Negocios Internacionales', 1),
    (5, 'Licenciatura en Turismo Internacional', 1);

-- Facultad de Derecho, Ciencias Políticas y Criminología (id = 6)
INSERT INTO `cat_degree` (`id_faculty`, `name`, `is_active`) VALUES
    (6, 'Licenciatura en Ciencias Políticas y Administración Pública', 1),
    (6, 'Licenciatura en Criminología', 1),
    (6, 'Licenciatura en Derecho', 1);

-- Facultad de Trabajo Social, Sociología y Psicología (id = 7)
INSERT INTO `cat_degree` (`id_faculty`, `name`, `is_active`) VALUES
    (7, 'Licenciatura en Psicología', 1),
    (7, 'Licenciatura en Psicoterapia', 1),
    (7, 'Licenciatura en Sociología', 1),
    (7, 'Licenciatura en Trabajo Social', 1),
    (7, 'Maestría en Ciencias Sociales', 1),
    (7, 'Maestría en Estudios de Género', 1),
    (7, 'Maestría en Psicología', 1),
    (7, 'Maestría en Trabajo Social', 1),
    (7, 'Doctorado en Ciencias Sociales', 1);

-- Facultad de Ciencias de la Educación (id = 8)
INSERT INTO `cat_degree` (`id_faculty`, `name`, `is_active`) VALUES
    (8, 'Licenciatura en Ciencias de la Educación', 1),
    (8, 'Licenciatura en Comunicación e Innovación Educativa', 1),
    (8, 'Licenciatura en Educación Inicial y Gestión de Instituciones', 1),
    (8, 'Especialidad en Educación Inicial y Gestión de Instituciones', 1),
    (8, 'Maestría en Educación Inicial y Gestión de Instituciones', 1);

-- Facultad de Filosofía y Letras (id = 9)
INSERT INTO `cat_degree` (`id_faculty`, `name`, `is_active`) VALUES
    (9, 'Licenciatura en Antropología', 1),
    (9, 'Licenciatura en Enseñanza de Lenguas', 1),
    (9, 'Licenciatura en Filosofía', 1),
    (9, 'Licenciatura en Historia', 1),
    (9, 'Licenciatura en Lengua y Literatura Hispanoamericana', 1),
    (9, 'Maestría en Estudios del Discurso y Literacidades Académicas', 1),
    (9, 'Maestría en Estudios Interdisciplinarios en Humanidades', 1);

-- Facultad de Ciencias para el Desarrollo Humano (id = 10)
INSERT INTO `cat_degree` (`id_faculty`, `name`, `is_active`) VALUES
    (10, 'Licenciatura en Ciencias de la Familia', 1),
    (10, 'Licenciatura en Educación Especial', 1),
    (10, 'Licenciatura en Gerontología Social', 1),
    (10, 'Maestría en Educación Especial', 1),
    (10, 'Maestría en Terapia Familiar', 1),
    (10, 'Doctorado en Ciencias Aplicadas a la Educación Especial', 1);

-- Facultad de Diseño, Arte y Arquitectura (id = 11)
INSERT INTO `cat_degree` (`id_faculty`, `name`, `is_active`) VALUES
    (11, 'Licenciatura en Arquitectura', 1),
    (11, 'Licenciatura en Artes Visuales', 1),
    (11, 'Licenciatura en Diseño Automotriz', 1),
    (11, 'Licenciatura en Diseño Gráfico', 1),
    (11, 'Licenciatura en Diseño Textil', 1),
    (11, 'Maestría en Diseño del Espacio Interior', 1),
    (11, 'Maestría en Gestión de Obra Pública Municipal', 1);

-- Unidad Académica Multidisciplinaria campus Calpulalpan (id = 12)
INSERT INTO `cat_degree` (`id_faculty`, `name`, `is_active`) VALUES
    (12, 'Licenciatura en Administración', 1),
    (12, 'Licenciatura en Ciencias de la Educación', 1),
    (12, 'Licenciatura en Ciencias Políticas y Administración Pública', 1),
    (12, 'Licenciatura en Contaduría Pública', 1),
    (12, 'Licenciatura en Derecho', 1),
    (12, 'Licenciatura en Educación Inicial y Gestión de Instituciones', 1),
    (12, 'Licenciatura en Enseñanza de Lenguas', 1),
    (12, 'Licenciatura en Ingeniería en Computación', 1),
    (12, 'Licenciatura en Nutrición', 1),
    (12, 'Licenciatura en Psicología', 1),
    (12, 'Licenciatura en Turismo Internacional', 1),
    (12, 'Maestría en Educación', 1);

-- Centro Tlaxcala de Biología de la Conducta (id = 13)
INSERT INTO `cat_degree` (`id_faculty`, `name`, `is_active`) VALUES
    (13, 'Maestría en Ciencias Biológicas', 1),
    (13, 'Doctorado en Ciencias Biológicas', 1);

-- Centro de Investigación de Ciencias Biológicas (id = 14)
INSERT INTO `cat_degree` (`id_faculty`, `name`, `is_active`) VALUES
    (14, 'Maestría en Biotecnología y Manejo de Recursos Naturales', 1);

-- Centro de Investigación en Genética y Ambiente (id = 15)
INSERT INTO `cat_degree` (`id_faculty`, `name`, `is_active`) VALUES
    (15, 'Maestría en Ciencias en Sistemas del Ambiente', 1),
    (15, 'Doctorado en Ciencias Ambientales', 1);

-- Centro de Investigaciones Jurídico-Políticas (id = 16)
INSERT INTO `cat_degree` (`id_faculty`, `name`, `is_active`) VALUES
    (16, 'Maestría en Argumentación Jurídica', 1),
    (16, 'Maestría en Derecho Constitucional y Procesal Constitucional', 1),
    (16, 'Maestría en Derecho Fiscal', 1),
    (16, 'Maestría en Derecho Penal Contradictorio Adversarial', 1),
    (16, 'Maestría en Derechos Humanos', 1),
    (16, 'Maestría en Fiscalización, Transparencia y Rendición de Cuentas', 1),
    (16, 'Maestría en Gobierno y Buena Política', 1),
    (16, 'Doctorado en Derecho y Argumentación Jurídica', 1),
    (16, 'Doctorado en Derechos Humanos', 1);

-- Centro de Investigación en Ciencias Administrativas (id = 17)
INSERT INTO `cat_degree` (`id_faculty`, `name`, `is_active`) VALUES
    (17, 'Maestría en Administración', 1),
    (17, 'Maestría en Administración Tributaria', 1),
    (17, 'Doctorado en Ciencias Administrativas', 1);

-- Centro de Investigaciones Interdisciplinarias Sobre Desarrollo Regional (id = 18)
INSERT INTO `cat_degree` (`id_faculty`, `name`, `is_active`) VALUES
    (18, 'Maestría en Análisis Regional', 1),
    (18, 'Doctorado en Estudios Territoriales', 1);

-- Centro de Investigación Educativa (id = 19)
INSERT INTO `cat_degree` (`id_faculty`, `name`, `is_active`) VALUES
    (19, 'Maestría en Desarrollo Educativo e Investigación', 1),
    (19, 'Doctorado en Investigación Educativa', 1);