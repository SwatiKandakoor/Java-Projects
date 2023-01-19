package com.xworkz.springcrud.repository;

import org.springframework.stereotype.Component;

import com.xworkz.springcrud.dto.FirstAidDto;

import lombok.NoArgsConstructor;


@NoArgsConstructor
@Component
public class FirstAidRepoImpl implements FirstAidRepo {
	

	@Override
	public boolean save(FirstAidDto dto) {
		System.out.println("running save in repo dto...");
		System.out.println(" aiddto :" + dto);
		return true;
	}

}
