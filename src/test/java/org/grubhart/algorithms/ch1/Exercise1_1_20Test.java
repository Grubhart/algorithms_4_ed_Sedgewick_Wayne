package org.grubhart.algorithms.ch1;

import org.junit.Test;

import static org.junit.Assert.*;

public class Exercise1_1_20Test {

    @Test
    public void testFatorial(){

        Exercise1_1_20 exercise1_1_20= new Exercise1_1_20();

        assertEquals(1,exercise1_1_20.factorial(1));
        assertEquals(2,exercise1_1_20.factorial(2));
        assertEquals(120,exercise1_1_20.factorial(5));

    }
}
