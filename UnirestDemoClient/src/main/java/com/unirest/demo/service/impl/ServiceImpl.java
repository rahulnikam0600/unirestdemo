package com.unirest.demo.service.impl;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.unirest.demo.model.Student;
import com.unirest.demo.service.ServerService;

import kong.unirest.HttpResponse;
import kong.unirest.Unirest;

@Service
public class ServiceImpl implements ServerService{

	@Override
	public ResponseEntity<Student> studentInfo() {
		
		HttpResponse<Student> response = Unirest.get("http://localhost:9090/student")
				.asObject(Student.class);
		
		System.out.println(response.getBody());
		return new ResponseEntity<Student>(response.getBody(), HttpStatus.OK);
	}
}
