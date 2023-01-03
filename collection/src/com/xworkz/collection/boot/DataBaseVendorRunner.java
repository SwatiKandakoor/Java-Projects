package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.xworkz.collection.constant.TYPE;

import com.xworkz.collection.dto.DataBaseVendorDTO;

public class DataBaseVendorRunner {
	public static void main(String[] args) {
		List<DataBaseVendorDTO> dataBase = new ArrayList<DataBaseVendorDTO>();
		dataBase.add(new DataBaseVendorDTO("Microsoft", "Charles Simonyi", TYPE.MONGODB, 20, 1000));
		dataBase.add(new DataBaseVendorDTO("Microsoft SQL Server", "Microsoft", TYPE.MICROSOFTSQL_SERVER, 25, 700));
		dataBase.add(new DataBaseVendorDTO("Oracle RDBMS", "Oracle Corporation.", TYPE.ORACLE, 6, 40));
		dataBase.add(new DataBaseVendorDTO("Microsoft", "Bill Gates ", TYPE.MYSQL, 8, 10));

		dataBase.stream().map(ele -> ele.getDevelopedBy().toUpperCase()).collect(Collectors.toList())
				.forEach(ele -> System.out.println(ele));
		System.out.println("----print license cost less than 100 and type------");
		dataBase.stream().filter(ele -> ele.getLicenseCost() < 100 && ele.getType() == TYPE.MYSQL)
				.collect(Collectors.toSet()).forEach(ele -> System.out.println(ele));
		System.out.println("-----Print all types------");
		dataBase.stream().forEach(ele -> System.out.println(ele.getType()));
	}

}
