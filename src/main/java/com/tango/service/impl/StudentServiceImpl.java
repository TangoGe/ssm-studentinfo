package com.tango.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tango.dao.StudentDao;
import com.tango.entity.Student;
import com.tango.service.StudentService;

@Service
@Transactional // 添加事务注解
public class StudentServiceImpl implements StudentService {
	@Resource
	private StudentDao studentDao;

	/**
	 * 根据ID查询数据
	 * 
	 * @param studentId
	 * @return
	 */
	@Override
	public Student selectById(Integer stuId) {
		return studentDao.selectById(stuId);
	}

	@Override
	public void updateById(Student student) {
		studentDao.updateById(student);
	}

	@Override
	public void insert(Student student) {
		studentDao.insert(student);
	}
}
