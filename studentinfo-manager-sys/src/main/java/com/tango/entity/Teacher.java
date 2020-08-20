package com.tango.entity;

import java.util.Date;

/**
 * 教师类
 * @author tango
 *
 */
public class Teacher {
	private Integer teacherId;// ID
	private String TeacherCode;// 学号
	private String TeacherName; // 姓名
	private char sex;// 性别
	private Date birthDate;// 出生日期
	private String tellPhone;// 电话
	private String address;// 家庭住址
	public Integer getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(Integer teacherId) {
		this.teacherId = teacherId;
	}
	public String getTeacherCode() {
		return TeacherCode;
	}
	public void setTeacherCode(String teacherCode) {
		TeacherCode = teacherCode;
	}
	public String getTeacherName() {
		return TeacherName;
	}
	public void setTeacherName(String teacherName) {
		TeacherName = teacherName;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public String getTellPhone() {
		return tellPhone;
	}
	public void setTellPhone(String tellPhone) {
		this.tellPhone = tellPhone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
