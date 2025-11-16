package com.tnsif.di_ioc_qualifier_project6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DiIocQualifierProject6Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext var = SpringApplication.run(DiIocQualifierProject6Application.class, args);
		
		Customer c = var.getBean(Customer.class);
		c.order();
	}

}
