package org.grubhart.algorithms.ch1;

public class Exercise1_1_20 {

    public static void main(String[] args) {

    }

    public int factorial(int i) {
        if(i==1 || i== 0){
            return 1;
        }else{
            return i*factorial(i-1);
        }
    }
}
