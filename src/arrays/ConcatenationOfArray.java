package arrays;

public class ConcatenationOfArray {
    public static void main(String[] args) {

    } // main

    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];

        int i = 0;
        while (i < nums.length) {
            ans[i] = nums[i];

            i++;
        } // while

        while (i < nums.length * 2) {
            ans[i] = nums[i - nums.length];

            i++;
        } // while

        return ans;
    } // getConcatenation
}
