package arrays;

import java.util.Arrays;

public class CellsWithOddValuesInAMatrix {
    public static void main(String[] args) {
        int m = 2, n = 3;
        
        int[][] indices = { { 0, 1 }, { 1, 1 } };

        System.out.println(oddCells(m, n, indices));
    } // main

    public static int oddCells(int m, int n, int[][] indices) {
        int numOddCells = 0;
        int[][] arr = new int[m][n]; // all zeroes

        System.out.println();
        System.out.println(Arrays.deepToString(arr));
        System.out.println();

        // [ row, col ]
        for (int i = 0; i < indices.length; i++) {
            // row
            int x = indices[i][0];

            for (int k = 0; k < arr[indices[i][0]].length; k++) {
                arr[indices[i][0]][k]++;

                numOddCells += (arr[indices[i][0]][k] % 2 != 0) ? (1) : (-1);
            } // for

            System.out.println();
            System.out.println(Arrays.deepToString(arr));
            System.out.println();

            // column
            int y = indices[i][1];

            for (int j = 0; j < arr.length; j++) {
                arr[j][y]++;

                numOddCells += (arr[j][y] % 2 != 0) ? (1) : (-1);
            } // for

            System.out.println();
            System.out.println(Arrays.deepToString(arr));
            System.out.println();
        } // for

        // return the number of odd-valued cells in the matrix after applying the increment to all locations
        System.out.println();
        return numOddCells;
    } // oddCells
}

// APPARENTLY MY OPTIMIZATION MADE IT SLOWER LOL
/*
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt % 2 != 0) {
                    numOddCells++;
                }
            }
        } // for
 */