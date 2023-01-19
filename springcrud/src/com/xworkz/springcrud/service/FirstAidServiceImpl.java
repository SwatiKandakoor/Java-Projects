package com.xworkz.springcrud.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.springcrud.dto.FirstAidDto;
import com.xworkz.springcrud.repository.FirstAidRepo;

@Component
public class FirstAidServiceImpl implements FirstAidService {
	@Autowired
	private FirstAidRepo firstaid;
	private Validator validator;

	@Autowired
	public FirstAidServiceImpl(Validator validator) {
		this.validator = validator;
		System.out.println("created service by passing repo...from spring...");
	}

	@Override
	public boolean validationAndSave(FirstAidDto dto) {
		System.out.println("executing validate and save start");
		System.out.println("aiddto passed :" + dto);
		Set<ConstraintViolation<FirstAidDto>> violation = this.validator.validate(dto);

		if (!violation.isEmpty()) {
			System.err.println("there are validation erros");
			violation.forEach(vs -> System.err.println(vs));
			return false;
		} else {
			System.out.println("Data is valid and save");

			boolean saved = this.firstaid.save(dto);
			System.out.println("saved first aid:" + saved);

			return saved;
		}

	}

}
