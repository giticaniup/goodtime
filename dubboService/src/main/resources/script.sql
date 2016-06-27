/*日志表脚本*/
CREATE TABLE `user_diary` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '日志Id',
  `user_id` int(11) NOT NULL,
  `title` varchar(255) NOT NULL,
  `content` text NOT NULL,
  `create_time` datetime DEFAULT NULL,
  `modify_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

