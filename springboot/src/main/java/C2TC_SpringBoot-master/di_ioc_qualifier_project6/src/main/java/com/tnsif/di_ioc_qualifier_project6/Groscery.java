package com.tnsif.di_ioc_qualifier_project6;

import org.springframework.stereotype.Component;

@Component
public class Groscery implements Ordering {
	
	public void order() {
		System.out.println("Ordering grocery Products...");
	}
	

}
