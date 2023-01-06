package com.xworkz.collection.boot;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.stream.Collectors;

import com.xworkz.collection.dto.MovieDTO;
import com.xworkz.collection.dto.Type;
import com.xworkz.collection.dto.WeaponDTO;

public class WeaponRunner {
	public static void main(String[] args) {
		Collection<WeaponDTO> collection = new LinkedList<WeaponDTO>();

		collection.add(new WeaponDTO("V-2 missile", "nepal", LocalDate.of(1867, 12, 6), 1000d, Type.ARTILLERY));
		collection.add(
				new WeaponDTO("Congreve rocket", "southAfrica", LocalDate.of(1898, 12, 8), 2000d, Type.SEMIAUTOMATIC));
		collection
				.add(new WeaponDTO("gunblunderbuss", "northAfrica", LocalDate.of(1988, 12, 4), 3000d, Type.EXPLOSIVES));
		collection.add(new WeaponDTO("air gun", "korea", LocalDate.of(1998, 12, 3), 5000d, Type.ROCKETS));
		collection.add(new WeaponDTO("hydrogen cyanide", "manipuri", LocalDate.of(1980, 12, 10), 6000d, Type.CHEMICAL));
		collection.add(new WeaponDTO("Garand rifle", "russia", LocalDate.of(2022, 12, 23), 7000d, Type.RANGED));
		collection.add(new WeaponDTO("pistol", "america", LocalDate.of(1980, 12, 18), 8000d, Type.ROCKETS));
		collection.add(new WeaponDTO("hand gun", "India", LocalDate.of(2022, 12, 15), 9000d, Type.ARTILLERY));
		collection.add(new WeaponDTO("revolver", "russia", LocalDate.of(1980, 12, 16), 10000d, Type.SEMIAUTOMATIC));
		collection.add(new WeaponDTO("rifle", "austrailia", LocalDate.of(1980, 12, 18), 11000d, Type.EXPLOSIVES));
		collection.add(new WeaponDTO("sword", "ukraine", LocalDate.of(1980, 3, 7), 12000d, Type.FIREARMS));
		collection.add(new WeaponDTO("dagger", "russia", LocalDate.of(1933, 12, 8), 13000d, Type.ROCKETS));
		collection.add(new WeaponDTO("nerve gas", "nepal", LocalDate.of(1983, 12, 6), 14000d, Type.CHEMICAL));
		collection.add(new WeaponDTO("depth charge", "srilanka", LocalDate.of(2022, 12, 10), 15000d, Type.RANGED));
		collection.add(new WeaponDTO("grenade", "afghanisthan", LocalDate.of(1943, 12, 15), 16000d, Type.ROCKETS));
		collection.add(new WeaponDTO("antiballistic", "Austriala", LocalDate.of(1987, 12, 17), 17000d, Type.MISSILES));
		collection.add(new WeaponDTO("Polaris", "India", LocalDate.of(1999, 12, 31), 18000d, Type.AUTOMATIC));
		collection.add(new WeaponDTO("Big Bertha", "India", LocalDate.of(2022, 12, 30), 19000d, Type.ARTILLERY));
		collection.add(new WeaponDTO("yellow rain", "USA", LocalDate.of(2000, 12, 29), 3000d, Type.SEMIAUTOMATIC));
		collection.add(new WeaponDTO("bow and arrow", "japan", LocalDate.of(1933, 12, 27), 33000d, Type.COMBAT));
		collection.add(new WeaponDTO("grapeshot", "china", LocalDate.of(1982, 1, 25), 8000d, Type.SIEGE));
		System.out.println(collection);
		
		System.out.println("------print all weapons by price greater than-----");
		collection.stream().filter(e -> e.getPrice() > 2000).collect(Collectors.toList())
				.forEach(e -> System.out.println(e));

		System.out.println("-----print all weapons madeby and madeon------");
		collection.stream()
				.forEach(e -> System.out.println("madeby :" + e.getMadeBy() + "      " + "madeOn :" + e.getMadeOn()));

		System.out.println("------print all name sorted in desc-------");

		collection.stream().sorted((a1, a2) -> a2.getName().compareTo(a1.getName())).collect(Collectors.toList())
				.forEach(e -> System.out.println(e));

		System.out.println("------print all weapons sort by madeBy-------");
		collection.stream().sorted((p1, p2) -> p1.getMadeBy().compareTo(p2.getMadeBy())).collect(Collectors.toList())
				.forEach(e -> System.out.println(e));

//		System.out.println("----print all weapons sort by madeOn------ ");
//		Comparator<WeaponDTO> cmp=((v1,v2)->LocalDate.c)
//		collection.stream().sorted().forEach(e->System.out.println(e));
		System.out.println("------print all weapons sort by price-------");
		collection.stream().sorted((b1, b2) -> Double.compare(b1.getPrice(), b2.getPrice()))
				.collect(Collectors.toList()).forEach(e -> System.out.println(e));

		System.out.println("------print all weapons sort by price desc-------");
		Comparator<WeaponDTO> comp = ((s1, s2) -> Double.compare(s2.getPrice(), s1.getPrice()));
		collection.stream().sorted(comp).forEach(e -> System.out.println(e));

		System.out.println("------print all weapons sort by name and madeOn asc -------");
		// collection.stream().sorted(y1,y2)->y1.
		System.out.println("------print all weapons sort by type and madeby,name in  desc -------");

		Comparator<WeaponDTO> name = (w1, w2) -> w1.getName().compareTo(w2.getName());

		Comparator<WeaponDTO> madeby = (w1, w2) -> w1.getMadeBy().compareTo(w2.getMadeBy());

		Comparator<WeaponDTO> type = (w1, w2) -> w1.getType().compareTo(w2.getType());

		collection.stream().sorted(name.thenComparing(madeby).thenComparing(type)).collect(Collectors.toList())
				.forEach(e -> System.out.println(e));

	}

}
