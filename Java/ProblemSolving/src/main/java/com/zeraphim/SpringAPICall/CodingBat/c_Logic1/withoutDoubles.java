package com.zeraphim.SpringAPICall.CodingBat.c_Logic1;

/*

Return the sum of two 6-sided dice rolls, each in the range 1..6. However, if noDoubles is true, if the two dice show the same value, increment one die to the next value, wrapping around to 1 if its value was 6.

withoutDoubles(2, 3, true) → 5
withoutDoubles(3, 3, true) → 7
withoutDoubles(3, 3, false) → 6

 */

public class withoutDoubles {
    public static void main(String[] args) {
        System.out.println(withoutDoubles(2, 3, true));
        System.out.println(withoutDoubles(3, 3, true));
        System.out.println(withoutDoubles(3, 3, false));
    }

    private static int withoutDoubles(int die1, int die2, boolean noDoubles) {
        if (noDoubles && die1 == die2) {
            die1 = die1 == 6 ? 1 : die1 + 1;
        }
        return die1 + die2;
    }

    private static int withoutDoublesLong(int die1, int die2, boolean noDoubles) {
        boolean isDouble = die1 == die2;
        boolean isBoth6 = die1 == 6 && die2 == 6;

        if (isBoth6 && noDoubles) {
            return die1 + 1;
        } else if(isDouble && !noDoubles) {
            return die1 + die2;
        } else if (isDouble && noDoubles) {
            return die1 + die2 + 1;
        }

        return die1 + die2;
    }
}