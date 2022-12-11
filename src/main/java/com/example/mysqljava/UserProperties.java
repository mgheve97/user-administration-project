package com.example.mysqljava;

import com.example.mysqljava.util.Users;

public interface UserProperties {

	Iterable<Users> getUsers();
	
	void setUsers(String first_name, String last_name, String username, String userpass);
	
}
