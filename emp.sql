/*
 Navicat MySQL Data Transfer

 Source Server         : wyt
 Source Server Type    : MySQL
 Source Server Version : 50725
 Source Host           : localhost:3306
 Source Schema         : admin

 Target Server Type    : MySQL
 Target Server Version : 50725
 File Encoding         : 65001

 Date: 05/02/2023 20:19:59
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for emp
-- ----------------------------
DROP TABLE IF EXISTS `emp`;
CREATE TABLE `emp`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `emp_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '员工姓名',
  `sex` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '性别',
  `age` int(11) NOT NULL COMMENT '年龄',
  `dept_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '部门名称',
  `emp_degree_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '学历',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 74 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of emp
-- ----------------------------
INSERT INTO `emp` VALUES (3, '张三', '男', 27, '后勤部', '大专');
INSERT INTO `emp` VALUES (4, '张四', '女', 28, '人事部', '大专');
INSERT INTO `emp` VALUES (5, '张五', '男', 29, '后勤部', '大专');
INSERT INTO `emp` VALUES (6, '张六', '女', 29, '后勤部', '本科');
INSERT INTO `emp` VALUES (7, '张七', '男', 33, '业务部', '研究生');
INSERT INTO `emp` VALUES (8, '张八', '男', 32, '业务部', '本科');
INSERT INTO `emp` VALUES (9, '张九', '女', 33, '业务部', '大专');
INSERT INTO `emp` VALUES (10, '李一', '女', 45, '业务部', '研究生');
INSERT INTO `emp` VALUES (11, '李二', '女', 19, '人事部', '本科');
INSERT INTO `emp` VALUES (12, '李三', '男', 28, '业务部', '研究生');
INSERT INTO `emp` VALUES (13, '李四', '女', 46, '后勤部', '研究生');
INSERT INTO `emp` VALUES (14, '李五', '男', 58, '业务部', '大专');
INSERT INTO `emp` VALUES (15, '李六', '女', 22, '人事部', '研究生');
INSERT INTO `emp` VALUES (16, '李七', '男', 26, '后勤部', '大专');
INSERT INTO `emp` VALUES (17, '李八', '男', 25, '人事部', '研究生');
INSERT INTO `emp` VALUES (18, '李九', '女', 29, '后勤部', '研究生');
INSERT INTO `emp` VALUES (19, '王一', '男', 45, '后勤部', '本科');
INSERT INTO `emp` VALUES (20, '王二', '女', 21, '业务部', '本科');
INSERT INTO `emp` VALUES (21, '王三', '男', 21, '业务部', '大专');
INSERT INTO `emp` VALUES (22, '王四', '男', 23, '业务部', '大专');
INSERT INTO `emp` VALUES (23, '王五', '女', 33, '业务部', '大专');
INSERT INTO `emp` VALUES (24, '王六', '男', 45, '人事部', '本科');
INSERT INTO `emp` VALUES (25, '王七', '男', 35, '业务部', '研究生');
INSERT INTO `emp` VALUES (26, '王八', '男', 41, '后勤部', '本科');
INSERT INTO `emp` VALUES (27, '王九', '女', 25, '业务部', '大专');
INSERT INTO `emp` VALUES (28, '赵一', '男', 26, '人事部', '研究生');
INSERT INTO `emp` VALUES (29, '赵二', '男', 20, '后勤部', '本科');
INSERT INTO `emp` VALUES (30, '赵三', '女', 21, '人事部', '研究生');
INSERT INTO `emp` VALUES (31, '赵四', '男', 19, '后勤部', '研究生');
INSERT INTO `emp` VALUES (32, '赵五', '女', 35, '后勤部', '大专');
INSERT INTO `emp` VALUES (33, '赵六', '男', 24, '业务部', '研究生');
INSERT INTO `emp` VALUES (34, '赵七', '男', 29, '业务部', '大专');
INSERT INTO `emp` VALUES (35, '赵八', '女', 33, '业务部', '研究生');
INSERT INTO `emp` VALUES (36, '赵九', '男', 45, '业务部', '本科');
INSERT INTO `emp` VALUES (37, '张一', '男', 25, '业务部', '本科');
INSERT INTO `emp` VALUES (38, '张二', '女', 26, '人事部', '本科');
INSERT INTO `emp` VALUES (39, '张三', '男', 27, '后勤部', '大专');
INSERT INTO `emp` VALUES (40, '张四', '女', 28, '人事部', '大专');
INSERT INTO `emp` VALUES (41, '张五', '男', 29, '后勤部', '大专');
INSERT INTO `emp` VALUES (42, '张六', '女', 29, '后勤部', '本科');
INSERT INTO `emp` VALUES (43, '张七', '男', 33, '业务部', '研究生');
INSERT INTO `emp` VALUES (44, '张八', '男', 32, '业务部', '本科');
INSERT INTO `emp` VALUES (45, '张九', '女', 33, '业务部', '大专');
INSERT INTO `emp` VALUES (46, '李一', '女', 45, '业务部', '研究生');
INSERT INTO `emp` VALUES (47, '李二', '女', 19, '人事部', '本科');
INSERT INTO `emp` VALUES (48, '李三', '男', 28, '业务部', '研究生');
INSERT INTO `emp` VALUES (49, '李四', '女', 46, '后勤部', '研究生');
INSERT INTO `emp` VALUES (50, '李五', '男', 58, '业务部', '大专');
INSERT INTO `emp` VALUES (51, '李六', '女', 22, '人事部', '研究生');
INSERT INTO `emp` VALUES (52, '李七', '男', 26, '后勤部', '大专');
INSERT INTO `emp` VALUES (53, '李八', '男', 25, '人事部', '研究生');
INSERT INTO `emp` VALUES (54, '李九', '女', 29, '后勤部', '研究生');
INSERT INTO `emp` VALUES (55, '王一', '男', 45, '后勤部', '本科');
INSERT INTO `emp` VALUES (56, '王二', '女', 21, '业务部', '本科');
INSERT INTO `emp` VALUES (57, '王三', '男', 21, '业务部', '大专');
INSERT INTO `emp` VALUES (58, '王四', '男', 23, '业务部', '大专');
INSERT INTO `emp` VALUES (59, '王五', '女', 33, '业务部', '大专');
INSERT INTO `emp` VALUES (60, '王六', '男', 45, '人事部', '本科');
INSERT INTO `emp` VALUES (61, '王七', '男', 35, '业务部', '研究生');
INSERT INTO `emp` VALUES (62, '王八', '男', 41, '后勤部', '本科');
INSERT INTO `emp` VALUES (63, '王九', '女', 25, '业务部', '大专');
INSERT INTO `emp` VALUES (64, '赵一', '男', 26, '人事部', '研究生');
INSERT INTO `emp` VALUES (65, '赵二', '男', 20, '后勤部', '本科');
INSERT INTO `emp` VALUES (66, '赵三', '女', 21, '人事部', '研究生');
INSERT INTO `emp` VALUES (67, '赵四', '男', 19, '后勤部', '研究生');
INSERT INTO `emp` VALUES (68, '赵五', '女', 35, '后勤部', '大专');
INSERT INTO `emp` VALUES (69, '赵六', '男', 24, '业务部', '研究生');
INSERT INTO `emp` VALUES (70, '赵七', '男', 29, '业务部', '大专');
INSERT INTO `emp` VALUES (71, '赵八', '女', 33, '业务部', '研究生');
INSERT INTO `emp` VALUES (72, '赵九', '男', 45, '业务部', '本科');
INSERT INTO `emp` VALUES (73, '11', '女', 11, '业务部', '大专');

SET FOREIGN_KEY_CHECKS = 1;
