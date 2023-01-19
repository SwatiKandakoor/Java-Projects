package com.xworkz.springcrud.repository;

import org.springframework.stereotype.Component;

import com.xworkz.springcrud.dto.ResortDto;
@Component
public class ResortRepoImpl implements ResortRepo {
	public ResortRepoImpl() {
		System.out.println("resortrepo impl no-arg cons..");
	}

	@Override
	public boolean save(ResortDto dto) {
		System.out.println("resort dto is saved");
		System.out.println("saved dto :" + dto);
		return false;
	}

}
