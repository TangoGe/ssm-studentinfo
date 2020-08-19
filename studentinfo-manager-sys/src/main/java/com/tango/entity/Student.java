/**
 * 
 */
package com.tango.entity;

/**
 * @author tango 学生类
 */
public class Student {

	private Integer studentId;// id
	private String studentNumber;// 学号
	private String name; // 姓名
	private int age;// 年龄
	private String phone;// 电话
	private String address;// 地址

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentNumber=" + studentNumber + ", name=" + name + ", age="
				+ age + ", phone=" + phone + ", address=" + address + "]";
	}
}
