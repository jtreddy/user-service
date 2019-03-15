package org.jtr.userservice;

import java.util.List;

public interface UserRepositoryCustom {
	
	List <User> findUserbyAddressAndName( String name, String city);

}
