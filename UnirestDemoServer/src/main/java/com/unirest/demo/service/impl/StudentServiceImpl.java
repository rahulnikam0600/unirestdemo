package com.unirest.demo.service.impl;

import java.beans.JavaBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.unirest.demo.model.Student;
import com.unirest.demo.repository.StudentRepo;
import com.unirest.demo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepo studentRepo;
	
	@Override
	public ResponseEntity<Student> getStudent(Integer id) {
		
		return new ResponseEntity<Student>(studentRepo.getStudent(id),HttpStatus.OK);
	}

}
