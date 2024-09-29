package main.java.ezhidkova.week08;

import java.util.Arrays;

public class mergeSort {
    public static String[] mergeSort(String[] arr) {
        String[] buffer1 = Arrays.copyOf(arr, arr.length);
        String[] buffer2 = new String[arr.length];
        return mergeSortInner(buffer1, buffer2, 0, arr.length);
    }

    public static String[] mergeSortInner(String[] buffer1, String[] buffer2, int startIndex, int endIndex) {

        if (startIndex >= endIndex - 1) {
            return buffer1;
        }

        int middle = startIndex + (endIndex - startIndex) / 2;
        String[] sorted1 = mergeSortInner(buffer1, buffer2, startIndex, middle);
        String[] sorted2 = mergeSortInner(buffer1, buffer2, middle, endIndex);


        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;

        String[] result = ((sorted1 == buffer1) ? buffer2 : buffer1);
        while (index1 < middle && index2 < endIndex) {
            if (sorted1[index1].length() < sorted2[index2].length()) {
                result[destIndex] = sorted1[index1];
                destIndex++;
                index1++;
            } else {
                result[destIndex] = sorted2[index2];
                destIndex++;
                index2++;
            }
        }
        while (index1 < middle) {
            result[destIndex] = sorted1[index1];
            destIndex++;
            index1++;
        }
        while (index2 < endIndex) {
            result[destIndex] = sorted2[index2];
            destIndex++;
            index2++;
        }

        return result;
    }

    public static void main(String args[]) {
        String[] arr = {"cat", "orange", "elephant", "bird"};
        String[] res = mergeSort(arr);
        System.out.println(Arrays.toString(res));
    }
}
