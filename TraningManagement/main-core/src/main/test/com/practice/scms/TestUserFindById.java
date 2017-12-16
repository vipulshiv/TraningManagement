package com.practice.scms;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.practice.scms.configuration.SpringRootConfig;
import com.practice.scms.dao.UserDAO;
import com.practice.scms.model.User;

public class TestUserFindById {
	
	
	public static void main(String[] args) {
		
		System.out.println("Start");
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
		
		System.out.println(ctx);
		
		UserDAO userDAO = ctx.getBean(UserDAO.class);
		User user = new User();
		
		userDAO.find(2);
		
		System.out.println(user.getName()+"-"+user.getContact()+"-"+user.getEmail()+"-"+user.getAddress()+"-"+user.getLoginname()+"-"+user.getPassword());
		
	}

}
