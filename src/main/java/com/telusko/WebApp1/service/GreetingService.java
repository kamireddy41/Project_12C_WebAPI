package com.telusko.WebApp1.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service
public class GreetingService implements IGreetingService
{

	@Override
	public String getGreetings(String name) 
	{
		LocalDateTime dateTime = LocalDateTime.now();
		int hour=dateTime.getHour();
		
		if(hour<12)
	
			return "Hello! "+ name+ " Have a great morning";
		
		else if(hour<16)
			return "Hello! "+ name+ " Have a great Noon";
		
		else if(hour<20)
			return "Hello! "+ name+ " Have a great Evening";
		else
			return "Hello! "+ name+ " Have a great night";

	}
	

}
