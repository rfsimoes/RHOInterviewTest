package com.example.demo;


import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MoviesApplication {
	
	 @RequestMapping(value = "/")
	  public List<String> movies() {
		 List<String> list = new ArrayList<String>();
		 list.add("The Shawshank Redemption");
		 list.add("The Godfather ");
		 list.add("The Godfather: Part II ");
		 list.add("The Dark Knight ");
		 list.add("12 Angry Men");
		 
	    return list;
	  }
	
	public static void main(String[] args) {
		SpringApplication.run(MoviesApplication.class, args);
	}
}
