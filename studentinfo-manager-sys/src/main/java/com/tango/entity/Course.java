package com.tango.entity;

/**
 * 课程类
 * 
 * @author tango
 *
 */
public class Course {
	private Integer courseId; // ID
	private char courseCode; // 课程编号
	private String courseName; // 课程名称

	public Integer getCourseId() {
		return courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	public char getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(char courseCode) {
		this.courseCode = courseCode;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

}
