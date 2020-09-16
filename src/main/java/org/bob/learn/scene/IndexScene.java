package org.bob.learn.scene;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import org.apache.commons.lang3.StringUtils;
import org.bob.learn.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;

public class IndexScene extends Application {

    @Autowired
    private AuthService authService;


    Label usernameLabel = new Label("用户名");
    TextField usernameField = new TextField();

    Label passwordLabel = new Label("密  码");
    TextField passwordField = new TextField();

    Button confirmButton = new Button("确定");
    Button cancelButton = new Button("取消");
    @Override
    public void start(Stage primaryStage) throws Exception {

        confirmButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String username = usernameField.getText();
                String password = usernameField.getText();
                if(StringUtils.isBlank(username)) {
                    Object[] options = { "OK ", "CANCEL " };
                    JOptionPane.showOptionDialog(null, "请输入用户名", "提示", JOptionPane.DEFAULT_OPTION,
                            JOptionPane.WARNING_MESSAGE,null, options, options[0]);
                }
                if(StringUtils.isBlank(password)) {
                    Object[] options = { "OK ", "CANCEL " };
                    JOptionPane.showOptionDialog(null, "请输入密码", "提示", JOptionPane.DEFAULT_OPTION,
                            JOptionPane.WARNING_MESSAGE,null, options, options[0]);
                }
                boolean authResult = authService.auth(username,password);
                if(!authResult){
                    Object[] options = { "OK ", "CANCEL " };
                    JOptionPane.showOptionDialog(null, "用户名或密码错误，请重新输入", "提示", JOptionPane.DEFAULT_OPTION,
                            JOptionPane.WARNING_MESSAGE,null, options, options[0]);
                }
            }
        });



        StackPane root = new StackPane();
        root.getChildren().add(usernameLabel);
        root.getChildren().add(usernameField);
        root.getChildren().add(passwordLabel);
        root.getChildren().add(passwordField);
        root.getChildren().add(confirmButton);
        root.getChildren().add(cancelButton);
        Scene scene = new Scene(root, 400, 300);
        primaryStage.setTitle("Redis RDB Analyzer");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void onConfirmButton()
    {


    }

    private void onCancelButton()
    {
        usernameField.setText("");
        passwordField.setText("");

    }


}
