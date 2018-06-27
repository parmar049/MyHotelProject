package com.parmar.SpringMVC.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parmar.SpringMVC.dao.UserDAO;
import com.parmar.SpringMVC.model.User;
import com.parmar.SpringMVC.service.UserService;
@Service

public class UserServiceImpl implements UserService{
	@Autowired
	private UserDAO userDAO;
	public User getUser(String loginId) {
		return userDAO.getUser(loginId);
	}

	public boolean validateUser(String loginId, String password) {
		return userDAO.validateUser(loginId, password);
	}

	public User getUserDetailsAfterLogin(String loginId,String password) {
		boolean isValidUser=userDAO.validateUser(loginId, password);
		if(isValidUser)
			return userDAO.getUser(loginId);
		else 
			return null;
	}
	
	
}
