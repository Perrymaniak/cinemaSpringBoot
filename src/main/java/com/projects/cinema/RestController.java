package com.projects.cinema;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@EnableAutoConfiguration(exclude = SecurityAutoConfiguration.class)
public class RestController {

    @RequestMapping("/")
    public String index(){
        return "index.html";
    }

    @RequestMapping("/logowanie")
    public String login(){
        return "logowanie.html";
    }

    @RequestMapping("/rezerwuj")
    public String rezerwuj(){
        return "rezerwacja.html";
    }
}
