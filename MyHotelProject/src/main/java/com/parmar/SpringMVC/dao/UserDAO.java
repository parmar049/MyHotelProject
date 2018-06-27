package com.parmar.SpringMVC.dao;

import com.parmar.SpringMVC.model.User;

public interface UserDAO {

	public User getUser(String loginId);
	
	public boolean validateUser(String loginId,String password);
	
	public User getUserDetailsAfterLogin(String loginId,String password) ;
}
