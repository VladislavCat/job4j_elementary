package ru.job4j.loop;

public class Fitness {
    public static int calc(int ivan, int nic) {
        int mountCounter = 0;
        while (ivan <= nic) {
            ivan *= 3;
            nic *= 2;
            mountCounter++;
        }
        return mountCounter;
    }
}
