package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StudentServiceImpl implements IStudentService {

	private IStudent studentRepo;
	
	@Autowired
	public void setStudentRepo(IStudent studentRepo) {
		this.studentRepo = studentRepo;
	}

	@Override
	public Iterable<Student> listAllStudents() {
		return studentRepo.findAll();
	}

	@Override
	public Student getStudentById(long id) {
		return studentRepo.findOne(id);
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepo.save(student);
	}
	
	@Override
	public void deleteStudent(long id) {

		studentRepo.delete(id);
		
	}

	
}
