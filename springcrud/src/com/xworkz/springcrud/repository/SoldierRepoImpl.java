package com.xworkz.springcrud.repository;

import com.xworkz.springcrud.dto.SoldierDto;

public class SoldierRepoImpl implements SoldierRepo {

	public SoldierRepoImpl() {
		System.out.println("created Soldier repo no-arg cons....");
	}

	
	@Override
	public boolean save(SoldierDto dto) {
		System.out.println("Soldier dto  creating");
		System.out.println("saved to " + dto);
		return true;
	}

}
