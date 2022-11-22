package com.example.testing;

import com.example.testing.service.CalculatorService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorServiceTest {

    CalculatorService calculatorService;

    @BeforeEach
    void setUp() {
        calculatorService = new CalculatorService();
    }

    @Test
    void addWithoutFirstArgumentReturnIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> calculatorService.add(null, 5));
    }

    @Test
    void addWithoutSecondArgumentReturnIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> calculatorService.add(5, null));
    }

    @Test
    void addWithoutAllArgumentReturnIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> calculatorService.add(null, null));
    }

    @Test
    void minusWithoutFirstArgumentReturnIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> calculatorService.minus(null, 5));
    }

    @Test
    void minusWithoutSecondArgumentReturnIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> calculatorService.minus(5, null));
    }

    @Test
    void multiplyWithoutFirstArgumentReturnIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> calculatorService.multiply(null, 5));
    }

    @Test
    void multiplyWithoutSecondArgumentReturnIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> calculatorService.multiply(5, null));
    }

    @Test
    void divideWithoutFirstArgumentReturnIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> calculatorService.divide(null, 5));
    }

    @Test
    void divideWithoutSecondArgumentReturnIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> calculatorService.divide(5, null));
    }

    @Test
    void divideByZeroReturnIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> calculatorService.divide(5, 0));
    }
}
