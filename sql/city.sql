/*
 Navicat Premium Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 50562
 Source Host           : localhost:3306
 Source Schema         : ztree

 Target Server Type    : MySQL
 Target Server Version : 50562
 File Encoding         : 65001

 Date: 04/07/2019 14:49:35
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for city
-- ----------------------------
DROP TABLE IF EXISTS `city`;
CREATE TABLE `city`  (
  `id` int(11) NOT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `pid` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of city
-- ----------------------------
INSERT INTO `city` VALUES (1, '中国', 0);
INSERT INTO `city` VALUES (2, '江苏', 1);
INSERT INTO `city` VALUES (3, '安徽', 1);
INSERT INTO `city` VALUES (4, '湖南', 1);
INSERT INTO `city` VALUES (5, '长沙', 4);
INSERT INTO `city` VALUES (6, '南京', 2);
INSERT INTO `city` VALUES (7, '合肥', 3);
INSERT INTO `city` VALUES (8, '无锡', 2);
INSERT INTO `city` VALUES (9, '长丰', 7);
INSERT INTO `city` VALUES (10, '包河', 7);

SET FOREIGN_KEY_CHECKS = 1;
