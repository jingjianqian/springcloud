package com.joker.systemmodule.eruka;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ErukaApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ErukaApplication.class).web(true).run(args);
    }

}
