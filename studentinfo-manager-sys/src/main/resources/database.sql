create database student_db;

use student_db;

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

