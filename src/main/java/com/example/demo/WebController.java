package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class WebController {

    @GetMapping("/web")
    public String getMethodName(Model webInput) {
        String name = "Guvi";
        webInput.addAttribute("username", name);
        return "index.html";
    }
    
}
