package ru.job4j.condition;

public class SqArea {
    public static double findSquare(double p, double k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        return h * l;
    }

    public static void main(String[] args) {
        System.out.println(" p = 4, k = 1, s = 1, real = " + findSquare(4, 1));
    }
}