package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class EvenOddCheckerTest {
    EvenOddChecker checker = new EvenOddChecker();

    @Test
    public void testEvenNumbers() {
        assertTrue(checker.isEven(2));
        assertTrue(checker.isEven(0));
        assertTrue(checker.isEven(-4));
    }

    @Test
    public void testOddNumbers() {
        assertFalse(checker.isEven(1));
        assertFalse(checker.isEven(-7));
    }
}