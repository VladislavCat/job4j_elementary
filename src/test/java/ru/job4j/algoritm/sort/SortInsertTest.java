package ru.job4j.algoritm.sort;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.algoritm.sort.SortInsert;

import java.util.Arrays;

public class SortInsertTest {
    private int[] arr;

    @Before
    public void setArray() {
        arr = new int[]{1, 213, 21, 134, 2, 93, 65, 34, 342, 22, 11, 324, 114, 9};
    }

    @Test
    public void whenSortingBubble() {
        int[] expected = new int[]{1, 2, 9, 11, 21, 22, 34, 65, 93, 114, 134, 213, 324, 342};
        arr = SortInsert.sort(arr);
        Assert.assertArrayEquals(expected, arr);
    }

    @Test
    public void whenFindFirstElemInArr() {
        int expected = Arrays.binarySearch(SortInsert.sort(arr), 1);
        Assert.assertEquals(SortInsert.binarySearch(arr, 1), expected);
    }

    @Test
    public void neElemOnArrayBinarySearch() {
        int expected = -1;
        Assert.assertEquals(SortInsert.binarySearch(arr, 200), expected);
    }

    @Test
    public void findRandomElemInArr() {
        int expected = Arrays.binarySearch(SortInsert.sort(arr), 213);
        System.out.println(expected);
        Assert.assertEquals(SortInsert.binarySearch(arr, 213), expected);
    }

    @Test
    public void findLastElemInArr() {
        int expected = Arrays.binarySearch(SortInsert.sort(arr), 342);
        Assert.assertEquals(SortInsert.binarySearch(arr, 342), expected);
    }
}
