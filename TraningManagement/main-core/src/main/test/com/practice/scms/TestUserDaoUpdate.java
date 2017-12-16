package com.practice.scms;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.practice.scms.configuration.SpringRootConfig;
import com.practice.scms.dao.UserDAO;
import com.practice.scms.model.User;

public class TestUserDaoUpdate {

	public static void main(String[] args) {
		
AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
		
		System.out.println(ctx);
		
		UserDAO userDAO = ctx.getBean(UserDAO.class);
		
		User user = new User();
		
		user.setName("Anku");
		user.setContact("8813");
		user.setEmail("bramha@gmail.com");
		user.setAddress("Pune");
		user.setLoginname("shiv");
		user.setPassword("baba");
		user.setId(6);
		
		userDAO.update(user);
		
		System.out.println("User Updated");
		
		ctx.close();
		
	}

}
