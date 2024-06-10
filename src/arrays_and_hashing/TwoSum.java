package arrays_and_hashing;

import java.util.Map;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {

    } // main

    static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(); // {diff, index}

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;

            // if difference is found in map, return indexes
            if (map.containsKey(diff)) {
                // return index of
                return new int[] { map.get(diff), i };
            }
            // if not, add it to the map
            else {
                map.put(num, i);
            }
        }

        // if nothing found
        return new int[] {-1, -1};
    } // twoSum
}