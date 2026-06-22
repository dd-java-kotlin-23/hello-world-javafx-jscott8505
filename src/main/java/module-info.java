module edu.cnm.deepdive.helloworld {

  requires javafx.controls;
  requires javafx.fxml;

  exports edu.cnm.deepdive.helloworld to javafx.graphics;

  opens edu.cnm.deepdive.helloworld to javafx.fxml;
  opens edu.cnm.deepdive.helloworld.controller to javafx.fxml;

}