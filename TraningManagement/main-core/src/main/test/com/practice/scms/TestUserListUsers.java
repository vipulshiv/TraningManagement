package com.practice.scms;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.practice.scms.configuration.SpringRootConfig;
import com.practice.scms.dao.UserDAO;
import com.practice.scms.model.User;

public class TestUserListUsers {

	public static void main(String[] args) {
		
		System.out.println("Start");
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
		
		System.out.println(ctx);
		
		UserDAO userDAO = ctx.getBean(UserDAO.class);
		
	  	List<User> list= userDAO.findall();
		
		for (User user : list) {
			System.out.println(user.getName()+"-"+user.getContact()+"-"+user.getEmail()+"-"+user.getAddress()+"-"+user.getLoginname()+"-"+user.getPassword());
			
		}
	  	
	}

}
