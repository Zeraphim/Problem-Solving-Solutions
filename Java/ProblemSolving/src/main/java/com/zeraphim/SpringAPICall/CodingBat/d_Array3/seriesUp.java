package com.zeraphim.SpringAPICall.CodingBat.d_Array3;

/*

Given n>=0, create an array with the pattern {1,    1, 2,    1, 2, 3,   ... 1, 2, 3 .. n} (spaces added to show the grouping). Note that the length of the array will be 1 + 2 + 3 ... + n, which is known to sum to exactly n*(n + 1)/2.

seriesUp(3) → [1, 1, 2, 1, 2, 3]
seriesUp(4) → [1, 1, 2, 1, 2, 3, 1, 2, 3, 4]
seriesUp(2) → [1, 1, 2]


 */

import java.util.ArrayList;
import java.util.List;

public class seriesUp {
    public static void main(String[] args) {
        System.out.println(seriesUp(3));
        System.out.println(seriesUp(4));
        System.out.println(seriesUp(2));
    }

    private static int[] seriesUp(int n) {
        int[] result = new int[n*(n+1)/2];

        int groupNumber = 1;
        int counter = 1;

        for (int i = 0; i < result.length; i++) {

            if (counter <= groupNumber) {
                result[i] = counter;
                counter++;
            } else {
                groupNumber++;
                counter = 1;
                result[i] = counter;
                counter++;
            }
        }

        return result;
    }

    private static int[] seriesUpNestedLoop(int n) {
        int[] result = new int[n * (n + 1) / 2];
        int index = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                result[index++] = j;
            }
        }

        return result;
    }

    private static int[] seriesUpArrayList(int n) {
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                list.add(j);
            }
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}