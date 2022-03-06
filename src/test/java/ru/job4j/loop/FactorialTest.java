package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int res = Factorial.calc(5);
        int expected = 120;
        Assert.assertEquals(expected, res);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
       int res = Factorial.calc(0);
       int expected = 1;
       Assert.assertEquals(expected, res);
    }

    @Test
    public void whenCalculateFactorialForTenThenThree() {
        int res = Factorial.calc(10);
        int expected = 3628800;
        Assert.assertEquals(expected, res);
    }
}