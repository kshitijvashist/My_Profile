package com.myprofile.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myprofile.dto.EmailSender;
import com.myprofile.emailsender.EmailService;

@Controller
@RequestMapping("/MyProfile")
public class MyProfileController {
	@RequestMapping("/Kshitij")
	public String getData()
	{
		System.out.println("hiiiiiiiiiiiiiiiiiiiiiiiiiirrrrrrrriiiiii");
		return "index";
	}
	
	
	@Autowired
	EmailService service;
	@PostMapping("/email")
    public String greetingSubmit(@ModelAttribute EmailSender email) {
		System.out.println("hiiiiiiiiiiiiiiiiiiiiii"+email.getEmail());
       
		service.sendSimpleMessage(email.getEmail(),email.getFullName(),email.getMessage());
		
		
		return "index";
    }
	
	
}

