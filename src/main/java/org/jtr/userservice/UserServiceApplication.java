package org.jtr.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}

}

/*************************************************************************
spring.h2.console.enabled=true

 			
Make sure that you use
 jdbc:h2:mem:testdb   ............. as JDBC URL.

5) populate some data into student table by adding a file called data.sql
/src/main/resources/data.sql

insert into user values(100,'visualpath', 'hyderabad');
insert into user values(101,'Noel', 'Hyderabad');


http://localhost:8080/h2-console
http://localhost:8080/user/100
**************************************************/


