package com.xworkz.springcrud.boot;

import com.xworkz.springcrud.dto.StudentDto;
import com.xworkz.springcrud.service.StudentService;
import com.xworkz.springcrud.service.StudentServiceImpl;

public class StudentRunner {
	public static void main(String[] args) {
		StudentDto dto=new StudentDto();
		dto.setAge(22);
		dto.setName("Sunitha");
		
		System.out.println(dto);
		StudentService repo=new StudentServiceImpl();
		repo.validateAndSave(dto);
	}

}
