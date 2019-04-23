package com.GUI.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class FeesController {
  @FXML
  public void changeScene(ActionEvent event) throws IOException {
    Parent pane = FXMLLoader.load(getClass().getResource("../FXML/FeesRecords.fxml"));
    Scene scene = new Scene(pane);
    Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
    window.setTitle("Fees Submission");
    window.setScene(scene);
    window.show();
  }
}
