package com.xworkz.springcrud.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.springcrud.dto.ResortDto;
import com.xworkz.springcrud.repository.ResortRepo;
@Component
public class ResortServiceImpl implements ResortService {
	private ResortRepo resortrepo;
	private Validator validator;
@Autowired
	public ResortServiceImpl(ResortRepo resortrepo, Validator validator) {
		super();
		this.resortrepo = resortrepo;
		this.validator = validator;
	}

	@Override
	public boolean validateAndSave(ResortDto dto) {
		System.out.println("executing validate and save start");
		System.out.println("dto passed :" + dto);

		Set<ConstraintViolation<ResortDto>> violation = validator.validate(dto);
		if (!violation.isEmpty()) {
			System.err.println("Error is there");
			violation.forEach(vs -> System.err.println(vs));
			return false;
		} else {
			boolean saved = this.resortrepo.save(dto);
			System.out.println("saved :" + saved);
			System.out.println("all are valida and save");

			return saved;
		}
	}

}
