package com.myprofile.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@EnableAutoConfiguration
@ComponentScan({"com.myprofile.controller,com.myprofile.starter,com.myprofile.emailsender"})

public class MyProfileApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(MyProfileApplication.class, args);
		
		
	}
}
