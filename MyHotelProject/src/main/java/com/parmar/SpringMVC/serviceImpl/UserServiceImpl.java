package com.parmar.SpringMVC.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.parmar.SpringMVC.dao.UserDAO;
import com.parmar.SpringMVC.model.User;
import com.parmar.SpringMVC.service.UserService;
@Service
//@Transactional
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDAO userDAO;
	@Transactional
	public User getUser(String loginId) {
		return userDAO.getUser(loginId);
	}
	@Transactional
	public boolean validateUser(String loginId, String password) {
		return userDAO.validateUser(loginId, password);
	}
	@Transactional
	public User getUserDetailsAfterLogin(String loginId,String password) {
		boolean isValidUser=userDAO.validateUser(loginId, password);
		System.out.println("User Validated :"+isValidUser);
		if(isValidUser)
			return userDAO.getUser(loginId);
		else 
			return null;
	}
	
	
}
