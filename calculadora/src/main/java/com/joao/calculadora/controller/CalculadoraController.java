package com.joao.calculadora.controller;

import com.joao.calculadora.services.CalculadoraServices;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/calculadora")
@CrossOrigin
public class CalculadoraController {

    private final CalculadoraServices service;

    public CalculadoraController(CalculadoraServices service) {
        this.service = service;
    }

    @GetMapping("/somar")
    public double somar(@RequestParam double a, @RequestParam double b) {
        return service.somar(a, b);
    }

    @GetMapping("/subtrair")
    public double subtrair(@RequestParam double a, @RequestParam double b) {
        return service.subtrair(a, b);
    }

    @GetMapping("/multiplicar")
    public double multiplicar(@RequestParam double a, @RequestParam double b) {
        return service.multiplicar(a, b);
    }

    @GetMapping("/dividir")
    public double dividir(@RequestParam double a, @RequestParam double b) {
        return service.dividir(a, b);
    }
}
    
