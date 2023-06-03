package ru.algoritm.sort;

public class SortInsertTrue {

    public static void sort(int[] arr) {
        int in, out;

        for (out = 1; out < arr.length; out++) {
            int tmp = arr[out];
            in = out;
            while (in > 0 && arr[in - 1] >= tmp) {
                arr[in] = arr[in - 1];
                in--;
            }
            arr[in] = tmp;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{0, 88, 77, 44, 33, 99, 100, 66, 22, 55, 11};
        sort(arr);
        for (int i : arr) {
            System.out.print(i + ", ");
        }
     }
}
