package com.xworkz.dependency.component;

import org.springframework.stereotype.Component;

import com.xworkz.dependency.rule.Browser;
@Component
public class FireBox implements Browser{

	@Override
	public void browse() {
		System.out.println("created browse method..");
		
	}

}
