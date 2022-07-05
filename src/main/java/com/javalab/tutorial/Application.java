package com.javalab.tutorial;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Application {

    private final static Logger LOGGER = Logger.getLogger(Application.class.getName());

    public static void main(String[] args) {

        try (InputStream resource=  Application.class.getClassLoader().getResourceAsStream("logging.properties")) {
            LogManager.getLogManager().readConfiguration(resource);

            LOGGER.info("Log INFO level");
            LOGGER.warning("Log WARNING level");
        } catch(IOException e) {
            LOGGER.severe("Error loading logging.properties file");
        }
    }
}
