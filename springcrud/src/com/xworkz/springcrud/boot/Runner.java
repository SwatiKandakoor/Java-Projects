package com.xworkz.springcrud.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springcrud.configurtion.SpringConfiguration;
import com.xworkz.springcrud.dto.FirstAidDto;
import com.xworkz.springcrud.dto.MissileDto;
import com.xworkz.springcrud.dto.ResortDto;
import com.xworkz.springcrud.service.FirstAidService;
import com.xworkz.springcrud.service.MissileService;
import com.xworkz.springcrud.service.ResortService;

public class Runner {
 public static void main(String[] args) {
	ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfiguration.class);
	FirstAidService service1=context.getBean(FirstAidService.class);
	boolean saved=service1.validationAndSave(new FirstAidDto());
	System.out.println("saved :"+saved);
	
	MissileService service=context.getBean(MissileService.class);
	boolean saved1=service.validationAndSave(new MissileDto());
	System.out.println("saved :"+saved1);
	
	ResortService service2=context.getBean(ResortService.class);
	boolean saved2=service2.validateAndSave(new ResortDto());
	System.out.println("saved :"+saved2);
}
}
