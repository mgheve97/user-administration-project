package com.example.mysqljava.controller;

import javafx.scene.control.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.mysqljava.UsersAdapterImpl;
import com.example.mysqljava.util.Users;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

@Controller
public class AppController {
	
	@Autowired
	UsersAdapterImpl usersAdapter;
	
	@FXML
	private TableView<Users> tableView;
	@FXML
	TextField firstNameField;
	@FXML
	TextField lastNameField;
	@FXML
	TextField usernameField;
	@FXML
	TextField passwordField;
	
	
	public void addUser() {
		usersAdapter.setUsers(
				firstNameField.getText(), 
				lastNameField.getText(), 
				usernameField.getText(), 
				passwordField.getText());
		
		firstNameField.setText("");
		lastNameField.setText("");
		usernameField.setText("");
		passwordField.setText("");
	}
	
	public void getUsers(ActionEvent event) {
		
		Iterable<Users> users = usersAdapter.getUsers();
		ObservableList<Users> data = tableView.getItems();
		data.clear();
		users.forEach((user -> data.add(user)));
	}
}
