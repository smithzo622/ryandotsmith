package com.ryansmith.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.mail.Message;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.mail.*;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessagePreparator;

import com.ryansmith.types.Email;

@Controller
public class WebController {
	

	private JavaMailSender mailSender;
	
	@RequestMapping(value="/index")
	public String home(Model model){
		
		model.addAttribute("email", new Email());
		return "index";
	}
	
	@RequestMapping(value="/contact", method=RequestMethod.POST)
	public String contact(Email email, Model model){
		
		System.out.println(email.getName());
		System.out.println("Email: " + email.getEmail());
		System.out.println("Message: " + email.getMessage());
		
		//TODO: implement email functionality
		
		return "redirect:index";
	}

}
