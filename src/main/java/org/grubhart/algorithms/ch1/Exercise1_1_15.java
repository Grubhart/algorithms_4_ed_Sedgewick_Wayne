package org.grubhart.algorithms.ch1;

public class Exercise1_1_15 {

    public static void main(String[] args) {

    }


    public int[] histogram(int[] a, int m) {

        int result[] = new int[m];

        for(int i=0;i<m;i++){
            result[i] = getTimes(a,i);
        }
        return result;
    }

    private int getTimes(int[] a, int m) {

        int times = 0;
        for(int i=0;i<a.length;i++){
            if(a[i]==m){
                times++;
            }
        }
        return times;
    }
}
