package com.example.demo;

import org.springframework.data.repository.CrudRepository;

public interface RepositoryStudent extends CrudRepository<Student, Integer>{

	public Student findAllByEmailAndPassword(String email,String password);
}
