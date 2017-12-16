package com.practice.scms.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

import com.practice.scms.configuration.SpringRootConfig;
import com.practice.scms.dao.UserDAO;
import com.practice.scms.daoimpl.UserDAOImpl;
import com.practice.scms.model.User;
import com.practice.scms.service.UserRegistrationServive;
import com.practice.scms.validation.UserRqst;

@Service
public class UserRegistrationServiveImpl implements UserRegistrationServive{


	@Autowired
	UserDAOImpl userDaoImpl;
	
	public void registerUser(UserRqst userrqst) {
		
		User user =  new User();
		user.setName("test");
		user.setContact("123456");
		user.setEmail(userrqst.getEmail());
		user.setAddress("test");
		user.setLoginname(userrqst.getLoginname());
		user.setPassword(userrqst.getPassword());
		
		userDaoImpl.save(user);
		
	}

}
