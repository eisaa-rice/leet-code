package arrays;

import java.util.ArrayList;
import java.util.List;

public class AddToArrayFormOfInteger {
    public static void main(String[] args) {
        int[] num = {2,7,4};
        addToArrayForm(num,181); // [4,5,5]
    } // for

    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> result = new ArrayList<>();

        for (int i = num.length - 1; i > -1; i--) {
            result.addFirst((num[i] + k) % 10);  // % 10 gets all digits starting from the 10s place onward

            System.out.println(result + ", " + k);

            k = (num[i] + k) / 10;
            System.out.println(k + "\n");
        } // for


        while (k > 0) {
            result.addFirst(k % 10);
            k /= 10;
        } // while

        System.out.println("\n" + result);
        return result;
    } // addToArrayForm
}
