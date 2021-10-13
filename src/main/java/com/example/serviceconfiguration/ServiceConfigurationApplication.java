package com.example.serviceconfiguration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

// on va ajouter une seule annotation qui est:
@EnableConfigServer
@SpringBootApplication
public class ServiceConfigurationApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceConfigurationApplication.class, args);
    }

}
