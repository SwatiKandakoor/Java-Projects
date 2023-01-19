package com.xworkz.springcrud.configurtion;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.xworkz.springcrud")
public class SpringConfiguration {
	@Bean
	public Validator validator() {
		System.out.println("registerting validation");
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validation = factory.getValidator();
		return validation;
	}
}
