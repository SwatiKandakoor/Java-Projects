package com.xworkz.collection.boot;


import java.util.HashSet;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;
import com.xworkz.collection.dto.SweetDto;

public class SweetRunner {
	public static void main(String[] args) {
		
		
		SweetDto sweetDto=new SweetDto("mysurPack", 250d, true);
		SweetDto sweetDto1=new SweetDto("jangeer", 300d, false);
		SweetDto sweetDto2=new SweetDto("laddo", 200d, true);
		
		Set<SweetDto> dtos=new HashSet<SweetDto>();
		dtos.add(sweetDto2);
		dtos.add(sweetDto1);
		dtos.add(sweetDto);
		for(SweetDto element:dtos) {
			System.out.println(element.hashCode());
			System.out.println(element);
			
			System.out.println(System.identityHashCode(element));
			
		}
		
		
		
	}

}
