package com.unirest.demo.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Student {

	private Integer id;
	
	private String name;
	
	private Branch branch;
	
}
