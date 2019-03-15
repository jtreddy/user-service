package org.jtr.userservice;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface UserCRUDRepository extends CrudRepository  <User, Long>, UserRepositoryCustom  {
	
	//public Optional <User> findById(Long id);
	List<User> findByNameIgnoreCase(String name);
   List<User> findByLowerName (String name); //@NAmedQry
   
}
