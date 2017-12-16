/*package com.practice.scms.daoimpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.practice.scms.dao.BaseDAO;
import com.practice.scms.dao.CourseDAO;
import com.practice.scms.model.Course;

@Repository
public class CourseDAOImpl  extends BaseDAO implements CourseDAO {

	public void saveCourse(Course course) {
		
		

		String sql="insert into courses(userid,title,duration,description) values(:userid, :title, :duration, :description)";
		
		Map<String,Object> map= new HashMap();
		map.put("userid", course.getUserid());
		map.put("title", course.getTitle());
		map.put("duration",course.getDuration());
		map.put("description", course.getDescription());
		
		KeyHolder kh= new GeneratedKeyHolder();
		
		SqlParameterSource ps= new MapSqlParameterSource(map);
		
		getNamedParameterJdbcTemplate().update(sql,ps,kh);
		
		Integer userid=kh.getKey().intValue();
		course.setId(userid);
		
		
	}

	public void updateCourse(Course course) {
		
		
		 String sql="update courses set title=:title, duration=:duration, description=:description where id=:id";
			
			Map<String,Object> map= new HashMap();
			
			map.put("title", course.getTitle());
			map.put("duration",course.getDuration());
			map.put("desecription", course.getDescription());
			map.put("id",course.getId());
			
			KeyHolder kh= new GeneratedKeyHolder();
			
			SqlParameterSource ps= new MapSqlParameterSource(map);
			
			getNamedParameterJdbcTemplate().update(sql,ps,kh);
			
			
		
		
	}

	public void deleteCourse(Course course) {
		getJdbcTemplate().update("DELETE FROM courses WHERE id = ?",
				new Object[] {course.getId() });
	
	}

	public void deleteCourseById(Integer id) {
		
		
		String sql="delete from  courses where id= :id";
		Map<String,Object> map= new HashMap();
		map.put("id",id );
        KeyHolder kh= new GeneratedKeyHolder();
		
		SqlParameterSource ps= new MapSqlParameterSource(map);
		
		getNamedParameterJdbcTemplate().update(sql,ps,kh);
	}

	public Course find(Integer id) {
	

		String sql = "SELECT * FROM courses WHERE id = ?";

	  Course course = (Course)getJdbcTemplate().queryForObject(
			  
				sql, new Object[] {id },
				new BeanPropertyRowMapper(Course.class));

		return course;
		
		
	}

	public List<Course> findaAll() {
		String sql = "SELECT * FROM courses";

		List<Course> courses= new ArrayList();

		List<Map<java.lang.String, Object>> rows = getJdbcTemplate().queryForList(sql);
		
		for (Map row : rows) {
			Course course = new Course();
			
			
			course.setTitle((String)(row.get("title")));
			course.setDuration((Integer)(row.get("duration")));
			course.setDescription((String)(row.get("description")));

			courses.add(course);
		}
		
		return courses;
	}

	public List<Course> findbyProparty(String propartyName, Object propartyValue) {
		// TODO Auto-generated method stub
		return null;
	}

}
*/