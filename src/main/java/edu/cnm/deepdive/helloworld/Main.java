package edu.cnm.deepdive.helloworld;

import java.net.URL;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

  static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage stage) throws Exception {
    stage.setTitle("Hello World!");
    stage.setResizable(false);
    URL location = getClass().getResource("/layouts/main.fxml");
    FXMLLoader loader = new FXMLLoader(location);
    Scene scene = new Scene(loader.load());
    stage.setScene(scene);
    stage.show();
  }



}
