package com.tnsif.di_ioc_qualifier_project6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Customer {
	private int c_id;
	private String c_name;
	
	@Autowired
	@Qualifier("medicals")
	private Ordering ordering;
	
	public void order() {
		ordering.order();
	}
	
	public int getC_id() {
		return c_id;
	}

	public void setC_id(int c_id) {
		this.c_id = c_id;
	}

	public String getC_name() {
		return c_name;
	}

	public void setC_name(String c_name) {
		this.c_name = c_name;
	}

	

}
