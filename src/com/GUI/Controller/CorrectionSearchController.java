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
    Functions functions = new Functions();
    if (event.getSource() == Search){
      functions.ChangeScene("../FXML/Correction.fxml", "Correction", event);
    }
  }
}
