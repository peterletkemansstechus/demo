package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void can_Add_Numbers() {
        Calculator calculator = new Calculator();
        double result = calculator.add(new double[]{1, 2, 3});
        double expected = 6;
        assertEquals(expected,result);
        result = calculator.add(new double[]{100, 2, 3});
        expected = -100;
        assertNotEquals(expected,result);
    }

    @Test
    void can_Subtract_Numbers() {
        Calculator calculator = new Calculator();
        double result = calculator.minus(new double[]{1, 2, 3});
        double expected = -6;
        assertEquals(expected,result);
        result = calculator.minus(new double[]{100, 2, 3});
        expected = -100;
        assertNotEquals(expected,result);
    }

    @Test
    void can_Multiply_Numbers() {
        Calculator calculator = new Calculator();
        double result = calculator.multiply(new double[]{100, 2, -3});
        double expected = -600;
        assertEquals(expected,result);
        result = calculator.multiply(new double[]{6, 2, 3});
        expected = -100;
        assertNotEquals(expected,result);
    }

    @Test
    void can_Divide_Numbers() {
        Calculator calculator = new Calculator();
        double result = calculator.divide(new double[]{2,-2});
        double expected = -0.25;
        assertEquals(expected,result);
        result = calculator.divide(new double[]{ 2, 3});
        expected = -100; // 0.16666666666666666;
        assertNotEquals(expected,result);
    }
}