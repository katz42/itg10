package week08;

import java.util.Arrays;

public class quickSort {
    public static void quickSort(String[] arr, int low, int high) {
        if (arr.length == 0 || low >= high) {
            return;
        }

        int middle = low + (high - low) / 2;
        String border = arr[middle];
        int i = low;
        int j = high;

        while (i <= j) {
            while (arr[i].compareTo(border) < 0) {
                i++;
            }
            while (arr[j].compareTo(border) > 0) {
                j--;
            }
            if (i <= j) {
                String swap = arr[i];
                arr[i] = arr[j];
                arr[j] = swap;
                i++;
                j--;
            }
        }

        if (low < j) {
            quickSort(arr, low, j);
        }
        if (high > i) {
            quickSort(arr, i, high);
        }
    }

    public static void main(String[] args) {
        String[] arr = {"apple", "orange", "grape", "banana"};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}