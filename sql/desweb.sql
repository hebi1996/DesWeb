/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 80017
Source Host           : 127.0.0.1:3306
Source Database       : desweb

Target Server Type    : MYSQL
Target Server Version : 80017
File Encoding         : 65001

Date: 2020-04-29 14:09:33
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admininfo
-- ----------------------------
DROP TABLE IF EXISTS `admininfo`;
CREATE TABLE `admininfo` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `loginName` varchar(64) DEFAULT NULL,
  `loginPwd` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of admininfo
-- ----------------------------
INSERT INTO `admininfo` VALUES ('1', 'admin', '111111');
INSERT INTO `admininfo` VALUES ('2', 'root', '111111');
INSERT INTO `admininfo` VALUES ('3', 'abcd', '111111');

-- ----------------------------
-- Table structure for cart
-- ----------------------------
DROP TABLE IF EXISTS `cart`;
CREATE TABLE `cart` (
  `cartId` int(20) NOT NULL AUTO_INCREMENT,
  `userId` int(20) DEFAULT NULL,
  `mealId` int(20) DEFAULT NULL,
  `count` int(20) DEFAULT NULL,
  PRIMARY KEY (`cartId`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of cart
-- ----------------------------

-- ----------------------------
-- Table structure for cuisine
-- ----------------------------
DROP TABLE IF EXISTS `cuisine`;
CREATE TABLE `cuisine` (
  `seriesId` int(20) NOT NULL AUTO_INCREMENT,
  `seriesName` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`seriesId`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of cuisine
-- ----------------------------
INSERT INTO `cuisine` VALUES ('1', '川菜');
INSERT INTO `cuisine` VALUES ('2', '徽菜');
INSERT INTO `cuisine` VALUES ('3', '粤菜');
INSERT INTO `cuisine` VALUES ('4', '鲁菜');

-- ----------------------------
-- Table structure for foodinfo
-- ----------------------------
DROP TABLE IF EXISTS `foodinfo`;
CREATE TABLE `foodinfo` (
  `mealId` int(20) NOT NULL AUTO_INCREMENT,
  `mealSeriesId` int(20) DEFAULT NULL,
  `mealName` varchar(255) DEFAULT NULL,
  `mealSummarize` varchar(255) DEFAULT NULL,
  `mealDescription` text,
  `mealPrice` double(10,2) DEFAULT NULL,
  `mealImage` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`mealId`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of foodinfo
-- ----------------------------
INSERT INTO `foodinfo` VALUES ('1', '1', '尖椒炒尖椒', '尖椒炒尖椒', '尖椒炒尖椒', '11.22', 'G:\\worker\\eclipse-workspace\\DesWeb\\WebContent\\WEB-INF\\img\\meal\\微信图片_20190822093223.jpg');
INSERT INTO `foodinfo` VALUES ('2', '2', '臭臭鱼', '臭臭鱼1234567890-=', '1234567890-', '100.21', 'G:\\worker\\eclipse-workspace\\DesWeb\\WebContent\\WEB-INF\\img\\meal\\4610b912c8fcc3cef70d70409845d688d53f20f7 - 副本.jpg');
INSERT INTO `foodinfo` VALUES ('3', '1', '蒸蒸日虾', '1234567890-987654321', '1234567890-987654321', '10.32', 'G:\\worker\\eclipse-workspace\\DesWeb\\WebContent\\WEB-INF\\img\\meal\\茄汁大黄鱼.jpg');

-- ----------------------------
-- Table structure for mainorder
-- ----------------------------
DROP TABLE IF EXISTS `mainorder`;
CREATE TABLE `mainorder` (
  `oid` int(20) NOT NULL AUTO_INCREMENT,
  `userId` int(20) DEFAULT NULL,
  `orderTime` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `orderState` int(1) DEFAULT NULL,
  `orderPrice` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`oid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of mainorder
-- ----------------------------
INSERT INTO `mainorder` VALUES ('1', '1', '2020-04-29 12:45:48', '3', '11.22');
INSERT INTO `mainorder` VALUES ('2', '1', '2020-04-29 13:32:27', '2', '110.53');

-- ----------------------------
-- Table structure for sonorder
-- ----------------------------
DROP TABLE IF EXISTS `sonorder`;
CREATE TABLE `sonorder` (
  `odId` int(20) NOT NULL AUTO_INCREMENT,
  `oId` int(20) DEFAULT NULL,
  `mealId` int(20) DEFAULT NULL,
  `mealPrice` double(10,2) DEFAULT NULL,
  `mealCount` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`odId`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of sonorder
-- ----------------------------
INSERT INTO `sonorder` VALUES ('1', '1', '1', '11.22', '1.00');
INSERT INTO `sonorder` VALUES ('2', '2', '2', '100.21', '1.00');
INSERT INTO `sonorder` VALUES ('3', '2', '3', '10.32', '1.00');

-- ----------------------------
-- Table structure for userinfo
-- ----------------------------
DROP TABLE IF EXISTS `userinfo`;
CREATE TABLE `userinfo` (
  `id` int(20) NOT NULL,
  `loginName` varchar(64) DEFAULT NULL,
  `loginPwd` varchar(64) DEFAULT NULL,
  `trueName` varchar(64) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `phone` varchar(64) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `facepath` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of userinfo
-- ----------------------------
INSERT INTO `userinfo` VALUES ('1', 'aaa', '111111', 'aaa', '1@qq.com', '18710109979', 'beijing', '1');
