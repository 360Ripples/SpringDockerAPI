// https://springframework.guru/spring-framework-annotations/

package com.example.demo.rest;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class HelloWorldService {
	

	@RequestMapping("/sayHello")
	public String sayHello() {
		return "Say Hello";
	}

	// hit this service from a browser using the url
	// http://localhost:8080/sayHelloUser?name="shanmu"
	@RequestMapping("/sayHelloUser")
	public String sayHello(@RequestParam(value = "name", defaultValue = "Jackson") String nam,
			@RequestParam(value = "phone", required = true) String phone) {
		return "Say Hello to " + nam + " Phone:" + phone;
	}

	// http://localhost:8080/sayHello2/105110/23456
	@RequestMapping("/sayHello2/{empid}/{rollid}")
	public String sayHello(@PathVariable("empid") int id, @PathVariable("rollid") int rollId) {
		return "Say Hello To employee ->" + id + " Roll Id->" + rollId;
	}


}