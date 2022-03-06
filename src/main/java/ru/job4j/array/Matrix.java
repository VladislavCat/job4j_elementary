package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] matrixMul = new int[size][size];
        for (int i = 0; i < matrixMul.length; i++) {
            for (int j = 0; j < matrixMul[i].length; j++) {
                matrixMul[i][j] = (i + 1) * (j + 1);
            }
        }
        return matrixMul;
    }
}
