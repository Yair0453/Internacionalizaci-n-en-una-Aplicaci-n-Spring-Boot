package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.Locale;

@RestController
public class InternacionalizacionController {
    @Autowired
    private MessageSource messageSource;

    @GetMapping("/saludo")
    public String obtenerSaludo(@RequestParam(name = "lang", defaultValue = "en") String idioma) {
        Locale locale = new Locale(idioma);
        return messageSource.getMessage("welcome.message", null, locale);
    }
}
