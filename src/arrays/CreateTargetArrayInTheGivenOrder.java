package arrays;

import java.util.ArrayList;

public class CreateTargetArrayInTheGivenOrder {
    public static void main(String[] args) {

    } // main

    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> tempo = new ArrayList<>();

        // add() will automatically push the rest of the list down for us if the index is already taken
        for (int i = 0; i < nums.length; i++) {
            tempo.add(index[i], nums[i]);
        } // for

        int[] target = new int[tempo.size()];

        for (int i = 0; i < tempo.size(); i++) {
            target[i] = tempo.get(i);
        } // for

        return target;
    } // createTargetArray
}
