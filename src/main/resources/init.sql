-- 数据库初始化脚本

-- 创建用户表
CREATE TABLE cat_user (
  `user_Id`     BIGINT NOT NULL AUTO_INCREMENT COMMENT '用户Id',
  `code`        VARCHAR(64) COMMENT '编号',
  `name`        VARCHAR(64) COMMENT '用户名',
  `phone`       VARCHAR(16) COMMENT '手机号',
  `passwd`      VARCHAR(128) COMMENT '密码',
  `gender`      SMALLINT COMMENT '性别',
  `email`       VARCHAR(64) COMMENT '邮箱',
  `create_Time` TIMESTAMP DEFAULT current_timestamp COMMENT '创建时间',
  PRIMARY KEY (user_Id)
)ENGINE = InnoDB DEFAULT CHAR SET = utf8 COMMENT = '用户表';
