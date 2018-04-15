package com.app;

public interface IStudentService {
	   public Iterable<Student> listAllStudents();
	   public Student getStudentById(long id);
	   public Student saveStudent(Student student);
	   public void deleteStudent(long id);
	
}
