package com.example.mysqljava.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.mysqljava.UsersAdapterImpl;
import com.example.mysqljava.util.Users;

@RestController
public class UserRestController {
	
	@Autowired
	UsersAdapterImpl usersAdapter;
	
	@RequestMapping(method = RequestMethod.GET, path = "/ws/getUsers")
	public Iterable<Users> fetchAllUsers(){
		return usersAdapter.getUsers();
	}
}
