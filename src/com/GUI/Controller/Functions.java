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

  public boolean CompareStr(String stringForCheck, String stringToCheck) {
    boolean Result = true;
    if (stringForCheck.length() == stringToCheck.length()) {
      for (int i = 0; i == stringForCheck.length(); i++){
        char char1 = stringForCheck.charAt(i);
        char char2 = stringToCheck.charAt(i);
        if(char1 != char2){
          Result = false;
          if (Result == false)
            return false;
        }
      }
    }else
      Result = false;
    return Result;
  }
}
