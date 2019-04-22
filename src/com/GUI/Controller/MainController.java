package com.GUI.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {

  @FXML
  public void MainWindow(ActionEvent e) throws IOException{
    Parent Pane = FXMLLoader.load(getClass().getResource("FXML/Login.fxml"));
    Scene scene = new Scene(Pane);
    Stage window = (Stage) ((Node)e.getSource()).getScene().getWindow();
    window.setTitle("Student Management System");
    window.setScene(scene);
    window.show();
  }

}