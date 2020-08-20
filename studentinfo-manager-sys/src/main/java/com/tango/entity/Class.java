package com.tango.entity;

/**
 * 班级类
 * 
 * @author tango
 *
 */
public class Class {
	private Integer classId; // ID
	private char classCode; // 班级编号
	private String className;// 班级名称
	private Integer num;// 人数

	public Integer getClassId() {
		return classId;
	}

	public void setClassId(Integer classId) {
		this.classId = classId;
	}

	public char getClassCode() {
		return classCode;
	}

	public void setClassCode(char classCode) {
		this.classCode = classCode;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

}
