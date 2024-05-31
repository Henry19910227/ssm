CREATE TABLE `courses` (
       `id` int unsigned NOT NULL AUTO_INCREMENT COMMENT '課表 id',
       `user_id` int unsigned DEFAULT NULL COMMENT '用戶 id',
       `name` varchar(20) NOT NULL DEFAULT '' COMMENT '課表名稱',
       `intro` varchar(400) NOT NULL DEFAULT '' COMMENT '課表介紹',
       `create_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '創建時間',
       `update_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '修改日期',
       PRIMARY KEY (`id`),
       KEY `fk_courses_user_id_to_users_id` (`user_id`),
       CONSTRAINT `fk_courses_user_id_to_users_id` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`) ON DELETE SET NULL
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci