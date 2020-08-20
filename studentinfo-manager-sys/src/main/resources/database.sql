create database student_db;

use student_db;

DROP TABLE `tb_student`;
CREATE TABLE `tb_student` (
  `StuId` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `StuCode` char(10) NOT NULL COMMENT '学号',
  `StuName` varchar(20) NOT NULL COMMENT '姓名',
  `Sex` char(1) NOT NULL COMMENT '性别',
  `BirthDate` date NOT NULL COMMENT '出生日期',
  `TellPhone` varchar(11) NOT NULL COMMENT '联系电话',
  `Address` varchar(20) NOT NULL COMMENT '家庭住址',
  `ClassId` char(10) NOT NULL COMMENT '班级ID',
  PRIMARY KEY (`StuId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='学生信息表'

DROP TABLE `tb_class`;
CREATE TABLE `tb_class` (
  `ClassId` int unsigned NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `ClassCode` char(10) NOT NULL COMMENT '班级编号',
  `ClassName` varchar(20) NOT NULL COMMENT '班级名称',
  PRIMARY KEY (`ClassId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='班级信息表'

DROP TABLE `tb_course`;
CREATE TABLE `tb_course` (
  `CourseId` int unsigned NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `CourseCode` char(10) NOT NULL COMMENT '课程编号',
  `CourseName` varchar(20) NOT NULL COMMENT '课程名称',
  PRIMARY KEY (`CourseId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='课程信息表'

DROP TABLE `tb_score`;
CREATE TABLE `tb_score` (
  `ScoreId` int unsigned NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `Term` varchar(20) NOT NULL COMMENT '学期',
  `StuCode` char(10) NOT NULL COMMENT '学号',
  `CourseCode` char(10) NOT NULL COMMENT '课程编号',
  `Score` float(4,1) NOT NULL COMMENT '分数',
  PRIMARY KEY (`ScoreId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='学生成绩表'

DROP TABLE `tb_teacher`;
CREATE TABLE `tb_teacher` (
  `TeacherId` int unsigned NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `TeacherCode` char(10) NOT NULL COMMENT '教师编号',
  `TeacherName` varchar(20) NOT NULL COMMENT '教师姓名',
  `Sex` char(1) NOT NULL COMMENT '性别',
  `BirthDate` date NOT NULL COMMENT '出生日期',
  `TellPhone` varchar(11) NOT NULL COMMENT '联系电话',
  `Address` varchar(20) NOT NULL COMMENT '家庭住址',
  PRIMARY KEY (`TeacherId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='教师信息表'

