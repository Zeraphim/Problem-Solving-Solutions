package com.zeraphim.SpringAPICall.CodingBat.c_Logic1;

/*

You have a blue lottery ticket, with ints a, b, and c on it. This makes three pairs, which we'll call ab, bc, and ac. Consider the sum of the numbers in each pair. If any pair sums to exactly 10, the result is 10. Otherwise if the ab sum is exactly 10 more than either bc or ac sums, the result is 5. Otherwise the result is 0.

blueTicket(9, 1, 0) → 10
blueTicket(9, 2, 0) → 0
blueTicket(6, 1, 4) → 10

 */

public class blueTicket {
    public static void main(String[] args) {
        System.out.println(blueTicket(9, 1, 0));
        System.out.println(blueTicket(9, 2, 0));
        System.out.println(blueTicket(6, 1, 4));
    }

    private static int blueTicket(int a, int b, int c) {
        int abSum = a + b;
        int bcSum = b + c;
        int acSum = a + c;

        boolean isPairSumTen =
                abSum == 10
                || bcSum == 10
                || acSum == 10;

        boolean isTenMore =
                abSum == bcSum + 10
                || abSum == acSum + 10;

        if (isPairSumTen) {
            return 10;
        } else if (isTenMore) {
            return 5;
        }

        return 0;
    }
}