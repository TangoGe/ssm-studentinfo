package com.tango.service;

import com.tango.entity.Student;

public interface StudentService {

	Student selectById(Integer stuId);
	
	void updateById(Student student);
}
