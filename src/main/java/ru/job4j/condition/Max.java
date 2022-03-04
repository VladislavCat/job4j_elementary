package ru.job4j.condition;

public class Max {

    public static int max(int left, int right) {
        if (left == right) {
            return left;
        } else {
            return left > right ? left : right;
        }
    }

    public static void main(String[] args) {
        System.out.println(max(11, 122));
    }
}