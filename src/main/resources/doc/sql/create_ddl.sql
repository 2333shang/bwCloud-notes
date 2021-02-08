-- 创建目录表
CREATE TABLE `notes_menu`  (
  `id` int(0) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `menu_no` varchar(16) NOT NULL COMMENT '流水号',
  `menu_privilege` int(0) COMMENT '目录优先级',
  `menu_name` varchar(32) COMMENT '菜单名称',
  `user_id` int(12) COMMENT '用户编号',
  `parent_menu_no` varchar(16) COMMENT '所属父节点编号',
  `created_date` timestamp NULL default CURRENT_TIMESTAMP COMMENT '创建时间',
  `created_by` varchar(16) COMMENT '创建人',
  `modified_date` datetime(0) NULL default CURRENT_TIMESTAMP COMMENT '更新时间',
  `modified_by` varchar(16) COMMENT '更新人',
  PRIMARY KEY (`id`, `menu_no`),
  UNIQUE INDEX `uniq_menu_no`(`menu_no`),
  UNIQUE INDEX `uniq_pri_name_userid`(`menu_privilege`, `menu_name`, `user_id`)
);

-- 创建内容表
CREATE TABLE `notes_content`  (
  `id` int(0) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `content_no` varchar(16) NOT NULL COMMENT '流水号',
  `menu_no` varchar(16) NOT NULL COMMENT '目录流水号',
  `content` text COMMENT '内容实体',
  `author_id` int(0) COMMENT '作者',
	`created_date` timestamp NULL default CURRENT_TIMESTAMP COMMENT '创建时间',
  `created_by` varchar(16) COMMENT '创建人',
  `modified_date` datetime(0) NULL default CURRENT_TIMESTAMP COMMENT '更新时间',
  `modified_by` varchar(16) COMMENT '更新人',
  PRIMARY KEY (`id`, `content_no`, `menu_no`),
  UNIQUE INDEX `uniq_content_no`(`content_no`),
  UNIQUE INDEX `uniq_menu_cont`(`menu_no`, `author_id`)
);