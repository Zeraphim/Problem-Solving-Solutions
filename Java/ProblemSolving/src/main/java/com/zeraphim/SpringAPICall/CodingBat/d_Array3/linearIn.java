package com.zeraphim.SpringAPICall.CodingBat.d_Array3;

/*

Given two arrays of ints sorted in increasing order, outer and inner, return true if all of the numbers in inner appear in outer. The best solution makes only a single "linear" pass of both arrays, taking advantage of the fact that both arrays are already in sorted order.

linearIn([1, 2, 4, 6], [2, 4]) → true
linearIn([1, 2, 4, 6], [2, 3, 4]) → false
linearIn([1, 2, 4, 4, 6], [2, 4]) → true

 */

public class linearIn {
    public static void main(String[] args) {
        System.out.println(linearIn(new int[]{1, 2, 4, 6}, new int[]{2, 4}));
        System.out.println(linearIn(new int[]{1, 2, 4, 6}, new int[]{2, 3, 4}));
        System.out.println(linearIn(new int[]{1, 2, 4, 4, 6}, new int[]{2, 4}));
    }

    private static boolean linearIn(int[] outer, int[] inner) {
        if (inner.length == 0) {
            return true;
        }

        int innerIndex = 0;

        for (int num : outer){
            if (num == inner[innerIndex]) {
                if (innerIndex < inner.length - 1) {
                    innerIndex++;
                } else {
                    return true;
                }
            }
        }

        return false;
    }
}