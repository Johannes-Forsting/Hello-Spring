package com.example.hellospring.controllers;

import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import services.ErDetFredag;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Locale;

@RestController
public class Controller {

    @GetMapping("/hello")
    public String hello(){
        return "Hello user. Have a nice day!";
    }

    @GetMapping("/echo")
    public String echo(@RequestParam(value = "name", defaultValue = "world") String name){
        return String.format("hello %s", name);
    }


    @GetMapping("/erDetFredag")
    public String erDetFredag(){
        return ErDetFredag.erDetFredag();
    }




    @GetMapping("/test")
    public String test(@RequestParam String text, int x){
        String toReturn = "";
        for (int i = 0; i < x; i++) {
            toReturn += "\"" + text + "\" ";
        }
        return toReturn;
    }

}
