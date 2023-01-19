package com.xworkz.springcrud.repository;

import org.springframework.stereotype.Component;

import com.xworkz.springcrud.dto.MissileDto;
@Component
public class MissileRepoImpl implements MissileRepo{
	public MissileRepoImpl() {
		System.out.println("missilerepo impl no-arg cons..");
	}

	@Override
	public boolean save(MissileDto dto) {
		System.out.println("missile dto is saved");
		System.out.println("saved dto :" + dto);
		return false;
	}

}
