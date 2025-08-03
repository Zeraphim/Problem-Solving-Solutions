package com.zeraphim.SpringAPICall.CodingBat.a_WarmUp1;

/*

Given three int values, a b c, return the largest.

intMax(1, 2, 3) → 3
intMax(1, 3, 2) → 3
intMax(3, 2, 1) → 3

 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class intMax {
    public static void main(String[] args) {
        System.out.println(intMax(1, 2, 3));
        System.out.println(intMax(1, 3, 2));
        System.out.println(intMax(3, 2, 1));
    }

    public static int intMax(int a, int b, int c) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(a);
        numbers.add(b);
        numbers.add(c);

        return Collections.max(numbers);
    }
}