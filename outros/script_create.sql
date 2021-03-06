-- MySQL Script generated by MySQL Workbench
-- Wed Nov 22 17:25:58 2017
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema sistema
-- -----------------------------------------------------
-- Banco de dados utilizado para estudos em Java

-- -----------------------------------------------------
-- Schema sistema
--
-- Banco de dados utilizado para estudos em Java
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `sistema` DEFAULT CHARACTER SET utf8 ;
USE `sistema` ;

-- -----------------------------------------------------
-- Table `sistema`.`cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sistema`.`cliente` (
  `id_cliente` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `nome_cliente` VARCHAR(100) NOT NULL,
  `sobrenome_cliente` VARCHAR(100) NULL,
  `documento_cliente` VARCHAR(25) NULL,
  `data_nasc_cliente` VARCHAR(10) NULL,
  `sexo_cliente` VARCHAR(15) NOT NULL,
  `endereco_cliente` VARCHAR(255) NULL,
  `email_cliente` VARCHAR(100) NULL,
  `telefone_cliente` VARCHAR(25) NULL,
  `credito_cliente` FLOAT NULL,
  `status_cliente` TINYINT NULL,
  PRIMARY KEY (`id_cliente`))
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
