package com.zeraphim.SpringAPICall.CodingBat.c_Logic1;

/*

You have a green lottery ticket, with ints a, b, and c on it. If the numbers are all different from each other, the result is 0. If all of the numbers are the same, the result is 20. If two of the numbers are the same, the result is 10.

greenTicket(1, 2, 3) → 0
greenTicket(2, 2, 2) → 20
greenTicket(1, 1, 2) → 10

 */

import java.util.*;

public class greenTicket {
    public static void main(String[] args) {
        System.out.println(greenTicket(1, 2, 3));
        System.out.println(greenTicket(2, 2, 2));
        System.out.println(greenTicket(1, 1, 2));
    }

    private static int greenTicket(int a, int b, int c) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(a);
        numbers.add(b);
        numbers.add(c);

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num: numbers) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        boolean hasTwoSame = frequencyMap.containsValue(2);
        boolean allUnique = frequencyMap.size() == numbers.size();

        if (allUnique) {
            return 0;
        } else if (hasTwoSame) {
            return 10;
        }

        return 20;
    }

    private static int greenTicketSimple(int a, int b, int c) {
        if (a == b && b == c) {
            return 20;
        } else if (a == b || b == c || a == c) {
            return 10;
        } else {
            return 0;
        }
    }

    private static int greenTickeSet(int a, int b, int c) {
        Set<Integer> set = new HashSet<>();
        set.add(a);
        set.add(b);
        set.add(c);

        if (set.size() == 1) {
            return 20; // all same
        } else if (set.size() == 2) {
            return 10; // two same
        } else {
            return 0; // all different
        }
    }
}