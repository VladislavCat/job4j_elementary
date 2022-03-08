package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax13To12() {
        int left = 13;
        int right = 12;
        int result = Max.max(left, right);
        int expected = 13;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax100To100() {
        int left = 100;
        int right = 100;
        int result = Max.max(left, right);
        int expected = 100;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMaxMinus12To12() {
        int left = -12;
        int right = 12;
        int result = Max.max(left, right);
        int expected = 12;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax11To100to1000() {
        int first = 11;
        int second = 100;
        int third = 1000;
        int result = Max.max(first, second, third);
        int expected = 1000;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax100To100to100() {
        int first = 100;
        int second = 100;
        int third = 100;
        int result = Max.max(first, second, third);
        int expected = 100;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax22To10to1() {
        int first = 22;
        int second = 10;
        int third = 1;
        int result = Max.max(first, second, third);
        int expected = 22;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax11To100to12to15() {
        int first = 11;
        int second = 100;
        int third = 12;
        int four = 15;
        int result = Max.max(first, second, third, four);
        int expected = 100;
        Assert.assertEquals(result, expected);
    }
}