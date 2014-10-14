SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL';

CREATE SCHEMA IF NOT EXISTS `dbalphahoteis` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci ;
USE `dbalphahoteis` ;

-- -----------------------------------------------------
-- Table `dbalphahoteis`.`cliente`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `dbalphahoteis`.`cliente` (
  `id_cliente` INT NOT NULL AUTO_INCREMENT ,
  `nome` VARCHAR(255) NULL ,
  `sexo` VARCHAR(1) NULL ,
  `data_nascimento` DATE NULL ,
  `cpf` INT NULL ,
  `rg` VARCHAR(50) NULL ,
  `email` VARCHAR(255) NULL ,
  `telefone` VARCHAR(45) NULL ,
  `celular` VARCHAR(45) NULL ,
  `endereco` VARCHAR(255) NULL ,
  `bairro` VARCHAR(255) NULL ,
  `cidade` VARCHAR(255) NULL ,
  `uf` VARCHAR(2) NULL ,
  PRIMARY KEY (`id_cliente`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dbalphahoteis`.`quarto`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `dbalphahoteis`.`quarto` (
  `id_quarto` INT NOT NULL AUTO_INCREMENT ,
  `numero_quarto` INT NULL ,
  `tipo_quarto` VARCHAR(50) NULL ,
  `valor_quarto` DECIMAL(10,2) NULL ,
  PRIMARY KEY (`id_quarto`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dbalphahoteis`.`produto`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `dbalphahoteis`.`produto` (
  `id_produto` INT NOT NULL ,
  `cod_produto` INT NULL ,
  `nome_produto` VARCHAR(255) NULL ,
  `valor_produto` DECIMAL(10,2) NULL ,
  `quantidade_produto` INT NULL ,
  PRIMARY KEY (`id_produto`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dbalphahoteis`.`hospedagem`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `dbalphahoteis`.`hospedagem` (
  `id_hospedagem` INT NOT NULL AUTO_INCREMENT ,
  `id_cliente` INT NOT NULL ,
  `id_quarto` INT NOT NULL ,
  `data_entrada` DATE NULL ,
  `data_saida` DATE NULL ,
  `hora_entrada` TIME NULL ,
  `hora_saida` TIME NULL ,
  `valor_diaria` DECIMAL(10,2) NULL ,
  `quantidade_diaria` INT NULL ,
  `total_hospedagem` DECIMAL(10,2) NULL ,
  PRIMARY KEY (`id_hospedagem`, `id_cliente`, `id_quarto`) ,
  INDEX `fk_cliente_has_quarto_quarto1` (`id_quarto` ASC) ,
  INDEX `fk_cliente_has_quarto_cliente` (`id_cliente` ASC) ,
  CONSTRAINT `fk_cliente_has_quarto_cliente`
    FOREIGN KEY (`id_cliente` )
    REFERENCES `dbalphahoteis`.`cliente` (`id_cliente` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_cliente_has_quarto_quarto1`
    FOREIGN KEY (`id_quarto` )
    REFERENCES `dbalphahoteis`.`quarto` (`id_quarto` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dbalphahoteis`.`servico_agregado`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `dbalphahoteis`.`servico_agregado` (
  `id_servico` INT NOT NULL AUTO_INCREMENT ,
  `id_produto` INT NOT NULL ,
  `id_hospedagem` INT NOT NULL ,
  PRIMARY KEY (`id_servico`) ,
  INDEX `fk_servico_agregado_produto1` (`id_produto` ASC) ,
  INDEX `fk_servico_agregado_cliente_has_quarto1` (`id_hospedagem` ASC) ,
  CONSTRAINT `fk_servico_agregado_produto1`
    FOREIGN KEY (`id_produto` )
    REFERENCES `dbalphahoteis`.`produto` (`id_produto` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_servico_agregado_cliente_has_quarto1`
    FOREIGN KEY (`id_hospedagem` )
    REFERENCES `dbalphahoteis`.`hospedagem` (`id_hospedagem` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;



SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
