package arrays_and_hashing;

import java.util.HashSet;
import java.util.Set;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = { 0, 1 };

        System.out.println(missingNumber(nums));
    } // main

    public int missingNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();

        // find max
        int max = -1;
        for (int x : nums) {
            // fill in hash set as we go
            set.add(x);

            if (x > max) {
                max = x;
            }
        } // for

        // spot missing value
        for (int i = 0; i < max; i++) {
            if (!set.contains(i)) {
                return i;
            }
        } // for

        return max + 1;
    } // missingNumber
}
