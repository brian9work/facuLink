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


