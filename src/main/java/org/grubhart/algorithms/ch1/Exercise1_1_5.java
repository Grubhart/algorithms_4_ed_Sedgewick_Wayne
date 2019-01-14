package org.grubhart.algorithms.ch1;

public class Exercise1_1_5 {
    public static void main(String[] args) {
        double number1 = Double.parseDouble(args[0]);
        double number2 = Double.parseDouble(args[1]);

        if(between0And1(number1)&&between0And1(number2)){
            System.out.println("true");
        }else{
            System.out.println("False");
        }



    }

    public static boolean between0And1(double number) {
        return number>0 && number<1;
    }
}
