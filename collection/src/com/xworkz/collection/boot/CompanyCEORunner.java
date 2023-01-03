package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.xworkz.collection.dto.CompanyCEODTO;
import com.xworkz.collection.dto.DaugtherDTO;

public class CompanyCEORunner {
	public static void main(String[] args) {
		DaugtherDTO daugther = new DaugtherDTO("Akshata Murthy", 9980361822d, 22, false, true);
		CompanyCEODTO company = new CompanyCEODTO("Sudha Murthy", "Infosys", 55, "india", "BE", true, daugther);

		DaugtherDTO daugther1 = new DaugtherDTO("Aditi Premji", 8073982483d, 26, true, true);
		CompanyCEODTO company1 = new CompanyCEODTO("Azim Premji", "wipro", 25, "india", "BE", true, daugther1);

		DaugtherDTO daugther2 = new DaugtherDTO("Sunitha", 7019336631d, 24, true, true);
		CompanyCEODTO company2 = new CompanyCEODTO("Faqir Chand Kohli", "TCS", 70, "india", "BE", true, daugther2);

		List<CompanyCEODTO> companyCEOs = new ArrayList<CompanyCEODTO>();
		companyCEOs.add(company);
		companyCEOs.add(company2);
		companyCEOs.add(company1);

		System.out.println(companyCEOs);
		System.out.println("---------print all daugtherdto-------");
		companyCEOs.stream().forEach(ele -> System.out.println(ele.getDaugtherDTO()));
		System.out.println("-------print all daugtherdto names-------");
		companyCEOs.stream().forEach(ele -> System.out.println(ele.getDaugtherDTO().getName()));

		System.out.println("-------total companyCEO------");
		long total = companyCEOs.stream().filter(ele -> ele.getAge() > 30).count();

		System.out.println(total);

		System.out.println("----print father age and daugther age------");
		companyCEOs.stream().forEach(ele -> System.out
				.println("Father age :" + ele.getAge() + ", daugther age :" + ele.getDaugtherDTO().getAge()));
	}
}
