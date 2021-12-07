package com.sajal.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sajal.demo.dao.AlienRepo;
import com.sajal.demo.model.Alien;

@Controller
public class AlienController
{
	@Autowired
	AlienRepo repo;
	
	@RequestMapping("/")
	public String home()
	{
		return "home.jsp";
	}
	
	@RequestMapping("/addalien")
	public String addalien(Alien alien)
	{
		repo.save(alien);
		return "home.jsp";
	}
	

}
