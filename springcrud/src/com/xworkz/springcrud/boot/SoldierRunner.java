package com.xworkz.springcrud.boot;

import com.xworkz.springcrud.dto.SoldierDto;
import com.xworkz.springcrud.repository.SoldierRepo;
import com.xworkz.springcrud.repository.SoldierRepoImpl;
import com.xworkz.springcrud.service.SoldierService;
import com.xworkz.springcrud.service.SoldierServiceImpl;

public class SoldierRunner {
	public static void main(String[] args) {
		SoldierDto dto = new SoldierDto(1, "Naveen", "Ilkal", "FirstRank");
		SoldierServiceImpl service = new SoldierServiceImpl();
		SoldierRepoImpl repo = new SoldierRepoImpl();
		service.setSoldierRepo(repo);
		service.validationAndSava(dto);

	}

}
