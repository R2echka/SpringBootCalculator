package com.example.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public String addition(Integer num1, Integer num2){
        if (num1 == null || num2 == null){
            return "Для корректного выполнения операции необходимо ввести два числа";
        }
        return num1 + " + " + num2 + " = " + (num1 + num2);
    }

    public String substraction(Integer num1, Integer num2){
        if (num1 == null || num2 == null){
            return "Для корректного выполнения операции необходимо ввести два числа";
        }
        return num1 + " - " + num2 + " = " + (num1 - num2);
    }

    public String multiplication(Integer num1, Integer num2){
        if (num1 == null || num2 == null){
            return "Для корректного выполнения операции необходимо ввести два числа";
        }
        return num1 + " * " + num2 + " = " + (num1 * num2);
    }

    public String division(Integer num1, Integer num2){
        if (num1 == null || num2 == null){
            return "Для корректного выполнения операции необходимо ввести два числа";
        } else if (num2 == 0) {
            return "Число, на которое вы собираетесь делить не может быть равно нулю";
        }
        return num1 + " / " + num2 + " = " + (num1 / num2);
    }
}
