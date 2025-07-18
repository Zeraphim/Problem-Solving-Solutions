package com.zeraphim.SpringAPICall.CodingBat.d_Array3;

/*

Given n>=0, create an array length n*n with the following pattern, shown here for n=3 : {0, 0, 1,    0, 2, 1,    3, 2, 1} (spaces added to show the 3 groups).

squareUp(3) → [0, 0, 1, 0, 2, 1, 3, 2, 1]
squareUp(2) → [0, 1, 2, 1]
squareUp(4) → [0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1]

 */

public class squareUp {
    public static void main(String[] args) {
        System.out.println(squareUp(3));
        System.out.println(squareUp(2));
        System.out.println(squareUp(4));
    }

    private static int[] squareUp(int n){
        int[] result = new int[(int) Math.pow(n, 2)];
        int groupNumber = 0;
        int resetNum = 1;

        for (int i = result.length - 1; i >= 0; i--){

            if (resetNum <= n) {
                if (resetNum > n - groupNumber) {
                    result[i] = 0;
                    resetNum += 1;
                } else {
                    result[i] = resetNum;
                    resetNum += 1;
                }
            } else {
                resetNum = 1;
                result[i] = resetNum;
                resetNum += 1;
                groupNumber++;
            }
        }

        return result;
    }


    private static int[] squareUpNestedLoop(int n) {
        int[] result = new int[n * n];

        for (int row = 1; row <= n; row++) {
            int startIndex = n * row - 1;
            for (int k = 1; k <= row; k++) {
                result[startIndex - (k - 1)] = k;
            }
        }

        return result;
    }

    private static int[] squareUp2DArray(int n) {
        int[][] matrix = new int[n][n];

        for (int row = 0; row < n; row++) {
            for (int col = n - 1, val = 1; col >= n - 1 - row; col--, val++) {
                matrix[row][col] = val;
            }
        }

        int[] result = new int[n * n];
        int index = 0;
        for (int[] row : matrix) {
            for (int num : row) {
                result[index++] = num;
            }
        }

        return result;
    }
}