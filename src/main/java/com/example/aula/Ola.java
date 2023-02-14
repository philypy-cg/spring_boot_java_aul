package com.example.aula;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController

public class Ola {

    @GetMapping(value="/")
    public String getMethodName() {
        return "Olá Turma";
    }
    
    
}
