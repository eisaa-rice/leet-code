package arrays;

import java.util.Arrays;

public class FlippingAnImage {
    public static void main(String[] args) {
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};

        System.out.println(Arrays.deepToString(image));
        System.out.println();
        System.out.println(Arrays.deepToString(flipAndInvertImage(image)));
    } // main

    // to flip an image horizontally means that each row of the image is reversed
        // [1,1,0] horizontally results in [0,1,1]
    // to invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0
        // inverting [0,1,1] results in [1,0,0]

    public static int[][] flipAndInvertImage(int[][] image) {
        int[][] result = new int[image.length][image.length]; // n x n

        for (int i = 0; i < image.length; i++) { // first dimension
            for (int j = 0, k = image.length - 1; j < image[i].length; j++, k--) { // second dimension
                // first, flip the image horizontally
                result[i][j] = image[i][k];


                // then invert it
                result[i][j] = result[i][j] ==  0 ? 1 : 0;
            } // for
        } // for

        // and return the resulting image
        return result;
    } // flipAndInvertImage
}
