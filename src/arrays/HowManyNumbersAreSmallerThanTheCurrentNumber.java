package arrays;

public class HowManyNumbersAreSmallerThanTheCurrentNumber {
    public static void main(String[] args) {
        int[] nums = {6,5,4,8};

        System.out.println(java.util.Arrays.toString(smallerNumbersThanCurrent(nums)));
    } // main

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        // "0 <= nums[i] <= 100"
        int[] count = new int[101]; // this array will hold the number of occurrences each integer has

        // get occurrences for each integer
        for (int num : nums) {
            count[num]++;
        } // for

        // add the count of the previous number to the current number
        for (int i = 1 ; i <= 100; i++) {
            count[i] += count[i - 1]; // every index will hold the number of items smaller than it
        } // for

        //
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) { // if the number is 0, there are no smaller numbers
                ans[i] = 0;
            }
            else {
                ans[i] = count[nums[i] - 1];
            }
        } // for

        return ans;
    } // smallerNumbersThanCurrent
}
