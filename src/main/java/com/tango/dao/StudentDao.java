package com.tango.dao;

import java.util.List;

import com.tango.entity.Student;

public interface StudentDao {

	void insert(Student student);

	Student selectById(Integer stuId);
	
	List<Student> selectList();

	void deleteById(Integer stuId);

	void updateById(Student student);
}
