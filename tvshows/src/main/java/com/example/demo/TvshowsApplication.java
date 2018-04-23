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
public class TvshowsApplication {
	
	 @RequestMapping(value = "/")
	  public List<String> tvshows() {
		 List<String> list = new ArrayList<String>();
		 list.add("Band of Brothers");
		 list.add("Game of Thrones");
		 list.add("Breaking Bad");
		 list.add("The Wire ");
		 list.add("Rick and Morty");
		 
	    return list;
	  }

	public static void main(String[] args) {
		SpringApplication.run(TvshowsApplication.class, args);
	}
}
