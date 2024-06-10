package arrays_and_hashing;

import java.util.Set;
import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};

        System.out.println(containsDuplicate(nums));
    } // main

    static boolean containsDuplicate(int[] nums) {
        Set<Integer> appearances = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            // if the current number is in there, return true
            if (appearances.contains(nums[i])) {
                return true;
            }
            // if not, add it to hashmap
            else {
                appearances.add(nums[i]);
            }
        }

        // if no dupes found, return false
        return false;
    } // containsDuplicate
}
