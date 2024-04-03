package com.Akhil.Springboot;

import org.springframework.boot.SpringApplication;     // code start execution from here 
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication   //top level annotation that contains many annotations
public class SpringCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCoreApplication.class, args);   //Spring Code wont work if we delete this line 
		System.out.println("\n We can write anything over here");
		
	}

}
