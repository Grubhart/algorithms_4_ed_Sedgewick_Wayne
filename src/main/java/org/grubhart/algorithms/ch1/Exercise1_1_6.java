package org.grubhart.algorithms.ch1;

public class Exercise1_1_6 {

    public static void main(String[] args) {
        int f = 0;
        int g = 1;
        for(int i=1; i<=15; i++){
            System.out.println(f);

            f=f+g;
            g=f-g;
        }
    }

}
