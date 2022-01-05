package com.cody;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * To start mongodb/brew/mongodb-community now and restart at login:
 *   brew services start mongodb/brew/mongodb-community
 * Or, if you don't want/need a background service you can just run:
 *   mongod --config /usr/local/etc/mongod.conf
 */
@SpringBootApplication
@MapperScan("com.cody.dao")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
