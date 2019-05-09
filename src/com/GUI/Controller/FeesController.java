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
    Functions functions = new Functions();
    functions.ChangeScene("../FXML/FeesRecords.fxml", "Fees Submission", event);
  }
}
