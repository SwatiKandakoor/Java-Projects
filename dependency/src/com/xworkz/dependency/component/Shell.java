package com.xworkz.dependency.component;
import com.xworkz.dependency.rule.PetrolBunk;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class Shell implements PetrolBunk {
	@Autowired
	//@Qualifier("diesel")
	private PetrolBunk petrolBunk;

	@Override
	public boolean purchase() {
		System.out.println("created purchase mathod");
		return false;
	}

}
