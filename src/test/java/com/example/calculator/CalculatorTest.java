package com.example.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Unit test untuk kelas Calculator.
 *
 * @author CI/CD Demo Team
 */
@DisplayName("Calculator Test")
class CalculatorTest {

    private Calculator calculator;

    /**
     * Setup sebelum setiap test.
     */
    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    /**
     * Test penjumlahan.
     */
    @Test
    @DisplayName("2 + 3 = 5")
    void testAdd() {
        assertEquals(5, calculator.add(2, 3));
    }

    /**
     * Test pengurangan.
     */
    @Test
    @DisplayName("5 - 3 = 2")
    void testSubtract() {
        assertEquals(2, calculator.subtract(5, 3));
    }

    /**
     * Test perkalian.
     */
    @Test
    @DisplayName("4 * 3 = 12")
    void testMultiply() {
        assertEquals(12, calculator.multiply(4, 3));
    }

    /**
     * Test pembagian.
     */
    @Test
    @DisplayName("10 / 2 = 5")
    void testDivide() {
        assertEquals(5, calculator.divide(10, 2));
    }

    /**
     * Test pembagian dengan nol harus error.
     */
    @Test
    @DisplayName("Pembagian dengan nol harus throw exception")
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
    }
}
