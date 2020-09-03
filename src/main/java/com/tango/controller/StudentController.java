package com.tango.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tango.common.dto.BaseResult;
import com.tango.entity.Student;
import com.tango.service.IStudentService;

@Controller
@RequestMapping("/student")
public class StudentController {

	@Resource
	private IStudentService studentService;

	@RequestMapping("/selectAll")
	@ResponseBody
	public BaseResult selectAll() {
		List<Student> students = studentService.selectAll();
		BaseResult baseResult = BaseResult.buildSuccess(students);
		return baseResult;
	}

	@RequestMapping("/selectById")
	@ResponseBody
	public BaseResult selectById(Long stuId) {
		Student student = studentService.selectById(stuId);
		return BaseResult.buildSuccess(student);
	}

	@RequestMapping("/update")
	@ResponseBody
	public BaseResult update(Student student) {
		BaseResult baseResult = null;
		try {
			studentService.update(student);
			baseResult = BaseResult.buildSuccess();
		} catch (Exception e) {
			baseResult = BaseResult.buildFail(e.getMessage(), e);
		}

		return baseResult;
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	@ResponseBody
	public String save(Student student) {
		studentService.insert(student);
		return "ok";
	}
}
