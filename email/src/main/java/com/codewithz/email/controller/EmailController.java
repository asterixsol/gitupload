package com.codewithz.email.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codewithz.email.model.Book;
import com.codewithz.email.model.Clients;
import com.codewithz.email.services.EmailService;

@CrossOrigin
@RestController
public class EmailController {
	
	@Autowired
	EmailService service;
	
	@PostMapping("/sendEmail")
	public void sendEmail()
	{
		service.sendMail("nzartab@gmail.com", "Test Mail from Spring Boot", "Hey Coding Owl!! This email is sent through Spring!! enjoy..");
	}
	
	@GetMapping("/books")
	public List<Book> getBooks(){
		
		Book b1=new Book(1,"Book 1");
		Book b2=new Book(2, "Book 2");
		
		List<Book> list=new ArrayList<>();
		list.add(b1);
		list.add(b2);
		
		return list;
	}
	
	@GetMapping("/clients")
	public List<Clients> getClients()
	{
		
		Clients c1=new Clients();
		c1.setClientBranch("BOM");
		c1.setClientDOB("13-12-1990");
		c1.setClientId(1);
		c1.setClientName("Zartab");
		c1.setClientOnboardingDate("13-12-2018");
		c1.setClientRM("Test");
		
		Clients c2=new Clients();
		c2.setClientBranch("BLR");
		c2.setClientDOB("14-02-1995");
		c2.setClientId(2);
		c2.setClientName("Tom");
		c2.setClientOnboardingDate("14-09-2013");
		c2.setClientRM("Test1");
		
		List<Clients> l=new ArrayList<>();
		l.add(c1);
		l.add(c2);
		
		return l;
		
	}

}
