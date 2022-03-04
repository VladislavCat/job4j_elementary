package ru.job4j.condition;

import ru.job4j.calculator.Point;

public class ChessBoard {

    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (isValid(x1) && isValid(x2)
                && isValid(y1) && isValid(y2)) {
            if (x1 != x2 && y1 != y2) {
                rsl = (int) distance(x1, y1, x2, y2);
            }
        }
        return rsl;
    }

    private static double distance(int x1, int y1, int x2, int y2) {
        int resX, resY;
        resX = x1 - x2;
        resY = y1 - y2;
        if (Math.abs(resX) == Math.abs(resY)) {
            return Math.abs(resX);
        } else {
            return 0;
        }
    }

    private static boolean isValid(int coordinate) {
        return coordinate >= 0 && coordinate <= 7;
    }
}