/*
Navicat MySQL Data Transfer

Source Server         : company
Source Server Version : 50722
Source Host           : localhost:3306
Source Database       : employ

Target Server Type    : MYSQL
Target Server Version : 50722
File Encoding         : 65001

Date: 2019-12-14 13:09:12
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for apply
-- ----------------------------
DROP TABLE IF EXISTS `apply`;
CREATE TABLE `apply` (
  `apply_id` int(11) NOT NULL AUTO_INCREMENT,
  `recruit_id` int(11) DEFAULT NULL,
  `graduate_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`apply_id`),
  KEY `fk_apply_recruit` (`recruit_id`),
  KEY `fk_apply_gra` (`graduate_id`),
  CONSTRAINT `fk_apply_gra` FOREIGN KEY (`graduate_id`) REFERENCES `graduate` (`gra_id`),
  CONSTRAINT `fk_apply_recruit` FOREIGN KEY (`recruit_id`) REFERENCES `recruitment` (`recruit_id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for apply-graduate
-- ----------------------------
DROP TABLE IF EXISTS `apply-graduate`;
CREATE TABLE `apply-graduate` (
  `apply_id` int(11) DEFAULT NULL,
  `gra_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for college
-- ----------------------------
DROP TABLE IF EXISTS `college`;
CREATE TABLE `college` (
  `coll_id` int(11) NOT NULL AUTO_INCREMENT,
  `gra_id` int(11) DEFAULT NULL,
  `uni_id` int(11) DEFAULT NULL,
  `coll_name` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `coll_intro` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `coll_img` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`coll_id`) USING BTREE,
  KEY `fk_coll-gra` (`gra_id`) USING BTREE,
  CONSTRAINT `fk_coll-gra` FOREIGN KEY (`gra_id`) REFERENCES `graduate` (`gra_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Table structure for company
-- ----------------------------
DROP TABLE IF EXISTS `company`;
CREATE TABLE `company` (
  `com_id` int(11) NOT NULL AUTO_INCREMENT,
  `com_name` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `com_leader` varchar(10) COLLATE utf8_bin DEFAULT NULL,
  `com_position` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `com_intro` text COLLATE utf8_bin,
  `com_img` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `username` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `password` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `role` varchar(64) COLLATE utf8_bin DEFAULT 'company',
  PRIMARY KEY (`com_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Table structure for grade
-- ----------------------------
DROP TABLE IF EXISTS `grade`;
CREATE TABLE `grade` (
  `grade_id` int(11) NOT NULL AUTO_INCREMENT,
  `gra_id` int(11) DEFAULT NULL,
  `grade_first_year` int(11) DEFAULT NULL,
  `grade_second_year` int(11) DEFAULT NULL,
  `grade_third_year` int(11) DEFAULT NULL,
  `grade_fourth_year` int(11) DEFAULT NULL,
  `grade_compre` int(11) DEFAULT NULL,
  PRIMARY KEY (`grade_id`) USING BTREE,
  KEY `fk_gradeGraduate` (`gra_id`),
  CONSTRAINT `fk_gradeGraduate` FOREIGN KEY (`gra_id`) REFERENCES `graduate` (`gra_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Table structure for graduate
-- ----------------------------
DROP TABLE IF EXISTS `graduate`;
CREATE TABLE `graduate` (
  `gra_id` int(11) NOT NULL AUTO_INCREMENT,
  `gra_name` varchar(10) COLLATE utf8_bin DEFAULT NULL,
  `gra_honor` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `gra_age` int(11) DEFAULT NULL,
  `gra_year` int(11) DEFAULT NULL,
  `gra_birthday` date DEFAULT NULL,
  `grade_id` int(11) DEFAULT NULL,
  `coll_id` int(11) DEFAULT NULL,
  `uni_id` int(11) DEFAULT NULL,
  `gra_img` varchar(40) COLLATE utf8_bin DEFAULT NULL,
  `res_id` int(11) DEFAULT NULL,
  `gra_major` varchar(15) COLLATE utf8_bin DEFAULT NULL,
  `username` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `password` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `role` varchar(64) COLLATE utf8_bin DEFAULT 'graduate',
  `gra_gender` varchar(10) COLLATE utf8_bin DEFAULT NULL,
  `gra_email` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`gra_id`) USING BTREE,
  KEY `res_id` (`res_id`) USING BTREE,
  KEY `fk_gradu_uni` (`uni_id`),
  CONSTRAINT `fk_gradu_uni` FOREIGN KEY (`uni_id`) REFERENCES `university` (`uni_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Table structure for job_fair
-- ----------------------------
DROP TABLE IF EXISTS `job_fair`;
CREATE TABLE `job_fair` (
  `fair_id` int(11) NOT NULL AUTO_INCREMENT,
  `fair_position` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `fair_contact_person` varchar(10) COLLATE utf8_bin DEFAULT NULL,
  `fair_contact_phone` varchar(30) COLLATE utf8_bin DEFAULT NULL,
  `fair_tips` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `fair_intro` text COLLATE utf8_bin,
  PRIMARY KEY (`fair_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Table structure for policy
-- ----------------------------
DROP TABLE IF EXISTS `policy`;
CREATE TABLE `policy` (
  `poli_id` int(11) NOT NULL AUTO_INCREMENT,
  `poli_post_time` timestamp NULL DEFAULT NULL,
  `poli_content` text COLLATE utf8_bin,
  `author` varchar(30) COLLATE utf8_bin DEFAULT NULL,
  `title` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`poli_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Table structure for recommend
-- ----------------------------
DROP TABLE IF EXISTS `recommend`;
CREATE TABLE `recommend` (
  `rec_id` int(11) NOT NULL AUTO_INCREMENT,
  `rec_img` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `rec_title` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `rec_text` longtext COLLATE utf8_bin,
  `rec_post_time` date DEFAULT NULL,
  `author` varchar(15) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`rec_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Table structure for recruitment
-- ----------------------------
DROP TABLE IF EXISTS `recruitment`;
CREATE TABLE `recruitment` (
  `recruit_id` int(11) NOT NULL AUTO_INCREMENT,
  `recruit_name` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `recruit_requires` varchar(200) COLLATE utf8_bin DEFAULT NULL,
  `recruit_treat` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `com_id` int(11) DEFAULT NULL,
  `is_recruit_active` tinyint(1) DEFAULT NULL,
  `recruit_position` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `recruit_content` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `apply_count` int(10) DEFAULT '0',
  PRIMARY KEY (`recruit_id`) USING BTREE,
  KEY `com_id` (`com_id`) USING BTREE,
  CONSTRAINT `fk_recruit_com` FOREIGN KEY (`com_id`) REFERENCES `company` (`com_id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Table structure for resume
-- ----------------------------
DROP TABLE IF EXISTS `resume`;
CREATE TABLE `resume` (
  `res_id` int(11) NOT NULL AUTO_INCREMENT,
  `gra_id` int(11) DEFAULT NULL,
  `res_name` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `res_gra_name` varchar(10) COLLATE utf8_bin DEFAULT NULL,
  `res_gender` tinyint(1) DEFAULT NULL,
  `res_honor` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `res_age` int(11) DEFAULT NULL,
  `res_graduate_year` int(11) DEFAULT NULL,
  `res_email` varchar(30) COLLATE utf8_bin DEFAULT NULL,
  `res_phone` varchar(30) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`res_id`) USING BTREE,
  CONSTRAINT `fk_res_gradu` FOREIGN KEY (`res_id`) REFERENCES `graduate` (`res_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Table structure for root
-- ----------------------------
DROP TABLE IF EXISTS `root`;
CREATE TABLE `root` (
  `root_username` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `password` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `role` varchar(64) COLLATE utf8_unicode_ci DEFAULT 'root',
  PRIMARY KEY (`root_username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for test
-- ----------------------------
DROP TABLE IF EXISTS `test`;
CREATE TABLE `test` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Table structure for university
-- ----------------------------
DROP TABLE IF EXISTS `university`;
CREATE TABLE `university` (
  `uni_id` int(11) NOT NULL AUTO_INCREMENT,
  `uni_name` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `uni_intro` text COLLATE utf8_bin,
  `coll_id` int(11) DEFAULT NULL,
  `gra_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`uni_id`) USING BTREE,
  KEY `fk_uni-coll` (`coll_id`) USING BTREE,
  KEY `fk_uni_gra` (`gra_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=DYNAMIC;
