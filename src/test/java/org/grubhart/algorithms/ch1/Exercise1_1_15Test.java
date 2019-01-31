package org.grubhart.algorithms.ch1;

import org.junit.Test;

import static junit.framework.TestCase.*;

public class Exercise1_1_15Test {


    @Test
    public void testHistogram(){

        Exercise1_1_15 exercise1115 = new Exercise1_1_15();

        int a[] = new int[10];
        for (int i=0; i<10;i++){
            a[i]=0;
        }

        int m=3;

        int response[] = new int[m];
        response[0]=10;
        response[1]=0;
        response[2]=0;

        int obtained[]= exercise1115.histogram(a,m);

        assertTrue(equal(obtained,response));
        assertEquals(a.length,10);


    }

    @Test
    public void testHistogram8(){

        Exercise1_1_15 exercise1115 = new Exercise1_1_15();

        int a[] = new int[8];
        a[0]=3;
        a[1]=1;
        a[2]=7;
        a[3]=3;
        a[4]=1;
        a[5]=1;
        a[6]=4;
        a[7]=1;
        int m=8;

        int response[] = new int[m];
        response[0]=0;
        response[1]=4;
        response[2]=0;
        response[3]=2;
        response[4]=1;
        response[5]=0;
        response[6]=0;
        response[7]=1;

        int obtained[]= exercise1115.histogram(a,m);

        assertTrue(equal(obtained,response));
        assertEquals(a.length,8);


    }

    private boolean equal(int obtained[], int actual[]){
        boolean response = obtained.length==actual.length;

        if(response){
            for(int i=0; i<obtained.length; i++){
                response = response && (obtained[i]==actual[i]);
            }
        }

        return response;
    }
}
