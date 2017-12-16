package com.practice.scms;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.practice.scms.configuration.SpringRootConfig;
import com.practice.scms.dao.UserDAO;
import com.practice.scms.model.User;

public class TestUserDaoDeleteByUser {

	public static void main(String[] args) {
		

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
		
		System.out.println(ctx);
		
		UserDAO userDAO = ctx.getBean(UserDAO.class);
		
		User user = new User();
		
		user.setId(18);
		userDAO.deleteByUser(user);
		System.out.println("User Deleted");
	}

}
