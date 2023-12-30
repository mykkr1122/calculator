package com.example.calculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class CalculatorApplicationController {
    @RequestMapping("/form")
    public String form() {
    return "form";
    }
    
    @RequestMapping("/form/post")
    public String post(@RequestParam("val1") int reqVal1,@RequestParam("cal") String cal,@RequestParam("val2") int reqVal2, Model model) {
        int result=0;
        switch (cal) {
            case "add":
                result = reqVal1 + reqVal2;                
            break;  
            
            case "sub":
                result = reqVal1 - reqVal2;    
            break;

            case "mul":
                result = reqVal1 * reqVal2;                
            break;

            case "div":
                result = reqVal1 / reqVal2;                
            break;
        }
        model.addAttribute("reqVal", result);
        // model.addAttribute("reqVal1", result);
        // model.addAttribute("reqVal2", reqVal2);
    return "form";
    }

    
}
