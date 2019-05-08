package com.GUI.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;


public class CorrectionSearchController {
  @FXML
  private Button Search;

  public void Search(ActionEvent event) throws IOException {
    if (event.getSource() == Search){
      Parent pane = FXMLLoader.load(getClass().getResource("../FXML/Correction.fxml"));
      Scene scene = new Scene(pane);
      Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
      window.setTitle("Correction");
      window.setScene(scene);
      window.show();
    }
  }
}
