package arrays;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] mat = { {1,2,3}, {4,5,6}, {7,8,9} };
        printMatrix(mat);
        transpose(mat);

        int[][] matrix = { {1,2,3}, {4,5,6} };
        printMatrix(matrix);
        transpose(matrix);

    } // main

    public static void printMatrix (int[][] mat) {
        for (int[] item : mat) {
            for (int x : item) {
                System.out.print(" " + x + " ");
            }

            System.out.println();
        } // for
        System.out.println();
    } // printMatrix

    public static int[][] transpose(int[][] matrix) {
        int[][] result = new int[matrix[0].length][matrix.length]; // swap row and column lengths

        int offset = 0;
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                result[i][j] = matrix[j][offset];
            } // for

            offset++;
        } // for


        printMatrix(result);
        return result;
    }
}
