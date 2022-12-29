package com.xworkz.collection.boot;

import java.util.Collection;
import java.util.LinkedList;

import com.xworkz.collection.dto.AirportDto;

public class AirportRunner {
	public static void main(String[] args) {
		AirportDto dto=new AirportDto(40000d,"Bangalore", "Hyderabad");
		AirportDto dto1=new AirportDto(20000d,"Delhi", "Hyderabad");
		AirportDto dto2=new AirportDto(35000d,"Bangalore", "Delhi");
		AirportDto dto3=new AirportDto(10000d,"Delhi", "Gujarat");
		AirportDto dto4=new AirportDto(12000d,"Bangalore", "Mangalore");
		
		boolean equals=dto.equals(dto2);
		//System.out.println(dto.getDestination().equals(dto1.getDestination()));
		System.out.println(equals);
		
		Collection<AirportDto> col=new LinkedList<AirportDto>();
		col.add(dto);
		col.add(dto1);
		col.add(dto2);
		col.add(dto3);
		col.add(dto4);
		
		boolean contains=col.contains(dto);
		System.out.println("contains "+contains);
		
	}

}
