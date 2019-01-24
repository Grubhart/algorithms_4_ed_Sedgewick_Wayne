package org.grubhart.algorithms.ch1;

public class Exercise1_1_14 {

    public static void main(String[] args) {

        int number = Integer.parseInt(args[0]);
        int result = 0;
        int acumulator = 1;
        while (acumulator <= number){
            acumulator*=2;
            result++;
        }

        System.out.println(result-1);
    }

}
