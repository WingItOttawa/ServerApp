package com.wingit.serverapp;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Entry class for SpringApplication
 * @author AveryVine
 * @since 2018-07-05
 */
@SpringBootApplication
public class Main {

    private static final Database DATABASE = Database.getInstance();
    private static final Logger LOGGER = LogManager.getLogger();

    /**
     * Entry point for SpringApplication
     * @param args optional command line arguments
     */
    public static void main(String[] args) {
        LOGGER.info("WingIt Analysis Server initialized");
        SpringApplication.run(Main.class, args);
    }
}
