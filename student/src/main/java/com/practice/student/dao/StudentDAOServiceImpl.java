package com.practice.student.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.practice.student.model.Student;

@Service ("StudentDAOServiceImpl")
@Primary
public class StudentDAOServiceImpl implements StudentDAOService {

	private static Map<Long, Student> map = new HashMap<Long, Student>();

	@Override
	public Student getStudent(Long id) {
		System.out.println(map.size());
		// TODO Auto-generated method stub
		Student student = map.get(id);
		return student;
	}

	@Override
	public Student createStudent(Student student) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		Long id = rand.nextLong(1000);
		student.setId(id);

		map.put(id, student);

		System.out.println(map.size());
		return student;
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		map.put(student.getId(), student);
		return student;
	}

	@Override
	public Student deleteStudent(Student student) {
		// TODO Auto-generated method stub
		map.remove(student.getId());
		return student;
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		List<Student> studentList = new ArrayList<Student>();
		Collection<Student> col = map.values();
		for (Student s : col) {
			studentList.add(s);
		}

		return studentList;
	}

}
