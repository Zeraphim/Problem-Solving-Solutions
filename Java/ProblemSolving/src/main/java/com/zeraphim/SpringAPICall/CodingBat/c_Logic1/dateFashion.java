package com.zeraphim.SpringAPICall.CodingBat.c_Logic1;

/*

You and your date are trying to get a table at a restaurant. The parameter "you" is the stylishness of your clothes, in the range 0..10, and "date" is the stylishness of your date's clothes. The result getting the table is encoded as an int value with 0=no, 1=maybe, 2=yes. If either of you is very stylish, 8 or more, then the result is 2 (yes). With the exception that if either of you has style of 2 or less, then the result is 0 (no). Otherwise the result is 1 (maybe).

dateFashion(5, 10) → 2
dateFashion(5, 2) → 0
dateFashion(5, 5) → 1

 */

public class dateFashion {
    public static void main(String[] args) {
        System.out.println(dateFashion(5, 10));
        System.out.println(dateFashion(5, 2));
        System.out.println(dateFashion(5, 5));
    }

    private static int dateFashion(int you, int date) {
        boolean isNo = you <= 2 || date <= 2;
        boolean isYes = you >= 8 || date >= 8;

        if (isNo) {
            return 0;
        } else if (isYes) {
            return 2;
        } else {
            return 1;
        }
    }

    private static int dateFashionLong(int you, int date) {
        boolean isYes = ((you > 2 && you > 8) || (date > 2 && date > 8)) && (you > 2 && date > 2);
        boolean isMaybe = ((you < 8 || you <= 2) && you > 2) && ((date < 8 || date <= 2) && date > 2);

        if (isYes) {
            return 2;
        }  else if (isMaybe) {
            return 1;
        }

        return 0;
    }
}