package com.example.demo;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.employee.model.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AddEmployeeControllerTest {

	@Autowired 
	private User user;

	/*
	 * @Test public void createUser() { User savedUser = user.create(getUser());
	 * User userFromDb = user.findUserByEmpid(savedUser.getEmpid());
	 * assertEquals(savedUser.getEmpname(), userFromDb.getCareerlevel());
	 * assertEquals(savedUser.getDuname(), userFromDb.getWorklocation()); }
	 * 
	 * private User getUser() { User user = new User(); user.setEmpid(11119094);
	 * user.setCareerlevel("10"); user.setDuname("Baro2"); user.setEmpname("shrik");
	 * user.setWorklocation("mumbai"); return user; }
	 */

}

