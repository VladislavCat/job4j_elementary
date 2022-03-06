package ru.job4j.array;

import static ru.job4j.array.FindLoop.indexOf;
import static ru.job4j.array.MinDiapason.findMin;
import static ru.job4j.array.SwitchArray.swap;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = findMin(data, i, data.length - 1);
            int index = indexOf(data, min, i, data.length - 1);
            swap(data, i, index);
        }
        return data;
    }
}
