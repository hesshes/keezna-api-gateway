package com.keezna.api.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KeeznaApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(KeeznaApiGatewayApplication.class, args);
        System.out.println("direct push ban");
    }
}
