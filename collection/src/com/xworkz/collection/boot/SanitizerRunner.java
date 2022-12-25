package com.xworkz.collection.boot;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.xworkz.collection.dto.SanitizerDTO;

public class SanitizerRunner {
	public static void main(String[] args) {
		SanitizerDTO dto1 = new SanitizerDTO(2, "Sterillium", 3d, "colourless");
		SanitizerDTO dto2 = new SanitizerDTO(3, "Savlon", 40d, "blue");
		SanitizerDTO dto3 = new SanitizerDTO(5, null, 29d, "yellow");//Dettol
		SanitizerDTO dto4 = new SanitizerDTO(6, " Lifebuoy", 10d, "green");
		SanitizerDTO dto5 = new SanitizerDTO(8, "Godrej", 5d, "red");
		SanitizerDTO dto6 = new SanitizerDTO(9, "Dabur", 10d, "yellow");
		SanitizerDTO dto7 = new SanitizerDTO(10, "Multani", 15d, "blue");
		SanitizerDTO dto8 = new SanitizerDTO(17, "Corvil ", 4d, "red");
		SanitizerDTO dto9 = new SanitizerDTO(14, "Trust", 12d, "green");
		SanitizerDTO dto10 = new SanitizerDTO(6, "DCM Shriram ", 5d, "colourless");
		
		Collection<SanitizerDTO> collections = new LinkedList<SanitizerDTO>();
		collections.add(dto10);
		collections.add(dto9);
		collections.add(dto8);
		collections.add(dto7);
		collections.add(dto6);
		collections.add(dto5);
		collections.add(dto4);
		collections.add(dto3);
		collections.add(dto2);
		collections.add(dto1);

		System.out.println(collections.size());

		Iterator<SanitizerDTO> iterator = collections.iterator();
		while (iterator.hasNext()) {
			SanitizerDTO ref = iterator.next();
			if (ref.getPrice() > 5) {
				System.out.println("Price :" + ref);
			}

		}
		Iterator<SanitizerDTO> itr=collections.iterator();
		while(itr.hasNext()) {
			SanitizerDTO ref=itr.next();
			if(ref.getBrand()==null || ref.getPrice()==null || ref.getColor() == null
					|| ref.getId()==0) {
				System.out.println(ref);
			}
		}
		Iterator<SanitizerDTO> itr1=collections.iterator();
		while(itr1.hasNext()) {
			SanitizerDTO ref=itr1.next();
			if(ref.getColor()=="green" || ref.getColor()=="red" || ref.getColor()=="blue") {
				itr1.remove();
				System.err.println("color :"+ref);
			}
		}
       SanitizerDTO min=null;
       Double price = 1000000d;
		Iterator<SanitizerDTO> itr2=collections.iterator();
		while(itr2.hasNext()) {
			SanitizerDTO ref=itr2.next();
			if(ref.getPrice()<price) {
				min=ref;
				price=ref.getPrice();
			}
		}
		System.out.println("least :"+min);
		
		
		SanitizerDTO max=null;
		Double price1=0d;
		Iterator<SanitizerDTO>itr3=collections.iterator();
		while(itr3.hasNext()) {
			SanitizerDTO ref=itr3.next();
			if(ref.getPrice()>price1) {
				max=ref;
				price1=ref.getPrice();
			}
		}
		System.out.println("max :"+ max);
		
		
		SanitizerDTO secmax=null;
		Double price2=0d;
		Iterator<SanitizerDTO> itr4=collections.iterator();
		while(itr4.hasNext()) {
			SanitizerDTO ref=itr4.next();
			if(ref.getPrice()>price2 && ref.getPrice()!=price1) {
				secmax=ref;
				price2=ref.getPrice();
				
			}
		}
		System.out.println("second max :"+secmax);
		
		System.out.println("Completed");
	}
}
