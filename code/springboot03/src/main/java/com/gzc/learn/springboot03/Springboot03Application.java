package com.gzc.learn.springboot03;

import javafx.application.Application;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Springboot03Application {

    public static void main(String[] args) {
//        SpringApplication.run(Springboot03Application.class, args);

        // 在SpringBootApplication中启动运行JavaFx程序
        Application.launch(JavaFxApplication.class, args);
    }

}
