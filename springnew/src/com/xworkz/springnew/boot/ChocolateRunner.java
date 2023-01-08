package com.xworkz.springnew.boot;

import java.awt.Label;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springnew.configartion.SpringConfigartion;
import com.xworkz.springnew.thing.Bag;
import com.xworkz.springnew.thing.Book;
import com.xworkz.springnew.thing.Bottle;
import com.xworkz.springnew.thing.Box;
import com.xworkz.springnew.thing.Chair;
import com.xworkz.springnew.thing.Chocolate;
import com.xworkz.springnew.thing.Earphone;
import com.xworkz.springnew.thing.Laptop;
import com.xworkz.springnew.thing.Mirror;
import com.xworkz.springnew.thing.Mobile;
import com.xworkz.springnew.thing.Pen;
import com.xworkz.springnew.thing.Shirt;
import com.xworkz.springnew.thing.Sweet;

public class ChocolateRunner {

	public static void main(String[] args) {
		ApplicationContext application = new AnnotationConfigApplicationContext(SpringConfigartion.class);
		Chocolate chocolate = application.getBean(Chocolate.class);
		System.out.println(chocolate);
		Mobile mobile = application.getBean(Mobile.class);
		System.out.println(mobile);
		Laptop laptop = application.getBean(Laptop.class);
		System.out.println(laptop);
		Chair chair = application.getBean(Chair.class);
		System.out.println(chair);
		Pen pen=application.getBean(Pen.class);
		System.out.println(pen);
		Book book=application.getBean(Book.class);
		System.out.println(book);
		Bottle bottle=application.getBean(Bottle.class);
		System.out.println(bottle);
		Shirt shirt=application.getBean(Shirt.class);
		System.out.println(shirt);
		Bag bag=application.getBean(Bag.class);
		System.out.println(bag);
		Box box =application.getBean(Box.class);
		System.out.println(box);
		Sweet sweet=application.getBean(Sweet.class);
		System.out.println(sweet);
		Earphone earphone=application.getBean(Earphone.class);
		System.out.println(earphone);
		Mirror mirror=application.getBean(Mirror.class);
		System.out.println(mirror);
		
		
		
	}

}
