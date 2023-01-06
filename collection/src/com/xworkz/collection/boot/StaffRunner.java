package com.xworkz.collection.boot;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.xworkz.collection.dto.StaffDto;

public class StaffRunner {
	public static void main(String[] args) {
		List<StaffDto> staff = new ArrayList<StaffDto>();
		staff.add(new StaffDto("mkyong", 30, new BigDecimal(10000)));
		staff.add(new StaffDto("jack", 27, new BigDecimal(20000)));
		staff.add(new StaffDto("lawrence", 33, new BigDecimal(30000)));
		System.out.println("-----using foreach loop------");
		for (StaffDto ele : staff) {
			System.out.println(ele.getName());
		}
		System.out.println("-----using stream and map-----");
		staff.stream().map(ele -> ele.getName()).collect(Collectors.toSet()).forEach(ele -> System.out.println(ele));
	}
}
