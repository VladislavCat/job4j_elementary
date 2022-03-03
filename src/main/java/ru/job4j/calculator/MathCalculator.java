package ru.job4j.calculator;
import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double sumDivAndSub(double first, double second) {
        return sum((div(first, second)), sub(first, second));
    }

    public static double sumAllOperation(double first, double second) {
        return sum(first, second) + sub(first, second)
                + div(first, second) + multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат sumAndMultiply равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат sumDivAndSub равен: " + sumDivAndSub(12, 2));
        System.out.println("Результат sumAllOperation равен: " + sumAllOperation(24, 12));
    }
}
