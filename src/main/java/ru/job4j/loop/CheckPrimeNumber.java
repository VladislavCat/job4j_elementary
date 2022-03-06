package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int num) {
        boolean res = false;
        for (int i = 2; i <= num; i++) {
                if (!(num % i == 0) || i == num) {
                    res = true;
                } else {
                    res = false;
                    break;
                }
            } return res;
    }
}
