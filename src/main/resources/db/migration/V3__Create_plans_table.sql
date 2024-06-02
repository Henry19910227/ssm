CREATE TABLE IF NOT EXISTS plans (
    `id` INT(11) UNSIGNED PRIMARY KEY AUTO_INCREMENT COMMENT '計畫id',
    `course_id` INT(11) UNSIGNED COMMENT '課表id',
    `name` VARCHAR(20) NOT NULL DEFAULT '' COMMENT '計畫名稱',
    `create_at` DATETIME NOT NULL DEFAULT NOW() COMMENT '創建時間',
    `update_at` DATETIME NOT NULL DEFAULT NOW() COMMENT '更新時間',
    CONSTRAINT fk_plans_course_id_to_courses_id FOREIGN KEY (course_id) REFERENCES courses(id) ON DELETE CASCADE
) ENGINE=InnoDB CHARSET=utf8mb4 AUTO_INCREMENT = 1;