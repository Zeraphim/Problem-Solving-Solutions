package com.zeraphim.SpringAPICall.CodingBat.a_WarmUp1;

/*

The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.

sleepIn(false, false) → true
sleepIn(true, false) → false
sleepIn(false, true) → true

 */

public class sleepIn {
    public static void main(String[] args) {
        boolean r1 = sleepIn(false, false);
        boolean r2 = sleepIn(true, false);
        boolean r3 = sleepIn(false, true);

        System.out.println(Boolean.toString(r1) + "\n" +
                Boolean.toString(r2) + "\n" +
                Boolean.toString(r3));
    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (weekday && !vacation) {
            return false;
        }
        return true;
    }
}