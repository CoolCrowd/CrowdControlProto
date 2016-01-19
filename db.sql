-- MySQL Script generated by MySQL Workbench
-- Mon Jan 18 09:29:50 2016
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema crowdcontrol
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema crowdcontrol
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `crowdcontrol` DEFAULT CHARACTER SET utf8mb4 ;
USE `crowdcontrol` ;

-- -----------------------------------------------------
-- Table `crowdcontrol`.`Template`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `crowdcontrol`.`Template` (
  `id_template` INT NOT NULL AUTO_INCREMENT,
  `template` LONGTEXT NOT NULL,
  `titel` VARCHAR(191) NULL,
  `answer_type` VARCHAR(191) NULL,
  PRIMARY KEY (`id_template`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `crowdcontrol`.`Task_Chooser`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `crowdcontrol`.`Task_Chooser` (
  `id_task_chooser` VARCHAR(191) NOT NULL,
  PRIMARY KEY (`id_task_chooser`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `crowdcontrol`.`Experiment`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `crowdcontrol`.`Experiment` (
  `id_experiment` INT(11) NOT NULL AUTO_INCREMENT,
  `rating_options` MEDIUMTEXT NULL DEFAULT NULL,
  `titel` VARCHAR(191) NULL DEFAULT NULL,
  `description` LONGTEXT NULL DEFAULT NULL,
  `ratings_per_answer` INT(11) NULL DEFAULT NULL,
  `algorithm_task_chooser` VARCHAR(191) NULL DEFAULT NULL,
  `algorithm_quality_answer` VARCHAR(191) NULL DEFAULT NULL,
  `algorithm_quality_rating` VARCHAR(191) NULL DEFAULT NULL,
  `base_payment` INT(11) NULL DEFAULT NULL,
  `bonus_answer` INT(11) NULL DEFAULT NULL,
  `bonus_rating` INT(11) NULL DEFAULT NULL,
  `template_data` MEDIUMTEXT NULL DEFAULT NULL,
  `template` INT NULL,
  `answer_type` VARCHAR(45) NULL,
  PRIMARY KEY (`id_experiment`),
  INDEX `usedTemplate_idx` (`template` ASC),
  INDEX `usedTaskChooser_idx` (`algorithm_task_chooser` ASC),
  CONSTRAINT `usedTemplate`
    FOREIGN KEY (`template`)
    REFERENCES `crowdcontrol`.`Template` (`id_template`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `usedTaskChooser`
    FOREIGN KEY (`algorithm_task_chooser`)
    REFERENCES `crowdcontrol`.`Task_Chooser` (`id_task_chooser`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `crowdcontrol`.`Platform`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `crowdcontrol`.`Platform` (
  `id_platform` VARCHAR(191) NOT NULL,
  `name` VARCHAR(191) NOT NULL,
  `render_calibrations` BIT(1) NOT NULL,
  `needs_email` BIT(1) NOT NULL,
  PRIMARY KEY (`id_platform`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `crowdcontrol`.`Task`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `crowdcontrol`.`Task` (
  `id_task` INT(11) NOT NULL AUTO_INCREMENT,
  `experiment` INT(11) NOT NULL,
  `running` BIT(1) NOT NULL,
  `platform_data` MEDIUMTEXT NULL DEFAULT NULL,
  `crowd_platform` VARCHAR(191) NOT NULL,
  `stopping` BIT(1) NOT NULL,
  PRIMARY KEY (`id_task`),
  INDEX `idexperiment_idx` (`experiment` ASC),
  INDEX `runningOnPlattform_idx` (`crowd_platform` ASC),
  CONSTRAINT `idexperimenthit`
    FOREIGN KEY (`experiment`)
    REFERENCES `crowdcontrol`.`Experiment` (`id_experiment`)
    ON DELETE RESTRICT
    ON UPDATE RESTRICT,
  CONSTRAINT `runningOnPlattform`
    FOREIGN KEY (`crowd_platform`)
    REFERENCES `crowdcontrol`.`Platform` (`id_platform`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `crowdcontrol`.`Worker`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `crowdcontrol`.`Worker` (
  `id_worker` INT(11) NOT NULL AUTO_INCREMENT,
  `identification` VARCHAR(191) NULL DEFAULT NULL,
  `platform` VARCHAR(191) NOT NULL,
  `email` VARCHAR(191) NULL,
  PRIMARY KEY (`id_worker`),
  INDEX `workerOrigin_idx` (`platform` ASC),
  CONSTRAINT `workerOrigin`
    FOREIGN KEY (`platform`)
    REFERENCES `crowdcontrol`.`Platform` (`id_platform`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `crowdcontrol`.`Answer`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `crowdcontrol`.`Answer` (
  `id_answer` INT(11) NOT NULL AUTO_INCREMENT,
  `task` INT(11) NOT NULL,
  `answer` MEDIUMTEXT NOT NULL,
  `timestamp` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `worker_id` INT(11) NOT NULL,
  `quality` INT NULL,
  PRIMARY KEY (`id_answer`),
  INDEX `workerAnswered_idx` (`worker_id` ASC),
  INDEX `idHITanswers_idx` (`task` ASC),
  CONSTRAINT `idHITanswers`
    FOREIGN KEY (`task`)
    REFERENCES `crowdcontrol`.`Task` (`id_task`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `workerAnswered`
    FOREIGN KEY (`worker_id`)
    REFERENCES `crowdcontrol`.`Worker` (`id_worker`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `crowdcontrol`.`Constraint`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `crowdcontrol`.`Constraint` (
  `id_constraint` INT(11) NOT NULL AUTO_INCREMENT,
  `constraint` VARCHAR(45) NOT NULL,
  `experiment` INT(11) NOT NULL,
  PRIMARY KEY (`id_constraint`),
  INDEX `constrainedExperiment` (`experiment` ASC),
  CONSTRAINT `constrainedExperiment`
    FOREIGN KEY (`experiment`)
    REFERENCES `crowdcontrol`.`Experiment` (`id_experiment`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `crowdcontrol`.`Gift_Code`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `crowdcontrol`.`Gift_Code` (
  `id_gift_code` INT NOT NULL AUTO_INCREMENT,
  `code` MEDIUMTEXT NOT NULL,
  `amount` INT NOT NULL,
  PRIMARY KEY (`id_gift_code`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `crowdcontrol`.`Payment`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `crowdcontrol`.`Payment` (
  `id_payment` INT(11) NOT NULL AUTO_INCREMENT,
  `worker_id` INT(11) NOT NULL,
  `experiment_id` INT(11) NOT NULL,
  `timestamp` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `amount` INT NOT NULL,
  `giftcode` INT NULL,
  PRIMARY KEY (`id_payment`),
  INDEX `payedWorker_idx` (`worker_id` ASC),
  INDEX `payedExperiment_idx` (`experiment_id` ASC),
  INDEX `usedGiftCode_idx` (`giftcode` ASC),
  CONSTRAINT `payedExperiment`
    FOREIGN KEY (`experiment_id`)
    REFERENCES `crowdcontrol`.`Experiment` (`id_experiment`)
    ON DELETE RESTRICT
    ON UPDATE RESTRICT,
  CONSTRAINT `payedWorker`
    FOREIGN KEY (`worker_id`)
    REFERENCES `crowdcontrol`.`Worker` (`id_worker`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `usedGiftCode`
    FOREIGN KEY (`giftcode`)
    REFERENCES `crowdcontrol`.`Gift_Code` (`id_gift_code`)
    ON DELETE RESTRICT
    ON UPDATE RESTRICT)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `crowdcontrol`.`Population`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `crowdcontrol`.`Population` (
  `id_population` INT(11) NOT NULL AUTO_INCREMENT,
  `property` VARCHAR(191) NOT NULL,
  `description` TEXT NULL,
  `name` VARCHAR(191) NOT NULL,
  `experiment` INT NULL,
  PRIMARY KEY (`id_population`),
  UNIQUE INDEX `experiment_UNIQUE` (`experiment` ASC),
  CONSTRAINT `participatedIn`
    FOREIGN KEY (`experiment`)
    REFERENCES `crowdcontrol`.`Experiment` (`id_experiment`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `crowdcontrol`.`Rating`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `crowdcontrol`.`Rating` (
  `id_rating` INT(11) NOT NULL AUTO_INCREMENT,
  `task` INT(11) NOT NULL,
  `answer_r` INT(11) NOT NULL,
  `timestamp` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `rating` INT(11) NULL DEFAULT NULL,
  `worker_id` INT(11) NOT NULL,
  `quality` INT NULL,
  PRIMARY KEY (`id_rating`),
  INDEX `idAnswers_idx` (`answer_r` ASC),
  INDEX `workerRated_idx` (`worker_id` ASC),
  INDEX `idHITrating_idx` (`task` ASC),
  CONSTRAINT `idAnswersratins`
    FOREIGN KEY (`answer_r`)
    REFERENCES `crowdcontrol`.`Answer` (`id_answer`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `idHITrating`
    FOREIGN KEY (`task`)
    REFERENCES `crowdcontrol`.`Task` (`id_task`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `workerRated`
    FOREIGN KEY (`worker_id`)
    REFERENCES `crowdcontrol`.`Worker` (`id_worker`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `crowdcontrol`.`Tag`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `crowdcontrol`.`Tag` (
  `id_tag` INT(11) NOT NULL AUTO_INCREMENT,
  `tag` VARCHAR(191) NOT NULL,
  `experiment` INT(11) NOT NULL,
  PRIMARY KEY (`id_tag`),
  INDEX `idexperiment_idx` (`experiment` ASC),
  CONSTRAINT `idexperimenttags`
    FOREIGN KEY (`experiment`)
    REFERENCES `crowdcontrol`.`Experiment` (`id_experiment`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `crowdcontrol`.`Population_answer_option`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `crowdcontrol`.`Population_answer_option` (
  `id_population_answer_option` INT NOT NULL AUTO_INCREMENT,
  `population` INT NOT NULL,
  `answer` VARCHAR(191) NOT NULL,
  PRIMARY KEY (`id_population_answer_option`),
  INDEX `populationAnswer_idx` (`population` ASC),
  CONSTRAINT `populationAnswer`
    FOREIGN KEY (`population`)
    REFERENCES `crowdcontrol`.`Population` (`id_population`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `crowdcontrol`.`ExperimentsPopulation`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `crowdcontrol`.`ExperimentsPopulation` (
  `id_experiments_population` VARCHAR(191) NOT NULL,
  `population_user` INT NOT NULL,
  `answer` INT NOT NULL,
  `referenced_platform` VARCHAR(191) NOT NULL,
  `not` BIT(1) NOT NULL,
  PRIMARY KEY (`id_experiments_population`),
  INDEX `populationUser_idx` (`population_user` ASC),
  INDEX `referencedPlatform_idx` (`referenced_platform` ASC),
  INDEX `referencedAnswer_idx` (`answer` ASC),
  CONSTRAINT `populationUser`
    FOREIGN KEY (`population_user`)
    REFERENCES `crowdcontrol`.`Experiment` (`id_experiment`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `referencedPlatform`
    FOREIGN KEY (`referenced_platform`)
    REFERENCES `crowdcontrol`.`Platform` (`id_platform`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `referencedAnswer`
    FOREIGN KEY (`answer`)
    REFERENCES `crowdcontrol`.`Population_answer_option` (`id_population_answer_option`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `crowdcontrol`.`Population_Result`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `crowdcontrol`.`Population_Result` (
  `id_population_result` INT NOT NULL AUTO_INCREMENT,
  `worker` INT NOT NULL,
  `answer` INT NOT NULL,
  PRIMARY KEY (`id_population_result`),
  INDEX `referencedAnswer_idx` (`answer` ASC),
  INDEX `referencedWorker_idx` (`worker` ASC),
  CONSTRAINT `chosenAnswer`
    FOREIGN KEY (`answer`)
    REFERENCES `crowdcontrol`.`Population_answer_option` (`id_population_answer_option`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `referencedWorker`
    FOREIGN KEY (`worker`)
    REFERENCES `crowdcontrol`.`Worker` (`id_worker`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `crowdcontrol`.`Notification`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `crowdcontrol`.`Notification` (
  `id_notification` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `description` TEXT NOT NULL,
  `checkPeriod` INT NOT NULL,
  `sendThreshold` INT NOT NULL,
  `query` MEDIUMTEXT NOT NULL,
  `lastSent` TIMESTAMP NULL,
  PRIMARY KEY (`id_notification`))
ENGINE = InnoDB;

USE `crowdcontrol`;

DELIMITER $$
USE `crowdcontrol`$$
CREATE DEFINER = CURRENT_USER TRIGGER `crowdcontrol`.`Platform_BEFORE_INSERT` BEFORE INSERT ON `Platform` FOR EACH ROW
BEGIN
	IF REGEXP_LIKE (NEW.id_platform, '[a-z0-9._-]+') THEN
		SET NEW.id_platform = LOWER(NEW.id_platform);
	ELSE
		SET NEW.id_platform = NULL;
	END IF;
END$$


DELIMITER ;
