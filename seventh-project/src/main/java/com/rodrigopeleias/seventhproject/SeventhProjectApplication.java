package com.rodrigopeleias.seventhproject;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAdminServer
@SpringBootApplication
public class SeventhProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeventhProjectApplication.class, args);
    }

}
