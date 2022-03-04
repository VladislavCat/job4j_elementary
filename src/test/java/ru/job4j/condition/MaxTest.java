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
}