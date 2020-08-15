create database student_info;

use student_info;

CREATE TABLE IF NOT EXISTS `tb_student`(
   `studentId` INT UNSIGNED AUTO_INCREMENT,
   `studentNumber` VARCHAR(20) NOT NULL,
   `name` VARCHAR(20) NOT NULL,
   `age` int NOT NULL,
   `phone` VARCHAR(20) NOT NULL,
   `address` VARCHAR(20) NOT NULL,
   PRIMARY KEY ( `studentId` )
)ENGINE=InnoDB DEFAULT CHARSET=utf8;