/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 50641
 Source Host           : localhost:3306
 Source Schema         : springboot_demo

 Target Server Type    : MySQL
 Target Server Version : 50641
 File Encoding         : 65001

 Date: 10/10/2018 19:15:44
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for hibernate_sequence
-- ----------------------------
DROP TABLE IF EXISTS `hibernate_sequence`;
CREATE TABLE `hibernate_sequence`  (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE = MyISAM CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Fixed;

-- ----------------------------
-- Records of hibernate_sequence
-- ----------------------------
INSERT INTO `hibernate_sequence` VALUES (19);

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(11) NOT NULL,
  `birthdate` bigint(20) DEFAULT NULL,
  `gender` int(11) DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = MyISAM CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 784656000, 0, '888888', 'WayLeung');
INSERT INTO `user` VALUES (2, 784656000, 1, '123', 'Way');
INSERT INTO `user` VALUES (3, 784656000, 1, '123', 'Way');
INSERT INTO `user` VALUES (7, 784656000, 1, '123', 'Way');
INSERT INTO `user` VALUES (5, 772560000, 0, '123', 'Domo');
INSERT INTO `user` VALUES (6, 772560000, 0, '123', 'Domo');
INSERT INTO `user` VALUES (8, 784656000, 1, '123', 'Way');
INSERT INTO `user` VALUES (9, 772560000, 0, '888', 'WayDomo');
INSERT INTO `user` VALUES (10, 784656000, 1, '123', 'Way');
INSERT INTO `user` VALUES (11, 784656000, 1, '123', 'Way');
INSERT INTO `user` VALUES (12, 784656000, 1, '123', 'Way');
INSERT INTO `user` VALUES (13, 784656000, 1, '123', 'Way');
INSERT INTO `user` VALUES (14, 784656000, 1, '123', 'Way');
INSERT INTO `user` VALUES (15, 784656000, 1, '123', 'Way');
INSERT INTO `user` VALUES (16, 784656000, 1, '123', 'Way');
INSERT INTO `user` VALUES (17, 784656000, 1, '123', 'Way');

SET FOREIGN_KEY_CHECKS = 1;
