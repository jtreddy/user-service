package org.jtr.userservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

//@Service 
 @Service("UserService")
// @Service("userService")  

public class UserServiceImpl implements UserService {

						/* @Autowired // JDBCTEmplate
						 UserRepository userRepository;*/
 

						/* @Override
						 public User findById(Long id) {
						  
						// return userRepository.findByID(id);
						 }*/
	 @Autowired
	 UserCRUDRepository userCRUDRepository ;
	 //
	 @Override
	 public User findById (Long id) {
	  
	return userCRUDRepository.findById( id).get() ;
	 }
	@Override
	public List<User> findByNameIgnoreCase(String name) {
		return  userCRUDRepository.findByNameIgnoreCase(name) ;
	}
	//
	@Override
	public List<User> findByLowerName(String name) {
		return  userCRUDRepository.findByLowerName(name) ;
	}
	
	@Override
	public List<User> getUserByNameCity(String name, String address) {

		return  userCRUDRepository.findUserbyAddressAndName( name, address) ;
	}
	@Override
	public ResponseEntity <String> createUser(User user) {
		User savedUser =   userCRUDRepository.save(user);
		if(savedUser!=null)
        {
         return ResponseEntity.status(HttpStatus.CREATED).build();
     }
     return ResponseEntity.status(HttpStatus.I_AM_A_TEAPOT).build();
 }
	
	@Override
	public ResponseEntity<Object> updateUserByID(User user, long id) {
	Optional <User> user1 = 	userCRUDRepository.findById(id) ;
	
	if ( user1 !=null){
		user.setId(id);
		userCRUDRepository.save(user);
		 return ResponseEntity.status(HttpStatus.ACCEPTED).build();
	}
		
	 return ResponseEntity.status(HttpStatus.I_AM_A_TEAPOT).build();
	}
	
	
	
}
