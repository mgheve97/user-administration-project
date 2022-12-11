package com.example.mysqljava.util;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class Users {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="user_id")
	private Integer user_id;
	
	@Column(name="first_name")
	private String first_name;
	
	@Column(name="last_name")
	private String last_name;
	
	@Column(name="username")
	private String username;
	
	@Column(name="userpass")
	private String userpass;

	public Integer getUser_id() {
		return user_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public String getUsername() {
		return username;
	}

	public String getUserpass() {
		return userpass;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setUserpass(String userpass) {
		this.userpass = userpass;
	}

	public Users(String first_name, String last_name, String username, String userpass) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.username = username;
		this.userpass = userpass;
	}
	
	public Users() {
	}

	@Override
	public String toString() {
		return "Users [user_id=" + user_id + ", first_name=" + first_name + ", last_name=" + last_name + ", username="
				+ username + ", userpass=" + userpass + "]";
	}
	
	
	
}
