CREATE TABLE `Teste`.`PESSOA` (
    `ID_PESSOA` INT NOT NULL AUTO_INCREMENT ,
    `CPF` VARCHAR(15) NOT NULL ,
    `NOME` VARCHAR(60) NOT NULL ,
    PRIMARY KEY (`ID_PESSOA`))
ENGINE = InnoDB;

INSERT INTO `SALARIO` (`ID_SALARIO`, `ID_PESSOA`, `SALARIO`, `DATA_INICIO_VIGENCIA`, `DATA_FIM_VIGENCIA`) VALUES (NULL, '1', '1000.00', '2017-05-01', '2018-01-01');
INSERT INTO `SALARIO` (`ID_SALARIO`, `ID_PESSOA`, `SALARIO`, `DATA_INICIO_VIGENCIA`, `DATA_FIM_VIGENCIA`) VALUES (NULL, '1', '2000.00', '2018-01-01', '2018-11-01');
INSERT INTO `SALARIO` (`ID_SALARIO`, `ID_PESSOA`, `SALARIO`, `DATA_INICIO_VIGENCIA`, `DATA_FIM_VIGENCIA`) VALUES (NULL, '1', '2150.00', '2018-11-01', NULL);
INSERT INTO `SALARIO` (`ID_SALARIO`, `ID_PESSOA`, `SALARIO`, `DATA_INICIO_VIGENCIA`, `DATA_FIM_VIGENCIA`) VALUES (NULL, '2', '1500.00', '2016-02-01', NULL);