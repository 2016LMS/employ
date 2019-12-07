/*
 Navicat Premium Data Transfer

 Source Server         : Personal
 Source Server Type    : MySQL
 Source Server Version : 80016
 Source Host           : localhost:3306
 Source Schema         : hwadeepro

 Target Server Type    : MySQL
 Target Server Version : 80016
 File Encoding         : 65001

 Date: 11/09/2019 20:16:24
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for account
-- ----------------------------
DROP TABLE IF EXISTS `account`;
CREATE TABLE `account`  (
  `acc_id` int(11) NOT NULL AUTO_INCREMENT,
  `acc_username` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `acc_pwd` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `acc_role` varchar(10) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  PRIMARY KEY (`acc_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for college
-- ----------------------------
DROP TABLE IF EXISTS `college`;
CREATE TABLE `college`  (
  `coll_id` int(11) NOT NULL AUTO_INCREMENT,
  `gra_id` int(11) NULL DEFAULT NULL,
  `uni_id` int(11) NULL DEFAULT NULL,
  `coll_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `coll_intro` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `coll_img` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  PRIMARY KEY (`coll_id`) USING BTREE,
  INDEX `fk_coll-gra`(`gra_id`) USING BTREE,
  CONSTRAINT `fk_coll-gra` FOREIGN KEY (`gra_id`) REFERENCES `graduate` (`gra_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for company
-- ----------------------------
DROP TABLE IF EXISTS `company`;
CREATE TABLE `company`  (
  `com_id` int(11) NOT NULL AUTO_INCREMENT,
  `com_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `com_leader` varchar(10) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `com_position` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `com_intro` text CHARACTER SET utf8 COLLATE utf8_bin NULL,
  `com_img` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  PRIMARY KEY (`com_id`) USING BTREE,
  CONSTRAINT `fk_com-recruit` FOREIGN KEY (`com_id`) REFERENCES `recruitment` (`com_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for grade
-- ----------------------------
DROP TABLE IF EXISTS `grade`;
CREATE TABLE `grade`  (
  `grade_id` int(11) NOT NULL AUTO_INCREMENT,
  `gra_id` int(11) NULL DEFAULT NULL,
  `grade_first_year` int(11) NULL DEFAULT NULL,
  `grade_second_year` int(11) NULL DEFAULT NULL,
  `grade_third_year` int(11) NULL DEFAULT NULL,
  `grade_fourth_year` int(11) NULL DEFAULT NULL,
  `grade_compre` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`grade_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for graduate
-- ----------------------------
DROP TABLE IF EXISTS `graduate`;
CREATE TABLE `graduate`  (
  `gra_id` int(11) NOT NULL AUTO_INCREMENT,
  `gra_name` varchar(10) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `gra_honor` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `gra_age` int(11) NULL DEFAULT NULL,
  `gra_year` int(11) NULL DEFAULT NULL,
  `gra_birthday` date NULL DEFAULT NULL,
  `grade_id` int(11) NULL DEFAULT NULL,
  `coll_id` int(11) NULL DEFAULT NULL,
  `uni_id` int(11) NULL DEFAULT NULL,
  `gra_img` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `res_id` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`gra_id`) USING BTREE,
  INDEX `res_id`(`res_id`) USING BTREE,
  CONSTRAINT `fk_gra-res` FOREIGN KEY (`res_id`) REFERENCES `resume` (`res_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_gra-grade` FOREIGN KEY (`gra_id`) REFERENCES `grade` (`grade_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for job_fair
-- ----------------------------
DROP TABLE IF EXISTS `job_fair`;
CREATE TABLE `job_fair`  (
  `fair_id` int(11) NOT NULL AUTO_INCREMENT,
  `fair_position` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `fair_contact_person` varchar(10) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `fair_contact_phone` varchar(30) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `fair_tips` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `fair_intro` text CHARACTER SET utf8 COLLATE utf8_bin NULL,
  PRIMARY KEY (`fair_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for policy
-- ----------------------------
DROP TABLE IF EXISTS `policy`;
CREATE TABLE `policy`  (
  `poli_id` int(11) NOT NULL AUTO_INCREMENT,
  `poli_post_time` timestamp(0) NULL DEFAULT NULL,
  `poli_content` text CHARACTER SET utf8 COLLATE utf8_bin NULL,
  PRIMARY KEY (`poli_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for recomend
-- ----------------------------
DROP TABLE IF EXISTS `recomend`;
CREATE TABLE `recomend`  (
  `rec_id` int(11) NOT NULL AUTO_INCREMENT,
  `rec_img` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `rec_title` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `rec_text` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `rec_post_time` date NULL DEFAULT NULL,
  PRIMARY KEY (`rec_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for recruitment
-- ----------------------------
DROP TABLE IF EXISTS `recruitment`;
CREATE TABLE `recruitment`  (
  `recruit_id` int(11) NOT NULL AUTO_INCREMENT,
  `Com_com_id` int(11) NULL DEFAULT NULL,
  `recruit_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `recruit_requires` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `recruit_treat` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `com_id` int(11) NULL DEFAULT NULL,
  `is_recruit_active` tinyint(1) NULL DEFAULT NULL,
  `recruit_postion` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `recruit_content` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  PRIMARY KEY (`recruit_id`) USING BTREE,
  INDEX `com_id`(`com_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for resume
-- ----------------------------
DROP TABLE IF EXISTS `resume`;
CREATE TABLE `resume`  (
  `res_id` int(11) NOT NULL AUTO_INCREMENT,
  `gra_id` int(11) NULL DEFAULT NULL,
  `res_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `res_gra_name` varchar(10) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `res_gender` tinyint(1) NULL DEFAULT NULL,
  `res_honor` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `res_age` int(11) NULL DEFAULT NULL,
  `res_graduate_year` int(11) NULL DEFAULT NULL,
  `res_email` varchar(30) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `res_phone` varchar(30) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  PRIMARY KEY (`res_id`) USING BTREE,
  CONSTRAINT `fk_res-gra` FOREIGN KEY (`res_id`) REFERENCES `graduate` (`res_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for test
-- ----------------------------
DROP TABLE IF EXISTS `test`;
CREATE TABLE `test`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of test
-- ----------------------------
INSERT INTO `test` VALUES (1, '裴逸凡');

-- ----------------------------
-- Table structure for university
-- ----------------------------
DROP TABLE IF EXISTS `university`;
CREATE TABLE `university`  (
  `uni_id` int(11) NOT NULL AUTO_INCREMENT,
  `uni_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `uni_intro` text CHARACTER SET utf8 COLLATE utf8_bin NULL,
  `coll_id` int(11) NULL DEFAULT NULL,
  `gra_id` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`uni_id`) USING BTREE,
  INDEX `fk_uni-coll`(`coll_id`) USING BTREE,
  INDEX `fk_uni_gra`(`gra_id`) USING BTREE,
  CONSTRAINT `fk_uni-coll` FOREIGN KEY (`coll_id`) REFERENCES `college` (`coll_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_uni_gra` FOREIGN KEY (`gra_id`) REFERENCES `graduate` (`gra_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
