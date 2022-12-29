package com.xworkz.collection.boot;

import java.util.Collection;
import java.util.LinkedList;

import com.xworkz.collection.dto.CalendarDto;

public class CalendarRunner {
	public static void main(String[] args) {
		CalendarDto dto=new CalendarDto(1947, 8, 15);
		CalendarDto dto1=new CalendarDto(2000, 10, 1);
		CalendarDto dto2=new CalendarDto(1998, 6, 28);
		CalendarDto dto3=new CalendarDto(1998, 10, 2);
		CalendarDto dto4=new CalendarDto(1998, 18, 15);
		
		boolean equals=dto3.equals(dto4);
		System.out.println(equals);
		
		Collection<CalendarDto> col=new LinkedList<CalendarDto>();
		col.add(dto);
		col.add(dto1);
		col.add(dto2);
		col.add(dto3);
		col.add(dto4);
		
		boolean contains=col.contains(dto4);
		System.out.println("contains "+contains);
		
	}

}
