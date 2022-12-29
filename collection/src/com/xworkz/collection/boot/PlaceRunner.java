package com.xworkz.collection.boot;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

import com.xworkz.collection.dto.PlaceDto;

public class PlaceRunner {
	public static void main(String[] args) {
		PlaceDto dto = new PlaceDto("Mysuru", 80, "Sri Chamundeshwari Temple");
		PlaceDto dto1 = new PlaceDto("Hampi", 400, "Temple");
		PlaceDto dto2 = new PlaceDto("Udupi", 80, "Krishana Temple");
		PlaceDto dto3 = new PlaceDto("Gokarna", 80, "Beach");
		PlaceDto dto4 = new PlaceDto("Chikmagalur ", 80, "Mullayangiri");

		boolean equals = dto.equals(dto4);
		System.out.println("equals " + equals);

		Collection<PlaceDto> col = new LinkedList<PlaceDto>();
		col.add(dto);
		col.add(dto1);
		col.add(dto2);
		col.add(dto3);
		col.add(dto4);

		boolean contains = col.contains(dto);
		System.out.println("contains " + contains);

	}

}
