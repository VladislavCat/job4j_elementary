package ru.job4j.condition;

public class SqArea {
    public static double findH(double p, double k) {
        return p / (2 * (k + 1));
    }

    public static double findL(double h, double k) {
        return h * k;
    }

    public static void main(String[] args) {
        System.out.println(" p = 6, k = 2, s = 2, h = " + findH(6, 2)
                + " l = " + findL(findH(6, 2), 2));
    }
}