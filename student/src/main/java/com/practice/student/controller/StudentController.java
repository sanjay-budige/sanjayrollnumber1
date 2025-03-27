package com.practice.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.student.model.Student;
import com.practice.student.service.StudentService;

@RestController
@RequestMapping("/v1")
public class StudentController {

	@Autowired
	private StudentService studentService;

	// http://localhost:8080/v1/student/1
	@GetMapping("/student/{id}")
	public ResponseEntity<Student> getStudent(@PathVariable("id") Long id) {
		System.out.println(id); // print 1
		Student student = studentService.getStudent(id);

		return new ResponseEntity<Student>(student, HttpStatus.OK);
	}
	
	@GetMapping("/studentall")
	public ResponseEntity<List<Student>> getAllStudent() {
		 List<Student> students = studentService.getAllStudent();

		return new ResponseEntity<List<Student>>(students, HttpStatus.OK);
	}

	@PostMapping("/student/delete")
	public ResponseEntity<Student> createStudent(@RequestBody Student student) {
		student = studentService.deleteStudent(student);

		return new ResponseEntity<Student>(student, HttpStatus.OK);
	}
	
	@PostMapping("/student/create")
	public ResponseEntity<Student> deleteStudent(@RequestBody Student student) {
		student = studentService.createStudent(student);

		return new ResponseEntity<Student>(student, HttpStatus.OK);
	}
}
