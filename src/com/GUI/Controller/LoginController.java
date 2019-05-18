package com.GUI.Controller;

import com.GUI.SQL.SQLConnection;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class LoginController {
  @FXML
  private TextField LoginUserName;
  @FXML
  private PasswordField LoginUserPassword;
  @FXML
  private Label UserNameError;
  @FXML
  private Label PasswordError;
  @FXML
  private Button Login;
  @FXML
  public void Login(ActionEvent event) throws Exception {
    SQLConnection sqlConnection = new SQLConnection();
    Functions functions = new Functions();

    if (LoginUserName.getText() == sqlConnection.getUserName() && LoginUserPassword.getText() == sqlConnection.getPassword()) {
      functions.ChangeScene("../FXML/MainWindow.fxml", "Student Management System", event);
    }else{
      System.out.println("Invalid User Name or Password.");
      System.out.println("Entered User Name: " + sqlConnection.getUserName() +" -> "+ LoginUserName.getText());
      System.out.println("Entered User Passsword: " + sqlConnection.getPassword() +" -> "+ LoginUserPassword.getText());
    }
  }
}