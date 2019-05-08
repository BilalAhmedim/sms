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

public class MainController {
  @FXML
  private Button Pass_Outs;
  @FXML
  private Button Fees;
  @FXML
  private Button New_Admission;
  @FXML
  private Button Result;
  @FXML
  private Button Correction_Search;
  @FXML
  public void MainWindow(ActionEvent event) throws IOException{
    if (event.getSource() == Pass_Outs) {
      Parent Pane = FXMLLoader.load(getClass().getResource("../FXML/PassOuts.fxml"));
      Scene scene = new Scene(Pane);
      Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
      window.setTitle("Pass Outs Students");
      window.setScene(scene);
      window.show();
    } else if(event.getSource() == Fees){
      Parent pane = FXMLLoader.load(getClass().getResource("../FXML/Fees.fxml"));
      Scene scene = new Scene(pane);
      Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
      window.setTitle("Fees Submission");
      window.setScene(scene);
      window.show();
    }else if(event.getSource() == New_Admission){
      Parent pane = FXMLLoader.load(getClass().getResource("../FXML/NewAdmission.fxml"));
      Scene scene = new Scene(pane);
      Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
      window.setTitle("New Admission");
      window.setScene(scene);
      window.show();
    }else if(event.getSource() == Result){
      Parent pane = FXMLLoader.load(getClass().getResource("../FXML/Result.fxml"));
      Scene scene = new Scene(pane);
      Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
      window.setTitle("Student Results");
      window.setScene(scene);
      window.show();
    }else if(event.getSource() == Correction_Search){
      Parent pane = FXMLLoader.load(getClass().getResource("../FXML/CorrectionSearch.fxml"));
      Scene scene = new Scene(pane);
      Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
      window.setTitle("Search Student for Correction");
      window.setScene(scene);
      window.show();
    }
  }

}