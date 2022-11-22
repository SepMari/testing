package com.example.testing.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public Integer add(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new IllegalArgumentException("Одно из значений не введено!");
        }
        return num1 + num2;
    }

    public Integer minus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new IllegalArgumentException("Одно из значений не введено!");
        }
        return num1 - num2;
    }

    public Integer multiply(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new IllegalArgumentException("Одно из значений не введено!");
        }
        return num1 * num2;
    }
    public Integer divide(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new IllegalArgumentException("Одно из значений не введено!");
        }
        if (num2 == 0) {
            throw new IllegalArgumentException("На ноль делить нельзя!");
        }
        return num1 / num2;
    }
}
