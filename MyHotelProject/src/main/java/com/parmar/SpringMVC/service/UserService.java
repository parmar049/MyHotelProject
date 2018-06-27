package com.parmar.SpringMVC.service;

import com.parmar.SpringMVC.model.User;

public interface UserService {
	
	public User getUser(String loginId);

	public boolean validateUser(String loginId, String password);
	
	public User getUserDetailsAfterLogin(String loginId,String password) ;
}
