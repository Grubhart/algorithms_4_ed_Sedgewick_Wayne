package org.grubhart.algorithms.ch1;

import org.junit.Test;

import static org.junit.Assert.*;

public class Exercise1_1_11Test {
    @Test
    public void testPrintBooleanTrue(){
        Exercise1_1_11 exercise1_1_11 = new Exercise1_1_11();
        String booleanSymbol = exercise1_1_11.getBooleanSymbol(true);

        assertEquals("*",booleanSymbol);

    }

    @Test
    public void testPrintBooleanFalse(){
        Exercise1_1_11 exercise1_1_11 = new Exercise1_1_11();
        String booleanSymbol = exercise1_1_11.getBooleanSymbol(false);

        assertEquals(" ",booleanSymbol);

    }
}
