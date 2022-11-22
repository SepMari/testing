package com.example.testing;

import com.example.testing.service.CalculatorService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorServiceParamTest {

    CalculatorService calculatorService;

    @BeforeEach
    void setUp() {
        calculatorService = new CalculatorService();
    }

    public static Stream<Arguments> provideParamsForSumTests() {
        return Stream.of(
                Arguments.of(5, 6, 11),
                Arguments.of(0, -5, -5),
                Arguments.of(3, 1, 4)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForSumTests")
    void shouldReturnCorrectSum(Integer num1, Integer num2, Integer result) {
        assertEquals(result, calculatorService.add(num1, num2));
    }

    public static Stream<Arguments> provideParamsForDifferTests() {
        return Stream.of(
                Arguments.of(5, 6, -1),
                Arguments.of(0, -5, 5),
                Arguments.of(3, 1, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForDifferTests")
    void shouldReturnCorrectDiffer(Integer num1, Integer num2, Integer result) {
        assertEquals(result, calculatorService.minus(num1, num2));
    }

    public static Stream<Arguments> provideParamsForMultiplyTests() {
        return Stream.of(
                Arguments.of(5, 6, 30),
                Arguments.of(0, -5, 0),
                Arguments.of(3, 1, 3)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForMultiplyTests")
    void shouldReturnCorrectMult(Integer num1, Integer num2, Integer result) {
        assertEquals(result, calculatorService.multiply(num1, num2));
    }

    public static Stream<Arguments> provideParamsForDivideTests() {
        return Stream.of(
                Arguments.of(6, 6, 1),
                Arguments.of(0, -5, 0),
                Arguments.of(3, 1, 3)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForDivideTests")
    void shouldReturnCorrectDivide(Integer num1, Integer num2, Integer result) {
        assertEquals(result, calculatorService.divide(num1, num2));
    }
}
