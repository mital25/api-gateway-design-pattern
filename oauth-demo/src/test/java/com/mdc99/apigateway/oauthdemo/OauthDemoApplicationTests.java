package com.mdc99.apigateway.oauthdemo;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootTest
class OauthDemoApplicationTests {

	@Test
	void contextLoads() {
	}

	/*
	 * @Test public void crateUser() { User user = new User();
	 * user.setEmail("hello@gmail.com"); //
	 * user.setPassword(passwordEncoder.encode("123")); user.setPassword("123");
	 * user.setFirstName("Guddu"); user.setLastName("Pandit");
	 * user.setMobile("8888899999");
	 * 
	 * List<Role> roleList = new ArrayList<>();
	 * 
	 * Role role = new Role(); role.setName("ADMIN");
	 * role.setDescription("Administrator"); roleList.add(role);
	 * 
	 * Role role1 = new Role(); role1.setName("USER"); role1.setDescription("User");
	 * roleList.add(role1);
	 * 
	 * user.setRoles(roleList); userRepository.save(user); }
	 */
}
