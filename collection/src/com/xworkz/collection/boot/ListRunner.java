package com.xworkz.collection.boot;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListRunner {
	public static void main(String[] args) {
		String list="A";
		String list1="B";
		 List<String> ref=new ArrayList<String>();
		 ref.add(list);
		 ref.add(list1);
		 System.out.println(ref);//A,B
		 ref.set(0, "C");
		 System.out.println(ref);//C,B
		 ref.add(0, "D");
		 System.out.println(ref);//D,C,B
		 String x=ref.get(2);
		 System.out.println(x);//D,C,B
		 ref.remove(0);
		 System.out.println(ref);//C,B
		 ref.add(1,"U");
		 System.out.println(ref);//C,U,B
		 ref.add(1, "S");
		 System.out.println(ref);//C,S,U,B
		 ref.addAll(1, ref);
		 System.out.println(ref);//C,C,S,U,B,S,U,B4
		 
		 for(String element:ref) {
			 System.out.println(element);
		 }
	}

}
