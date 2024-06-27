package arrays_and_hashing;

import java.util.HashMap;
import java.util.Map;

public class NumberOfGoodPairs {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3}; // 4

        System.out.println(numIdenticalPairs(nums));
    } // main

    public static int numIdenticalPairs(int[] nums) {
        int numOfGoodPairs = 0;
        Map<Integer, Integer> map = new HashMap<>(); // {number, appearances}

        for (int x : nums) {
            if (map.containsKey(x)) {
                map.put(x, map.get(x) + 1);

                numOfGoodPairs += map.get(x);
            }
            else {
                map.put(x, 0);
            }
        } // for

        return numOfGoodPairs;
    } // numIdenticalPairs
}

/*
for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[i] == nums[j] && i < j) {
                    numOfGoodPairs++;
                }
            } // for
        } // for
 */