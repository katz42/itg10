package main.java.ezhidkova.week08;

import java.util.Arrays;

public class insertionSort {

    public insertionSort(String[] arr) {
        int j;
        for (int i = 1; i < arr.length; i++) {
            String swap = arr[i];
            for (j = i; j > 0 && countVowels(swap) < countVowels(arr[j - 1]); j--) {
                arr[j] = arr[j - 1];
            }
            arr[j] = swap;
        }
    }

    public static int countVowels(String word) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y'};
        int count = 0;
        for (char c : word.toCharArray()){
            for (char vowel : vowels) {
                if (c == vowel) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    public static void main(String args[]) {
        String[] arr = {"cat", "orange", "elephant", "bird"};
        new insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
