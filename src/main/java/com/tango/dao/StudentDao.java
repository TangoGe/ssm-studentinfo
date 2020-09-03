package com.tango.dao;

import java.util.List;

import com.tango.entity.Student;

public interface StudentDao {

	Student selectById(Long stuId);

	List<Student> selectAll();

	void insert(Student student);

	void deleteById(Long stuId);

	void update(Student student);
}
