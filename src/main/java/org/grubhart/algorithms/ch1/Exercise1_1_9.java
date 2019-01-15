package org.grubhart.algorithms.ch1;

public class Exercise1_1_9 {

    public static void main(String[] args) {



    }

    public String parseIntegerToBinary(int i,String sufix) {

        int div = i/2;
        int mod = i%2;

        if(div<=1){
            return Integer.toString(div)+Integer.toString(mod)+sufix;
        }else{
            return (parseIntegerToBinary(div,Integer.toString(mod))+sufix);
        }

    }
}
