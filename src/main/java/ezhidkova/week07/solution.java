package main.java.ezhidkova.week07;

import java.util.Arrays;

class solution {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] expectedNums = {0, 1, 2, 3, 4, 0, 0, 0, 0, 0};
        int[] result = removeDuplicates(nums);

        System.out.println(Arrays.equals(result, expectedNums));

    }

    public static int[] removeDuplicates(int[] nums) {
        int element = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                nums[element] = nums[i + 1];
                element++;
            }
        }
        for (int i = element; i < nums.length; i++) {
            nums[element] = 0;
            element++;
        }
        return nums;
    }
}