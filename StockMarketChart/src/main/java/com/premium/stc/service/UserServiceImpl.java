package com.premium.stc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.premium.stc.dao.*;
import com.premium.stc.model.User;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	public User addUser(User user){
		return userDao.save(user);
	}

	public List<User> getAllUserDetails() {
		return userDao.findAll();
	}
}
