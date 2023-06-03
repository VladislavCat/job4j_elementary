package ru.algoritm.sort;

public class SortChoice {

    public static int[] sortChoice(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int indexMin = findMin(arr, i);
            if (indexMin != i) {
                swap(arr, i, indexMin);
            }
        }
        return arr;
    }

    public static int findMin(int[] arr, int startIndex) {
        int min = Integer.MAX_VALUE;
        int rsl = 0;
        for (int i = startIndex; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                rsl = i;
            }
        }
        return rsl;
    }

    public static void swap(int[] arr, int index, int indexTwo) {
        int tmp = arr[index];
        arr[index] = arr[indexTwo];
        arr[indexTwo] = tmp;
    }

    public static void selectionSort(int[] arr) {
        int min, out, in;
        for (out = 0; out < arr.length - 1; out++) {
            min = out;
            for (in = out + 1; in < arr.length; in++) {
                if (arr[in] < arr[min]) {
                    min = in;
                }
            }
            swap(arr, out, min);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{8, 1, 4, 323, 2, 5, 92, 12};
        for (int i : sortChoice(arr)) {
            System.out.print(i + ", ");
        }
        System.out.println();
        int[] array = new int[]{0, 22, 77, 99, 11, 33, 66, 44, 88, 55};
        selectionSort(array);
        for (int i : array) {
            System.out.print(i + ", ");
        }
    }
}
