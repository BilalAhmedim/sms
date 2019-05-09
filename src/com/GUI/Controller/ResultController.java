package com.GUI.Controller;

import javafx.event.ActionEvent;

import java.io.IOException;

public class ResultController {
  public void changeScene(ActionEvent event) throws IOException {
    Functions functions = new Functions();
    functions.ChangeScene("../FXML/Result","Student Result", event);
  }
}
