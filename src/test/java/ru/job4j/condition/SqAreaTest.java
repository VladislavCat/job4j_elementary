package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        double expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.findSquare(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP12K7Square3dot93() {
        double expected = 3.93;
        int p = 12;
        double k = 7;
        double out = SqArea.findSquare(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP9K3Square2() {
        double expected = 1.17;
        int p = 5;
        double k = 3;
        double out = SqArea.findSquare(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

}