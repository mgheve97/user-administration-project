package com.example.mysqljava;

import com.example.mysqljava.UsersAdapterImpl;
import com.example.mysqljava.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.example.mysqljava.util.Users;

@Component
public class UsersAdapterImpl implements UserProperties{
	
	@Bean
	UsersAdapterImpl usersAdapter() {
		return new UsersAdapterImpl();
	}
	
	@Autowired
	private IUsers getUsers;
	
	@Autowired
	private IUsers setUsers;

	@Override
	public Iterable<Users> getUsers() {
		return this.getUsers.findAll();
	}

	@Override
	public void setUsers(String first_name, String last_name, String username, String userpass) {
		Users user = new Users(first_name, last_name, username, userpass);
		setUsers.save(user);
	}
	
	
	
	
}
