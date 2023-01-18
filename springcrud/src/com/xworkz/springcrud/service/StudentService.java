package com.xworkz.springcrud.service;

import com.xworkz.springcrud.dto.StudentDto;

public interface StudentService {
	
	boolean validateAndSave(StudentDto dto);

}
