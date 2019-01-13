package org.grubhart.algorithms;

public class exercise1_1_3{

    public static void main(String[] args) {
        int number1 = Integer.parseInt(args[0]);
        int number2 = Integer.parseInt(args[1]);
        int number3 = Integer.parseInt(args[2]);

        if(number1==number2 && number1==number3){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }

    }
}
