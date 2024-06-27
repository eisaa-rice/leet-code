package arrays_and_hashing;

public class RunningSumOf1dArray {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1}; // [1,2,3,4,5]

        nums = runningSum(nums);

        for (int num : nums) {
            System.out.println(num);
        }
    } // main

    public static int[] runningSum(int[] nums) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            nums[i] = sum;
        } // for

        return nums;
    } // runningSum
}
