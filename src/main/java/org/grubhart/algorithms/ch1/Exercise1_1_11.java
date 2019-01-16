package org.grubhart.algorithms.ch1;

public class Exercise1_1_11 {

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


        printMatrix(fila, col, booleanMatrix);
    }

    private static void printMatrix(int fila, int col, boolean[][] booleanMatrix) {
        printRow0(col);
        for(int i=0;i<fila;i++){
            printRow(i,col,booleanMatrix[i]);
        }


    }

    private static void printRow(int i, int col, boolean[] booleanMatrix) {

        System.out.printf("%d",i+1);
        for(int j=0; j<col; j++){
            System.out.printf("%s ",getBooleanSymbol(booleanMatrix[j]));

        }
        System.out.println();
    }

    private static void printRow0(int columns) {

        System.out.printf(" ");
        char columnName = 'a';
        for(int i=0; i<columns; i++){
            System.out.printf("%c ",columnName);
            columnName++;
        }
        System.out.println();
    }

    public static String getBooleanSymbol(boolean b) {

        if(b){
            return "*";
        }else{
            return " ";
        }
    }
}
