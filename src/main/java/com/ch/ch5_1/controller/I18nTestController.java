package com.ch.ch5_1.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/i18n")
public class I18nTestController {
    @GetMapping("/first")
    public String testI18n(){
        return "/i18n/first";
    }
    @GetMapping("/admin")
    public String admin(){
        return "/i18n/admin";
    }
    @GetMapping("/before")
    public String before(){
        return "/i18n/before";
    }
}
