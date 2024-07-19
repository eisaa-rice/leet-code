package arrays;

public class FindTheHighestAltitude {
    public static void main(String[] args) {
        int[] gain = { -4,-3,-2,-1,4,3,2 }; // 0

        System.out.println(largestAltitude(gain));
    } // main

    public static int largestAltitude(int[] gain) {
        int max = 0, sum = 0;

        for (int x : gain) {
            sum += x;

            if (sum > max) {
                max = sum;
            }
        } // for

        return max;
    } // largestAltitude
}
