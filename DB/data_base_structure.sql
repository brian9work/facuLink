-- MySQL Script generated by MySQL Workbench
-- Wed Feb 12 17:34:12 2025
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema facu_link
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `facu_link` ;

-- -----------------------------------------------------
-- Schema facu_link
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `facu_link` ;
USE `facu_link` ;



-- -----------------------------------------------------
-- Table `cat_type_of_transport`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `cat_type_of_transport` ;
CREATE TABLE IF NOT EXISTS `cat_type_of_transport` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(30) NOT NULL,
  `imagen` VARCHAR(30) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8mb3;



-- -----------------------------------------------------
-- Table `cat_line_of_transport`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `cat_line_of_transport` ;
CREATE TABLE IF NOT EXISTS `cat_line_of_transport` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(30) NOT NULL,
  `complete_name` VARCHAR(150) NOT NULL,
  `imagen` VARCHAR(30) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8mb3;



-- -----------------------------------------------------
-- Table `cat_municipalities`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `cat_municipalities` ;
CREATE TABLE IF NOT EXISTS `cat_municipalities` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(30) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8mb3;



-- -----------------------------------------------------
-- Table `cat_faculty`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `cat_faculty` ;
CREATE TABLE IF NOT EXISTS `cat_faculty` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `acronym` VARCHAR(30) NOT NULL,
  `name` VARCHAR(30) NOT NULL,
  `longitude` VARCHAR(30) NOT NULL,
  `latitude` VARCHAR(30) NOT NULL,
  `is_active` INT NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8mb3;



-- -----------------------------------------------------
-- Table `cat_degree`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `cat_degree` ;
CREATE TABLE IF NOT EXISTS `cat_degree` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `id_faculty` INT NOT NULL,
  `name` VARCHAR(30) NOT NULL,
  `is_active` INT NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  CONSTRAINT `id_faculty_fk`
    FOREIGN KEY (`id_faculty`)
    REFERENCES `cat_faculty` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8mb3;



-- -----------------------------------------------------
-- Table `transport`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `transport` ;
CREATE TABLE IF NOT EXISTS `transport` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `id_type_of_transport` INT NOT NULL,
  `id_line_of_transport` INT NOT NULL,
  `frequency` VARCHAR(15) NOT NULL,
  `name` VARCHAR(30) NOT NULL,
  `imagen` VARCHAR(30) NOT NULL,
  `origin` VARCHAR(20) NULL DEFAULT NULL,
  `destination` VARCHAR(20) NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id`),
  KEY `id_type_of_transport_idx` (`id_type_of_transport`),
  CONSTRAINT `type_of_transport_fk`
    FOREIGN KEY (`id_type_of_transport`)
    REFERENCES `cat_type_of_transport` (`id`),
  CONSTRAINT `line_of_transport_fk`
    FOREIGN KEY (`id_line_of_transport`)
    REFERENCES `cat_line_of_transport` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8mb3;



-- -----------------------------------------------------
-- Table `user`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `user` ;

CREATE TABLE IF NOT EXISTS `user` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(30) NOT NULL,
  `email` VARCHAR(30) NOT NULL,
  `imagen` VARCHAR(30) NOT NULL,
  `password` VARCHAR(30) NOT NULL,
  `reference` VARCHAR(30) NOT NULL,
  `is_active` TINYINT NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8mb3;


-- -----------------------------------------------------
-- Table `commentary`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `commentary` ;

CREATE TABLE IF NOT EXISTS `commentary` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `id_user` INT NOT NULL,
  `id_transport` INT NOT NULL,
  `comment` LONGTEXT NOT NULL,
  `is_banned` INT NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id`),
  CONSTRAINT `user_commentary_fx`
    FOREIGN KEY (`id_user`)
    REFERENCES `user` (`id`),
  CONSTRAINT `transport_commentary_fx`
    FOREIGN KEY (`id_transport`)
    REFERENCES `transport` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8mb3;


-- -----------------------------------------------------
-- Table `calification`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `calification` ;

CREATE TABLE IF NOT EXISTS `calification` (
  `id_user` INT NOT NULL,
  `id_transport` INT NOT NULL,
  `calification` INT NOT NULL,
  CONSTRAINT `user_calification_fx`
    FOREIGN KEY (`id_user`)
    REFERENCES `user` (`id`),
  CONSTRAINT `transport_calification_fx`
    FOREIGN KEY (`id_transport`)
    REFERENCES `transport` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8mb3;


-- -----------------------------------------------------
-- Table `stop`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `stop` ;

CREATE TABLE IF NOT EXISTS `stop` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `id_municipalities` INT NOT NULL,
  `longitude` VARCHAR(30) NOT NULL,
  `latitude` VARCHAR(30) NOT NULL,
  `name` VARCHAR(60) NULL DEFAULT NULL,
  `imagen` VARCHAR(30) NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  CONSTRAINT `id_municipalities_fk`
    FOREIGN KEY (`id_municipalities`)
    REFERENCES `cat_municipalities` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8mb3;



-- -----------------------------------------------------
-- Table `transport_stop`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `transport_stop` ;

CREATE TABLE IF NOT EXISTS `transport_stop` (
  `id_transport` INT NOT NULL,
  `id_stop` INT NOT NULL,
  KEY `id_transport_idx` (`id_transport`),
  KEY `id_stop_idx` (`id_stop`),
  CONSTRAINT `transport_stop_transport_fk`
    FOREIGN KEY (`id_transport`)
    REFERENCES `transport` (`id`),
  CONSTRAINT `transport_stop_stop_fk`
    FOREIGN KEY (`id_stop`)
    REFERENCES `stop` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8mb3;



-- -----------------------------------------------------
-- Table `route_cordinates`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `route_cordinates` ;

CREATE TABLE IF NOT EXISTS `route_cordinates` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `id_route` INT NOT NULL,
  `longitude` VARCHAR(30) NOT NULL,
  `latitude` VARCHAR(30) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  CONSTRAINT `routes_cordinates_transport_fk`
    FOREIGN KEY (`id_route`)
    REFERENCES `transport` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8mb3;



-- -----------------------------------------------------
-- Table `stop_routes`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `stop_routes` ;

CREATE TABLE IF NOT EXISTS `stop_routes` (
  `stop_id_from` INT NOT NULL,
  `stop_id_to` INT NOT NULL,
  `distance` INT NOT NULL,
  `time` INT NOT NULL,
  `price` FLOAT NOT NULL,
  CONSTRAINT `stop_routes_stop_from_fx`
    FOREIGN KEY (`stop_id_from`)
    REFERENCES `stop` (`id`),
  CONSTRAINT `stop_routes_stop_to_fx`
    FOREIGN KEY (`stop_id_to`)
    REFERENCES `stop` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8mb3;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
