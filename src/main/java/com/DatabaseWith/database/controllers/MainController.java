package com.DatabaseWith.database.controllers;

import org.apache.maven.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    @GetMapping
    public String greeting(@RequestParam(name = "name",required = false,defaultValue = "World")String name, Model model)
}
