package arrays;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] matrix = { {1,2,3}, {4,5,6}, {7,8,9} }; // 25
        System.out.println(diagonalSum(matrix));

        int[][] mat = { {1,1,1,1}, {1,1,1,1}, {1,1,1,1}, {1,1,1,1} }; // 8
        System.out.println(diagonalSum(mat));

        int[][] matrio = { {5} }; // 5
        System.out.println(diagonalSum(matrio));

        int[][] matrick = { {1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16} }; // 68
        System.out.println(diagonalSum(matrick));

        int[][] matrice = { {7,3,1,9}, {3,4,6,9}, {6,9,6,6}, {9,5,8,5} }; // 55
        System.out.println(diagonalSum(matrice));
    } // main

    public static int diagonalSum(int[][] mat) {
        int sum = 0;

        double splitPoint = ((double) mat.length / 2) - 0.5;

        int offset = 0;
        for (int i = 0; i < mat.length; i++) {
            sum += mat[i][offset];

            if (i != splitPoint) {
                sum += mat[i][mat[i].length - 1 - offset];
            }

            offset++;
        } // for

        return sum;
    } // diagonalSum
}

/*
        sum += mat[0][0];
        sum += mat[0][mat[0].length - 1];

        sum += mat[mat[0].length - 1][0];
        sum += mat[mat[0].length - 1][mat[0].length - 1];
 */

/*
        for (int i = 1; i < mat.length - 1; i++) {
           int offset = 1;

           if (offset >= mat[0].length / 2) {
               sum += mat[i][offset];
           }
           else {
               sum += mat[i][offset];
               sum += mat[i][mat[i].length - offset];
           }
        } // for
 */