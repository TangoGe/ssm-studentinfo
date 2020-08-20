/**
 * 
 */
package com.tango.entity;

import java.util.Date;

/**
 * 学生类
 * @author tango 
 */
public class Student {

	private Integer stuId;// ID
	private String stuCode;// 学号
	private String stuName; // 姓名
	private char sex;// 性别
	private Date birthDate;// 出生日期
	private String tellPhone;// 电话
	private String address;// 家庭住址
	private char classId; // 班级ID

	public Integer getStuId() {
		return stuId;
	}

	public void setStuId(Integer stuId) {
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

	public char getClassId() {
		return classId;
	}

	public void setClassId(char classId) {
		this.classId = classId;
	}

	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuCode=" + stuCode + ", stuName=" + stuName + ", sex=" + sex
				+ ", birthDate=" + birthDate + ", tellPhone=" + tellPhone + ", address=" + address + ", classId="
				+ classId + "]";
	}

}
