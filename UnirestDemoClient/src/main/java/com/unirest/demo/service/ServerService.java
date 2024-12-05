package com.unirest.demo.service;

import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Service;

import com.unirest.demo.model.Student;

//@Service
public interface ServerService {

	public ResponseEntity<Student> studentInfo();	
}
