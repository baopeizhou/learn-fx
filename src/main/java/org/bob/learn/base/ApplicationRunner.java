package org.bob.learn.base;

import com.sun.javafx.application.PlatformImpl;
import javafx.application.Application;
import org.bob.learn.scene.IndexScene;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

/**
 * 后台加载->前台加载
 */
@Component
public class ApplicationRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        Application.launch(IndexScene.class, args);
    }
}
