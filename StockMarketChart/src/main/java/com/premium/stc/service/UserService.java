package com.premium.stc.service;

import java.util.List;

import com.premium.stc.model.User;

public interface UserService {
	 public User addUser(User user);
	 
	 public List<User> getAllUserDetails();
}
