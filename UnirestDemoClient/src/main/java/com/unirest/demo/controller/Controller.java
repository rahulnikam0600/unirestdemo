package com.unirest.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unirest.demo.model.Student;
import com.unirest.demo.service.ServerService;

@RestController
public class Controller {

	@Autowired
	private ServerService service;
	
	@GetMapping("client")
	public ResponseEntity<Student>getData() {
		
		return service.studentInfo();
	}
	
}
