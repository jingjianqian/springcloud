package com.joker.systemmodule.eruka.eruka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EenableEurekaServer
public class ErukaApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ErukaApplication.class).web(true).run(args);
    }

}
