package org.grubhart.algorithms.ch1;

public class Exercise1_1_13 {

    public static void main(String[] args) {
        boolean[][] booleanMatrix = new boolean[3][3];
        int fila = 3;
        int col = 3;
        for(int i=0;i<fila;i++){
            for (int j=0; j<col;j++){
                if(i%2==0){
                    booleanMatrix[i][j]=true;
                }else{
                    booleanMatrix[i][j]=false;
                }
            }
        }


        for(int i=0;i<col;i++){
            for (int j=0; j<fila;j++){
                System.out.printf(String.valueOf(booleanMatrix[j][i]));

            }
            System.out.println();
        }

    }
}
