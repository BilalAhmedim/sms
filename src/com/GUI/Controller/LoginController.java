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
  private Label errorMsg;

  @FXML
  public void Login(ActionEvent event) throws Exception {
    SQLConnection sqlConnection = new SQLConnection();
    Functions functions = new Functions();

    if (functions.CompareStr(LoginUserName.getText().trim(), sqlConnection.getUserName().trim())
        &&
        functions.CompareStr(LoginUserPassword.getText().trim(), sqlConnection.getUserPassword().trim())
       ) {
      functions.ChangeScene("../FXML/MainWindow.fxml", "Student Management System", event);
    } else {
      errorMsg.setText("Invalid User Name or Password");
    }
  }
}