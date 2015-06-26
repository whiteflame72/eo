/*
SQLyog Community- MySQL GUI v8.21 
MySQL - 5.1.36-community : Database - eolproggoal
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`eolproggoal` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `eolproggoal`;

/*Table structure for table `cd_acty` */

DROP TABLE IF EXISTS `cd_acty`;

CREATE TABLE `cd_acty` (
  `ACTY_ID` int(11) NOT NULL AUTO_INCREMENT,
  `ACTY_NAME` varchar(45) NOT NULL,
  PRIMARY KEY (`ACTY_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

/*Data for the table `cd_acty` */

insert  into `cd_acty`(`ACTY_ID`,`ACTY_NAME`) values (1,'Assessment'),(2,'Exams/Testing'),(3,'Prep-test');

/*Table structure for table `cd_acvty_detls` */

DROP TABLE IF EXISTS `cd_acvty_detls`;

CREATE TABLE `cd_acvty_detls` (
  `ACVTY_DETLS_ID` int(11) NOT NULL,
  `ACVTY_DETLS_NAME` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `cd_acvty_detls` */

insert  into `cd_acvty_detls`(`ACVTY_DETLS_ID`,`ACVTY_DETLS_NAME`) values (1,'30 minutes a week'),(2,'3 hours a week'),(3,'1 hour a week'),(4,'4 hours a week'),(5,'5 times a week');

/*Table structure for table `cd_asmnt_detls` */

DROP TABLE IF EXISTS `cd_asmnt_detls`;

CREATE TABLE `cd_asmnt_detls` (
  `ASMNT_DETLS_ID` int(11) NOT NULL,
  `ASMNT_DETLS_NAME` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `cd_asmnt_detls` */

/*Table structure for table `cd_college_type` */

DROP TABLE IF EXISTS `cd_college_type`;

CREATE TABLE `cd_college_type` (
  `COLLEGE_TYPE_ID` int(11) NOT NULL AUTO_INCREMENT,
  `COLLEGE_TYPE_DESC` varchar(45) NOT NULL,
  `COLLEGE_GPA` decimal(4,2) NOT NULL,
  `COLLEGE_SAT` smallint(6) NOT NULL,
  `COLLEGE_ACT` smallint(6) NOT NULL,
  PRIMARY KEY (`COLLEGE_TYPE_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

/*Data for the table `cd_college_type` */

insert  into `cd_college_type`(`COLLEGE_TYPE_ID`,`COLLEGE_TYPE_DESC`,`COLLEGE_GPA`,`COLLEGE_SAT`,`COLLEGE_ACT`) values (1,'local','3.00',1000,25);

/*Table structure for table `cd_lrng_objective` */

DROP TABLE IF EXISTS `cd_lrng_objective`;

CREATE TABLE `cd_lrng_objective` (
  `NAME` varchar(45) NOT NULL,
  `TOPIC_ID` int(11) NOT NULL,
  `CD_LRNG_OBJECTIVE_ID` bigint(20) NOT NULL,
  PRIMARY KEY (`CD_LRNG_OBJECTIVE_ID`),
  KEY `FK_CD_LRNG_OBJECTIVE_TOPIC_ID` (`TOPIC_ID`),
  CONSTRAINT `FK_CD_LRNG_OBJECTIVE_TOPIC_ID` FOREIGN KEY (`TOPIC_ID`) REFERENCES `cd_topic` (`TOPIC_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `cd_lrng_objective` */

/*Table structure for table `cd_lrng_style` */

DROP TABLE IF EXISTS `cd_lrng_style`;

CREATE TABLE `cd_lrng_style` (
  `LRNG_STYLE_ID` int(11) NOT NULL AUTO_INCREMENT,
  `LRNG_STYLE_NAME` varchar(45) NOT NULL,
  PRIMARY KEY (`LRNG_STYLE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `cd_lrng_style` */

/*Table structure for table `cd_subject` */

DROP TABLE IF EXISTS `cd_subject`;

CREATE TABLE `cd_subject` (
  `SUBJECT_ID` int(11) NOT NULL AUTO_INCREMENT,
  `SUBJECT_NAME` varchar(45) NOT NULL,
  PRIMARY KEY (`SUBJECT_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

/*Data for the table `cd_subject` */

insert  into `cd_subject`(`SUBJECT_ID`,`SUBJECT_NAME`) values (1,'Math'),(2,'Language'),(3,'Science');

/*Table structure for table `cd_topic` */

DROP TABLE IF EXISTS `cd_topic`;

CREATE TABLE `cd_topic` (
  `TOPIC_ID` int(11) NOT NULL AUTO_INCREMENT,
  `TOPIC_NAME` varchar(45) NOT NULL,
  `SUBJECT_ID` int(11) NOT NULL,
  PRIMARY KEY (`TOPIC_ID`),
  KEY `FK_CD_TOPIC_SUBJECT_ID` (`SUBJECT_ID`),
  CONSTRAINT `FK_CD_TOPIC_SUBJECT_ID` FOREIGN KEY (`SUBJECT_ID`) REFERENCES `cd_subject` (`SUBJECT_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=latin1;

/*Data for the table `cd_topic` */

insert  into `cd_topic`(`TOPIC_ID`,`TOPIC_NAME`,`SUBJECT_ID`) values (1,'Algebra',1),(2,'Geometry',1),(3,'Statistics',1),(4,'Measurement',1),(5,'Trigonometry',1),(6,'Grammar',2),(7,'Reading',2),(8,'Vocabulary',2),(9,'Writing',2),(10,'Poem',2),(11,'Biology',3),(12,'Physics',3),(13,'Chemistry',3);

/*Table structure for table `goal` */

DROP TABLE IF EXISTS `goal`;

CREATE TABLE `goal` (
  `GOAL_ID` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `student_id` int(11) NOT NULL,
  `topic_id` int(11) NOT NULL,
  `goal` int(11) DEFAULT NULL,
  PRIMARY KEY (`GOAL_ID`),
  UNIQUE KEY `id` (`GOAL_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=79 DEFAULT CHARSET=latin1;

/*Data for the table `goal` */

insert  into `goal`(`GOAL_ID`,`student_id`,`topic_id`,`goal`) values (1,1,1,85),(2,1,2,90),(3,1,3,75),(4,1,4,80),(5,1,5,95),(6,2,1,75),(7,2,2,80),(8,2,3,90),(9,2,4,80),(10,2,5,80),(11,3,1,85),(12,3,2,80),(13,3,3,75),(14,3,4,90),(15,3,5,75),(16,4,1,95),(17,4,2,90),(18,4,3,95),(19,4,4,90),(20,4,5,95),(21,5,1,70),(22,5,2,70),(23,5,3,75),(24,5,4,70),(25,5,5,70),(26,6,1,80),(27,6,2,80),(28,6,3,85),(29,6,4,80),(30,6,5,80),(31,1,6,85),(32,1,7,90),(33,1,8,75),(34,1,9,80),(35,1,10,95),(36,2,6,75),(37,2,7,80),(38,2,8,90),(39,2,9,80),(40,2,10,80),(41,3,6,85),(42,3,7,80),(43,3,8,75),(44,3,9,90),(45,3,10,75),(46,4,6,95),(47,4,7,90),(48,4,8,95),(49,4,9,90),(50,4,10,95),(51,5,6,70),(52,5,7,70),(53,5,8,75),(54,5,9,70),(55,5,10,70),(56,6,6,80),(57,6,7,80),(58,6,8,85),(59,6,9,80),(60,6,10,80),(61,1,11,85),(62,1,12,90),(63,1,13,75),(64,2,11,75),(65,2,12,80),(66,2,13,90),(67,3,11,85),(68,3,12,80),(69,3,13,75),(70,4,11,95),(71,4,12,90),(72,4,13,95),(73,5,11,70),(74,5,12,70),(75,5,13,75),(76,6,11,80),(77,6,12,80),(78,6,13,85);

/*Table structure for table `prgm_goals_acvty_sched` */

DROP TABLE IF EXISTS `prgm_goals_acvty_sched`;

CREATE TABLE `prgm_goals_acvty_sched` (
  `RESPONDENT_ID` int(11) NOT NULL,
  `ASMNT_ID` char(1) NOT NULL,
  `ACVTY_DT` date NOT NULL,
  `ACVTY_DETLS_ID` int(11) NOT NULL,
  `PRGM_GOALS_ACVTY_SCHED_ID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `prgm_goals_acvty_sched` */

insert  into `prgm_goals_acvty_sched`(`RESPONDENT_ID`,`ASMNT_ID`,`ACVTY_DT`,`ACVTY_DETLS_ID`,`PRGM_GOALS_ACVTY_SCHED_ID`) values (4,'A','2008-03-01',2,1),(4,'H','2008-03-01',3,2),(4,'P','2008-03-01',1,3),(4,'T','2008-03-01',3,4);

/*Table structure for table `prgm_goals_appid_knwlg` */

DROP TABLE IF EXISTS `prgm_goals_appid_knwlg`;

CREATE TABLE `prgm_goals_appid_knwlg` (
  `RESPONDENT_ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `APPLIES_KNOWLEDGE_REAL_WORLD` smallint(6) NOT NULL,
  `SOLVES_INTEGRATED_PROBLEMS` smallint(6) NOT NULL,
  PRIMARY KEY (`RESPONDENT_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=latin1;

/*Data for the table `prgm_goals_appid_knwlg` */

insert  into `prgm_goals_appid_knwlg`(`RESPONDENT_ID`,`APPLIES_KNOWLEDGE_REAL_WORLD`,`SOLVES_INTEGRATED_PROBLEMS`) values (1,0,2),(2,0,0),(3,0,0),(4,0,0),(5,0,0),(6,0,0),(7,0,0),(8,0,0),(9,0,0),(10,0,0),(11,0,0),(12,0,0),(13,0,0),(14,0,0),(15,0,0),(16,0,0),(17,0,0),(18,0,0),(19,0,0),(20,0,0),(21,0,0),(22,0,0);

/*Table structure for table `prgm_goals_asmnt_rmind` */

DROP TABLE IF EXISTS `prgm_goals_asmnt_rmind`;

CREATE TABLE `prgm_goals_asmnt_rmind` (
  `RESPONDENT_ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `ASMNT_ID` varchar(1) DEFAULT NULL,
  `RMIND_TYPE` varchar(6) NOT NULL,
  `RMIND_EMAIL_ID` varchar(80) NOT NULL,
  PRIMARY KEY (`RESPONDENT_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `prgm_goals_asmnt_rmind` */

/*Table structure for table `prgm_goals_asmnt_sched` */

DROP TABLE IF EXISTS `prgm_goals_asmnt_sched`;

CREATE TABLE `prgm_goals_asmnt_sched` (
  `RESPONDENT_ID` int(11) NOT NULL,
  `ASMNT_ID` char(1) NOT NULL,
  `ASMNT_DT` date NOT NULL,
  `ASMNT_DETLS_ID` int(11) NOT NULL,
  `PRGM_GOALS_ASMNT_SCHED_ID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `prgm_goals_asmnt_sched` */

insert  into `prgm_goals_asmnt_sched`(`RESPONDENT_ID`,`ASMNT_ID`,`ASMNT_DT`,`ASMNT_DETLS_ID`,`PRGM_GOALS_ASMNT_SCHED_ID`) values (4,'T','2008-03-01',1,1),(4,'H','2008-03-01',2,2),(4,'P','2008-03-01',3,3),(4,'T','2008-03-03',4,4),(4,'H','2008-03-03',5,5),(4,'P','2008-03-03',6,6),(4,'A','2008-03-05',7,7);

/*Table structure for table `prgm_goals_grade_scale` */

DROP TABLE IF EXISTS `prgm_goals_grade_scale`;

CREATE TABLE `prgm_goals_grade_scale` (
  `RESPONDENT_ID` bigint(22) NOT NULL,
  `GRADE_SCALE_ID` enum('A+','A','A-','B+','B','B-','C+','C','C-','D+','D','D-','F') NOT NULL DEFAULT 'A+',
  `GRADE_UPPER_BND` decimal(5,2) NOT NULL,
  `GRADE_LOWER_BND` decimal(4,2) NOT NULL,
  `PRGM_GOALS_GRADE_SCALE_ID` bigint(22) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`PRGM_GOALS_GRADE_SCALE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `prgm_goals_grade_scale` */

/*Table structure for table `prgm_goals_lrng_styl` */

DROP TABLE IF EXISTS `prgm_goals_lrng_styl`;

CREATE TABLE `prgm_goals_lrng_styl` (
  `RESPONDENT_ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `ANY_STYLE` smallint(6) NOT NULL,
  `REAL_WORLD_EXAMPLES` smallint(6) NOT NULL,
  `SIMPLER_EXPLANATIONS` smallint(6) NOT NULL,
  `VISUAL` smallint(6) NOT NULL,
  `AUDITORY` smallint(6) NOT NULL,
  `HANDS-ON` smallint(6) NOT NULL,
  `DEDUCTIVE` smallint(6) NOT NULL,
  `INDUCTIVE` smallint(6) NOT NULL,
  PRIMARY KEY (`RESPONDENT_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=latin1;

/*Data for the table `prgm_goals_lrng_styl` */

insert  into `prgm_goals_lrng_styl`(`RESPONDENT_ID`,`ANY_STYLE`,`REAL_WORLD_EXAMPLES`,`SIMPLER_EXPLANATIONS`,`VISUAL`,`AUDITORY`,`HANDS-ON`,`DEDUCTIVE`,`INDUCTIVE`) values (2,3,4,3,2,3,4,2,3),(3,0,0,0,0,0,0,0,0),(4,0,0,0,0,0,0,0,0),(5,0,0,0,0,0,0,0,0),(6,0,5,0,0,0,0,0,0),(7,0,5,0,0,0,0,0,0),(8,0,5,0,0,0,0,0,0),(9,0,0,0,0,0,0,0,0),(10,0,0,0,0,0,0,0,0),(11,0,0,0,0,0,0,0,0),(12,0,0,0,0,0,0,0,0),(13,0,0,0,0,0,0,0,0),(14,0,0,0,0,0,0,0,0),(15,0,0,0,0,0,0,0,0),(16,0,0,0,0,0,0,0,0),(17,0,0,0,0,0,0,0,0),(18,0,0,0,0,0,0,0,0),(19,0,0,0,0,0,0,0,0),(20,0,0,0,0,0,0,0,0),(21,0,0,0,0,0,0,0,0),(22,0,0,0,0,0,0,0,0),(23,0,0,0,0,0,0,0,0),(24,0,0,0,0,0,0,0,0),(25,0,0,0,0,0,0,0,0),(26,0,0,0,0,0,0,0,0),(27,0,0,0,0,0,0,0,0),(28,0,0,0,0,0,0,0,0),(29,0,0,0,0,0,0,0,0),(30,0,0,0,0,0,0,0,0);

/*Table structure for table `prgm_goals_parent_trgt` */

DROP TABLE IF EXISTS `prgm_goals_parent_trgt`;

CREATE TABLE `prgm_goals_parent_trgt` (
  `PARENT_TRGT_ID` int(11) NOT NULL AUTO_INCREMENT,
  `RESPONDENT_ID` int(11) NOT NULL,
  `GRADE_PCTG_TRGT` decimal(4,2) NOT NULL,
  `GRADE_PCTG_LAST_YR` decimal(4,2) NOT NULL,
  `GRADE_PCTG_AVG` decimal(4,2) NOT NULL,
  `COLLEGE` enum('YES','NO','UNSURE') NOT NULL,
  `COLLEGE_YR` tinyint(4) DEFAULT NULL,
  `COLLEGE_TYPE_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`PARENT_TRGT_ID`),
  KEY `FK_PARENT_TRGT_RESPONDENT_ID` (`RESPONDENT_ID`),
  KEY `FK_PARENT_TRGT_COLLEGE_TYPE_ID` (`COLLEGE_TYPE_ID`),
  CONSTRAINT `FK_PARENT_TRGT_COLLEGE_TYPE_ID` FOREIGN KEY (`COLLEGE_TYPE_ID`) REFERENCES `cd_college_type` (`COLLEGE_TYPE_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_PARENT_TRGT_RESPONDENT_ID` FOREIGN KEY (`RESPONDENT_ID`) REFERENCES `prgm_goals_respondent` (`RESPONDENT_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

/*Data for the table `prgm_goals_parent_trgt` */

insert  into `prgm_goals_parent_trgt`(`PARENT_TRGT_ID`,`RESPONDENT_ID`,`GRADE_PCTG_TRGT`,`GRADE_PCTG_LAST_YR`,`GRADE_PCTG_AVG`,`COLLEGE`,`COLLEGE_YR`,`COLLEGE_TYPE_ID`) values (1,4,'90.00','80.00','75.00','YES',1,1);

/*Table structure for table `prgm_goals_prgm_sched` */

DROP TABLE IF EXISTS `prgm_goals_prgm_sched`;

CREATE TABLE `prgm_goals_prgm_sched` (
  `RESPONDENT_ID` int(11) NOT NULL,
  `SUBJECT_ID` int(11) NOT NULL,
  `SCHED_LEVEL` enum('R','I') DEFAULT NULL,
  `SCHED_DAY` enum('MON','TUE','WED','THU','FRI','SAT','SUN') NOT NULL DEFAULT 'MON',
  `SCHED_BGN_TM` time NOT NULL,
  `SCHED_END_TM` time NOT NULL,
  `PRGM_GOALS_PRGM_SCHED_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`RESPONDENT_ID`,`SUBJECT_ID`,`SCHED_DAY`,`SCHED_BGN_TM`),
  KEY `FK_PRGM_SCHED_RESPONDENT_ID` (`RESPONDENT_ID`),
  KEY `FK_PRGM_SCHED_SUBJECT_ID` (`SUBJECT_ID`),
  CONSTRAINT `FK_PRGM_SCHED_RESPONDENT_ID` FOREIGN KEY (`RESPONDENT_ID`) REFERENCES `prgm_goals_respondent` (`RESPONDENT_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_PRGM_SCHED_SUBJECT_ID` FOREIGN KEY (`SUBJECT_ID`) REFERENCES `subject` (`SUBJECT_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `prgm_goals_prgm_sched` */

insert  into `prgm_goals_prgm_sched`(`RESPONDENT_ID`,`SUBJECT_ID`,`SCHED_LEVEL`,`SCHED_DAY`,`SCHED_BGN_TM`,`SCHED_END_TM`,`PRGM_GOALS_PRGM_SCHED_ID`) values (4,1,'R','MON','16:00:00','19:00:00',1),(4,1,'R','WED','16:00:00','19:00:00',2),(4,1,'R','FRI','16:00:00','19:00:00',3);

/*Table structure for table `prgm_goals_registration` */

DROP TABLE IF EXISTS `prgm_goals_registration`;

CREATE TABLE `prgm_goals_registration` (
  `REGISTRATION_ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `PARENT_NAME` varchar(255) DEFAULT NULL,
  `STUDENT_NAME` varchar(255) DEFAULT NULL,
  `PARENT_ADDRESS1` varchar(255) DEFAULT NULL,
  `PARENT_ADDRESS2` varchar(255) DEFAULT NULL,
  `STUDENT_ADDRESS1` varchar(255) DEFAULT NULL,
  `STUDENT_ADDRESS2` varchar(255) DEFAULT NULL,
  `PARENT_COUNTRY` varchar(255) DEFAULT NULL,
  `PARENT_ZIP` varchar(255) DEFAULT NULL,
  `STUDENT_ZIP` varchar(255) DEFAULT NULL,
  `PARENT_PHONE` varchar(255) DEFAULT NULL,
  `STUDENT_PHONE` varchar(255) DEFAULT NULL,
  `PASSWORD` varchar(255) DEFAULT NULL,
  `ADDED_DT` date NOT NULL,
  `ADDED_BY` varchar(20) NOT NULL,
  `UPDT_DT` date NOT NULL,
  `UPDT_BY` varchar(20) NOT NULL,
  PRIMARY KEY (`REGISTRATION_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `prgm_goals_registration` */

/*Table structure for table `prgm_goals_respondent` */

DROP TABLE IF EXISTS `prgm_goals_respondent`;

CREATE TABLE `prgm_goals_respondent` (
  `RESPONDENT_ID` int(11) NOT NULL AUTO_INCREMENT,
  `RESPONDENT_DT` date NOT NULL,
  `RESPONDENT_TYPE` enum('PARENT','TEACHER') DEFAULT NULL,
  `STUDENT_ID` int(11) NOT NULL,
  `TEACHER_ID` int(11) NOT NULL,
  `SUBJECT_ID` int(11) NOT NULL,
  `STUDENT_RANK` decimal(2,0) NOT NULL,
  `GRADE_PCTG` decimal(4,2) NOT NULL,
  `ADDED_DT` date NOT NULL,
  `ADDED_BY` varchar(20) NOT NULL,
  `UPDT_DT` date NOT NULL,
  `UPDT_BY` varchar(20) NOT NULL,
  PRIMARY KEY (`RESPONDENT_ID`),
  KEY `PRGM_GOALS_RESPONDENT_IX1` (`STUDENT_ID`,`TEACHER_ID`,`SUBJECT_ID`),
  KEY `PRGM_GOALS_RESPONDENT_IX2` (`TEACHER_ID`,`STUDENT_ID`,`SUBJECT_ID`),
  KEY `FK_TEACHER_INPUT_STUDENT_ID` (`STUDENT_ID`),
  KEY `FK_TEACHER_INPUT_TEACHER_ID` (`TEACHER_ID`),
  KEY `FK_TEACHER_INPUT_SUBJECT_ID` (`SUBJECT_ID`),
  CONSTRAINT `FK_TEACHER_INPUT_STUDENT_ID` FOREIGN KEY (`STUDENT_ID`) REFERENCES `profile` (`PROFILE_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_TEACHER_INPUT_SUBJECT_ID` FOREIGN KEY (`SUBJECT_ID`) REFERENCES `cd_subject` (`SUBJECT_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_TEACHER_INPUT_TEACHER_ID` FOREIGN KEY (`TEACHER_ID`) REFERENCES `profile` (`PROFILE_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=54 DEFAULT CHARSET=latin1;

/*Data for the table `prgm_goals_respondent` */

insert  into `prgm_goals_respondent`(`RESPONDENT_ID`,`RESPONDENT_DT`,`RESPONDENT_TYPE`,`STUDENT_ID`,`TEACHER_ID`,`SUBJECT_ID`,`STUDENT_RANK`,`GRADE_PCTG`,`ADDED_DT`,`ADDED_BY`,`UPDT_DT`,`UPDT_BY`) values (4,'2009-09-09','PARENT',7,14,1,'13','70.45','2009-09-09','NA','2009-09-09','NA'),(5,'2009-09-09','PARENT',7,14,2,'15','85.50','2009-09-09','NA','2009-09-09','NA'),(6,'2009-09-09','PARENT',7,14,3,'18','67.10','2009-09-09','NA','2009-09-09','NA'),(7,'2009-09-09','PARENT',8,14,1,'3','92.00','2009-09-09','NA','2009-09-09','NA'),(8,'2009-09-09','PARENT',8,14,2,'10','85.50','2009-09-09','NA','2009-09-09','NA'),(9,'2009-09-09','PARENT',8,14,3,'8','90.10','2009-09-09','NA','2009-09-09','NA'),(10,'2009-09-09','PARENT',7,14,2,'8','80.00','2009-09-09','NA','2009-09-09','NA'),(20,'2010-03-26','TEACHER',9,14,1,'0','6.00','2010-03-26','2','2010-03-26','2'),(21,'2010-03-26','TEACHER',9,14,1,'0','6.00','2010-03-26','2','2010-03-26','2'),(22,'2010-03-26','TEACHER',9,14,1,'0','6.00','2010-03-26','2','2010-03-26','2'),(23,'2010-03-26','TEACHER',9,14,1,'0','6.00','2010-03-26','2','2010-03-26','2'),(24,'2010-03-26','TEACHER',9,14,1,'0','6.00','2010-03-26','2','2010-03-26','2'),(25,'2010-03-26','TEACHER',9,14,1,'0','6.00','2010-03-26','2','2010-03-26','2'),(26,'2010-03-26','TEACHER',9,14,1,'0','6.00','2010-03-26','2','2010-03-26','2'),(27,'2010-03-26','TEACHER',9,14,1,'0','6.00','2010-03-26','2','2010-03-26','2'),(28,'2010-03-26','TEACHER',9,14,1,'0','6.00','2010-03-26','2','2010-03-26','2'),(29,'2010-03-26','TEACHER',9,14,1,'0','6.00','2010-03-26','2','2010-03-26','2'),(30,'2010-03-26','TEACHER',9,14,1,'0','6.00','2010-03-26','2','2010-03-26','2'),(31,'2010-03-26','TEACHER',9,14,1,'0','6.00','2010-03-26','2','2010-03-26','2'),(32,'2010-03-26','TEACHER',9,14,1,'0','6.00','2010-03-26','2','2010-03-26','2'),(33,'2010-03-26','TEACHER',9,14,1,'0','6.00','2010-03-26','2','2010-03-26','2'),(34,'2010-03-26','TEACHER',9,14,1,'0','6.00','2010-03-26','2','2010-03-26','2'),(35,'2010-04-01','TEACHER',9,14,1,'0','6.00','2010-04-01','2','2010-04-01','2'),(36,'2010-04-01','TEACHER',9,14,1,'0','6.00','2010-04-01','2','2010-04-01','2'),(37,'2010-04-01','TEACHER',9,14,1,'0','6.00','2010-04-01','2','2010-04-01','2'),(38,'2010-04-01','TEACHER',9,14,1,'0','6.00','2010-04-01','2','2010-04-01','2'),(39,'2010-04-01','TEACHER',9,14,1,'0','6.00','2010-04-01','2','2010-04-01','2'),(41,'2010-04-01','TEACHER',9,14,1,'0','6.00','2010-04-01','2','2010-04-01','2'),(42,'2010-04-01','TEACHER',9,14,1,'0','6.00','2010-04-01','2','2010-04-01','2'),(43,'2010-04-01','TEACHER',9,14,1,'0','6.00','2010-04-01','2','2010-04-01','2'),(44,'2010-04-01','TEACHER',9,14,1,'0','6.00','2010-04-01','2','2010-04-01','2'),(45,'2010-04-01','TEACHER',9,14,1,'0','6.00','2010-04-01','2','2010-04-01','2'),(46,'2010-04-01','TEACHER',9,14,1,'0','6.00','2010-04-01','2','2010-04-01','2'),(47,'2010-04-01','TEACHER',9,14,1,'0','6.00','2010-04-01','2','2010-04-01','2'),(48,'2010-04-01','TEACHER',9,14,1,'0','6.00','2010-04-01','2','2010-04-01','2'),(49,'2010-04-01','TEACHER',9,14,1,'0','6.00','2010-04-01','2','2010-04-01','2'),(50,'2010-04-01','TEACHER',9,14,1,'0','6.00','2010-04-01','2','2010-04-01','2'),(51,'2010-04-01','TEACHER',9,14,1,'0','6.00','2010-04-01','2','2010-04-01','2'),(52,'2010-04-01','TEACHER',9,14,1,'0','6.00','2010-04-01','2','2010-04-01','2'),(53,'2010-04-01','TEACHER',9,14,1,'0','6.00','2010-04-01','2','2010-04-01','2');

/*Table structure for table `prgm_goals_skill_sets` */

DROP TABLE IF EXISTS `prgm_goals_skill_sets`;

CREATE TABLE `prgm_goals_skill_sets` (
  `RESPONDENT_ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `COMPUTATION_ACCURACY` smallint(6) NOT NULL,
  `CALCULATOR_USE` smallint(6) NOT NULL,
  `RETENTION` smallint(6) NOT NULL,
  `FORMULA_SELECTION` smallint(6) NOT NULL,
  `ABSTRACT_CONCEPT_GRASP` smallint(6) NOT NULL,
  `LOGICAL_THOUGHT_PROCESS` smallint(6) NOT NULL,
  `LOW_PROBLEM_PROFICIENCY` smallint(6) NOT NULL,
  `MED_PROBLEM_PROFICIENCY` smallint(6) NOT NULL,
  `HI_PROBLEM_PROFICIENCY` smallint(6) NOT NULL,
  `SNGL_STEP_PROBLEM_SKILL` smallint(6) NOT NULL,
  `MULT_STEP_PROBLEM_SKILL` smallint(6) NOT NULL,
  PRIMARY KEY (`RESPONDENT_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=latin1;

/*Data for the table `prgm_goals_skill_sets` */

insert  into `prgm_goals_skill_sets`(`RESPONDENT_ID`,`COMPUTATION_ACCURACY`,`CALCULATOR_USE`,`RETENTION`,`FORMULA_SELECTION`,`ABSTRACT_CONCEPT_GRASP`,`LOGICAL_THOUGHT_PROCESS`,`LOW_PROBLEM_PROFICIENCY`,`MED_PROBLEM_PROFICIENCY`,`HI_PROBLEM_PROFICIENCY`,`SNGL_STEP_PROBLEM_SKILL`,`MULT_STEP_PROBLEM_SKILL`) values (1,0,0,0,0,0,0,0,0,0,0,0),(2,0,0,0,0,0,0,0,0,0,0,0),(3,0,0,0,0,0,0,0,0,0,0,0),(4,0,0,0,0,0,0,0,0,0,0,0),(5,0,0,0,0,0,0,0,0,0,0,0),(6,0,0,0,0,0,0,0,0,0,0,0),(7,0,0,0,0,0,0,0,0,0,0,0),(8,0,0,0,0,0,0,0,0,0,0,0),(9,0,0,0,0,0,0,0,0,0,0,0),(10,0,0,0,0,0,0,0,0,0,0,0),(11,0,0,0,0,0,0,0,0,0,0,0),(12,0,0,0,0,0,0,0,0,0,0,0),(13,0,0,0,0,0,0,0,0,0,0,0),(14,0,0,0,0,0,0,0,0,0,0,0),(15,0,0,0,0,0,0,0,0,0,0,0),(16,0,0,0,0,0,0,0,0,0,0,0),(17,0,0,0,0,0,0,0,0,0,0,0),(18,0,0,0,0,0,0,0,0,0,0,0),(19,0,0,0,0,0,0,0,0,0,0,0),(20,0,0,0,0,0,0,0,0,0,0,0),(21,0,0,0,0,0,0,0,0,0,0,0),(22,0,0,0,0,0,0,0,0,0,0,0),(23,0,0,0,0,0,0,0,0,0,0,0),(24,0,0,0,0,0,0,0,0,0,0,0),(25,0,0,0,0,0,0,0,0,0,0,0);

/*Table structure for table `prgm_goals_work_hbits` */

DROP TABLE IF EXISTS `prgm_goals_work_hbits`;

CREATE TABLE `prgm_goals_work_hbits` (
  `RESPONDENT_ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `COMPLETES_ASSIGNMENTS` smallint(6) NOT NULL,
  `SHOWS_SOLUTION` smallint(6) NOT NULL,
  `FOCUS` smallint(6) NOT NULL,
  `ACCURACY` smallint(6) NOT NULL,
  `ORGANIZATION` smallint(6) NOT NULL,
  `PREPARATION` smallint(6) NOT NULL,
  PRIMARY KEY (`RESPONDENT_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=latin1;

/*Data for the table `prgm_goals_work_hbits` */

insert  into `prgm_goals_work_hbits`(`RESPONDENT_ID`,`COMPLETES_ASSIGNMENTS`,`SHOWS_SOLUTION`,`FOCUS`,`ACCURACY`,`ORGANIZATION`,`PREPARATION`) values (1,0,0,0,0,0,0),(2,0,0,0,0,0,0),(3,0,0,0,0,0,0),(4,0,0,0,0,0,0),(5,0,0,0,0,0,0),(6,4,3,3,1,2,4),(7,0,0,0,0,0,0),(8,0,0,0,0,0,0),(9,0,0,0,0,0,0),(10,0,0,0,0,0,0),(11,0,0,0,0,0,0),(12,0,0,0,0,0,0),(13,0,0,0,0,0,0),(14,0,0,0,0,0,0),(15,0,0,0,0,0,0),(16,0,0,0,0,0,0),(17,0,0,0,0,0,0),(18,0,0,0,0,0,0),(19,0,0,0,0,0,0),(20,0,0,0,0,0,0),(21,0,0,0,0,0,0),(22,0,0,0,0,0,0),(23,0,0,0,0,0,0),(24,0,0,0,0,0,0),(25,0,0,0,0,0,0),(26,0,0,0,0,0,0),(27,0,0,0,0,0,0),(28,0,0,0,0,0,0),(29,0,0,0,0,0,0),(30,0,0,0,0,0,0),(31,0,0,0,0,0,0);

/*Table structure for table `profile` */

DROP TABLE IF EXISTS `profile`;

CREATE TABLE `profile` (
  `PROFILE_ID` int(11) NOT NULL,
  `ACCOUNT_ID` int(11) NOT NULL,
  `PROFILE_TYPE` char(2) NOT NULL,
  `PROFILE_FNAME` varchar(45) NOT NULL,
  `PROFILE_MNAME` varchar(45) DEFAULT NULL,
  `PROFILE_LNAME` varchar(45) NOT NULL,
  `PROFILE_SUFFX` varchar(4) DEFAULT NULL,
  `PROFILE_ADDR1` varchar(80) DEFAULT NULL,
  `PROFILE_ADDR2` varchar(80) DEFAULT NULL,
  `PROFILE_ADDR3` varchar(80) DEFAULT NULL,
  `PROFILE_CITY` varchar(25) DEFAULT NULL,
  `PROFILE_STATE` varchar(25) DEFAULT NULL,
  `PROFILE_ZIP` varchar(10) DEFAULT NULL,
  `PROFILE_CNTRY` varchar(25) DEFAULT NULL,
  `PROFILE_ATTN` varchar(80) DEFAULT NULL,
  `PROFILE_BDAY_DT` date DEFAULT NULL,
  `PROFILE_EMAIL` varchar(80) DEFAULT NULL,
  `PROFILE_TEXT_MSG` int(11) DEFAULT NULL,
  `ADDED_DT` date NOT NULL,
  `ADDED_BY` varchar(20) NOT NULL,
  `UPDT_DT` date NOT NULL,
  `UPDT_BY` varchar(20) NOT NULL,
  PRIMARY KEY (`PROFILE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `profile` */

insert  into `profile`(`PROFILE_ID`,`ACCOUNT_ID`,`PROFILE_TYPE`,`PROFILE_FNAME`,`PROFILE_MNAME`,`PROFILE_LNAME`,`PROFILE_SUFFX`,`PROFILE_ADDR1`,`PROFILE_ADDR2`,`PROFILE_ADDR3`,`PROFILE_CITY`,`PROFILE_STATE`,`PROFILE_ZIP`,`PROFILE_CNTRY`,`PROFILE_ATTN`,`PROFILE_BDAY_DT`,`PROFILE_EMAIL`,`PROFILE_TEXT_MSG`,`ADDED_DT`,`ADDED_BY`,`UPDT_DT`,`UPDT_BY`) values (2,1,'P','debbie',NULL,'wilson',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'debbie1@eol.com',NULL,'2009-09-09','NA','2010-04-01','username'),(3,3,'P','bobby',NULL,'smith',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'a@eol.com',NULL,'2009-09-09','NA','2009-09-09','NA'),(4,4,'P','karen',NULL,'fife',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'a@eol.com',NULL,'2009-09-09','NA','2009-09-09','NA'),(5,5,'P','rich',NULL,'lee',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'a@eol.com',NULL,'2009-09-09','NA','2009-09-09','NA'),(7,1,'S','tom',NULL,'lueders',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'a@eol.com',NULL,'2009-09-09','NA','2009-09-09','NA'),(8,1,'S','luara',NULL,'casio',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'a@eol.com',NULL,'2009-09-09','NA','2009-09-09','NA'),(9,1,'S','kevin',NULL,'perez',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'a@eol.com',NULL,'2009-09-09','NA','2010-04-01','test'),(10,1,'S','jacob',NULL,'jaworski',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'a@eol.com',NULL,'2009-09-09','NA','2009-09-09','NA'),(11,1,'S','sarah',NULL,'finnegan',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'a@eol.com',NULL,'2009-09-09','NA','2009-09-09','NA'),(12,1,'S','james',NULL,'tucci',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'a@eol.com',NULL,'2009-09-09','NA','2009-09-09','NA'),(13,1,'S','claire',NULL,'sharp',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'a@eol.com',NULL,'2009-09-09','NA','2009-09-09','NA'),(14,5,'T','chris',NULL,'herman',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'a@eol.com',NULL,'2009-09-09','NA','2009-09-09','NA');

/*Table structure for table `profile_details` */

DROP TABLE IF EXISTS `profile_details`;

CREATE TABLE `profile_details` (
  `PROFILE_ID` int(11) NOT NULL,
  `SESSN_LNGTH_MIN` tinyint(4) NOT NULL,
  `SESSN_LNGTH_MAX` tinyint(4) NOT NULL,
  `GRADE` varchar(2) NOT NULL,
  `ADDED_DT` date NOT NULL,
  `ADDED_BY` varchar(20) NOT NULL,
  `UPDT_DT` date NOT NULL,
  `UPDT_BY` varchar(20) NOT NULL,
  PRIMARY KEY (`PROFILE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `profile_details` */

insert  into `profile_details`(`PROFILE_ID`,`SESSN_LNGTH_MIN`,`SESSN_LNGTH_MAX`,`GRADE`,`ADDED_DT`,`ADDED_BY`,`UPDT_DT`,`UPDT_BY`) values (6,10,100,'9','2009-09-09','NA','2009-09-09','NA'),(7,10,100,'7','2009-09-09','NA','2009-09-09','NA'),(8,10,100,'4','2009-09-09','NA','2009-09-09','NA'),(9,20,90,'8','2009-09-09','NA','2009-09-09','NA'),(10,20,90,'5','2009-09-09','NA','2009-09-09','NA'),(11,15,90,'8','2009-09-09','NA','2009-09-09','NA'),(12,15,90,'5','2009-09-09','NA','2009-09-09','NA'),(13,15,80,'2','2009-09-09','NA','2009-09-09','NA');

/*Table structure for table `score` */

DROP TABLE IF EXISTS `score`;

CREATE TABLE `score` (
  `SCORE_ID` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `student_id` int(11) NOT NULL,
  `topic_id` int(11) NOT NULL,
  `score` int(11) DEFAULT NULL,
  `timestamp` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`SCORE_ID`),
  UNIQUE KEY `id` (`SCORE_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=79 DEFAULT CHARSET=latin1;

/*Data for the table `score` */

insert  into `score`(`SCORE_ID`,`student_id`,`topic_id`,`score`,`timestamp`) values (1,1,1,75,'2009-09-09 15:56:50'),(2,1,2,95,'2009-09-09 15:56:50'),(3,1,3,85,'2009-09-09 15:56:50'),(4,1,4,70,'2009-09-09 15:56:50'),(5,1,5,85,'2009-09-09 15:56:50'),(6,2,1,65,'2009-09-09 15:56:50'),(7,2,2,70,'2009-09-09 15:56:50'),(8,2,3,80,'2009-09-09 15:56:50'),(9,2,4,75,'2009-09-09 15:56:50'),(10,2,5,70,'2009-09-09 15:56:50'),(11,3,1,90,'2009-09-09 15:56:50'),(12,3,2,80,'2009-09-09 15:56:50'),(13,3,3,75,'2009-09-09 15:56:50'),(14,3,4,95,'2009-09-09 15:56:50'),(15,3,5,85,'2009-09-09 15:56:50'),(16,4,1,100,'2009-09-09 15:56:50'),(17,4,2,90,'2009-09-09 15:56:50'),(18,4,3,90,'2009-09-09 15:56:50'),(19,4,4,90,'2009-09-09 15:56:50'),(20,4,5,95,'2009-09-09 15:56:50'),(21,5,1,60,'2009-09-09 15:56:50'),(22,5,2,75,'2009-09-09 15:56:50'),(23,5,3,65,'2009-09-09 15:56:50'),(24,5,4,70,'2009-09-09 15:56:50'),(25,5,5,60,'2009-09-09 15:56:50'),(26,6,1,70,'2009-09-09 15:56:50'),(27,6,2,70,'2009-09-09 15:56:50'),(28,6,3,75,'2009-09-09 15:56:50'),(29,6,4,70,'2009-09-09 15:56:50'),(30,6,5,70,'2009-09-09 15:56:50'),(31,1,6,75,'2009-09-09 15:56:50'),(32,1,7,95,'2009-09-09 15:56:50'),(33,1,8,85,'2009-09-09 15:56:50'),(34,1,9,70,'2009-09-09 15:56:50'),(35,1,10,85,'2009-09-09 15:56:50'),(36,2,6,65,'2009-09-09 15:56:50'),(37,2,7,70,'2009-09-09 15:56:50'),(38,2,8,80,'2009-09-09 15:56:50'),(39,2,9,75,'2009-09-09 15:56:50'),(40,2,10,70,'2009-09-09 15:56:50'),(41,3,6,90,'2009-09-09 15:56:50'),(42,3,7,80,'2009-09-09 15:56:50'),(43,3,8,75,'2009-09-09 15:56:50'),(44,3,9,95,'2009-09-09 15:56:50'),(45,3,10,85,'2009-09-09 15:56:50'),(46,4,6,100,'2009-09-09 15:56:50'),(47,4,7,90,'2009-09-09 15:56:50'),(48,4,8,90,'2009-09-09 15:56:50'),(49,4,9,90,'2009-09-09 15:56:50'),(50,4,10,95,'2009-09-09 15:56:50'),(51,5,6,60,'2009-09-09 15:56:50'),(52,5,7,75,'2009-09-09 15:56:50'),(53,5,8,65,'2009-09-09 15:56:50'),(54,5,9,70,'2009-09-09 15:56:50'),(55,5,10,60,'2009-09-09 15:56:50'),(56,6,6,70,'2009-09-09 15:56:50'),(57,6,7,70,'2009-09-09 15:56:50'),(58,6,8,75,'2009-09-09 15:56:50'),(59,6,9,70,'2009-09-09 15:56:50'),(60,6,10,70,'2009-09-09 15:56:50'),(61,1,11,75,'2009-09-09 15:56:50'),(62,1,12,95,'2009-09-09 15:56:50'),(63,1,13,85,'2009-09-09 15:56:50'),(64,2,11,65,'2009-09-09 15:56:50'),(65,2,12,70,'2009-09-09 15:56:50'),(66,2,13,80,'2009-09-09 15:56:50'),(67,3,11,90,'2009-09-09 15:56:50'),(68,3,12,80,'2009-09-09 15:56:50'),(69,3,13,75,'2009-09-09 15:56:50'),(70,4,11,100,'2009-09-09 15:56:50'),(71,4,12,90,'2009-09-09 15:56:50'),(72,4,13,90,'2009-09-09 15:56:50'),(73,5,11,60,'2009-09-09 15:56:50'),(74,5,12,75,'2009-09-09 15:56:50'),(75,5,13,65,'2009-09-09 15:56:50'),(76,6,11,70,'2009-09-09 15:56:50'),(77,6,12,70,'2009-09-09 15:56:50'),(78,6,13,75,'2009-09-09 15:56:50');

/*Table structure for table `student` */

DROP TABLE IF EXISTS `student`;

CREATE TABLE `student` (
  `PROFILE_ID` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `grade` int(11) DEFAULT '8',
  `STUDENT_ID` bigint(20) NOT NULL,
  PRIMARY KEY (`STUDENT_ID`),
  UNIQUE KEY `id` (`PROFILE_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=latin1;

/*Data for the table `student` */

insert  into `student`(`PROFILE_ID`,`grade`,`STUDENT_ID`) values (7,5,1),(8,7,2),(9,6,3),(10,4,4),(11,5,5),(12,7,6),(13,8,7);

/*Table structure for table `student_activity_log` */

DROP TABLE IF EXISTS `student_activity_log`;

CREATE TABLE `student_activity_log` (
  `STUDENT_ACTIVITY_LOG_ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `STUDENT_ID` int(11) NOT NULL,
  `START_TM` time NOT NULL,
  `END_TM` time NOT NULL,
  `ACTIVITY_ID` int(11) NOT NULL,
  `ACTIVITY_TYPE` char(1) NOT NULL,
  `SUBJECT_ID` int(11) NOT NULL,
  `TOPIC_ID` int(11) NOT NULL,
  `LRN_OBJ_ID` int(11) NOT NULL,
  `SESSION_ID` int(11) NOT NULL,
  `PRBLM_DESC` text,
  `ANSWR_DESC` text,
  `INDICATOR` char(4) NOT NULL,
  `OTHER_ID` int(11) NOT NULL DEFAULT '0',
  `PRBLM_RESULT` enum('Correct','Correct with hint','Correct with feedback','Incorrect') DEFAULT NULL,
  `ADDED_DT` date NOT NULL,
  `ADDED_BY` varchar(20) NOT NULL,
  PRIMARY KEY (`STUDENT_ACTIVITY_LOG_ID`),
  KEY `STUDENT_RESULTS_IX1` (`STUDENT_ID`,`ADDED_DT`,`SUBJECT_ID`),
  KEY `FK_STUDENT_ACTIVITY_LOG_STUDENT_ID` (`STUDENT_ID`),
  KEY `FK_STUDENT_ACTIVITY_LOG_SUBJECT_ID` (`SUBJECT_ID`),
  CONSTRAINT `FK_STUDENT_ACTIVITY_LOG_STUDENT_ID` FOREIGN KEY (`STUDENT_ID`) REFERENCES `profile` (`PROFILE_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_STUDENT_ACTIVITY_LOG_SUBJECT_ID` FOREIGN KEY (`SUBJECT_ID`) REFERENCES `cd_subject` (`SUBJECT_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=95 DEFAULT CHARSET=latin1;

/*Data for the table `student_activity_log` */

insert  into `student_activity_log`(`STUDENT_ACTIVITY_LOG_ID`,`STUDENT_ID`,`START_TM`,`END_TM`,`ACTIVITY_ID`,`ACTIVITY_TYPE`,`SUBJECT_ID`,`TOPIC_ID`,`LRN_OBJ_ID`,`SESSION_ID`,`PRBLM_DESC`,`ANSWR_DESC`,`INDICATOR`,`OTHER_ID`,`PRBLM_RESULT`,`ADDED_DT`,`ADDED_BY`) values (1,8,'12:10:00','12:11:00',2,'A',1,1,100,100,NULL,NULL,'NA',0,'Correct','2009-09-09','NA'),(2,8,'12:10:00','12:11:00',2,'A',1,1,100,100,NULL,NULL,'NA',0,'Correct','2009-09-09','NA'),(3,8,'12:10:00','12:11:00',2,'A',1,1,100,100,NULL,NULL,'NA',0,'Correct','2009-09-09','NA'),(4,8,'12:10:00','12:11:00',2,'A',1,2,100,100,NULL,NULL,'NA',0,'Correct','2009-09-09','NA'),(5,8,'12:10:00','12:11:00',2,'A',1,2,100,100,NULL,NULL,'NA',0,'Incorrect','2009-09-09','NA'),(6,8,'12:10:00','12:11:00',2,'A',1,2,100,100,NULL,NULL,'NA',0,'Correct','2009-09-09','NA'),(7,8,'12:10:00','12:11:00',2,'A',1,2,100,100,NULL,NULL,'NA',0,'Incorrect','2009-09-09','NA'),(8,8,'12:10:00','12:11:00',2,'A',1,2,100,100,NULL,NULL,'NA',0,'Correct','2009-09-09','NA'),(9,8,'12:10:00','12:11:00',2,'A',1,2,100,100,NULL,NULL,'NA',0,'Incorrect','2009-09-09','NA'),(10,8,'12:10:00','12:11:00',2,'A',1,3,100,100,NULL,NULL,'NA',0,'Correct','2009-09-09','NA'),(11,8,'12:10:00','12:11:00',2,'A',1,3,100,100,NULL,NULL,'NA',0,'Correct','2009-09-09','NA'),(12,8,'12:10:00','12:11:00',2,'A',1,3,100,100,NULL,NULL,'NA',0,'Correct','2009-09-09','NA'),(13,8,'12:10:00','12:11:00',2,'A',1,3,100,100,NULL,NULL,'NA',0,'Correct','2009-09-09','NA'),(14,8,'12:10:00','12:11:00',2,'A',1,3,100,100,NULL,NULL,'NA',0,'Incorrect','2009-09-09','NA'),(15,8,'12:10:00','12:11:00',2,'A',1,3,100,100,NULL,NULL,'NA',0,'Correct','2009-09-09','NA'),(16,8,'12:10:00','12:11:00',2,'A',1,4,100,100,NULL,NULL,'NA',0,'Correct','2009-09-09','NA'),(17,8,'12:10:00','12:11:00',2,'A',1,4,100,100,NULL,NULL,'NA',0,'Incorrect','2009-09-09','NA'),(18,8,'12:10:00','12:11:00',2,'A',1,4,100,100,NULL,NULL,'NA',0,'Incorrect','2009-09-09','NA'),(19,8,'12:10:00','12:11:00',2,'A',1,4,100,100,NULL,NULL,'NA',0,'Correct','2009-09-09','NA'),(20,8,'12:10:00','12:11:00',2,'A',1,4,100,100,NULL,NULL,'NA',0,'Correct','2009-09-09','NA'),(21,8,'12:10:00','12:11:00',2,'A',1,4,100,100,NULL,NULL,'NA',0,'Correct','2009-09-09','NA'),(22,8,'12:10:00','12:11:00',2,'A',1,5,100,100,NULL,NULL,'NA',0,'Incorrect','2009-09-09','NA'),(23,8,'12:10:00','12:11:00',2,'A',1,5,100,100,NULL,NULL,'NA',0,'Correct','2009-09-09','NA'),(24,8,'12:10:00','12:11:00',2,'A',1,5,100,100,NULL,NULL,'NA',0,'Correct','2009-09-09','NA'),(25,8,'12:10:00','12:11:00',2,'A',1,5,100,100,NULL,NULL,'NA',0,'Correct','2009-09-09','NA'),(26,8,'12:10:00','12:11:00',2,'A',1,5,100,100,NULL,NULL,'NA',0,'Incorrect','2009-09-09','NA'),(27,8,'12:10:00','12:11:00',2,'A',1,5,100,100,NULL,NULL,'NA',0,'Correct','2009-09-09','NA'),(28,8,'12:10:00','12:11:00',2,'A',1,5,100,100,NULL,NULL,'NA',0,'Incorrect','2009-09-09','NA'),(29,8,'12:10:00','12:11:00',2,'A',2,7,100,100,NULL,NULL,'NA',0,'Correct','2009-09-09','NA'),(30,8,'12:10:00','12:11:00',2,'A',2,6,100,100,NULL,NULL,'NA',0,'Correct','2009-09-09','NA'),(31,8,'12:10:00','12:11:00',2,'A',2,6,100,100,NULL,NULL,'NA',0,'Correct','2009-09-09','NA'),(32,8,'12:10:00','12:11:00',2,'A',2,6,100,100,NULL,NULL,'NA',0,'Correct','2009-09-09','NA'),(33,8,'12:10:00','12:11:00',2,'A',2,7,100,100,NULL,NULL,'NA',0,'Correct','2009-09-09','NA'),(34,8,'12:10:00','12:11:00',2,'A',2,7,100,100,NULL,NULL,'NA',0,'Incorrect','2009-09-09','NA'),(35,8,'12:10:00','12:11:00',2,'A',2,7,100,100,NULL,NULL,'NA',0,'Correct','2009-09-09','NA'),(36,8,'12:10:00','12:11:00',2,'A',2,7,100,100,NULL,NULL,'NA',0,'Incorrect','2009-09-09','NA'),(37,8,'12:10:00','12:11:00',2,'A',2,8,100,100,NULL,NULL,'NA',0,'Incorrect','2009-09-09','NA'),(38,8,'12:10:00','12:11:00',2,'A',2,8,100,100,NULL,NULL,'NA',0,'Incorrect','2009-09-09','NA'),(39,8,'12:10:00','12:11:00',2,'A',2,8,100,100,NULL,NULL,'NA',0,'Correct','2009-09-09','NA'),(40,8,'12:10:00','12:11:00',2,'A',2,8,100,100,NULL,NULL,'NA',0,'Correct','2009-09-09','NA'),(41,8,'12:10:00','12:11:00',2,'A',2,8,100,100,NULL,NULL,'NA',0,'Correct','2009-09-09','NA'),(42,8,'12:10:00','12:11:00',2,'A',2,9,100,100,NULL,NULL,'NA',0,'Correct','2009-09-09','NA'),(43,8,'12:10:00','12:11:00',2,'A',2,9,100,100,NULL,NULL,'NA',0,'Correct','2009-09-09','NA'),(44,8,'12:10:00','12:11:00',2,'A',2,9,100,100,NULL,NULL,'NA',0,'Correct','2009-09-09','NA'),(45,8,'12:10:00','12:11:00',2,'A',2,10,100,100,NULL,NULL,'NA',0,'Correct','2009-09-09','NA'),(46,8,'12:10:00','12:11:00',2,'A',2,10,100,100,NULL,NULL,'NA',0,'Correct','2009-09-09','NA'),(47,8,'12:10:00','12:11:00',2,'A',2,10,100,100,NULL,NULL,'NA',0,'Incorrect','2009-09-09','NA'),(48,8,'12:10:00','12:11:00',2,'A',2,10,100,100,NULL,NULL,'NA',0,'Incorrect','2009-09-09','NA'),(49,8,'12:10:00','12:11:00',2,'A',3,11,100,100,NULL,NULL,'NA',0,'Correct','2009-09-09','NA'),(50,8,'12:10:00','12:11:00',2,'A',3,11,100,100,NULL,NULL,'NA',0,'Incorrect','2009-09-09','NA'),(51,8,'12:10:00','12:11:00',2,'A',3,11,100,100,NULL,NULL,'NA',0,'Correct','2009-09-09','NA'),(52,8,'12:10:00','12:11:00',2,'A',3,11,100,100,NULL,NULL,'NA',0,'Correct','2009-09-09','NA'),(53,8,'12:10:00','12:11:00',2,'A',3,11,100,100,NULL,NULL,'NA',0,'Correct','2009-09-09','NA'),(54,8,'12:10:00','12:11:00',2,'A',3,11,100,100,NULL,NULL,'NA',0,'Correct','2009-09-09','NA'),(55,8,'12:10:00','12:11:00',2,'A',3,12,100,100,NULL,NULL,'NA',0,'Incorrect','2009-09-09','NA'),(56,8,'12:10:00','12:11:00',2,'A',3,12,100,100,NULL,NULL,'NA',0,'Correct','2009-09-09','NA'),(57,8,'12:10:00','12:11:00',2,'A',3,12,100,100,NULL,NULL,'NA',0,'Incorrect','2009-09-09','NA'),(58,8,'12:10:00','12:11:00',2,'A',3,12,100,100,NULL,NULL,'NA',0,'Incorrect','2009-09-09','NA'),(59,8,'12:10:00','12:11:00',2,'A',3,12,100,100,NULL,NULL,'NA',0,'Correct','2009-09-09','NA'),(60,8,'12:10:00','12:11:00',2,'A',3,12,100,100,NULL,NULL,'NA',0,'Correct','2009-09-09','NA'),(61,8,'12:10:00','12:11:00',2,'A',3,12,100,100,NULL,NULL,'NA',0,'Correct','2009-09-09','NA'),(62,8,'12:10:00','12:11:00',2,'A',3,12,100,100,NULL,NULL,'NA',0,'Correct','2009-09-09','NA'),(63,8,'12:10:00','12:11:00',2,'A',3,13,100,100,NULL,NULL,'NA',0,'Correct','2009-09-09','NA'),(64,8,'12:10:00','12:11:00',2,'A',3,13,100,100,NULL,NULL,'NA',0,'Incorrect','2009-09-09','NA'),(65,8,'12:10:00','12:11:00',2,'A',3,13,100,100,NULL,NULL,'NA',0,'Incorrect','2009-09-09','NA'),(66,8,'12:10:00','12:11:00',2,'A',3,13,100,100,NULL,NULL,'NA',0,'Correct','2009-09-09','NA'),(67,8,'12:10:00','12:11:00',2,'A',3,13,100,100,NULL,NULL,'NA',0,'Correct','2009-09-09','NA'),(68,8,'12:10:00','12:11:00',2,'A',3,13,100,100,NULL,NULL,'NA',0,'Correct','2009-09-09','NA'),(69,8,'12:10:00','12:11:00',2,'A',3,13,100,100,NULL,NULL,'NA',0,'Correct','2009-09-09','NA'),(70,8,'12:10:00','12:11:00',2,'A',3,13,100,100,NULL,NULL,'NA',0,'Correct','2009-09-09','NA'),(71,8,'12:10:00','12:11:00',2,'A',3,13,100,100,NULL,NULL,'NA',0,'Incorrect','2009-09-09','NA'),(72,8,'12:10:00','12:11:00',2,'A',3,13,100,100,NULL,NULL,'NA',0,'Correct','2009-09-09','NA'),(73,8,'12:10:00','12:11:00',2,'A',3,13,100,100,NULL,NULL,'NA',0,'Correct','2009-09-09','NA'),(74,8,'12:10:00','12:11:00',2,'A',1,2,100,100,NULL,NULL,'NA',0,'Correct','2009-09-09','NA'),(75,8,'12:10:00','12:11:00',2,'A',1,2,100,100,NULL,NULL,'NA',0,'Correct','2009-09-09','NA'),(76,8,'12:10:00','12:11:00',2,'A',1,2,100,100,NULL,NULL,'NA',0,'Correct','2009-09-09','NA'),(77,8,'12:10:00','12:11:00',2,'A',1,2,100,100,NULL,NULL,'NA',0,'Incorrect','2009-09-09','NA'),(78,8,'12:10:00','12:11:00',2,'A',1,2,100,100,NULL,NULL,'NA',0,'Incorrect','2009-09-09','NA'),(79,8,'12:10:00','12:11:00',2,'A',1,2,100,100,NULL,NULL,'NA',0,'Correct','2009-09-09','NA'),(80,8,'12:10:00','12:11:00',2,'A',1,1,100,100,NULL,NULL,'NA',0,'Correct','2009-09-09','NA'),(81,8,'12:10:00','12:11:00',2,'A',1,1,100,100,NULL,NULL,'NA',0,'Correct','2009-09-09','NA'),(82,8,'12:10:00','12:11:00',2,'A',1,1,100,100,NULL,NULL,'NA',0,'Incorrect','2009-09-09','NA'),(83,8,'12:10:00','12:11:00',2,'A',1,1,100,100,NULL,NULL,'NA',0,'Correct','2009-09-09','NA'),(84,8,'12:10:00','12:11:00',2,'A',1,2,100,100,NULL,NULL,'NA',0,'Correct','2009-09-09','NA'),(85,8,'12:10:00','12:11:00',2,'A',1,2,100,100,NULL,NULL,'NA',0,'Incorrect','2009-09-09','NA'),(86,8,'12:10:00','12:11:00',2,'A',1,2,100,100,NULL,NULL,'NA',0,'Incorrect','2009-09-09','NA'),(87,8,'12:10:00','12:11:00',2,'A',1,2,100,100,NULL,NULL,'NA',0,'Incorrect','2009-09-09','NA'),(88,8,'12:10:00','12:11:00',2,'A',1,2,100,100,NULL,NULL,'NA',0,'Correct','2009-09-09','NA'),(89,8,'12:10:00','12:11:00',2,'A',1,1,100,100,NULL,NULL,'NA',0,'Correct','2009-09-09','NA'),(90,8,'12:10:00','12:11:00',2,'A',1,1,100,100,NULL,NULL,'NA',0,'Incorrect','2009-09-09','NA'),(91,8,'12:10:00','12:11:00',2,'A',1,1,100,100,NULL,NULL,'NA',0,'Correct','2009-09-09','NA'),(92,8,'12:10:00','12:11:00',2,'A',1,2,100,100,NULL,NULL,'NA',0,'Correct','2009-09-09','NA'),(93,8,'12:10:00','12:11:00',2,'A',1,2,100,100,NULL,NULL,'NA',0,'Correct','2009-09-09','NA'),(94,8,'12:10:00','12:11:00',2,'A',1,2,100,100,NULL,NULL,'NA',0,'Correct','2009-09-09','NA');

/*Table structure for table `student_lrng_style` */

DROP TABLE IF EXISTS `student_lrng_style`;

CREATE TABLE `student_lrng_style` (
  `STUDENT_ID` int(11) NOT NULL,
  `LRNG_STYLE_ID` int(11) NOT NULL,
  `WEIGHT` int(11) NOT NULL DEFAULT '0',
  `SUBJECT_ID` int(11) NOT NULL,
  `ADDED_DT` date NOT NULL,
  `ADDED_BY` varchar(20) NOT NULL,
  `UPDT_DT` date NOT NULL,
  `UPDT_BY` varchar(20) NOT NULL,
  `STUDENT_LRNG_STYLE_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`STUDENT_ID`,`LRNG_STYLE_ID`),
  KEY `FK_STUDENT_LRNG_STYLE_STUDENT_ID` (`STUDENT_ID`),
  KEY `FK_STUDENT_LRNG_STYLE_LRNG_STYLE_ID` (`LRNG_STYLE_ID`),
  KEY `FK_STUDENT_LRNG_STYLE_SUBJECT_ID` (`SUBJECT_ID`),
  CONSTRAINT `FK_STUDENT_LRNG_STYLE_LRNG_STYLE_ID` FOREIGN KEY (`STUDENT_ID`) REFERENCES `cd_lrng_style` (`LRNG_STYLE_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_STUDENT_LRNG_STYLE_STUDENT_ID` FOREIGN KEY (`STUDENT_ID`) REFERENCES `profile` (`PROFILE_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_STUDENT_LRNG_STYLE_SUBJECT_ID` FOREIGN KEY (`SUBJECT_ID`) REFERENCES `cd_subject` (`SUBJECT_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `student_lrng_style` */

/*Table structure for table `student_parent_pair` */

DROP TABLE IF EXISTS `student_parent_pair`;

CREATE TABLE `student_parent_pair` (
  `STUDENT_ID` int(11) NOT NULL,
  `PARENT_ID` int(11) NOT NULL,
  `ADDED_DT` date NOT NULL,
  `ADDED_BY` varchar(20) NOT NULL,
  `UPDT_DT` date NOT NULL,
  `UPDT_BY` varchar(20) NOT NULL,
  `STUDENT_PARENT_PAIR_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`STUDENT_ID`,`PARENT_ID`),
  KEY `STUDENT_PARENT_PAIR_IX1` (`PARENT_ID`,`STUDENT_ID`),
  KEY `FK_STUDENT_PARENT_PAIR_PARENT_ID` (`PARENT_ID`),
  CONSTRAINT `FK_STUDENT_PARENT_PAIR_PARENT_ID` FOREIGN KEY (`PARENT_ID`) REFERENCES `profile` (`PROFILE_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_STUDENT_PARENT_PAIR_STUDENT_ID` FOREIGN KEY (`STUDENT_ID`) REFERENCES `profile` (`PROFILE_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `student_parent_pair` */

insert  into `student_parent_pair`(`STUDENT_ID`,`PARENT_ID`,`ADDED_DT`,`ADDED_BY`,`UPDT_DT`,`UPDT_BY`,`STUDENT_PARENT_PAIR_ID`) values (9,2,'2009-09-09','NA','2009-09-09','NA',1),(10,2,'2009-09-09','NA','2009-09-09','NA',2),(11,3,'2009-09-09','NA','2009-09-09','NA',3),(12,3,'2009-09-09','NA','2009-09-09','NA',4),(13,4,'2009-09-09','NA','2009-09-09','NA',5);

/*Table structure for table `student_results` */

DROP TABLE IF EXISTS `student_results`;

CREATE TABLE `student_results` (
  `STUDENT_ID` int(11) NOT NULL,
  `SUBJECT_ID` int(11) NOT NULL,
  `ACTIVITY_ID` int(11) NOT NULL,
  `ACTIVITY_TYPE` char(1) NOT NULL,
  `PROBLEM_ID` int(11) DEFAULT NULL,
  `START_TM` time NOT NULL,
  `END_TM` time NOT NULL,
  `PRBLM_RESULT` enum('Correct','Correct with hint','Correct with feedback','Incorrect') DEFAULT NULL,
  `ADDED_DT` date NOT NULL,
  `ADDED_BY` varchar(20) NOT NULL,
  `UPDT_DT` date NOT NULL,
  `UPDT_BY` varchar(20) NOT NULL,
  `STUDENT_RESULTS_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`STUDENT_ID`,`SUBJECT_ID`,`ADDED_DT`),
  KEY `STUDENT_RESULTS_IX1` (`STUDENT_ID`,`ADDED_DT`,`SUBJECT_ID`),
  KEY `FK_STUDENT_RESULTS_STUDENT_ID` (`STUDENT_ID`),
  KEY `FK_STUDENT_RESULTS_SUBJECT_ID` (`SUBJECT_ID`),
  CONSTRAINT `FK_STUDENT_RESULTS_STUDENT_ID` FOREIGN KEY (`STUDENT_ID`) REFERENCES `profile` (`PROFILE_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_STUDENT_RESULTS_SUBJECT_ID` FOREIGN KEY (`SUBJECT_ID`) REFERENCES `cd_subject` (`SUBJECT_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `student_results` */

insert  into `student_results`(`STUDENT_ID`,`SUBJECT_ID`,`ACTIVITY_ID`,`ACTIVITY_TYPE`,`PROBLEM_ID`,`START_TM`,`END_TM`,`PRBLM_RESULT`,`ADDED_DT`,`ADDED_BY`,`UPDT_DT`,`UPDT_BY`,`STUDENT_RESULTS_ID`) values (7,1,10,'A',10,'12:00:00','13:00:00','Correct','2009-09-01','someone','2009-09-01','someone',1),(7,1,11,'A',11,'12:00:00','13:00:00','Correct','2009-09-02','someioine','2009-09-01','someone',2),(7,1,12,'A',12,'12:00:00','13:00:00','Incorrect','2009-09-03','someone','2009-09-01','someone',3),(7,1,13,'A',13,'12:00:00','13:00:00','Correct','2009-09-04','someone','2009-09-01','someone',4),(7,2,14,'A',14,'12:00:00','13:00:00','Correct','2009-09-05','someone','2009-09-01','someone',5),(7,2,15,'A',15,'12:00:00','13:00:00','Incorrect','2009-09-06','someone','2009-09-01','someone',6);

/*Table structure for table `student_teacher_pair` */

DROP TABLE IF EXISTS `student_teacher_pair`;

CREATE TABLE `student_teacher_pair` (
  `STUDENT_ID` int(11) NOT NULL,
  `TEACHER_ID` int(11) NOT NULL,
  `SUBJECT_ID` int(11) NOT NULL,
  `ADDED_DT` date NOT NULL,
  `ADDED_BY` varchar(20) NOT NULL,
  `UPDT_DT` date NOT NULL,
  `UPDT_BY` varchar(20) NOT NULL,
  `STUDENT_TEACHER_PAIR_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`STUDENT_ID`,`TEACHER_ID`,`SUBJECT_ID`),
  KEY `STUDENT_TEACHER_PAIR_IX1` (`TEACHER_ID`,`STUDENT_ID`),
  KEY `FK_STUDENT_TEACHER_PAIR_TEACHER_ID` (`TEACHER_ID`),
  KEY `FK_STUDENT_TEACHER_PAIR_STUDENT_ID` (`STUDENT_ID`),
  KEY `FK_STUDENT_TEACHER_PAIR_SUBJECT_ID` (`SUBJECT_ID`),
  CONSTRAINT `FK_STUDENT_TEACHER_PAIR_STUDENT_ID` FOREIGN KEY (`STUDENT_ID`) REFERENCES `profile` (`PROFILE_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_STUDENT_TEACHER_PAIR_SUBJECT_ID` FOREIGN KEY (`SUBJECT_ID`) REFERENCES `cd_subject` (`SUBJECT_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_STUDENT_TEACHER_PAIR_TEACHER_ID` FOREIGN KEY (`TEACHER_ID`) REFERENCES `profile` (`PROFILE_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `student_teacher_pair` */

insert  into `student_teacher_pair`(`STUDENT_ID`,`TEACHER_ID`,`SUBJECT_ID`,`ADDED_DT`,`ADDED_BY`,`UPDT_DT`,`UPDT_BY`,`STUDENT_TEACHER_PAIR_ID`) values (9,14,1,'2009-09-09','NA','2009-09-09','NA',1),(10,14,1,'2009-09-09','NA','2009-09-09','NA',2);

/*Table structure for table `subject` */

DROP TABLE IF EXISTS `subject`;

CREATE TABLE `subject` (
  `SUBJECT_ID` int(11) NOT NULL AUTO_INCREMENT,
  `SUBJECT_NAME` varchar(45) NOT NULL,
  PRIMARY KEY (`SUBJECT_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

/*Data for the table `subject` */

insert  into `subject`(`SUBJECT_ID`,`SUBJECT_NAME`) values (1,'math'),(2,'language '),(3,'science');

/*Table structure for table `teacher` */

DROP TABLE IF EXISTS `teacher`;

CREATE TABLE `teacher` (
  `TEACHER_ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `teacherFirstname` varchar(255) DEFAULT NULL,
  `teacherLastname` varchar(255) DEFAULT NULL,
  `teacherTitle` varchar(255) DEFAULT NULL,
  `teacherEmail` varchar(255) DEFAULT NULL,
  `teacherAddr1` varchar(255) DEFAULT NULL,
  `teacherAddr2` varchar(255) DEFAULT NULL,
  `teacherAddr3` varchar(255) DEFAULT NULL,
  `teacherCity` varchar(255) DEFAULT NULL,
  `teacherState` varchar(255) DEFAULT NULL,
  `teacherZip` varchar(255) DEFAULT NULL,
  `teacherCountry` varchar(255) DEFAULT NULL,
  `teacherAttn` varchar(255) DEFAULT NULL,
  `TEACHER_FIRST_NAME` varchar(255) DEFAULT NULL,
  `TEACHER_LAST_NAME` varchar(255) DEFAULT NULL,
  `TEACHER_TITLE` varchar(255) DEFAULT NULL,
  `TEACHER_EMAIL` varchar(255) DEFAULT NULL,
  `TEACHER_ADDR1` varchar(255) DEFAULT NULL,
  `TEACHER_ADDR2` varchar(255) DEFAULT NULL,
  `TEACHER_ADDR3` varchar(255) DEFAULT NULL,
  `TEACHER_CITY` varchar(255) DEFAULT NULL,
  `TEACHER_STATE` varchar(255) DEFAULT NULL,
  `TEACHER_ZIP` varchar(255) DEFAULT NULL,
  `TEACHER_COUNTRY` varchar(255) DEFAULT NULL,
  `TEACHER_ATTN` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`TEACHER_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `teacher` */

/*Table structure for table `topic` */

DROP TABLE IF EXISTS `topic`;

CREATE TABLE `topic` (
  `TOPIC_ID` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(60) DEFAULT NULL,
  `description` varchar(100) DEFAULT NULL,
  `subject_id` int(11) NOT NULL,
  PRIMARY KEY (`TOPIC_ID`),
  UNIQUE KEY `id` (`TOPIC_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=latin1;

/*Data for the table `topic` */

insert  into `topic`(`TOPIC_ID`,`name`,`description`,`subject_id`) values (1,'Algebra',NULL,1),(2,'Geometry',NULL,1),(3,'Statistics',NULL,1),(4,'Measurement',NULL,1),(5,'Trigonometry',NULL,1),(6,'Grammar',NULL,2),(7,'Reading',NULL,2),(8,'Vocabulary',NULL,2),(9,'Writing',NULL,2),(10,'Poem',NULL,2),(11,'Biology',NULL,3),(12,'Physics',NULL,3),(13,'Chemistry',NULL,3);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
