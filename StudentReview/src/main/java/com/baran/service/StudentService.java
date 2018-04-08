package com.baran.service;

import java.util.List;

import com.baran.model.Student;

public interface StudentService {
	public void add(Student stu);
	public void delete(int stuId);
	public void update(Student stu);
	public Student getStudent(int studentId);
	public List getAllStudent();
}
