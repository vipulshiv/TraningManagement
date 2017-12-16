package com.practice.scms.daoimpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.practice.scms.dao.BaseDAO;
import com.practice.scms.dao.UserDAO;
import com.practice.scms.model.User;


@Repository
public class UserDAOImpl extends BaseDAO implements UserDAO{

	
	
	public void save(User user) {
	
		String sql = "insert into users(name, contact ,email, address, loginname, password) values (:name, :contact ,:email, :address, :loginname, :password)";
		
		Map< String, Object> map = new HashMap();
		
		map.put("name", user.getName());
		map.put("contact", user.getContact());
		map.put("email", user.getEmail());
		map.put("address", user.getAddress());
		map.put("loginname", user.getLoginname());
		map.put("password", user.getPassword());
		
		KeyHolder kh = new GeneratedKeyHolder();  // Primary key id generation
		
		SqlParameterSource ps = new MapSqlParameterSource(map);
		getNamedParameterJdbcTemplate().update(sql, ps, kh);
		
		Integer userId = kh.getKey().intValue();
		
		user.setId(userId);
		
	}

	public void update(User user) {
		String query = " update users set name= :name,contact= :contact,email= :email,address= :address,loginname= :loginname,password= :password where id= :id";
		
		Map< String, Object> map = new HashMap();
		
		map.put("name", user.getName());
		map.put("contact", user.getContact());
		map.put("email", user.getEmail());
		map.put("address", user.getAddress());
		map.put("loginname", user.getLoginname());
		map.put("password", user.getPassword());
		map.put("id", user.getId());
		
      KeyHolder kh = new GeneratedKeyHolder();  // Primary key id generation
		
		SqlParameterSource ps = new MapSqlParameterSource(map);
		getNamedParameterJdbcTemplate().update(query, ps, kh);
		
	}

	public void deleteByUser(User user) {
		
		this.delete(user.getId());;
		
	}

	public void delete(Integer id) {
		
		String query = "delete from users where id = :id ";
		
		Map< String, Object> map = new HashMap();
		map.put("id", id);
		
        KeyHolder kh = new GeneratedKeyHolder();  // Primary key id generation
		
		SqlParameterSource ps = new MapSqlParameterSource(map);
		getNamedParameterJdbcTemplate().update(query, ps, kh);
	
	}

	public User find(Integer id) {
		
		/*String sql = "SELECT * FROM users WHERE id = ?";

		  User user = (User)getJdbcTemplate().queryForObject(sql, new Object[] {id },new UserMapper());*/

			return null;
		
		
	}

	
	public List<User> findall() {
		
		
		
		String sql = "select * from users";
	
		List<User> list = new ArrayList<User>();
		
		List<Map<String, Object>> lm = getJdbcTemplate().queryForList(sql);
		
		for (Map map : lm) {
			User user = new User();
			
			user.setName((String) map.get("name"));
			user.setContact((String) map.get("contact"));
			user.setEmail((String) map.get("email"));
			user.setAddress((String) map.get("address"));
			user.setLoginname((String) map.get("loginname"));
			user.setPassword((String) map.get("password"));
			
			list.add(user);
		}
		
		return list;
		}
		
public List<User> findByProperty(String propertybyname, Object propertybyvalue) {
		
		return null;
	}

	}

	
	
