package com.tnsif.Restcontrol_restAPI;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	//Handling request path
	@GetMapping("/hello")
	public String welcome(@RequestParam(value="name",defaultValue="Java World") String name) {
		return "Hello "+name;
	}
	
	//Handling the path variable
	@GetMapping("/greet/{name}")
	public String Greet(@PathVariable String name) {
		return "Greeting "+name;
		
	}
}
