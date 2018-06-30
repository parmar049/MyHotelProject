package com.parmar.SpringMVC.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.parmar.SpringMVC.dao.UserDAO;
import com.parmar.SpringMVC.model.User;

@Repository
public class UserDAOImpl implements UserDAO{
	@Autowired
	private SessionFactory sessionFactory;
	
	public User getUser(String loginId) {
		
		return (User) sessionFactory.getCurrentSession().get(User.class, loginId);
	}
	public boolean validateUser(String loginId, String password) {
		  List<User> userList = new ArrayList<User>();
	        Query query = sessionFactory.getCurrentSession().createQuery("from User u where u.loginId = :login");
	        query.setParameter("login", loginId);
	        userList = query.list();
	        if (userList.size() > 0)
	            return true;
	        else
	            return false;    
	}

	public User getUserDetailsAfterLogin(String loginId, String password) {
		return (User) sessionFactory.getCurrentSession().get(User.class, loginId);
	}

}
