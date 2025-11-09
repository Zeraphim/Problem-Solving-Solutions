package com.zeraphim.SpringAPICall.CodingBat.d_Array1;

/*

Given 2 int arrays, a and b, return a new array length 2 containing, as much as will fit, the elements from a followed by the elements from b. The arrays may be any length, including 0, but there will be 2 or more elements available between the 2 arrays.

make2([4, 5], [1, 2, 3]) → [4, 5]
make2([4], [1, 2, 3]) → [4, 1]
make2([], [1, 2]) → [1, 2]

*/

import java.util.ArrayList;
import java.util.List;

public class make2 {
    public static void main(String[] args) {
        System.out.println(make2(new int[]{4, 5}, new int[]{1, 2, 3}));
        System.out.println(make2(new int[]{4}, new int[]{1, 2, 3}));
        System.out.println(make2(new int[]{}, new int[]{1, 2}));
    }

    private static int[] make2(int[] a, int[] b) {

        int[] response = new int[2];
        int minusIndex = 0;

        for (int i = 0; i < response.length; i++) {
            if (i <= a.length - 1) {
                response[i] = a[i];
                minusIndex++;
            } else {
                response[i] = b[i - minusIndex];
            }
        }

        return response;
    }

    private static int[] make2ArrayCopy(int[] a, int[] b) {
        int[] result = new int[2];
        int aLen = Math.min(a.length, 2);
        System.arraycopy(a, 0, result, 0, aLen);
        if (aLen < 2) {
            System.arraycopy(b, 0, result, aLen, 2 - aLen);
        }
        return result;
    }

    private static int[] make2ListConverstion(int[] a, int[] b) {
        List<Integer> combined = new ArrayList<>();
        for (int n : a) combined.add(n);
        for (int n : b) combined.add(n);

        return new int[]{combined.get(0), combined.get(1)};
    }
}