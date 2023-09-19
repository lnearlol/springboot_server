package com.doc.controllers;

import org.apache.jasper.tagplugins.jstl.core.Url;
import org.jsoup.Jsoup;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.jsoup.nodes.Document;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;

@Controller
public class HomeController {

    Document document;

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/lol")
    public String lol(Model model) {
        model.addAttribute("message", "Привет, мир!");
        return "lol";
    }

    @PostMapping("/button")
    public String buttonPage() {
        System.out.println("Button was clicked");
        return "index";
    }
}