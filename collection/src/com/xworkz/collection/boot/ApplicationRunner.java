package com.xworkz.collection.boot;

import java.util.Collection;
import java.util.LinkedList;
import java.util.stream.Collectors;

import com.xworkz.collection.dto.ApplicationDTO;

public class ApplicationRunner {
	public static void main(String[] args) {
		Collection<ApplicationDTO> applicationDto = new LinkedList<ApplicationDTO>();
		applicationDto.add(new ApplicationDTO("chrome", 8, true, "google", 2000));
		applicationDto.add(new ApplicationDTO("Microsoft Word", 10, false, "Charles Simonyi", 1000));
		applicationDto.add(new ApplicationDTO(" browsers", 4, true, "google", 0));
		applicationDto.add(new ApplicationDTO("Instagram.", 8, true, "Kevin Systrom", 0));
		applicationDto.add(new ApplicationDTO("Facebook", 9, true, " Mark Zuckerberg", 0));

		applicationDto.stream().filter(ele -> ele.isFree() == true && ele.getDevelopedBy() == "google")
				.collect(Collectors.toList()).forEach(ele -> System.out.println(ele));
		System.out.println("----version and name-------");
		applicationDto.stream().filter(ele -> ele.getVersion() > 5).collect(Collectors.toList())
				.forEach(ele -> System.out.println(ele.getName()));

	}

}
