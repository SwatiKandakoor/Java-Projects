package com.xworkz.springcrud.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.springcrud.dto.StudentDto;

public class StudentServiceImpl implements StudentService {
	@Override
	public boolean validateAndSave(StudentDto dto) {
		System.out.println("executing validateAndSave start");
		System.out.println("Dto passed :" + dto);

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<StudentDto>> violations = validator.validate(dto);
		if (violations.isEmpty()) {
			System.out.println("Error is there");
			violations.forEach(e -> System.out.println(e.getMessage()));
		}
		return false;
	}

}
