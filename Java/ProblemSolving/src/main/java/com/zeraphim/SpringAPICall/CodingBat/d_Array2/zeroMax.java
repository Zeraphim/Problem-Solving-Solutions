package com.zeraphim.SpringAPICall.CodingBat.d_Array2;

/*

Return a version of the given array where each zero value in the array is replaced by the largest odd value to the right of the zero in the array. If there is no odd value to the right of the zero, leave the zero as a zero.

zeroMax([0, 5, 0, 3]) → [5, 5, 3, 3]
zeroMax([0, 4, 0, 3]) → [3, 4, 3, 3]
zeroMax([0, 1, 0]) → [1, 1, 0]

 */

public class zeroMax {
    public static void main(String[] args) {
        System.out.println(zeroMax(new int[]{0, 5, 0, 3}));
        System.out.println(zeroMax(new int[]{0, 4, 0, 3}));
        System.out.println(zeroMax(new int[]{0, 1, 0}));
    }

    private static int[] zeroMax(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                int maxOdd = 0;
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] % 2 == 1 && nums[j] > maxOdd) {
                        maxOdd = nums[j];
                    }
                }
                if (maxOdd > 0) {
                    nums[i] = maxOdd;
                }
            }
        }
        return nums;
    }

    private static int[] zeroMaxRightToLeftTraversal(int[] nums) {
        int maxOdd = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] % 2 == 1) {
                maxOdd = Math.max(maxOdd, nums[i]);
            }
            if (nums[i] == 0 && maxOdd > 0) {
                nums[i] = maxOdd;
            }
        }
        return nums;
    }

    private static int[] zeroMaxStreams(int[] nums) {
        int[] result = nums.clone();
        for (int i = 0; i < result.length; i++) {
            if (result[i] == 0) {
                int maxOdd = java.util.Arrays.stream(result, i + 1, result.length)
                        .filter(n -> n % 2 == 1)
                        .max()
                        .orElse(0);
                if (maxOdd > 0) {
                    result[i] = maxOdd;
                }
            }
        }
        return result;
    }
}