package com.xworkz.collection.boot;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.xworkz.collection.dto.MovieDTO;

public class MovieRunner {
	public static void main(String[] args) {
		MovieDTO dto = new MovieDTO("KGF", 200, "Kannada", 1000, LocalDate.of(2022, 8, 13));
		MovieDTO dto1 = new MovieDTO("Avatar", 240, "English", 10000, LocalDate.of(2022, 12, 15));
		MovieDTO dto2 = new MovieDTO("RRR", 200, "telugu", 2000, LocalDate.of(2022, 9, 10));
		MovieDTO dto3 = new MovieDTO("Vedaa", 180, "Kannada", 100, LocalDate.of(2022, 12, 20));
		MovieDTO dto4 = new MovieDTO("Kranthi", 220, "Kannada", 100, LocalDate.of(2023, 1, 16));

		List<MovieDTO> movies = new ArrayList<MovieDTO>();
		movies.add(dto);
		movies.add(dto1);
		movies.add(dto2);
		movies.add(dto3);
		movies.add(dto4);
//        System.out.println("----------name assending order----------------");
//		movies.stream().sorted().forEach(ele -> System.out.println(ele));
//		
		System.out.println("----------name desending order----------------");
		Comparator<MovieDTO> comp=(a1, a2) -> a2.getName().compareTo(a1.getName());
		movies.stream().sorted(comp)
				.forEach(ele -> System.out.println(ele));
		
		System.out.println("----------budget assending order------------");
		Comparator<MovieDTO> comparator = ((q1, q2) ->q1.getBudget().compareTo(q2.getBudget()));
		movies.stream().sorted(comparator).forEach(ele -> System.out.println(ele));

	    System.out.println("----------budget desending order------------");
	    Comparator<MovieDTO> comparator1=((v1,v2)->Double.compare(v2.getBudget(), v1.getBudget()));
	    movies.stream().sorted(comparator1).forEach(ele->System.out.println(ele));
	}

}
