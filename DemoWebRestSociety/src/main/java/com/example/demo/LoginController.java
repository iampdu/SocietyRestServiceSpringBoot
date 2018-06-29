package com.example.demo;


import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	
	@Autowired
	ServiceStudentIn ser;
	
	@RequestMapping("/start")
	public String welPage() {
	return "Prasad";	
	}
	
	
	@RequestMapping(value="/crst",method=RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
	public String createStud(@RequestBody Student st) {
		
		return ser.CreateStudent(st);
		
		
	}
	
	@RequestMapping(value="/logst",method=RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
	public String ValidateStudent(/*@RequestParam(value="email") String us,@RequestParam(value="password") String ps*/@RequestBody Student st)
	{
		
		Student stu=ser.validateStudent(st.getEmail(),st.getPassword());
		if(st.getId()>0)
		{
		return "success";
		}
		else
		{
			return "failed";
		}
		
	}
	
	@GetMapping("/getstu/{id}")
	public Student getStudentById(@PathVariable int id)
	{
		//int sid=Integer.parseInt(id);
		Optional<Student> optional=ser.getStudentById(id);
		return optional.get();
		
	}
	
	@GetMapping("/getallstu")
	public List<Student> getAllStudent()
	{
		return ser.retrieveAllStudents();
		
	}
}
