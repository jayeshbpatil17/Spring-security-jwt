package com.patil.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.patil.entity.User;

@Service
public class UserService {
	
	List<User> store = new ArrayList<>();
	public UserService() {
		// TODO Auto-generated constructor stub
		store.add(new User(UUID.randomUUID().toString(),"Jayesh","jayesh@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(),"Ram","Ram@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(),"Shyam","Shyam@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(),"Sita","Sita@gmail.com"));
	}
	
	public List<User> getUsers(){
		return this.store;
	}
	
}
