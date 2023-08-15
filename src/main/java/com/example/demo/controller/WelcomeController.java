package com.example.demo.controller;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@GetMapping("/welcome")
	public ResponseEntity<String> getMessage(){
		LocalDateTime local=LocalDateTime.now();
		int hour=local.getHour();
		String msg=null;
		if(hour <=12) 
			msg= "good morning Welcome"; 
			
			
		else if(hour <16) 
			msg="good evening";
			
		
		HttpStatus staus=HttpStatus.OK;
		
		ResponseEntity<String> response= new ResponseEntity<String>(msg,staus);
		return response;
	

	}}
