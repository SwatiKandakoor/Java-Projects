package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import com.xworkz.collection.dto.PalaceDTO;

public class PalaceRunner {
	public static void main(String[] args) {
		List<PalaceDTO> palaceDto = new ArrayList<PalaceDTO>();
		palaceDto.add(new PalaceDTO("Bangalore", "Bangalore", "Tarun", true, 500));
		palaceDto.add(new PalaceDTO("Mysuru", "Mysuru", "Amruth", false, 800));
		palaceDto.add(new PalaceDTO("Grand", "Bangkok", "Naveen Kumar", true, 700));
		palaceDto.add(new PalaceDTO("Lakshmi Vilas", "Gujarat", "Maharaja of Vadodara", false, 400));

		palaceDto.stream().filter(ele -> ele.isDestroyed() != false).collect(Collectors.toList())
				.forEach(ele -> System.out.println(ele));
	}

}
