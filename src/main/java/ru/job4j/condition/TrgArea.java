package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static void main(String[] args) {
        System.out.println("Площадь треугольника со сторонами 2,2,2 по формуле Герона равна: "
        + area(2, 2, 2));
    }
}
