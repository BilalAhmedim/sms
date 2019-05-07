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
    if(event.getSource() == Home){
      Parent Pane = FXMLLoader.load(getClass().getResource("../FXML/MainWindow.fxml"));
      Scene scene = new Scene(Pane);
      Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
      window.setTitle("Student Management System");
      window.setScene(scene);
      window.show();
    }else if (event.getSource() == Pass_Outs) {
      Parent Pane = FXMLLoader.load(getClass().getResource("../FXML/PassOuts.fxml"));
      Scene scene = new Scene(Pane);
      Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
      window.setTitle("Student Pass Outs");
      window.setScene(scene);
      window.show();
    } else if(event.getSource() == Fees){
      Parent Pane = FXMLLoader.load(getClass().getResource("../FXML/Fees.fxml"));
      Scene scene = new Scene(Pane);
      Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
      window.setTitle("Fees Submission");
      window.setScene(scene);
      window.show();
    }else if(event.getSource() == New_Admission){
      Parent Pane = FXMLLoader.load(getClass().getResource("../FXML/NewAdmission.fxml"));
      Scene scene = new Scene(Pane);
      Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
      window.setTitle("New Admission");
      window.setScene(scene);
      window.show();
    }else if(event.getSource() == Correction_Search){
      Parent Pane = FXMLLoader.load(getClass().getResource("../FXML/Correction_Search.fxml"));
      Scene scene = new Scene(Pane);
      Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
      window.setTitle("Correction Search");
      window.setScene(scene);
      window.show();
    }else if(event.getSource() == Result){
      Parent Pane = FXMLLoader.load(getClass().getResource("../FXML/Result.fxml"));
      Scene scene = new Scene(Pane);
      Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
      window.setTitle("Student Results");
      window.setScene(scene);
      window.show();
    }else if(event.getSource() == About){
      Parent Pane = FXMLLoader.load(getClass().getResource("../FXML/About.fxml"));
      Scene scene = new Scene(Pane);
      Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
      window.setTitle("About Us");
      window.setScene(scene);
      window.show();
    }
  }
}
