package com.xworkz.collection.boot;

import java.util.Collection;
import java.util.LinkedList;

import com.xworkz.collection.dto.HolidayDto;

public class HolidayRunner {
	public static void main(String[] args) {
		HolidayDto dto=new HolidayDto(4, "Devali Festival", true);
		HolidayDto dto1=new HolidayDto(2, "christmas", true);
		HolidayDto dto2=new HolidayDto(7, "Dasara", false);
		HolidayDto dto3=new HolidayDto(3, "Sakranti", false);
		HolidayDto dto4=new HolidayDto(1, "shivaratri", true);
		
		boolean equals=dto.equals(dto4);
		System.out.println(equals);
		
		Collection<HolidayDto> col=new LinkedList<HolidayDto>();
		col.add(dto4);
		col.add(dto3);
		col.add(dto2);
		col.add(dto1);
		col.add(dto);
		
		boolean contains=col.contains(dto4);
		System.out.println(contains);
	}

}
