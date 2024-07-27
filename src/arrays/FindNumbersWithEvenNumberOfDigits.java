package arrays;

public class FindNumbersWithEvenNumberOfDigits {
    public static void main(String[] args) {

    } // main

    public int findNumbers(int[] nums) {
        int count = 0;

        // we will abuse the fact that "1 <= nums[i] <= 10^5"
        for (int x : nums) {
            if ((x > 9 && x < 100) || (x > 999 && x < 10000) || (x == 100000)) {
                count++;
            }
        } // for

        return count;
    } // findNumbers
}

/*
int count = 0;

        for (int x : nums) {
            if (Integer.toString(x).length() %2 == 0) {
                count++;
            }
        } // for

        return count;
 */