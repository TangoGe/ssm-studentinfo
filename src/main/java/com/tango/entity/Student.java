/**
 * 
 */
package com.tango.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * 学生类
 * 
 * @author tango
 */
public class Student {

	private Long stuId;// ID
	private String stuCode;// 学号
	private String stuName; // 姓名
	private char sex;// 性别
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date birthDate;// 出生日期
	private String tellphone;// 电话
	private String address;// 家庭住址
	private char classId; // 班级ID

	public Long getStuId() {
		return stuId;
	}

	public void setStuId(Long stuId) {
		this.stuId = stuId;
	}

	public String getStuCode() {
		return stuCode;
	}

	public void setStuCode(String stuCode) {
		this.stuCode = stuCode;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
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

	public String getTellphone() {
		return tellphone;
	}

	public void setTellphone(String tellphone) {
		this.tellphone = tellphone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public char getClassId() {
		return classId;
	}

	public void setClassId(char classId) {
		this.classId = classId;
	}

}
