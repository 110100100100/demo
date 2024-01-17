package org.example.demo2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/home")

public class controller {
    @GetMapping()
    public String home() {
        return "/home";
    }

    @PostMapping("/caculator")
    public String caculator(@RequestParam("number1") double number1,
                            @RequestParam("number2") double number2, @RequestParam("option") String option,
                            Model model) {
        double result = 0;
        System.out.println("number1:" + number1);
        System.out.println("number2:" + number2);
        switch (option) {
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "*":
                result = number1 * number2;
                break;
            case "/":
                result = number1 / number2;
                break;
        }
        String path = "/home";
        model.addAttribute("result", result);
        return path;
    }
}