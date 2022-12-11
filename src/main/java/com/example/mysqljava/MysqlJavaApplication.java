package com.example.mysqljava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

@SpringBootApplication
public class MysqlJavaApplication extends Application{
	
	@Autowired
	UsersAdapterImpl usersAdapter;
	
	private ConfigurableApplicationContext springContext;
	private Parent rootNode;
	private FXMLLoader fxmlLoader;
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void init() throws Exception {
		springContext = SpringApplication.run(MysqlJavaApplication.class);
		fxmlLoader = new FXMLLoader();
		fxmlLoader.setControllerFactory(springContext::getBean);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		fxmlLoader.setLocation(getClass().getResource("/fxml/scene.fxml"));
		rootNode = fxmlLoader.load();
		primaryStage.setTitle("User Administration");
		Scene scene = new Scene(rootNode, 600, 650);
		primaryStage.setScene(scene);
		primaryStage.show();
	}	
	
	
	
}
