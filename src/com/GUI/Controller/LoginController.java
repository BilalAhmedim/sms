package com.GUI.Controller;

import javafx.scene.Node;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;

public class LoginController {

  @FXML
  public void Login(ActionEvent event) throws IOException {
    Functions functions = new Functions();
    functions.ChangeScene("../FXML/MainWindow.fxml", "Student Management System", event);
  }
}