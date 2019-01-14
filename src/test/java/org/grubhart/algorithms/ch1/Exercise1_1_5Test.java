package org.grubhart.algorithms.ch1;

import org.junit.Test;

import static org.junit.Assert.*;

public class Exercise1_1_5Test {

    @Test
    public void testDoubleBetween0And1True(){

        double number = 0.3;
        Exercise1_1_5 exercise1_1_5 = new Exercise1_1_5();

        assertTrue(exercise1_1_5.between0And1(number));

    }

    @Test
    public void testDoubleBetween0And1False(){

        double number = 1.3;
        Exercise1_1_5 exercise1_1_5 = new Exercise1_1_5();

        assertFalse(exercise1_1_5.between0And1(number));

    }
}
