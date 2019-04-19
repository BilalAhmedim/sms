package com.GUI;

import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;

import java.io.IOException;

public class LoginController {
  @FXML
  private Button Login;
  @FXML
  private TextField LoginUserName;
  @FXML
  private Label UserNameError;
  @FXML
  private Label PasswordError;
  @FXML
  private PasswordField LoginUserPassword;
  @FXML
  private boolean User, Password;
  @FXML
  private GridPane LoginPane;

  @FXML
  public void initialize() {
    User = false;
    Password = false;
  }

  @FXML
  public void Login(ActionEvent e) throws IOException {
    Parent Pane = FXMLLoader.load(getClass().getResource("FXML/MainWindow.fxml"));
    Scene scene = new Scene(Pane);
    Stage window = (Stage) ((Node)e.getSource()).getScene().getWindow();
    window.setScene(scene);
    window.show();
  }
}