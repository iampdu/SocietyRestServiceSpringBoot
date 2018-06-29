package com.example.demo;

import java.util.List;
import java.util.Optional;

public interface ServiceStudentIn {

	public String CreateStudent(Student st);
	
	public Student validateStudent(String us,String ps);
	
	public Optional<Student> getStudentById(int id);
	
	public List<Student> retrieveAllStudents();
}
