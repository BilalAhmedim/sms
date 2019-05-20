package com.GUI.Controller;

import com.GUI.SQL.SQLConnection;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.sql.SQLException;

public class NewAdmissionController {
  @FXML
  private TextField FirstName;
  @FXML
  private TextField LastName;
  @FXML
  private TextField FName;
  @FXML
  private TextField MName;
  @FXML
  private TextField DOB;
  @FXML
  private TextField Mobile;
  @FXML
  private TextField Address;
  @FXML
  private TextField Tenth;
  @FXML
  private TextField Inter;
  @FXML
  private TextField TC;
  @FXML
  private TextField CC;
  @FXML
  private TextField IC;

  @FXML
  public void Admission() throws Exception {
    SQLConnection sqlConnection = new SQLConnection();
    sqlConnection.setAdmission(FirstName.getText().trim(), LastName.getText().trim(), FName.getText().trim(), MName.getText().trim(), DOB.getText().trim(), Mobile.getText().trim(), Address.getText().trim(), Tenth.getText().trim(), Inter.getText().trim(), TC.getText().trim(), CC.getText().trim(), IC.getText().trim());
  }
}
