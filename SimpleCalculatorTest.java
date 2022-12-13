package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
    void twoPLusTwoShouldEquatFour() {

        Calculator calculator = new Calculator();
       // assertEquals(4,calculator.add(2,2));
        assertTrue(calculator.add(2,2) == 4);
    }

}