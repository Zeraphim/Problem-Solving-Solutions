package com.zeraphim.SpringAPICall.CodingBat.d_Array1;

/*

Given 2 int arrays, a and b, of any length, return a new array with the first element of each array. If either array is length 0, ignore that array.

front11([1, 2, 3], [7, 9, 8]) → [1, 7]
front11([1], [2]) → [1, 2]
front11([1, 7], []) → [1]

 */

import java.util.ArrayList;
import java.util.List;

public class front11 {
    public static void main(String[] args) {
        System.out.println(front11(new int[]{1, 2, 3}, new int[]{7, 9, 8}));
        System.out.println(front11(new int[]{1}, new int[]{2}));
        System.out.println(front11(new int[]{1, 7}, new int[]{}));
    }

    private static int[] front11(int[] a, int[] b) {
        int arrayLength = 2;

        if (a.length == 0) {
            arrayLength--;
        }

        if (b.length == 0) {
            arrayLength--;
        }

        int[] response = new int[arrayLength];

        if (a.length != 0) {
            response[0] = a[0];

            if (b.length != 0) {
                response[1] = b[0];
            }
        }

        if (a.length == 0) {
            if (b.length != 0) {
                response[0] = b[0];
            }
        }

        return response;
    }

    private static int[] front11Concise(int[] a, int[] b) {
        List<Integer> result = new ArrayList<>();

        if (a.length > 0) result.add(a[0]);
        if (b.length > 0) result.add(b[0]);

        return result.stream().mapToInt(i -> i).toArray();
    }
}