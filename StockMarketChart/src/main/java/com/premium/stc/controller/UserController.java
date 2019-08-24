package com.premium.stc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.premium.stc.model.Login;
import com.premium.stc.model.User;
import com.premium.stc.service.UserService;

@Controller
public class UserController 
{
	@Autowired
	UserService userService;
	
	@RequestMapping(path="userLogin", method = RequestMethod.GET)
	public String userLogin(Model model)
	{
		Login login = new Login();
		model.addAttribute("login", login);
		return "UserLogin";
	}
	
	@RequestMapping(path="userLoginProcess", method = RequestMethod.POST)
	public String userLoginProcess(Login login)
	{
		List<User> userDetails = userService.getAllUserDetails();
		String type = null;
		
		for(User user:userDetails)
		{
			if(login.getUserName().equals(user.getUserName()) && login.getPassword().equals(user.getPassword()))
			{
				type = user.getUserType();
			}
		}
		
		if(type.equals("user"))
			return "userLandingPage";
		else if(type.equals("admin"))
			return "adminLandingPage";
		else
			return "redirect:userLogin";
	}
}