package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SimpleApi extends SpringBootServletInitializer{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        SpringApplication.run(SimpleApi.class, args);
	}

}
