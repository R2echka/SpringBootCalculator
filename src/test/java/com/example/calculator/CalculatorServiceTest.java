package com.example.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculatorServiceTest {
    private final CalculatorService calculatorService = new CalculatorService();

    @Test
    public void plus() {
        String errorMessage = "Для корректного выполнения операции необходимо ввести два числа";
        assertEquals("5 + 5 = 10", calculatorService.addition(5, 5));
        assertEquals(errorMessage, calculatorService.addition(0, null));
    }

    @Test
    public void minus() {
        String errorMessage = "Для корректного выполнения операции необходимо ввести два числа";
        assertEquals("5 - 5 = 0", calculatorService.substraction(5, 5));
        assertEquals(errorMessage, calculatorService.substraction(0, null));
    }

    @Test
    public void times() {
        String errorMessage = "Для корректного выполнения операции необходимо ввести два числа";
        assertEquals("5 * 5 = 25", calculatorService.multiplication(5, 5));
        assertEquals(errorMessage, calculatorService.multiplication(0, null));
    }

    @Test
    public void dividedBy() {
        String errorMessage = "Для корректного выполнения операции необходимо ввести два числа";
        assertEquals("5 / 5 = 1", calculatorService.division(5, 5));
        assertEquals(errorMessage, calculatorService.division(0, null));
    }

    @Test
    public void dividedByZero() {
        String errorMessage = "Число, на которое вы собираетесь делить не может быть равно нулю";
        assertEquals(errorMessage, calculatorService.division(5, 0));
        assertEquals(errorMessage, calculatorService.division(0, 0));
    }
}
