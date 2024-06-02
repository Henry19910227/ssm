CREATE TABLE IF NOT EXISTS users (
     `id` int unsigned NOT NULL AUTO_INCREMENT COMMENT '用戶id',
     `email` varchar(255) NOT NULL DEFAULT '' COMMENT '信箱',
     `nickname` varchar(20) NOT NULL DEFAULT '' COMMENT '暱稱',
     `create_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '創建日期',
     `update_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '修改日期',
     PRIMARY KEY (`id`),
     KEY `index_nickname` (`nickname`),
     KEY `index_email` (`email`)
) ENGINE=InnoDB CHARSET=utf8mb4 AUTO_INCREMENT = 1;