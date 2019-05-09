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

public class MenuController {
  @FXML
  private Button Home;
  @FXML
  private Button Pass_Outs;
  @FXML
  private Button Fees;
  @FXML
  private Button New_Admission;
  @FXML
  private Button Correction_Search;
  @FXML
  private Button Result;
  @FXML
  private Button About;
  @FXML
  private Button Close;
  @FXML
  public void changeScene(ActionEvent event) throws IOException {
    Functions functions = new Functions();
    if(event.getSource() == Home){
      functions.ChangeScene("../FXML/MainWindow.fxml", "Student Management System", event);
    }else if (event.getSource() == Pass_Outs) {
      functions.ChangeScene("../FXML/PassOuts.fxml", "Pass Outs Students", event);
    } else if(event.getSource() == Fees){
      functions.ChangeScene("../FXML/Fees.fxml", "Fees Submission", event);
    }else if(event.getSource() == New_Admission){
      functions.ChangeScene("../FXML/NewAdmission.fxml", "New Admission", event);
    }else if(event.getSource() == Result){
      functions.ChangeScene( "../FXML/Result.fxml", "Student Results", event);
    }else if(event.getSource() == Correction_Search){
      functions.ChangeScene("../FXML/CorrectionSearch.fxml", "Search Student for Correction", event);
    }else if(event.getSource() == Result){
      functions.ChangeScene("../FXML/Result.fxml","Student Results", event);
    }else if(event.getSource() == About){
      functions.ChangeScene("../FXML/About.fxml", "About Us", event);
    }
  }
}
