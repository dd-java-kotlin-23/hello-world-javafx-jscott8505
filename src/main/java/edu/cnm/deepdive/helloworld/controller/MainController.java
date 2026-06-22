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
    updateCounterDisplay(false);
  }

  @FXML
  void update(ActionEvent actionEvent) {
    counter++;
    updateCounterDisplay(true);
  }

  @FXML
  void reset(ActionEvent actionEvent) {
    counter = 0;
    updateCounterDisplay(false);
  }

  private void updateCounterDisplay(boolean value) {
    currentCount.setText(String.valueOf(counter));
    currentCount.setVisible(value);
  }

}
