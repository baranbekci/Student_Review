package com.baran.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.baran.model.Student;
import com.baran.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/index")
	public String setupForm(Map <String,Object>map) {
		Student student = new Student();
		map.put("student", student);
		map.put("studentList",studentService.getAllStudent());
		return "student";
	}
	
	@RequestMapping(value="/student.do",method=RequestMethod.POST)
	public String doOperations(@ModelAttribute Student student, BindingResult result, @RequestParam String operation, Map<String, Object>map) {
		Student studentResult = new Student();
		switch (operation.toLowerCase()) {
		case "add":
			studentService.add(student);
			studentResult = student;
			break;
		case "update":
			studentService.update(student);
			studentResult = student;
			break;
			
		case "delete":
			studentService.delete(student.getStuId());
			studentResult = student;
			break;
		case "search":
			Student searchStudent = studentService.getStudent(student.getStuId());
			studentResult = searchStudent != null ? searchStudent : new Student();
			break;

		}
		map.put("student", studentResult);
		map.put("studentList", studentService.getAllStudent());
		return "student";
	}
}
