package com.tango.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tango.entity.Student;
import com.tango.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {

	@Resource
	private StudentService studentService;

	@RequestMapping("/selectById")
	@ResponseBody
	public Student selectById(Integer stuId) {
		return studentService.selectById(stuId);
	}

	@RequestMapping("/updateById")
	@ResponseBody
	public String updateById(Student student) {
		studentService.updateById(student);

		return "成功";
	}
}
