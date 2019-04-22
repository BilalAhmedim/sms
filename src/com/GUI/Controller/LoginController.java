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
  public void Login(ActionEvent e) throws IOException {
    Parent Pane = FXMLLoader.load(getClass().getResource("FXML/MainWindow.fxml"));
    Scene scene = new Scene(Pane);
    Stage window = (Stage) ((Node)e.getSource()).getScene().getWindow();
    window.setTitle("Student Management System");
    window.setScene(scene);
    window.show();
  }
}