-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Feb 21, 2025 at 06:31 PM
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

-- --------------------------------------------------------

--
-- Table structure for table `calification`
--

DROP TABLE IF EXISTS `calification`;
CREATE TABLE IF NOT EXISTS `calification` (
  `id_user` int NOT NULL,
  `id_transport` int NOT NULL,
  `calification` int NOT NULL,
  KEY `user_calification_fx` (`id_user`),
  KEY `transport_calification_fx` (`id_transport`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- --------------------------------------------------------

--
-- Table structure for table `cat_degree`
--

DROP TABLE IF EXISTS `cat_degree`;
CREATE TABLE IF NOT EXISTS `cat_degree` (
  `id` int NOT NULL AUTO_INCREMENT,
  `id_faculty` int NOT NULL,
  `name` varchar(30) NOT NULL,
  `is_active` int NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  KEY `id_faculty_fk` (`id_faculty`)
) ENGINE=InnoDB AUTO_INCREMENT=108 DEFAULT CHARSET=utf8mb3;

--
-- Dumping data for table `cat_degree`
--

INSERT INTO `cat_degree` (`id`, `id_faculty`, `name`, `is_active`) VALUES
(1, 1, 'Licenciatura en Biología', 1),
(2, 1, 'Licenciatura en Ciencias Ambie', 1),
(3, 1, 'Licenciatura en Medicina Veter', 1),
(4, 1, 'Licenciatura en Naturopatía', 1),
(5, 1, 'Maestría en Ciencias en Gestió', 1),
(6, 1, 'Maestría en Etología Veterinar', 1),
(7, 2, 'Licenciatura en Enfermería y O', 1),
(8, 2, 'Licenciatura en Fisioterapia', 1),
(9, 2, 'Licenciatura en Médico Cirujan', 1),
(10, 2, 'Licenciatura en Nutrición', 1),
(11, 2, 'Licenciatura en Química Clínic', 1),
(12, 2, 'Especialidad en Enfermería Per', 1),
(13, 2, 'Especialidad en Salud Pública', 1),
(14, 2, 'Maestría en Ciencias de la Sal', 1),
(15, 3, 'Licenciatura en Cirujano Denti', 1),
(16, 3, 'Especialidad en Endodoncia', 1),
(17, 3, 'Maestría en Estomatología Inte', 1),
(18, 4, 'Licenciatura en Ingeniería en ', 1),
(19, 4, 'Licenciatura en Ingeniería en ', 1),
(20, 4, 'Licenciatura en Ingeniería Mec', 1),
(21, 4, 'Licenciatura en Ingeniería Quí', 1),
(22, 4, 'Licenciatura en Inteligencia A', 1),
(23, 4, 'Licenciatura en Matemáticas Ap', 1),
(24, 4, 'Licenciatura en Química Indust', 1),
(25, 4, 'Maestría en Ciencias de la Cal', 1),
(26, 4, 'Maestría en Ciencias en Ingeni', 1),
(27, 4, 'Maestría en Ciencias en Sistem', 1),
(28, 4, 'Maestría en Ingeniería de Soft', 1),
(29, 4, 'Maestría en Matemáticas', 1),
(30, 4, 'Maestría en Uso y Gestión de l', 1),
(31, 4, 'Doctorado en Ciencias en Ingen', 1),
(32, 4, 'Doctorado en Ciencias en Siste', 1),
(33, 5, 'Licenciatura en Administración', 1),
(34, 5, 'Licenciatura en Contaduría Púb', 1),
(35, 5, 'Licenciatura en Economía y Fin', 1),
(36, 5, 'Licenciatura en Negocios Inter', 1),
(37, 5, 'Licenciatura en Turismo Intern', 1),
(38, 6, 'Licenciatura en Ciencias Polít', 1),
(39, 6, 'Licenciatura en Criminología', 1),
(40, 6, 'Licenciatura en Derecho', 1),
(41, 7, 'Licenciatura en Psicología', 1),
(42, 7, 'Licenciatura en Psicoterapia', 1),
(43, 7, 'Licenciatura en Sociología', 1),
(44, 7, 'Licenciatura en Trabajo Social', 1),
(45, 7, 'Maestría en Ciencias Sociales', 1),
(46, 7, 'Maestría en Estudios de Género', 1),
(47, 7, 'Maestría en Psicología', 1),
(48, 7, 'Maestría en Trabajo Social', 1),
(49, 7, 'Doctorado en Ciencias Sociales', 1),
(50, 8, 'Licenciatura en Ciencias de la', 1),
(51, 8, 'Licenciatura en Comunicación e', 1),
(52, 8, 'Licenciatura en Educación Inic', 1),
(53, 8, 'Especialidad en Educación Inic', 1),
(54, 8, 'Maestría en Educación Inicial ', 1),
(55, 9, 'Licenciatura en Antropología', 1),
(56, 9, 'Licenciatura en Enseñanza de L', 1),
(57, 9, 'Licenciatura en Filosofía', 1),
(58, 9, 'Licenciatura en Historia', 1),
(59, 9, 'Licenciatura en Lengua y Liter', 1),
(60, 9, 'Maestría en Estudios del Discu', 1),
(61, 9, 'Maestría en Estudios Interdisc', 1),
(62, 10, 'Licenciatura en Ciencias de la', 1),
(63, 10, 'Licenciatura en Educación Espe', 1),
(64, 10, 'Licenciatura en Gerontología S', 1),
(65, 10, 'Maestría en Educación Especial', 1),
(66, 10, 'Maestría en Terapia Familiar', 1),
(67, 10, 'Doctorado en Ciencias Aplicada', 1),
(68, 11, 'Licenciatura en Arquitectura', 1),
(69, 11, 'Licenciatura en Artes Visuales', 1),
(70, 11, 'Licenciatura en Diseño Automot', 1),
(71, 11, 'Licenciatura en Diseño Gráfico', 1),
(72, 11, 'Licenciatura en Diseño Textil', 1),
(73, 11, 'Maestría en Diseño del Espacio', 1),
(74, 11, 'Maestría en Gestión de Obra Pú', 1),
(75, 12, 'Licenciatura en Administración', 1),
(76, 12, 'Licenciatura en Ciencias de la', 1),
(77, 12, 'Licenciatura en Ciencias Polít', 1),
(78, 12, 'Licenciatura en Contaduría Púb', 1),
(79, 12, 'Licenciatura en Derecho', 1),
(80, 12, 'Licenciatura en Educación Inic', 1),
(81, 12, 'Licenciatura en Enseñanza de L', 1),
(82, 12, 'Licenciatura en Ingeniería en ', 1),
(83, 12, 'Licenciatura en Nutrición', 1),
(84, 12, 'Licenciatura en Psicología', 1),
(85, 12, 'Licenciatura en Turismo Intern', 1),
(86, 12, 'Maestría en Educación', 1),
(87, 13, 'Maestría en Ciencias Biológica', 1),
(88, 13, 'Doctorado en Ciencias Biológic', 1),
(89, 14, 'Maestría en Biotecnología y Ma', 1),
(90, 15, 'Maestría en Ciencias en Sistem', 1),
(91, 15, 'Doctorado en Ciencias Ambienta', 1),
(92, 16, 'Maestría en Argumentación Jurí', 1),
(93, 16, 'Maestría en Derecho Constituci', 1),
(94, 16, 'Maestría en Derecho Fiscal', 1),
(95, 16, 'Maestría en Derecho Penal Cont', 1),
(96, 16, 'Maestría en Derechos Humanos', 1),
(97, 16, 'Maestría en Fiscalización, Tra', 1),
(98, 16, 'Maestría en Gobierno y Buena P', 1),
(99, 16, 'Doctorado en Derecho y Argumen', 1),
(100, 16, 'Doctorado en Derechos Humanos', 1),
(101, 17, 'Maestría en Administración', 1),
(102, 17, 'Maestría en Administración Tri', 1),
(103, 17, 'Doctorado en Ciencias Administ', 1),
(104, 18, 'Maestría en Análisis Regional', 1),
(105, 18, 'Doctorado en Estudios Territor', 1),
(106, 19, 'Maestría en Desarrollo Educati', 1),
(107, 19, 'Doctorado en Investigación Edu', 1);

-- --------------------------------------------------------

--
-- Table structure for table `cat_faculty`
--

DROP TABLE IF EXISTS `cat_faculty`;
CREATE TABLE IF NOT EXISTS `cat_faculty` (
  `id` int NOT NULL AUTO_INCREMENT,
  `acronym` varchar(30) NOT NULL,
  `name` varchar(30) NOT NULL,
  `longitude` varchar(30) NOT NULL,
  `latitude` varchar(30) NOT NULL,
  `is_active` int NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8mb3;

--
-- Dumping data for table `cat_faculty`
--

INSERT INTO `cat_faculty` (`id`, `acronym`, `name`, `longitude`, `latitude`, `is_active`) VALUES
(1, 'FA', 'Facultad de Agrobiología', '0', '0', 1),
(2, 'FCS', 'Facultad de Ciencias de la Sal', '0', '0', 1),
(3, 'FO', 'Facultad de Odontología', '0', '0', 1),
(4, 'FCBIyT', 'Facultad de Ciencias Básicas I', '0', '0', 1),
(5, 'FCEA', 'Facultad de Ciencias Económico', '0', '0', 1),
(6, 'FDCPC', 'Facultad de Derecho, Ciencias ', '0', '0', 1),
(7, 'FTSSyP', 'Facultad de Trabajo Social, So', '0', '0', 1),
(8, 'FCE', 'Facultad de Ciencias de la Edu', '0', '0', 1),
(9, 'FFL', 'Facultad de Filosofía y Letras', '0', '0', 1),
(10, 'FCDH', 'Facultad de Ciencias para el D', '0', '0', 1),
(11, 'FDAA', 'Facultad de Diseño, Arte y Arq', '0', '0', 1),
(12, 'UAMCC', 'Unidad Académica Multidiscipli', '0', '0', 1),
(13, 'CTBC', 'Centro Tlaxcala de Biología de', '0', '0', 1),
(14, 'CICB', 'Centro de Investigación de Cie', '0', '0', 1),
(15, 'CIGA', 'Centro de Investigación en Gen', '0', '0', 1),
(16, 'CIJP', 'Centro de Investigaciones Jurí', '0', '0', 1),
(17, 'CICA', 'Centro de Investigación en Cie', '0', '0', 1),
(18, 'CIISDR', 'Centro de Investigaciones Inte', '0', '0', 1),
(19, 'CIE', 'Centro de Investigación Educat', '0', '0', 1);

-- --------------------------------------------------------

--
-- Table structure for table `cat_line_of_transport`
--

DROP TABLE IF EXISTS `cat_line_of_transport`;
CREATE TABLE IF NOT EXISTS `cat_line_of_transport` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(30) NOT NULL,
  `complete_name` varchar(150) NOT NULL,
  `imagen` varchar(30) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb3;

--
-- Dumping data for table `cat_line_of_transport`
--

INSERT INTO `cat_line_of_transport` (`id`, `name`, `complete_name`, `imagen`) VALUES
(1, 'atha', 'Autotransportes Tlaxcala, Apizaco, Huamantla', ''),
(2, 'expreso', '', ''),
(3, 'flecha azul', '', ''),
(4, 'tepetitla', '', ''),
(5, 'sit', 'servicios intermunicipales de transporte', ''),
(6, 'aust', 'autotransportes urbanos y suburbanos texcalac', ''),
(7, 'colectivo', '', ''),
(8, 'otro', '', '');

-- --------------------------------------------------------

--
-- Table structure for table `cat_municipalities`
--

DROP TABLE IF EXISTS `cat_municipalities`;
CREATE TABLE IF NOT EXISTS `cat_municipalities` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(30) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=61 DEFAULT CHARSET=utf8mb3;

--
-- Dumping data for table `cat_municipalities`
--

INSERT INTO `cat_municipalities` (`id`, `name`) VALUES
(1, 'Amaxac de Guerrero'),
(2, 'Apetatitlán de Antonio Carvaja'),
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
(15, 'Ixtacuixtla de Mariano Matamor'),
(16, 'Ixtenco'),
(17, 'Mazatecochco de José María Mor'),
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
(37, 'Ziltlaltépec de Trinidad Sánch'),
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
(60, 'Santa Isabel Xiloxoxtla');

-- --------------------------------------------------------

--
-- Table structure for table `cat_type_of_transport`
--

DROP TABLE IF EXISTS `cat_type_of_transport`;
CREATE TABLE IF NOT EXISTS `cat_type_of_transport` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(30) NOT NULL,
  `imagen` varchar(30) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb3;

--
-- Dumping data for table `cat_type_of_transport`
--

INSERT INTO `cat_type_of_transport` (`id`, `name`, `imagen`) VALUES
(1, 'combi', ''),
(2, 'micro', ''),
(3, 'autobus', ''),
(4, 'colectivo', ''),
(5, 'ban', ''),
(6, 'otro', '');

-- --------------------------------------------------------

--
-- Table structure for table `commentary`
--

DROP TABLE IF EXISTS `commentary`;
CREATE TABLE IF NOT EXISTS `commentary` (
  `id` int NOT NULL AUTO_INCREMENT,
  `id_user` int NOT NULL,
  `id_transport` int NOT NULL,
  `comment` longtext NOT NULL,
  `is_banned` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  KEY `user_commentary_fx` (`id_user`),
  KEY `transport_commentary_fx` (`id_transport`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- --------------------------------------------------------

--
-- Table structure for table `route_cordinates`
--

DROP TABLE IF EXISTS `route_cordinates`;
CREATE TABLE IF NOT EXISTS `route_cordinates` (
  `id` int NOT NULL AUTO_INCREMENT,
  `id_route` int NOT NULL,
  `longitude` varchar(30) NOT NULL,
  `latitude` varchar(30) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  KEY `routes_cordinates_transport_fk` (`id_route`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- --------------------------------------------------------

--
-- Table structure for table `stop`
--

DROP TABLE IF EXISTS `stop`;
CREATE TABLE IF NOT EXISTS `stop` (
  `id` int NOT NULL AUTO_INCREMENT,
  `id_municipalities` int NOT NULL,
  `longitude` varchar(30) NOT NULL,
  `latitude` varchar(30) NOT NULL,
  `name` varchar(60) DEFAULT NULL,
  `imagen` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  KEY `id_municipalities_fk` (`id_municipalities`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- --------------------------------------------------------

--
-- Table structure for table `stop_routes`
--

DROP TABLE IF EXISTS `stop_routes`;
CREATE TABLE IF NOT EXISTS `stop_routes` (
  `stop_id_from` int NOT NULL,
  `stop_id_to` int NOT NULL,
  `distance` int NOT NULL,
  `time` int NOT NULL,
  `price` float NOT NULL,
  KEY `stop_routes_stop_from_fx` (`stop_id_from`),
  KEY `stop_routes_stop_to_fx` (`stop_id_to`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- --------------------------------------------------------

--
-- Table structure for table `transport`
--

DROP TABLE IF EXISTS `transport`;
CREATE TABLE IF NOT EXISTS `transport` (
  `id` int NOT NULL AUTO_INCREMENT,
  `id_type_of_transport` int NOT NULL,
  `id_line_of_transport` int NOT NULL,
  `frequency` varchar(15) NOT NULL,
  `name` varchar(30) NOT NULL,
  `imagen` varchar(30) NOT NULL,
  `origin` varchar(20) DEFAULT NULL,
  `destination` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  KEY `id_type_of_transport_idx` (`id_type_of_transport`),
  KEY `line_of_transport_fk` (`id_line_of_transport`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- --------------------------------------------------------

--
-- Table structure for table `transport_stop`
--

DROP TABLE IF EXISTS `transport_stop`;
CREATE TABLE IF NOT EXISTS `transport_stop` (
  `id_transport` int NOT NULL,
  `id_stop` int NOT NULL,
  KEY `id_transport_idx` (`id_transport`),
  KEY `id_stop_idx` (`id_stop`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(30) NOT NULL,
  `email` varchar(30) NOT NULL,
  `imagen` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL,
  `reference` varchar(30) NOT NULL,
  `is_active` tinyint NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `calification`
--
ALTER TABLE `calification`
  ADD CONSTRAINT `transport_calification_fx` FOREIGN KEY (`id_transport`) REFERENCES `transport` (`id`),
  ADD CONSTRAINT `user_calification_fx` FOREIGN KEY (`id_user`) REFERENCES `user` (`id`);

--
-- Constraints for table `cat_degree`
--
ALTER TABLE `cat_degree`
  ADD CONSTRAINT `id_faculty_fk` FOREIGN KEY (`id_faculty`) REFERENCES `cat_faculty` (`id`);

--
-- Constraints for table `commentary`
--
ALTER TABLE `commentary`
  ADD CONSTRAINT `transport_commentary_fx` FOREIGN KEY (`id_transport`) REFERENCES `transport` (`id`),
  ADD CONSTRAINT `user_commentary_fx` FOREIGN KEY (`id_user`) REFERENCES `user` (`id`);

--
-- Constraints for table `route_cordinates`
--
ALTER TABLE `route_cordinates`
  ADD CONSTRAINT `routes_cordinates_transport_fk` FOREIGN KEY (`id_route`) REFERENCES `transport` (`id`);

--
-- Constraints for table `stop`
--
ALTER TABLE `stop`
  ADD CONSTRAINT `id_municipalities_fk` FOREIGN KEY (`id_municipalities`) REFERENCES `cat_municipalities` (`id`);

--
-- Constraints for table `stop_routes`
--
ALTER TABLE `stop_routes`
  ADD CONSTRAINT `stop_routes_stop_from_fx` FOREIGN KEY (`stop_id_from`) REFERENCES `stop` (`id`),
  ADD CONSTRAINT `stop_routes_stop_to_fx` FOREIGN KEY (`stop_id_to`) REFERENCES `stop` (`id`);

--
-- Constraints for table `transport`
--
ALTER TABLE `transport`
  ADD CONSTRAINT `line_of_transport_fk` FOREIGN KEY (`id_line_of_transport`) REFERENCES `cat_line_of_transport` (`id`),
  ADD CONSTRAINT `type_of_transport_fk` FOREIGN KEY (`id_type_of_transport`) REFERENCES `cat_type_of_transport` (`id`);

--
-- Constraints for table `transport_stop`
--
ALTER TABLE `transport_stop`
  ADD CONSTRAINT `transport_stop_stop_fk` FOREIGN KEY (`id_stop`) REFERENCES `stop` (`id`),
  ADD CONSTRAINT `transport_stop_transport_fk` FOREIGN KEY (`id_transport`) REFERENCES `transport` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
