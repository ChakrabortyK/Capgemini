package com.example.SpringBootFirst;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {

    @RequestMapping("/")
    String show(){
        return "Hello There";
    }

    void update(){
        System.out.println("Something has been updated");
    }

}
