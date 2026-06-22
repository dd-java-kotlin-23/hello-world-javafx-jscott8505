package edu.cnm.deepdive.helloworld.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class MainController {

  @FXML
  private Text currentCount;

  private int counter = 0;

  @FXML
void initialize() {
  currentCount.setText(String.valueOf(counter));
}

  @FXML
  void update(ActionEvent actionEvent) {
    counter++;
    currentCount.setText(String.valueOf(counter));
  }

}
