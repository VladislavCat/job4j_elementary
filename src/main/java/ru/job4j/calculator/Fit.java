package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        return (height - 100) * 1.15;
    }

    public static double womanWeight(short height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        short height = 187;
        System.out.println("Идеальный вес для мужчины при росте 187: " + manWeight(height));
        System.out.println("Идеальный вес для женщины при росте 187: " + womanWeight(height));
    }
}
