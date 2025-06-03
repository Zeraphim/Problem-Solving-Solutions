package com.zeraphim.SpringAPICall.CodingBat.c_Logic1;

/*

Your cell phone rings. Return true if you should answer it. Normally you answer, except in the morning you only answer if it is your mom calling. In all cases, if you are asleep, you do not answer.

answerCell(false, false, false) → true
answerCell(false, false, true) → false
answerCell(true, false, false) → false

 */

public class answerCell {
    public static void main(String[] args) {
        System.out.println(answerCell(false, false, false));
        System.out.println(answerCell(false, false, true));
        System.out.println(answerCell(true, false, false));
    }

    private static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        return !isAsleep && (!isMorning || isMom);
    }

    private static boolean answerCellLong(boolean isMorning, boolean isMom, boolean isAsleep) {

        if (isAsleep) {
            return false;
        }

        if (isMorning && !isMom) {
            return false;
        }

        return true;
    }
}