package com.java.lessons;

public class ArraysMult {
    public static void main(String[] args) {

        // двумерный массив чисел
        int[][] intMult = {{1, 2, 3, 4, 5}, {6}, {7, 8, 9}};

        // пустой двумерный массив строк
        String[][] strinsMult = new String[2][3];

        // Просмотр двумерного массива через цикл for
        for (int i = 0; i < intMult.length; i++) {
            for (int j = 0; j < intMult[i].length; j++) {
                System.out.print(intMult[i][j] + " ");
            }
            System.out.println();
        }
    }
}