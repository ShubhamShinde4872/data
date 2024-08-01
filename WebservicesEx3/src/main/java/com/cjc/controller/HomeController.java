package com.cjc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.model.Student;
import com.cjc.servicei.Studentservicei;

@RestController
public class HomeController {
	@Autowired
	Studentservicei ssi;
	
	@GetMapping("/")
	public List<Student> preLogin()
	{
		List<Student> list=new ArrayList<Student>();
		
		list=ssi.preLogin();
		
		return list;
	}
      
	@PostMapping("/save")
	  public Student saveData(@RequestBody Student s)
	  {
		Student stu=ssi.saveData(s);  
	
		  return stu;
		  
	  }
	   
	@DeleteMapping("/delete")
	public List<Student> deleteData(@PathVariable int rollno)
	{
		List<Student> list=ssi.delete(rollno);
		return list;
	}
	
	//@PutMapping("/put")
	
}
