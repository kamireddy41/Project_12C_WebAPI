package com.telusko.WebApp1.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.telusko.WebApp1.service.IGreetingService;

import jakarta.servlet.http.HttpServletResponse;

@Controller
public class DemoController1 
{

	@Autowired
	private IGreetingService service;
	
//	@GetMapping("/greet1")
//	public String getMeWish(Map<String, Object> map)
//	{
//		map.put("g1", service.getGreetings("Renuka"));
//		return "greetings1";
//	}
	
	@GetMapping("/greet1")
	public String getMeWishPost(Map<String, Object> map)
	{
		map.put("g1", service.getGreetings("Renuka"));
		return "greetings1";
	}
	
//	@PostMapping("/greet1")
//	public void getMeWish(Map<String, Object> map)
//	{
//		//String msg=service.getGreetings("Renuka");
//		map.put("g1", service.getGreetings("Renuka"));
//		return ;
//	}
	
	@GetMapping("/greet2")
	public Map<String, Object> getMeWish()
	{
		Map<String, Object> map=new HashMap<>();
		
		map.put("g2", service.getGreetings("Shweta"));
		return map;
	}
	
	@GetMapping("/greet3")
	public void getMeWish(HttpServletResponse response) throws IOException
	{
		PrintWriter writer = response.getWriter();
		writer.println("<h1> Hello this is response directly coming from controller using servlets "+service.getGreetings("Vibhuti")+ "</h1>");
	}
	
	
}
