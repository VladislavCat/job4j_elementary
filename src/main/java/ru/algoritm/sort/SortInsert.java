package ru.algoritm.sort;

public class SortInsert {
    public static void main(String[] args) {
        int[] arr = {1, 34, 22, 12, 11, 123, 1, 3, 4, 2, 59};
        System.out.println(arr.length);
        System.out.println(binarySearch(arr, 11));
    }

    public static int[] sort(int[] s) {
        int i, n;
        n = 1;
        for (i = 0; i < s.length; i++) {
            for (int j = 0; j < s.length - n; j++) {
                if (s[j] > s[j + 1]) {
                    swap(s, j);
                }
            }
            n++;
        }
        return s;
    }

    public static void swap(int[] arr, int index) {
        int tmp = arr[index];
        arr[index] = arr[index + 1];
        arr[index + 1] = tmp;
    }

    public static int binarySearch(int[] arr, int searchValue) {
        arr = sort(arr);
        int maxIndex = arr.length;
        int minIndex = 0;
        while (true) {
            int centerSearch = maxIndex + minIndex >> 1;
            if (arr[centerSearch] == searchValue) {
                return centerSearch;
            } else if (maxIndex - minIndex < 2) {
                return -1;
            } else if (arr[centerSearch] > searchValue) {
                maxIndex = centerSearch - 1;
            } else if (arr[centerSearch] < searchValue) {
                minIndex = centerSearch + 1;
            }
        }
    }
}
