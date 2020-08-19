package com.tango.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.tango.dao.StudentDao;
import com.tango.entity.Student;

@Service
public class StudentService {

	@Resource
	private StudentDao studentDao;
	
	/**
	 * 根据ID查询一条学生数据
	 * @param studentId
	 * @return
	 */
	public Student selectById(Integer studentId) {
		return studentDao.selectById(studentId);
	}
}
