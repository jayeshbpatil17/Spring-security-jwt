package com.patil.controller;

import java.security.Principal;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.patil.entity.User;
import com.patil.service.UserService;


@RestController
@RequestMapping("/home")
public class HomeController {

	@Autowired
	UserService userService;

	Logger LOG = Logger.getLogger("HomeController.class");

	//  http://localhost:8080/home/users
	@GetMapping("/users")
	public String getUser() {
		System.out.println("Getting Users");
		LOG.info("getUser()");
		return "Users : " ;
	}
	
	@GetMapping("/userlist")
	public List<User> getUserList(){
		return userService.getUsers();
	}
	
	@GetMapping("/currentser")
	public String getCurrentUser(Principal principal) {
		return principal.getName();
	}
}
