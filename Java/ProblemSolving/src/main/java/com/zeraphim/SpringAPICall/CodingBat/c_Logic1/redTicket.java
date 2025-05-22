package com.zeraphim.SpringAPICall.CodingBat.c_Logic1;

/*

You have a red lottery ticket showing ints a, b, and c, each of which is 0, 1, or 2. If they are all the value 2, the result is 10. Otherwise if they are all the same, the result is 5. Otherwise so long as both b and c are different from a, the result is 1. Otherwise the result is 0.

redTicket(2, 2, 2) → 10
redTicket(2, 2, 1) → 0
redTicket(0, 0, 0) → 5

 */

import java.util.HashSet;
import java.util.Set;

public class redTicket {
    public static void main(String[] args) {
        System.out.println(redTicket(2, 2, 2));
        System.out.println(redTicket(2, 2, 1));
        System.out.println(redTicket(0, 0, 0));
    }

    private static int redTicket(int a, int b, int c) {
        boolean isAll2 = a == 2 && b == 2 && c == 2;
        boolean isAllSame = a == c && c == b;
        boolean isDifferent = b != a && c != a;

        if (isAll2) {
            return 10;
        } else if (isAllSame) {
            return 5;
        } else if (isDifferent) {
            return 1;
        }

        return 0;
    }

    private static int redTicketSet(int a, int b, int c) {
        Set<Integer> values = new HashSet<>();
        values.add(a);
        values.add(b);
        values.add(c);

        if (values.size() == 1 && a == 2) return 10; // All 2s
        if (values.size() == 1) return 5;           // All same
        if (a != b && a != c) return 1;             // b and c different from a

        return 0;
    }

    private static int redTicketTernary(int a, int b, int c) {
        return (a == 2 && b == 2 && c == 2) ? 10 :
                (a == b && b == c) ? 5 :
                        (a != b && a != c) ? 1 : 0;
    }
}