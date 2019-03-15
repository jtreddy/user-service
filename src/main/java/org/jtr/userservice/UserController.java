package org.jtr.userservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class UserController {

	@Autowired
	UserService userService;
	 
	 @RequestMapping(value = "/user/{id}", method =RequestMethod.GET )
	 public User getUserByID(@PathVariable("id") long id) {
	 return userService.findById(id);
	 } 
	 
	 @RequestMapping(value = "/userByName/{name}", method =RequestMethod.GET )
	 public List<User> getUserByName(@PathVariable("name") String name) {
	 return userService.findByNameIgnoreCase(name);
	 }
	 
	 @RequestMapping(value = "/userByLowerName/{name}", method =RequestMethod.GET )
	 public List<User> getUserByLowerName(@PathVariable("name") String name) {
	 return userService.findByLowerName(name);
	 }
	 
	 @RequestMapping(value = "/userbynamecity", method =RequestMethod.GET)
	 public List<User> getUserByNameCity(@RequestParam(value="name",required=false) String name,@RequestParam(value="address",required=false) String address) {
	  return userService.getUserByNameCity(name, address);  
	 
	 }
	 
	 @RequestMapping(value = "/newUser", method = RequestMethod.POST)
     public ResponseEntity < String > createUser(@RequestBody User user) {        
           
         return userService.createUser(user);
     }
	 
	 @RequestMapping(value = "/updateUser/{id}", method =RequestMethod.PUT)
	 public ResponseEntity<Object> updateUserByID(@RequestBody User user, @PathVariable("id") long id) {
	    return userService.updateUserByID(user,id);  
	  
	 }
	 
	 
}
