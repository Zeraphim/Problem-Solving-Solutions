package com.zeraphim.SpringAPICall.CodingBat.d_Array3;

/*

We'll say that a "mirror" section in an array is a group of contiguous elements such that somewhere in the array, the same group appears in reverse order. For example, the largest mirror section in {1, 2, 3, 8, 9, 3, 2, 1} is length 3 (the {1, 2, 3} part). Return the size of the largest mirror section found in the given array.

maxMirror([1, 2, 3, 8, 9, 3, 2, 1]) → 3
maxMirror([1, 2, 1, 4]) → 3
maxMirror([7, 1, 2, 9, 7, 2, 1]) → 2

 */

public class maxMirror {
    public static void main(String[] args) {
        System.out.println(maxMirror(new int[]{1, 2, 3, 8, 9, 3, 2, 1}));
        System.out.println(maxMirror(new int[]{1, 2, 1, 4}));
        System.out.println(maxMirror(new int[]{7, 1, 2, 9, 7, 2, 1}));
    }

    private static int maxMirror(int[] nums) {
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j >= 0; j--) {
                int count = 0;
                int outerIndex = i;
                int innerIndex = j;

                while (outerIndex < nums.length && innerIndex >= 0 && nums[outerIndex] == nums[innerIndex]) {
                    count++;
                    outerIndex++;
                    innerIndex--;
                }

                max = Math.max(max, count);
            }
        }

        return max;
    }

    private static int maxMirrorDynamic(int[] nums) {
        int n = nums.length;
        int[] reversed = new int[n];
        for (int i = 0; i < n; i++) {
            reversed[i] = nums[n - 1 - i];
        }

        int[][] dp = new int[n + 1][n + 1];
        int max = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (nums[i - 1] == reversed[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    max = Math.max(max, dp[i][j]);
                }
            }
        }

        return max;
    }
}