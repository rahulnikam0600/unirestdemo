package com.unirest.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unirest.demo.model.Student;
import com.unirest.demo.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService service;

	@GetMapping("student")
	public ResponseEntity<Student> getStudentInfo(){
		return service.getStudent(101);
	}
	
}
