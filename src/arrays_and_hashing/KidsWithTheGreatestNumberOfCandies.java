package arrays_and_hashing;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {
    public static void main(String[] args) {

    } // main

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = -1;
        List<Boolean> result = new ArrayList<>();

        for (int i : candies) {
            if (i > max) {
                max = i;
            }
        } // for

        for (int j : candies) {
            if (j + extraCandies >= max) {
                result.add(true);
            }
            else {
                result.add(false);
            }
        } // for

        return result;
    } // kidsWithCandies
}
