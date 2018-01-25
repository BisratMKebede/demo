package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;


@RestController
public class HomeController {
    @RequestMapping("/")
    public String showIndex()
    {
        String userName;
        Scanner keyboard = new Scanner(System.in);
        userName = keyboard.nextLine();
        String greet = "hello "+ userName;
        System.out.println(greet);
        return greet;


    }


}

