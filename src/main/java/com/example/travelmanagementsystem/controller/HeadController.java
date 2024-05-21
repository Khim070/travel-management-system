package com.example.travelmanagementsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HeadController {
    @GetMapping("/head")
    public String head(){
        return "Backend/Head";
    }

    @GetMapping("/home/head")
    public String home_head(){
        return "Frontend/Head";
    }

    @GetMapping("/home/review")
    public String home_review(){
        return "Frontend/Review";
    }

    @GetMapping("/home/aboutUs")
    public String home_aboutUs(){
        return "Frontend/AboutUs";
    }

    @GetMapping("/home/contactUs")
    public String home_contactUs(){
        return "Frontend/ContactUs";
    }
}
