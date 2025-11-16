package com.tnsif.di_ioc_qualifier_project6;

import org.springframework.stereotype.Component;

@Component
public class Medicals implements Ordering {

	public void order() {
		System.out.println("Ordering Medical Products");
	}

}
