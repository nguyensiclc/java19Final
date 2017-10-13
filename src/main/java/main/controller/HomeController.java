package main.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value = "/")
public class HomeController {
    @Autowired
    @RequestMapping
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/login")
    public String login(){
        return "login";
    }
}
