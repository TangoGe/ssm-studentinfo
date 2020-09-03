package com.tango.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tango.dao.StudentDao;
import com.tango.entity.Student;
import com.tango.service.IStudentService;

@Service
@Transactional // 添加事务注解
public class StudentService implements IStudentService {
	// 注入StudentDao
	@Resource
	private StudentDao studentDao;

	/**
	 * 查询所有数据
	 * 
	 * @return List<Student>
	 */
	@Override
	public List<Student> selectAll() {
		return studentDao.selectAll();
	}

	/**
	 * 根据stuId查询数据
	 * 
	 * @param studentId
	 * @return
	 */
	@Override
	public Student selectById(Long stuId) {
		return studentDao.selectById(stuId);
	}

	/**
	 * 更新
	 */
	@Override
	public void update(Student student) {
		studentDao.update(student);
	}

	/**
	 * 插入
	 */
	@Override
	public void insert(Student student) {
		studentDao.insert(student);
	}
}
