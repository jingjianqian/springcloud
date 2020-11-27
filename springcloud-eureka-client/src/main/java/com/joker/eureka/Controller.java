package com.joker.eureka;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fuck")
public class Controller {
    @RequestMapping("/you")
    public  String fuck(String s){
        return s;
    }
}
