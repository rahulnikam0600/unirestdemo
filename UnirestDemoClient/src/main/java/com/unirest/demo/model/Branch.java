package com.unirest.demo.model;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Branch {

	private Integer id;
	private String name;
	private List<String> subjects;
	
}
