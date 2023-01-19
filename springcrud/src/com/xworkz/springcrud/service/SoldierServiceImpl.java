package com.xworkz.springcrud.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.springcrud.dto.SoldierDto;
import com.xworkz.springcrud.repository.SoldierRepo;
import com.xworkz.springcrud.repository.SoldierRepoImpl;

public class SoldierServiceImpl implements SoldierService {
	private SoldierRepoImpl soldierRepo;

	public SoldierServiceImpl() {
		System.out.println("created soldier service no-arg cons...");

	}

	public void setSoldierRepo(SoldierRepoImpl soldierRepo) {
		this.soldierRepo = soldierRepo;
	}

	@Override
	public boolean validationAndSava(SoldierDto dto) {
		System.out.println("executing validateAndSave start");
		System.out.println("Dto passed :" + dto);

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<SoldierDto>> validate = validator.validate(dto);
		if (!validate.isEmpty()) {
			System.err.println("not validation");

			validate.forEach(e -> System.out.println(e.getMessage()));
			return false;
		} else {
			boolean saved = this.soldierRepo.save(dto);
			if (dto != null) {

				System.out.println("Soldier dto is saved " + saved);
				return saved;
			}
		}
		System.out.println("Soldier is valid and save");
		return true;

	}

}
