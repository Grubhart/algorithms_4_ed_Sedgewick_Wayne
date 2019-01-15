package org.grubhart.algorithms.ch1;

import org.junit.Test;
import static org.junit.Assert.*;

public class Exercise1_1_9Test {

    @Test
    public void testParseIntegerToBinary(){

        Exercise1_1_9 exercise = new Exercise1_1_9();
        String binaryRepresentation = "";
        binaryRepresentation= exercise.parseIntegerToBinary(2,"");

        assertEquals("10",binaryRepresentation);

    }

    @Test
    public void testParseIntegerToBinary3(){

        Exercise1_1_9 exercise = new Exercise1_1_9();
        String binaryRepresentation = "";
        binaryRepresentation= exercise.parseIntegerToBinary(3,"");

        assertEquals("11",binaryRepresentation);

    }

    @Test
    public void testParseIntegerToBinary4(){

        Exercise1_1_9 exercise = new Exercise1_1_9();
        String binaryRepresentation = "";
        binaryRepresentation= exercise.parseIntegerToBinary(4,"");

        assertEquals("100",binaryRepresentation);

    }

    @Test
    public void testParseIntegerToBinary5() {

        Exercise1_1_9 exercise = new Exercise1_1_9();
        String binaryRepresentation = "";
        binaryRepresentation = exercise.parseIntegerToBinary(5, "");

        assertEquals("101", binaryRepresentation);
    }

    @Test
    public void testParseIntegerToBinary6(){

        Exercise1_1_9 exercise = new Exercise1_1_9();
        String binaryRepresentation = "";
        binaryRepresentation= exercise.parseIntegerToBinary(6,"");

        assertEquals("110",binaryRepresentation);

    }

    @Test
    public void testParseIntegerToBinary7(){

        Exercise1_1_9 exercise = new Exercise1_1_9();
        String binaryRepresentation = "";
        binaryRepresentation= exercise.parseIntegerToBinary(7,"");

        assertEquals("111",binaryRepresentation);

    }

    @Test
    public void testParseIntegerToBinary8(){

        Exercise1_1_9 exercise = new Exercise1_1_9();
        String binaryRepresentation = "";
        binaryRepresentation= exercise.parseIntegerToBinary(8,"");

        assertEquals("1000",binaryRepresentation);

    }

    @Test
    public void testParseIntegerToBinary9(){

        Exercise1_1_9 exercise = new Exercise1_1_9();
        String binaryRepresentation = "";
        binaryRepresentation= exercise.parseIntegerToBinary(9,"");

        assertEquals("1001",binaryRepresentation);

    }


    @Test
    public void testParseIntegerToBinary17(){

        Exercise1_1_9 exercise = new Exercise1_1_9();
        String binaryRepresentation = "";
        binaryRepresentation= exercise.parseIntegerToBinary(17,"");

        assertEquals("10001",binaryRepresentation);

    }
}
