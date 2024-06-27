package arrays_and_hashing;

import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,4,3,2,1};
        int n = 4;

        shuffle(array, n);
    } // main

    public static int[] shuffle(int[] nums, int n) {
        int[] arr = new int[nums.length];

        for (int i = 0, j = 0; i < nums.length; i += 2, j++) {
            arr[i] = nums[j];

            arr[i + 1] = nums[j + n];
        }

        System.out.println(Arrays.toString(arr));

        return arr;
    } // shuffle
}
