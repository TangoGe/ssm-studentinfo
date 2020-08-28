create database student_db;

use student_db;

DROP TABLE `da_student`;
CREATE TABLE `da_student` (
  `stu_id` bigint unsigned NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `stu_code` char(10) NOT NULL COMMENT '学号',
  `stu_name` varchar(20) NOT NULL COMMENT '姓名',
  `sex` char(1) NOT NULL COMMENT '性别',
  `birth_date` date NOT NULL COMMENT '出生日期',
  `tellphone` varchar(11) NOT NULL COMMENT '联系电话',
  `address` varchar(20) NOT NULL COMMENT '家庭住址',
  `class_id` char(10) NOT NULL COMMENT '班级ID',
  PRIMARY KEY (`stu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='学生信息表';

DROP TABLE `da_class`;
CREATE TABLE `da_class` (
  `ClassId` bigint unsigned NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `ClassCode` char(10) NOT NULL COMMENT '班级编号',
  `ClassName` varchar(20) NOT NULL COMMENT '班级名称',
  PRIMARY KEY (`ClassId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='班级信息表';

DROP TABLE `da_course`;
CREATE TABLE `da_course` (
  `course_id` bigint unsigned NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `course_code` char(10) NOT NULL COMMENT '课程编号',
  `course_name` varchar(20) NOT NULL COMMENT '课程名称',
  PRIMARY KEY (`course_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='课程信息表';

DROP TABLE `da_score`;
CREATE TABLE `da_score` (
  `score_id` bigint unsigned NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `term` varchar(20) NOT NULL COMMENT '学期',
  `stu_code` char(10) NOT NULL COMMENT '学号',
  `course_code` char(10) NOT NULL COMMENT '课程编号',
  `score` decimal(4,1) NOT NULL COMMENT '分数',
  PRIMARY KEY (`score_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='学生成绩表';

DROP TABLE `da_teacher`;
CREATE TABLE `da_teacher` (
  `teacher_id` bigint unsigned NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `teacher_code` char(10) NOT NULL COMMENT '教师编号',
  `teacher_name` varchar(20) NOT NULL COMMENT '教师姓名',
  `sex` char(1) NOT NULL COMMENT '性别',
  `birth_date` datetime NOT NULL COMMENT '出生日期',
  `tellphone` varchar(11) NOT NULL COMMENT '联系电话',
  `address` varchar(20) NOT NULL COMMENT '家庭住址',
  PRIMARY KEY (`teacher_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='教师信息表';

