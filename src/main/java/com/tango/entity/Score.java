package com.tango.entity;

import java.math.BigDecimal;

/**
 * 学生成绩类
 * @author tango
 *
 */
public class Score {

	private Integer scoreId; //ID
	private String term; //学期
	private char  stuCode;//学号
	private char courseCode; //课程编号
	private Float score;//分数
	
	public Integer getScoreId() {
		return scoreId;
	}
	public void setScoreId(Integer scoreId) {
		this.scoreId = scoreId;
	}
	public String getTerm() {
		return term;
	}
	public void setTerm(String term) {
		this.term = term;
	}
	public char getStuCode() {
		return stuCode;
	}
	public void setStuCode(char stuCode) {
		this.stuCode = stuCode;
	}
	public char getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(char courseCode) {
		this.courseCode = courseCode;
	}
	public Float getScore() {
		return score;
	}
	public void setScore(Float score) {
		this.score = score;
	}
	
}
