package main.java.ezhidkova.week08;

import java.util.Arrays;
public class selectionSort {
    public static void selectionSort(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (countOperations(arr[j]) < countOperations(arr[min])) {
                    min = j;
                }
            }
            swap(arr, i, min);
        }
    }

    public static void swap(String[] arr, int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int countOperations(String expression) {
        int count = 0;
        for (char c : expression.toCharArray()) {
            switch (c) {
                case '+':
                case '-':
                case '*':
                case '/':
                    count++;
                    break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String[] expressions = {"5+6+32=43", "1+1=2", "(3+5)*4*21=483", "((21-20)*(32-30))/2=1"};
        selectionSort(expressions);
        System.out.println(Arrays.toString(expressions));
    }
}
