package org.jtr.userservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class UserRepositoryJDBCTemplate {

	
	@Autowired 
	 JdbcTemplate jdbcTemplate;  
	 
	 public User findByID(Long id) {
	  
	  return jdbcTemplate.queryForObject("select * from user where id=?", new Object[] { id },
	    new BeanPropertyRowMapper<User>(User.class));
	  
	 }
}
