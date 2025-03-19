package com.sin.lineage.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.sin.lineage.server")
public class LineageServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(LineageServerApplication.class, args);
    }

}
