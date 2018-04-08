package com.baran.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baran.dao.StudentDao;
import com.baran.model.Student;
import com.baran.service.StudentService;

@Service
public class StudentServiceImp implements StudentService {
	@Autowired
	private StudentDao studentDao;
	
	@Transactional
	public void add(Student stu) {
		// TODO Auto-generated method stub
		studentDao.add(stu);

	}

	@Transactional
	public void delete(int stuId) {
		// TODO Auto-generated method stub
		studentDao.delete(stuId);
	}

	@Transactional
	public void update(Student stu) {
		// TODO Auto-generated method stub
		studentDao.update(stu);
	}

	@Transactional
	public Student getStudent(int studentId) {
		// TODO Auto-generated method stub
		return studentDao.getStudent(studentId);
	}

	@Transactional
	public List getAllStudent() {
		// TODO Auto-generated method stub
		return studentDao.getAllStudent();
	}

}
