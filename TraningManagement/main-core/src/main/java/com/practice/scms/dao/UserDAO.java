package com.practice.scms.dao;

import java.util.List;

import com.practice.scms.model.User;

public interface UserDAO {

	public void save(User user);
	
	public void update(User user);
	
	public void deleteByUser(User user);
	
	public void delete(Integer id);
	
	public User find(Integer id);
	
	public List<User>findall();
	
	public List<User>findByProperty(String propertybyname, Object propertybyvalue );
	
}
