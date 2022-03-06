package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {
    @Test
    public void whenSortArrayOf5elements() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void  whenSortArrayOf8Elements() {
        int[] data = new int[]{7, 2, 4, 5, 1, 8, 3, 6};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArrayOf3Elements() {
        int[] data = new int[]{2, 8, 4};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{2, 4, 8};
        Assert.assertArrayEquals(expected, result);
    }
}