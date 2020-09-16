package org.bob.learn;

import lombok.extern.java.Log;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

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