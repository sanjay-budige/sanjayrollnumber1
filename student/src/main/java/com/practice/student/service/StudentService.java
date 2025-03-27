package com.practice.student.service;

import java.util.List;

import com.practice.student.model.Student;

public interface StudentService {
	
	public Student getStudent(Long id);
	
	public List<Student> getAllStudent();
	
	public Student createStudent(Student student);
	
	public Student updateStudent(Student student);
	
	public Student deleteStudent(Student student);

}
