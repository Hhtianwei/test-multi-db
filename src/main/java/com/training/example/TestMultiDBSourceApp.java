package com.training.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.AbstractEnvironment;

@SpringBootApplication
public class TestMultiDBSourceApp {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(TestMultiDBSourceApp.class, args);
        String databaseType = context.getEnvironment().getProperty("app.database.type");

        if ("a".equalsIgnoreCase(databaseType)) {
            System.setProperty(AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME, "postgresql");
        } else {
            System.setProperty(AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME, "mongodb");
        }
    }
}