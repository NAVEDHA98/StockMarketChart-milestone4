package com.premium.stc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.premium.stc.model.User;
import com.premium.stc.service.UserService;

@RestController
public class UserRestController 
{
	@Autowired
	UserService userService;
	
	@GetMapping("/user/signUp/{userId}/{userName}/{password}/{userType}/{email}/{mobileNumber}/{confirmed}")
	public User storeUserDetails(@PathVariable("userId") int userId, @PathVariable("userName") String userName, @PathVariable("password") String password, @PathVariable("userType") String userType, @PathVariable("email") String email, @PathVariable("mobileNumber") long mobileNumber, @PathVariable("confirmed") boolean confirmed)
	{
		User userDetails = new User(userId, userName, password, userType, email, mobileNumber, confirmed);
		return userService.addUser(userDetails);
	}
}
