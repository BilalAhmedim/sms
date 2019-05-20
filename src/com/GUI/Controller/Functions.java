package com.GUI.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Functions {
  public void ChangeScene(String Location, String Title, ActionEvent event) throws IOException {
    Parent Pane = FXMLLoader.load(getClass().getResource(Location));
    Scene scene = new Scene(Pane);
    Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
    window.setTitle(Title);
    window.setScene(scene);
    window.show();
  }

  public boolean CompareStr(String orignalString, String chechString) {
    boolean Result = true;
    if (orignalString.length() == chechString.length() && orignalString.equals(chechString)) {
      Result = true;
    }else{
      Result = false;
    }
    return Result;
  }
}
