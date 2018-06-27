package com.parmar.SpringMVC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.parmar.SpringMVC.model.User;
import com.parmar.SpringMVC.service.UserService;

@Controller
public class WebController {
	@Autowired
	private UserService userService;
	/*
	 * This method will be called on launch of this application
	 */
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String homePage() {
		return "index";
	}
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String loginPage() {
		return "login";
	}
	@RequestMapping(value="/loginAction",method=RequestMethod.POST)
	public String loginAction(User user) {
		User userDetais=userService.getUserDetailsAfterLogin(user.getLoginId(), user.getPassword());
		if(userDetais!=null) {
			System.out.println(userDetais.getName());
		}
		
		return "home";
	}
	
	
	
}
