package arrays;

public class RichestCustomerWealth {
    public static void main(String[] args) {

    } // main

    public int maximumWealth(int[][] accounts) {
        int max = -1;

        for (int[] account : accounts) { // every account
            int sum = 0;

            for (int j = 0; j < account.length; j++) { // the money in one account
                sum += account[j];
            } // for

            if (sum > max) {
                max = sum;
            }
        } // for

        return max;
    } // maximumWealth
}
