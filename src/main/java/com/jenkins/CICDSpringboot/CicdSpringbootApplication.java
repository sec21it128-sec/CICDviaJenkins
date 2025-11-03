package com.jenkins.CICDSpringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CicdSpringbootApplication {
	
   
	public static void main(String[] args) { 
		System.out.println("This is a basic CI/CD Application "); 
		System.out.println("We deploy it on github and ensure CI/CD via jenkins");
		
		
	}

}
