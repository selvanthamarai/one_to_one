package com.LibraryManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan("com.LibraryManagement")
@EnableAutoConfiguration
@SpringBootApplication
public class OneToOneRelationApplication {

	public static void main(String[] args) {
		SpringApplication.run(OneToOneRelationApplication.class, args);
	}

}
