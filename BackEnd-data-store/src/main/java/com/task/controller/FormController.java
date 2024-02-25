package com.task.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.task.entity.User;
import com.task.repository.UserRepository;

import jakarta.servlet.http.HttpSession;

@Controller
public class FormController {
	
	@Autowired
	private UserRepository repo;

	@GetMapping("/")
	public String home() {
		return "index";
	}
	
	@PostMapping("/register")
	public String register(@ModelAttribute User u, HttpSession session)
	{
		System.out.println(u);
		
		repo.save(u);
		
		session.setAttribute("message","User Register Successfully..");
		
		return "success";
//		return "redirect:/";
	}
	
}
