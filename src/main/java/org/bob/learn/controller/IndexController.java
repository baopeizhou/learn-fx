package org.bob.learn.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class IndexController {

    @FXML
    private TextField usernameTF;

    @FXML
    private TextField passwordTF;

    @FXML
    private Button loginB;

    @FXML
    private Button cancelB;

    @FXML
    private void initialize() {
        usernameTF.setText("");
        passwordTF.setText("");
    }

}
