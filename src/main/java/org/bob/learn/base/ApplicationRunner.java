package org.bob.learn.base;

import javafx.application.Application;
import org.bob.learn.client.ClientApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * 后台加载->前台加载
 */
@Component
public class ApplicationRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        Application.launch(ClientApplication.class, args);
    }
}
