package org.bob.learn;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import lombok.extern.java.Log;
import org.apache.commons.lang3.StringUtils;
import org.bob.learn.scene.IndexScene;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import javax.swing.*;

/**
 * 应用启动类
 */
@Log
@SpringBootApplication
public class Application  {
    public static void main(String[] args) {
        log.info("Learn-FX应用启动开始");
        new SpringApplicationBuilder(Application.class).headless(false).web(WebApplicationType.NONE).run(args);
        log.info("Learn-FX应用启动结束");
    }


}
