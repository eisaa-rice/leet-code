package arrays;

public class BuildArrayFromPermutation {
    public static void main(String[] args) {

    } // main

    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }

        return ans;
    } // buildArray
}
