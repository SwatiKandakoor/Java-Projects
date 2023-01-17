package com.xworkz.dependency.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.dependency.rule.Browser;
import com.xworkz.dependency.rule.Provider;
@Component
public class Chrome implements Browser {
	@Autowired
	@Qualifier("jio")
	private Provider provider;

	@Override
	public void browse() {
		System.out.println("created browse method");
		provider.connect();
	}

}
