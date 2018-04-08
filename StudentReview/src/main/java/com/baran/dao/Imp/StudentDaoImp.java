package com.baran.dao.Imp;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.baran.dao.StudentDao;
import com.baran.model.Student;

@Repository
public class StudentDaoImp implements StudentDao {
	
	@Autowired
	private SessionFactory session;
	
	@Override
	public void add(Student stu) {
		// TODO Auto-generated method stub
		session.getCurrentSession().save(stu);
	}

	@Override
	public void delete(int stuId) {
		// TODO Auto-generated method stub
		session.getCurrentSession().delete(stuId);

	}

	@Override
	public void update(Student stu) {
		// TODO Auto-generated method stub
		session.getCurrentSession().update(stu);
	}

	@Override
	public Student getStudent(int studentId) {
		// TODO Auto-generated method stub
		return (Student)session.getCurrentSession().get(Student.class, studentId);
	}

	@Override
	public List getAllStudent() {
		// TODO Auto-generated method stub
		return session.getCurrentSession().createQuery("from Student").list();
	}

}
