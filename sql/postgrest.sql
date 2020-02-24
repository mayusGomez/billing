/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  agomez
 * Created: 23/02/2020
 */

CREATE TABLE `billing`.`customer` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `identification_type` INT NOT NULL COMMENT '1-PERSON, 2-PASSPORT, 3-COMPANY',
  `identification` VARCHAR(45) NOT NULL,
  `name` VARCHAR(100) NOT NULL,
  `lastname` VARCHAR(100) NULL,
  `email` VARCHAR(150) NULL,
  `phone` VARCHAR(45) NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `identification_UNIQUE` (`identification` ASC) INVISIBLE)
COMMENT = 'Cutomer of company';

-- UPDATE `billing`.`customer` SET `identification_type` = '1', `identification` = '90998999' WHERE (`id` = '1');
-- UPDATE `billing`.`customer` SET `identification_type` = '2', `identification` = '89992888' WHERE (`id` = '2');
