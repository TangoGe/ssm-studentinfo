package com.tango.dao;

import java.util.List;

import com.tango.entity.Student;

public interface StudentDao {
	// 插入一条数据
	void insertOne(Student student);

	// 查询所有数据
	List<Student> selectAll();

	// 根据ID查询一条数据
	Student selectById(Integer studentId);

	// 根据ID删除数据
	void deleteById(Integer studentId);

	// 根据ID更新数据
	void updateById(Student student);
}
