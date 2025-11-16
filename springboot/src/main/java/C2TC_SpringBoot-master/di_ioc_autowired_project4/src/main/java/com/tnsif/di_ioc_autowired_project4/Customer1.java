package com.tnsif.di_ioc_autowired_project4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customer1 {
	private int c_id;
	private String c_name;
	
	@Autowired
	Customer2 c2;
	@Autowired
	Customer3 c3;
	
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
	
	
	public void show() {
		System.out.println("Customer 1 Object");
		c2.show();
		c3.show();
	}

}
