import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.application.Application;
import java.io.File;

public class Main extends Application {
  public static void main(String[] args){
    launch(args);
  }

  @Override
  public void start(Stage PrimaryStage) throws Exception {
    FXMLLoader loader = new FXMLLoader(new File("src/com/GUI/Login.fxml").toURI().toURL());
    Parent root = loader.load();
    PrimaryStage.setTitle("Login");
    PrimaryStage.setScene(new Scene(root, 650, 400));
    PrimaryStage.show();
  }
}