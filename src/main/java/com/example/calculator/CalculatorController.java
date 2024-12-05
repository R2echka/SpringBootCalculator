package com.example.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService){
        this.calculatorService = calculatorService;
    }

    @GetMapping(path="/plus")
    public String addition(@RequestParam(value="num1", required = false) Integer num1, @RequestParam(value="num2", required = false) Integer num2){
        return calculatorService.addition(num1, num2);
    }

    @GetMapping(path="/minus")
    public String substraction(@RequestParam(value="num1", required = false) Integer num1, @RequestParam(value="num2", required = false) Integer num2){
        return calculatorService.substraction(num1, num2);
    }

    @GetMapping(path="/multiply")
    public String multiplication(@RequestParam(value="num1", required = false) Integer num1, @RequestParam(value="num2", required = false) Integer num2){
        return calculatorService.multiplication(num1, num2);
    }

    @GetMapping(path="/divide")
    public String division(@RequestParam(value="num1", required = false) Integer num1, @RequestParam(value="num2", required = false) Integer num2){
        return calculatorService.division(num1, num2);
    }
}
