package com.unirest.demo.repository;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.unirest.demo.model.Branch;
import com.unirest.demo.model.Student;

@Repository
public class StudentRepo {

	
	public Student getStudent(Integer id) {
		
		List<String> scienceSub = Arrays.asList("Physics","Chem","Math","Bio");
		List<String> artSub = Arrays.asList("Marathi","Hindi","History","Geography");
		
		Branch scienceBranch = Branch.builder()
				.id(1)
				.name("Science")
				.subjects(scienceSub)
				.build();
		Branch artBranch = Branch.builder()
				.id(2)
				.name("Art")
				.subjects(artSub)
				.build();
						
		Student student1 = Student.builder()
				.id(101)
				.name("Rahul")
				.branch(scienceBranch)
				.build();

		Student student2 = Student.builder()
				.id(102)
				.name("Tina")
				.branch(artBranch)
				.build();
		
		if(id == 101) {
			return student1;
		}else {
			return student2;
		}
	}
	
}
