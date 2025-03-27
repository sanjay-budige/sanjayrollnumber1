package com.practice.student.dao;

import java.util.List;

import com.practice.student.model.Student;

public interface StudentDAOService {

	public Student getStudent(Long id);

	public Student createStudent(Student student);
	
	public Student updateStudent(Student student);
	
	public Student deleteStudent(Student student);
	
	public List<Student> getAllStudent();
}
