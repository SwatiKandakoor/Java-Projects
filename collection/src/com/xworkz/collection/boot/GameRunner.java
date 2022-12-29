package com.xworkz.collection.boot;

import java.util.Collection;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingDeque;

import com.xworkz.collection.dto.GameDto;

public class GameRunner {
	public static void main(String[] args) {
		GameDto dto=new GameDto("kabaddi","outdoor",7);
		GameDto dto1=new GameDto("Chees","indoor",2);
		GameDto dto2=new GameDto("koko","outdoor",9);
		GameDto dto3=new GameDto("Cricket","outdoor",11);
		GameDto dto4=new GameDto("kabaddi","outdoor",7);
		
		boolean equals=dto.equals(dto4);
		System.out.println(equals);
		
		Collection<GameDto> col=new LinkedList<GameDto>();
		col.add(dto4);
		col.add(dto3);
		col.add(dto2);
		col.add(dto1);
		col.add(dto);
		
		boolean cantains=col.contains(dto4);
		System.out.println(cantains);
		
		
	}

}
