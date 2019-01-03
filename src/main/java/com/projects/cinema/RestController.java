package com.projects.cinema;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@EnableAutoConfiguration(exclude = SecurityAutoConfiguration.class)
public class RestController {

    @RequestMapping("/")
    public String index(){
        return "<h1>Strona startowa</h1>";
    }

    @RequestMapping("/logowanie")
    public String login(){
        return "<h1>Strona logowania</h1>";
    }

    @RequestMapping("/rezerwuj")
    public String rezerwuj(){
        return "<h1>Strona rezerwacji</h1>";
    }
}
