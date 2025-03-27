package com.practice.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.practice.student.dao.StudentDAOService;
import com.practice.student.model.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	//@Qualifier("StudentDAODatabaseServiceImpl")
	private StudentDAOService studentDAOService;

	@Override
	public Student getStudent(Long id) {
		Student student = studentDAOService.getStudent(id);
		return student;
	}

	@Override
	public Student createStudent(Student student) {
		// TODO Auto-generated method stub
		return studentDAOService.createStudent(student);
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return studentDAOService.updateStudent(student);
	}

	@Override
	public Student deleteStudent(Student student) {
		// TODO Auto-generated method stub
		return studentDAOService.deleteStudent(student);
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return studentDAOService.getAllStudent();
	}
}
