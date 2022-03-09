package ru.job4j.condition;

public class Max {

    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int first, int second, int third) {
        return max(first, max(second, third));
    }

    public static int max(int first, int second, int third, int four) {
        return max(max(first, second, third), four);
    }

    public static void main(String[] args) {
        System.out.println(max(11, 122));
        System.out.println(max(11, 122, 1222));
        System.out.println(max(11, 12, 13, 14));
    }
}