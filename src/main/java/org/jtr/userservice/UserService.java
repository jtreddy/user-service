package org.jtr.userservice;

import java.util.List;

import org.springframework.http.ResponseEntity;

public interface UserService {
	 public User findById(Long id);

	public List<User> findByNameIgnoreCase (String name);// methodname derivation
	public List<User> findByLowerName (String name); //@NAmedQry
	public List<User> getUserByNameCity(String name,String  address) ;
	ResponseEntity < String > createUser(User user);
	
	ResponseEntity < Object > updateUserByID (User user, long id) ;

}
