package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceStudent implements ServiceStudentIn {

	@Autowired
	RepositoryStudent repo;
	
	@Override
	public String CreateStudent(Student st) {
		repo.save(st);
		return "Success";
	}

	@Override
	public Student validateStudent(String us, String ps) {
		Student st=repo.findAllByEmailAndPassword(us, ps);
	
		return st;
	}

	@Override
	public Optional<Student> getStudentById(int id) {
		Optional<Student> st=repo.findById(id);
		return  st;
	}

	@Override
	public List<Student> retrieveAllStudents() {
		
		return (List<Student>) repo.findAll();
	}
	
	

}
