/*
 Navicat Premium Data Transfer

 Source Server         : 127.0.0.1
 Source Server Type    : MySQL
 Source Server Version : 50527
 Source Host           : localhost:3306
 Source Schema         : xmall_h_ui

 Target Server Type    : MySQL
 Target Server Version : 50527
 File Encoding         : 65001

 Date: 20/07/2018 10:34:23
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for sys_menu
-- ----------------------------
DROP TABLE IF EXISTS `sys_menu`;
CREATE TABLE `sys_menu`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `url` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `parentId` bigint(20) DEFAULT NULL,
  `icon` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 38 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sys_menu
-- ----------------------------
INSERT INTO `sys_menu` VALUES (1, '首页', 'javascript:;', 0, '');
INSERT INTO `sys_menu` VALUES (2, '关于我们', 'javascript:;', 0, '');
INSERT INTO `sys_menu` VALUES (3, '产品中心', 'javascript:;', 0, '');
INSERT INTO `sys_menu` VALUES (4, '主要业绩', 'javascript:;', 0, '');
INSERT INTO `sys_menu` VALUES (5, '技术支持', 'javascript:;', 0, '');
INSERT INTO `sys_menu` VALUES (6, '新闻中心', 'javascript:;', 0, '');
INSERT INTO `sys_menu` VALUES (7, '联系我们', 'javascript:;', 0, NULL);
INSERT INTO `sys_menu` VALUES (8, '实用工具', 'javascript:;', 0, NULL);
INSERT INTO `sys_menu` VALUES (9, '权限分配', 'javascript:;', 0, NULL);
INSERT INTO `sys_menu` VALUES (10, '首页公司简介(通用)', 'commonDetail.html?id=5', 1, 'layui-icon-right');
INSERT INTO `sys_menu` VALUES (11, '首页公司产品(通用)', 'commonDetail.html?id=6', 1, 'layui-icon-right');
INSERT INTO `sys_menu` VALUES (12, '首页新闻', 'homeNew', 1, 'layui-icon-right');
INSERT INTO `sys_menu` VALUES (13, '合作伙伴', 'partner', 1, 'layui-icon-user');
INSERT INTO `sys_menu` VALUES (14, '公司LOGO(通用)', 'commonDetail.html?id=8', 1, 'layui-icon-right');
INSERT INTO `sys_menu` VALUES (15, '底部页脚((通用)', 'commonDetail.html?id=9', 1, 'layui-icon-right');
INSERT INTO `sys_menu` VALUES (16, '关于我们', 'showAboutDetail.html?id=4', 2, 'layui-icon-about');
INSERT INTO `sys_menu` VALUES (17, '公司介绍', 'showAboutDetail.html?id=1', 2, 'layui-icon-right');
INSERT INTO `sys_menu` VALUES (18, '企业文化', 'showAboutDetail.html?id=2', 2, 'layui-icon-right');
INSERT INTO `sys_menu` VALUES (19, '企业管理及其研发实力', 'showAboutDetail.html?id=3', 2, 'layui-icon-right');
INSERT INTO `sys_menu` VALUES (20, '产品图片(通用)', 'commonDetail.html?id=7', 1, 'layui-icon-right');
INSERT INTO `sys_menu` VALUES (21, '产品列表', 'showProduct.html', 3, 'layui-icon-right');
INSERT INTO `sys_menu` VALUES (22, '添加产品', 'addProduct.html', 3, 'layui-icon-right');
INSERT INTO `sys_menu` VALUES (23, '产品介绍(通用)', 'commonDetail.html?id=1', 3, 'layui-icon-right');
INSERT INTO `sys_menu` VALUES (24, '业绩列表', 'yejiTitle.html', 4, 'layui-icon-right');
INSERT INTO `sys_menu` VALUES (25, '专利证书(通用)', 'commonDetail.html?id=2', 4, 'layui-icon-right');
INSERT INTO `sys_menu` VALUES (26, '业绩标题', 'yejiTitle.html', 4, 'layui-icon-right');
INSERT INTO `sys_menu` VALUES (27, '业绩内容', 'yejiDetail.html', 4, 'layui-icon-right');
INSERT INTO `sys_menu` VALUES (28, '技术支持(通用)', 'commonDetail.html?id=3', 5, 'layui-icon-right');
INSERT INTO `sys_menu` VALUES (29, '技术文档(通用)', 'commonDetail.html?id=4', 5, 'layui-icon-right');
INSERT INTO `sys_menu` VALUES (30, '相关下载', 'download.html', 5, 'layui-icon-right');
INSERT INTO `sys_menu` VALUES (31, '新闻列表', 'newsCenter.html', 6, 'layui-icon-right');
INSERT INTO `sys_menu` VALUES (32, '最新招聘', 'recuit.html', 6, 'layui-icon-right');
INSERT INTO `sys_menu` VALUES (33, '联系我们', 'contact.html', 7, 'layui-icon-right');
INSERT INTO `sys_menu` VALUES (34, '上传一切', 'uploadPic.html', 8, 'layui-icon-right');
INSERT INTO `sys_menu` VALUES (35, '首页轮播图', 'stuffPic', 1, 'layui-icon-right');
INSERT INTO `sys_menu` VALUES (36, '角色列表', 'findAllRoles.html', 9, 'layui-icon-right');
INSERT INTO `sys_menu` VALUES (37, '权限列表', 'permiss', 9, 'layui-icon-right');

-- ----------------------------
-- Table structure for sys_permissions
-- ----------------------------
DROP TABLE IF EXISTS `sys_permissions`;
CREATE TABLE `sys_permissions`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `permission` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `description` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `available` tinyint(1) DEFAULT 0,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `idx_sys_permissions_permission`(`permission`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sys_permissions
-- ----------------------------
INSERT INTO `sys_permissions` VALUES (1, 'user:*', '用户所有', 0);
INSERT INTO `sys_permissions` VALUES (2, 'menu:*', '列表所有', 0);
INSERT INTO `sys_permissions` VALUES (3, 'test:*', '测试所有', 0);

-- ----------------------------
-- Table structure for sys_roles
-- ----------------------------
DROP TABLE IF EXISTS `sys_roles`;
CREATE TABLE `sys_roles`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `role` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `description` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `available` tinyint(1) DEFAULT 0,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `idx_sys_roles_role`(`role`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sys_roles
-- ----------------------------
INSERT INTO `sys_roles` VALUES (1, 'admin', '上帝版的存在', 0);
INSERT INTO `sys_roles` VALUES (2, 'pAdmin', '普通管理员', 0);

-- ----------------------------
-- Table structure for sys_roles_permissions
-- ----------------------------
DROP TABLE IF EXISTS `sys_roles_permissions`;
CREATE TABLE `sys_roles_permissions`  (
  `role_id` bigint(20) NOT NULL DEFAULT 0,
  `permission_id` bigint(20) NOT NULL DEFAULT 0,
  PRIMARY KEY (`role_id`, `permission_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sys_roles_permissions
-- ----------------------------
INSERT INTO `sys_roles_permissions` VALUES (1, 1);
INSERT INTO `sys_roles_permissions` VALUES (1, 2);
INSERT INTO `sys_roles_permissions` VALUES (1, 3);
INSERT INTO `sys_roles_permissions` VALUES (2, 2);
INSERT INTO `sys_roles_permissions` VALUES (2, 3);

-- ----------------------------
-- Table structure for sys_users
-- ----------------------------
DROP TABLE IF EXISTS `sys_users`;
CREATE TABLE `sys_users`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `salt` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `locked` tinyint(1) DEFAULT 0,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `idx_sys_users_username`(`username`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sys_users
-- ----------------------------
INSERT INTO `sys_users` VALUES (1, 'admin', '88212f91e2e9cf36981a91b6c518af5c', 'admin', 0);
INSERT INTO `sys_users` VALUES (2, 'yang', '88212f91e2e9cf36981a91b6c518af5c', 'admin', 0);
INSERT INTO `sys_users` VALUES (3, 'test', '566674082dacada7311dd0b58a46c6d3', 'salt', 0);

-- ----------------------------
-- Table structure for sys_users_roles
-- ----------------------------
DROP TABLE IF EXISTS `sys_users_roles`;
CREATE TABLE `sys_users_roles`  (
  `user_id` bigint(20) NOT NULL DEFAULT 0,
  `role_id` bigint(20) NOT NULL DEFAULT 0,
  PRIMARY KEY (`user_id`, `role_id`) USING BTREE,
  INDEX `role_id`(`role_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sys_users_roles
-- ----------------------------
INSERT INTO `sys_users_roles` VALUES (1, 1);
INSERT INTO `sys_users_roles` VALUES (1, 2);

SET FOREIGN_KEY_CHECKS = 1;
