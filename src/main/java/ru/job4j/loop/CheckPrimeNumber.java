package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int num) {
        boolean res = false;
        for (int i = 2; i <= num - 1; i++) {
            if (!(num % i == 0)) {
                res = true;
            } else {
                res = false;
                break;
            }
        }
        return res;
    }
}
