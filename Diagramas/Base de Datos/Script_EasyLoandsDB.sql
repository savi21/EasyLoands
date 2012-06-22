SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL';

CREATE SCHEMA IF NOT EXISTS `easyloands` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci ;
USE `easyloands` ;

-- -----------------------------------------------------
-- Table `easyloands`.`pais`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `easyloands`.`pais` (
  `idpais` INT NOT NULL AUTO_INCREMENT ,
  `descripcion` VARCHAR(45) NULL ,
  PRIMARY KEY (`idpais`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `easyloands`.`provincia`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `easyloands`.`provincia` (
  `idprovincia` INT NOT NULL AUTO_INCREMENT ,
  `descripcion` VARCHAR(45) NULL ,
  `pais_idpais` INT NOT NULL ,
  PRIMARY KEY (`idprovincia`, `pais_idpais`) ,
  INDEX `fk_provincia_pais1` (`pais_idpais` ASC) ,
  CONSTRAINT `fk_provincia_pais1`
    FOREIGN KEY (`pais_idpais` )
    REFERENCES `easyloands`.`pais` (`idpais` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `easyloands`.`persona`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `easyloands`.`persona` (
  `idpersona` INT NOT NULL AUTO_INCREMENT ,
  `primerNombre` VARCHAR(45) NULL ,
  `segundoNombre` VARCHAR(45) NULL ,
  `primerApellido` VARCHAR(45) NULL ,
  `segundoApellido` VARCHAR(45) NULL ,
  `cedula` VARCHAR(45) NULL ,
  `estadoCivil` VARCHAR(45) NULL ,
  `celular` VARCHAR(45) NULL ,
  `telefono_casa` VARCHAR(45) NULL ,
  `telefono_empresa` VARCHAR(45) NULL ,
  `pais_idpais` INT NOT NULL ,
  `provincia_idprovincia` INT NOT NULL ,
  `direccion` VARCHAR(45) NULL ,
  `fechaNacimiento` DATE NULL ,
  PRIMARY KEY (`idpersona`, `pais_idpais`, `provincia_idprovincia`) ,
  INDEX `fk_persona_pais` (`pais_idpais` ASC) ,
  INDEX `fk_persona_provincia1` (`provincia_idprovincia` ASC) ,
  CONSTRAINT `fk_persona_pais`
    FOREIGN KEY (`pais_idpais` )
    REFERENCES `easyloands`.`pais` (`idpais` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_persona_provincia1`
    FOREIGN KEY (`provincia_idprovincia` )
    REFERENCES `easyloands`.`provincia` (`idprovincia` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `easyloands`.`cliente`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `easyloands`.`cliente` (
  `idcliente` INT NOT NULL AUTO_INCREMENT ,
  `limiteCredito` DECIMAL(15,2) NULL ,
  `persona_idpersona` INT NOT NULL ,
  PRIMARY KEY (`idcliente`, `persona_idpersona`) ,
  INDEX `fk_Cliente_persona1` (`persona_idpersona` ASC) ,
  CONSTRAINT `fk_Cliente_persona1`
    FOREIGN KEY (`persona_idpersona` )
    REFERENCES `easyloands`.`persona` (`idpersona` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `easyloands`.`usuario`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `easyloands`.`usuario` (
  `idusuario` INT NOT NULL AUTO_INCREMENT ,
  `perfil` VARCHAR(45) NULL ,
  `usuario` VARCHAR(45) NULL ,
  `password` VARCHAR(45) NULL ,
  `persona_idpersona` INT NOT NULL ,
  PRIMARY KEY (`idusuario`, `persona_idpersona`) ,
  INDEX `fk_usuario_persona1` (`persona_idpersona` ASC) ,
  CONSTRAINT `fk_usuario_persona1`
    FOREIGN KEY (`persona_idpersona` )
    REFERENCES `easyloands`.`persona` (`idpersona` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `easyloands`.`garante`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `easyloands`.`garante` (
  `idgarante` INT NOT NULL AUTO_INCREMENT ,
  `cliente_idcliente` INT NOT NULL ,
  `persona_idpersona` INT NOT NULL ,
  PRIMARY KEY (`idgarante`, `cliente_idcliente`, `persona_idpersona`) ,
  INDEX `fk_garante_Cliente1` (`cliente_idcliente` ASC) ,
  INDEX `fk_garante_persona1` (`persona_idpersona` ASC) ,
  CONSTRAINT `fk_garante_Cliente1`
    FOREIGN KEY (`cliente_idcliente` )
    REFERENCES `easyloands`.`cliente` (`idcliente` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_garante_persona1`
    FOREIGN KEY (`persona_idpersona` )
    REFERENCES `easyloands`.`persona` (`idpersona` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `easyloands`.`laboral`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `easyloands`.`laboral` (
  `idlaboral` INT NOT NULL AUTO_INCREMENT ,
  `profesion` VARCHAR(45) NULL ,
  `empleador` VARCHAR(45) NULL ,
  `telefono` VARCHAR(45) NULL ,
  `domicilio` VARCHAR(45) NULL ,
  `cliente_idcliente` INT NOT NULL ,
  PRIMARY KEY (`idlaboral`, `cliente_idcliente`) ,
  INDEX `fk_laboral_cliente1` (`cliente_idcliente` ASC) ,
  CONSTRAINT `fk_laboral_cliente1`
    FOREIGN KEY (`cliente_idcliente` )
    REFERENCES `easyloands`.`cliente` (`idcliente` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `easyloands`.`empresa`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `easyloands`.`empresa` (
  `idempresa` INT NOT NULL AUTO_INCREMENT ,
  `nombre` VARCHAR(45) NULL ,
  `direccion` VARCHAR(45) NULL ,
  `subitulo` VARCHAR(45) NULL ,
  `telefono` VARCHAR(45) NULL ,
  `fax` VARCHAR(45) NULL ,
  `web` VARCHAR(45) NULL ,
  `email` VARCHAR(45) NULL ,
  `rnc` VARCHAR(45) NULL ,
  `provincia_idprovincia` INT NOT NULL ,
  `pais_idpais` INT NOT NULL ,
  PRIMARY KEY (`idempresa`, `provincia_idprovincia`, `pais_idpais`) ,
  INDEX `fk_empresa_provincia1` (`provincia_idprovincia` ASC) ,
  INDEX `fk_empresa_pais1` (`pais_idpais` ASC) ,
  CONSTRAINT `fk_empresa_provincia1`
    FOREIGN KEY (`provincia_idprovincia` )
    REFERENCES `easyloands`.`provincia` (`idprovincia` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_empresa_pais1`
    FOREIGN KEY (`pais_idpais` )
    REFERENCES `easyloands`.`pais` (`idpais` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `easyloands`.`prestamos`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `easyloands`.`prestamos` (
  `idprestamos` INT NOT NULL AUTO_INCREMENT ,
  `monto` VARCHAR(45) NULL ,
  `cuotas` VARCHAR(45) NULL ,
  `interes` VARCHAR(45) NULL ,
  `mora` VARCHAR(45) NULL ,
  PRIMARY KEY (`idprestamos`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `easyloands`.`pago`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `easyloands`.`pago` (
  `cliente_idcliente` INT NOT NULL AUTO_INCREMENT ,
  `prestamos_idprestamos` INT NOT NULL ,
  `fechaPago` DATE NULL ,
  PRIMARY KEY (`cliente_idcliente`, `prestamos_idprestamos`) ,
  INDEX `fk_cliente_has_prestamos_prestamos1` (`prestamos_idprestamos` ASC) ,
  INDEX `fk_cliente_has_prestamos_cliente1` (`cliente_idcliente` ASC) ,
  CONSTRAINT `fk_cliente_has_prestamos_cliente1`
    FOREIGN KEY (`cliente_idcliente` )
    REFERENCES `easyloands`.`cliente` (`idcliente` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_cliente_has_prestamos_prestamos1`
    FOREIGN KEY (`prestamos_idprestamos` )
    REFERENCES `easyloands`.`prestamos` (`idprestamos` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `easyloands`.`amortizacion`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `easyloands`.`amortizacion` (
  `interesCuota` VARCHAR(45) NULL ,
  `idamortizacion` INT NOT NULL AUTO_INCREMENT ,
  `prestamos_idprestamos` INT NOT NULL ,
  `cuota` VARCHAR(45) NULL ,
  `capitalCuota` DECIMAL(15,2) NULL ,
  `moraCuota` DECIMAL(15,2) NULL ,
  `fechaCuota` DATE NULL ,
  `capitalCuotaPagado` DECIMAL(15,2) NULL ,
  `interesCuotaPagado` DECIMAL(15,2) NULL ,
  `moraCuotaPagado` DECIMAL(15,2) NULL ,
  PRIMARY KEY (`idamortizacion`, `prestamos_idprestamos`) ,
  INDEX `fk_amortizacion_prestamos1` (`prestamos_idprestamos` ASC) ,
  CONSTRAINT `fk_amortizacion_prestamos1`
    FOREIGN KEY (`prestamos_idprestamos` )
    REFERENCES `easyloands`.`prestamos` (`idprestamos` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;



SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
