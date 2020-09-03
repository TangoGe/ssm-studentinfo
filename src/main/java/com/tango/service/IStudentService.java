package com.tango.service;

import java.util.List;

import com.tango.entity.Student;

public interface IStudentService {

	List<Student> selectAll();

	Student selectById(Long stuId);

	void update(Student student);

	void insert(Student student);
}
