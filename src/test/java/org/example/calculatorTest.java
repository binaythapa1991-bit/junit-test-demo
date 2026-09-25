package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    calculator calc = new calculator();

    @Test
    void testAddition() {
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    void testDivision() {
        assertEquals(1, calc.divide(10, 10));

    }

    @Test
    void testMultiply() {
        assertEquals(10, calc.multiply(2, 5));
    }
    @Test
    void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> calc.divide(10, 0));
    }
}
