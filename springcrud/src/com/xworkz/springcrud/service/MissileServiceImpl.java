package com.xworkz.springcrud.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.springcrud.dto.MissileDto;
import com.xworkz.springcrud.repository.MissileRepo;
@Component
public class MissileServiceImpl implements MissileService {
	private MissileRepo missilerepo;
	private Validator validator;
    @Autowired
	public MissileServiceImpl(MissileRepo missilerepo, Validator validator) {
		super();
		this.missilerepo = missilerepo;
		this.validator = validator;
	}

	@Override
	public boolean validationAndSave(MissileDto dto) {
		System.out.println("executing validate and save start");
		System.out.println("dto passed :" + dto);

		Set<ConstraintViolation<MissileDto>> violation = validator.validate(dto);
		if (!violation.isEmpty()) {
			System.err.println("Error is there");
			violation.forEach(vs -> System.err.println(vs));
			return false;
		} else {
			System.out.println("all are valida and save");

			boolean saved = this.missilerepo.save(dto);
			System.out.println("saved :" + saved);

			return saved;
		}
	}

}
